package com.bridgelabz.addressbookapp.dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public @Data class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1,}[a-z]{2,}$", message = "Firstname is invalid, first letter should be uppercase!")
    private String fName;

    @Pattern(regexp = "[A-Za-z]+", message = " Lastname is invalid!")
    private String lName;

    @Pattern(regexp = "^[0-9]{10}$", message = "A valid phonenumber should exactly be 10 digits long!")
    private String phonenumber;

    @Pattern(regexp = "([a-zA-Z0-9./.-])+.([a-zA-Z0-9./.-])?@([a-z]{2,7})+.([a-z]{2,4})+.([a-z]{2,4})?", message = "Valid format is: abc.xyz@gmail.com")
    private String email;
    @Pattern(regexp = "^[A-Z]{1,}[a-z]{3,}$", message = "City name should start with uppercase and having atleast 4 characters!")
    private String city;

    @NotEmpty(message = "Please enter your address !!")
    private String address;
    @Pattern(regexp = "^[A-Z]{1,}[a-z]{1,}$", message = "State name should start with uppercase and having atleast 2 characters!")
    private String state;

//    @Pattern(regexp = "^[0-9]{6}$", message = "Valid pincode should exactly be 6 digits long!")
    private long zipcode;

    public AddressBookDTO(String fName, String lName, String phonenumber, String email, String city, String address, String state, long zipcode) {
        this.fName = fName;
        this.lName = lName;
        this.phonenumber = phonenumber;
        this.email = email;
        this.city = city;
        this.address=address;
        this.state = state;
        this.zipcode = zipcode;
    }
}
