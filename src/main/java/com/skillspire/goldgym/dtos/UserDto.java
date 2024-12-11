package com.skillspire.goldgym.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    int id;
    String firstName;
    String lastName;
    String email;
    String password;
    String mailingStreetAddress;
    String mailingCity;
    String mailingState;

    public UserDto() {
    }

    public UserDto(int id, String firstName, String lastName, String email, String password, String mailingStreetAddress, String mailingCity, String mailingState) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.mailingStreetAddress = mailingStreetAddress;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailingStreetAddress() {
        return mailingStreetAddress;
    }

    public void setMailingStreetAddress(String mailingStreetAddress) {
        this.mailingStreetAddress = mailingStreetAddress;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }
}
