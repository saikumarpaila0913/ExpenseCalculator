package com.expenseApp.ExpenseCalculator.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long expId;
    String expTitle;
    String expDescription;
    int expPrice;
    LocalDate expDate;
    LocalTime expTime;

    @ManyToOne
    @JoinColumn(name = "fk_User")
    User user;
}
