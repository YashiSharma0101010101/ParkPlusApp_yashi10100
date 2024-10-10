package com.example.Parkplus_App.Driver.Services;

import com.example.Parkplus_App.Driver.Model.Payment;

public interface PaymentService {
    Payment pay(Integer reservationId, int amountSent, String mode) throws Exception;
}
