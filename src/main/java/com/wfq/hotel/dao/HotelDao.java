package com.wfq.hotel.dao;

import com.wfq.hotel.entities.Hotel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelDao {

    public Hotel findById(int id);
    public List<Hotel> findAll();
}
