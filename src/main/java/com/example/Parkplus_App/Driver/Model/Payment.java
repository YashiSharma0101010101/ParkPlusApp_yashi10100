package com.example.Parkplus_App.Driver.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Boolean isPaymentCompleted;
    private PaymentMode paymentMode;
    @OneToOne
    @JoinColumn
    private Reservation reservation;
}
