package com.wfq.hotel.controller;

import com.wfq.hotel.entities.Hotel;
import com.wfq.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService service;

    @GetMapping("/hotel/list")
    public List<Hotel> lsit(){
        return service.list();
    }

    @GetMapping("hotel/get/{id}")
    public Hotel get(@PathVariable("id") int id){
        return service.get(id);
    };
}
