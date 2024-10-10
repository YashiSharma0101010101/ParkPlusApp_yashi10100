package com.example.Parkplus_App.Driver.Repositories;

import com.example.Parkplus_App.Driver.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
