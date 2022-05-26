package com.bridgelabz.addressbookapp.dto;


import lombok.Data;

public @Data class AddressBookDTO {
    private String fName;
    private String lName;
    private String phonenumber;
    private String email;
    private String city;
    private String state;
    private long zipcode;

    public AddressBookDTO(String fName, String lName, String phonenumber, String email, String city, String state, long zipcode) {
        this.fName = fName;
        this.lName = lName;
        this.phonenumber = phonenumber;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
}
