package com.vtxlab.g2307.model;

import java.util.Objects;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Builder
@ToString
public class Address {
    private String addrLine1;
    private String addrLine2;
    private String addrLine3;
    
    @NonNull
    private Country country;

    public Address(Country country) {
        if (country == null)
        throw new NullPointerException();

        this.country = country;
    }

    public static void main(String[] args) {
        Address a1 = new Address(Country.HK);
        Address a2 = new AddressBuilder()
            .addrLine1("flat a")
            .addrLine2("11 floor")
            .addrLine3("block 2")
            .country(Country.HK)
            .build();
        System.out.println(a2);
    }
}
