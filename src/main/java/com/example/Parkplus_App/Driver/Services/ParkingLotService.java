package com.example.Parkplus_App.Driver.Services;

import com.example.Parkplus_App.Driver.Model.ParkingLot;
import com.example.Parkplus_App.Driver.Model.Spot;

public interface ParkingLotService {

    void deleteSpot(int spotId);

    Spot updateSpot(int parkingLotId, int spotId, int pricePerHour);

    void deleteParkingLot(int parkingLotId);

    ParkingLot addParkingLot(String name, String address);

    Spot addSpot(int parkingLotId, Integer numberOfWheels, Integer pricePerHour);

}
