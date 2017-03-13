package com.galvanize;

import lombok.*;

@Data
public class Address {

    @Getter @Setter private String street;
    @Getter @Setter private String city;
    @Getter @Setter private String state;
    @Getter @Setter private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override public String toString() {
        return street + ", " +
            city + ", " +
            state +" " +
            zip;

    }
}
