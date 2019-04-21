package com.wfq.hotel.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Hotel implements Serializable {


    private int id;
    private String hotelname;
    private String location;
    private String feature;
    private double score;
    private String picturelink;
    public int price;

    public Hotel(String hotelname) {
        this.hotelname = hotelname;
    }
}
