package com.skillspire.goldgym.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "mailling_street_address")
    private String mailingStreetAddress;

    @Column(name = "mailing_city")
    private String mailingCity;

    @Column(name = "mailing_state")
    private String mailingState;

    @ManyToOne
    @JoinColumn(name = "gym_id", nullable = false)
    private Gym gym;
}
