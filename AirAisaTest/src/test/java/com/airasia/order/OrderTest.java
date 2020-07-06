package com.airasia.order;

import com.airaisa.AirAisaOrderApplication;
import com.airaisa.entity.Customer;
import com.airaisa.entity.Hotel;
import com.airaisa.entity.Order;
import com.airaisa.entity.Room;
import com.airaisa.service.CustomerService;
import com.airaisa.service.HotelService;
import com.airaisa.service.RoomService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.sql.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(classes = AirAisaOrderApplication.class)
@AutoConfigureMockMvc
public class OrderTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ObjectMapper mapper;

    @Test
    public void createOrderTest() throws Exception {


        Hotel hotel = hotelService.save(new Hotel("Maya", "KL", "010"));
        Room room = roomService.save(new Room("Suits", "101", 2, 2, 100.0, hotel));
        Customer customer = customerService.save(new Customer("shuwair", "sardar", "shu@gmail.com", "101"));

        Date checkInDate = Date.valueOf("2020-07-2");
        Date checkOutDate = Date.valueOf("2020-07-4");
        Date bookingDate = Date.valueOf("2020-07-1");
        Order order = new Order(checkInDate, checkOutDate, bookingDate, 4, "Approved", 200.0, hotel, room, customer);

        String json = mapper.writeValueAsString(order);

        this.mockMvc.perform(post("/order/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
        ).andExpect(status().isCreated());
    }
}
