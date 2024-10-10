package com.example.Parkplus_App.Driver.Services;

import com.example.Parkplus_App.Driver.Model.Reservation;

public interface ReservationService {
    Reservation reserveSpot(Integer userId, Integer parkingLotId, Integer timeInHours, Integer numberOfWheels) throws Exception;
}
