package com.example.Parkplus_App.Driver.Repositories;

import com.example.Parkplus_App.Driver.Model.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Integer> {
}
