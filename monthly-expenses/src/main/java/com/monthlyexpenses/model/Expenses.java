package com.monthlyexpenses.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="expenses")
public class Expenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exp_id;
    @Column(name="user_id")
    long userId;
    @Column(name="category")
    String category;
    @Column(name="amount")
    BigDecimal amount;
    @Column(name="date")
    LocalDate date;
    @Column(name="notes")
    String notes;
    @Column(name="payment_method")
    String paymentMethod;
}
