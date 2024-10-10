package com.example.Parkplus_App.Driver.Services.Impl;

import com.example.Parkplus_App.Driver.Model.Payment;
import com.example.Parkplus_App.Driver.Model.PaymentMode;
import com.example.Parkplus_App.Driver.Model.Reservation;
import com.example.Parkplus_App.Driver.Model.Spot;
import com.example.Parkplus_App.Driver.Repositories.PaymentRepository;
import com.example.Parkplus_App.Driver.Repositories.ReservationRepository;
import com.example.Parkplus_App.Driver.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    ReservationRepository reservationRepository2;
    @Autowired
    PaymentRepository paymentRepository2;

    @Override
    public Payment pay(Integer reservationId, int amountSent, String mode) throws Exception {
        Reservation reservation=reservationRepository2.findById(reservationId).get();
        Spot spot=reservation.getSpot();

        Payment payment=reservation.getPayment();
        int bill=reservation.getNumberOfHours()*reservation.getSpot().getPricePerHour();

        String modeType=mode.toUpperCase();
        if(modeType.equals("CASH")){
            payment.setPaymentMode(PaymentMode.CASH);
        }
        else if(modeType.equals("CARD")) {
            payment.setPaymentMode(PaymentMode.CARD);
        }
        else if(modeType.equals("UPI")){
            payment.setPaymentMode(PaymentMode.UPI);
        }
        else{
            throw new Exception("Payment mode not detected");
        }

        if(amountSent<bill){
            throw new Exception("Insufficient Amount");
        }
        payment.setIsPaymentCompleted(true);
        payment.setReservation(reservation);
        spot.setOccupied(false);
        reservation.setPayment(payment);
        reservationRepository2.save(reservation);
        return payment;
    }
}
