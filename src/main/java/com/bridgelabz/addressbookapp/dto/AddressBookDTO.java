package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {

    public String firstName;
    public String lastName;
    public String address;
    public String mobileNo;

    public AddressBookDTO(String firstName, String lastName, String address, String mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }
}
