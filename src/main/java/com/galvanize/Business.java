package com.galvanize;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class Business implements Addressable {

    @Getter private final String name;
    private final ArrayList<Address> addresses = new ArrayList<>();

    public Business(String name) {
        this.name = name;
    }

    @Override public List<Address> getAddresses() {
        return addresses;
    }

    @Override public void addAddress(Address address) {
        if(address != null){
            addresses.add(address);
        }
    }

}
