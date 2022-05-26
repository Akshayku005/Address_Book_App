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
}
