package com.r.a.project;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by crci1 on 3/17/2017.
 */

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    int id;


    @Column(nullable = false)
    String firstName;

    @Column(nullable = false)
    String lastName;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String phoneNumber;

    @Column(nullable = false)
    String height;

    @Column(nullable = false)
    String size;

    @Column(nullable = false)
    String bodyType;

    @Column(nullable = false)
    String eventType;

    @Column(nullable = false)
    String colorsLiked;

    @Column(nullable = false)
    String colorsDisliked;

    @Column(nullable = false)
    String zipCode;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String state;

    @Column(nullable = false)
    java.sql.Timestamp timestamp;

    @Column
    String image;


    public Client() {
    }

    public Client(String firstName, String lastName, String address, String email,
                  String phoneNumber, String height, String size,
                  String bodyType, String eventType, String colorsLiked, String colorsDisliked,
                  String zipCode, String city, String state, java.sql.Timestamp timestamp, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.height = height;
        this.size = size;
        this.bodyType = bodyType;
        this.eventType = eventType;
        this.colorsLiked = colorsLiked;
        this.colorsDisliked = colorsDisliked;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.timestamp = timestamp;
        this.image = image;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getColorsLiked() {
        return colorsLiked;
    }

    public void setColorsLiked(String colorsLiked) {
        this.colorsLiked = colorsLiked;
    }

    public String getColorsDisliked() {
        return colorsDisliked;
    }

    public void setColorsDisliked(String colorsDisliked) {
        this.colorsDisliked = colorsDisliked;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public java.sql.Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.sql.Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
