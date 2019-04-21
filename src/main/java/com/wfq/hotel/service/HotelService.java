package com.wfq.hotel.service;

import com.wfq.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {
    public List<Hotel> list();
    public Hotel get(int id);
}
