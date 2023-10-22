package com.expenseApp.ExpenseCalculator.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String token;
    private LocalDateTime tokenCreationTime;
    @OneToOne
    @JoinColumn(name = "fk_UserId")
    private User user;

    public AuthenticationToken(User user){
        this.user=user;
        this.token= UUID.randomUUID().toString();
        this.tokenCreationTime=LocalDateTime.now();
    }

}
