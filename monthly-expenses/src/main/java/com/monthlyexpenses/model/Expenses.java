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
    private Long id;
    @Column(name="user_id",nullable = false)
    long userId;
    @Column(name="category",nullable = false)
    String category;
    @Column(name="amount",nullable=false)
    BigDecimal amount;
    @Column(name="date",nullable=false)
    LocalDate date;
    @Column(name="notes")
    String notes;
}
