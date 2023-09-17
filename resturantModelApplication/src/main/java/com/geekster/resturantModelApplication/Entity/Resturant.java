package com.geekster.resturantModelApplication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resturant {
    private Integer resturantId;
    private String resturantName;
    private String resturantAddress;
    private String resturantNumber;
    private String speciality;
    private Integer resturantTotalStaffs;
    private Cuisine cuisine;
    private Payment payment;
    private boolean reservationAvailability;
}
