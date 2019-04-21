package com.wfq.hotel.service.impl;

import com.wfq.hotel.dao.HotelDao;
import com.wfq.hotel.entities.Hotel;
import com.wfq.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelDao dao;

    @Override
    public List<Hotel> list() {
        return dao.findAll();
    }

    @Override
    public Hotel get(int id) {
        return dao.findById(id);
    }
}
