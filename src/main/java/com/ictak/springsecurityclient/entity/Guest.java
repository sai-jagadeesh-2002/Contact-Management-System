package com.ictak.springsecurityclient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long guestId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
