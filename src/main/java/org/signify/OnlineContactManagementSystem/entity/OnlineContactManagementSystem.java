package org.signify.OnlineContactManagementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class OnlineContactManagementSystem {

    @Id
    private long userId;
    private String name;
    private String phoneNumber;
    private String email;

    public OnlineContactManagementSystem(){

    }

    public OnlineContactManagementSystem(long userId, String name, String phoneNumber, String email) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
