package com.bridgelabz.addressbookapp.model;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "AddressBook_table")
public @Data class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addressBook_id")
    private int id;
    @Column(name = "name")
    private String fName;

    private String lName;

    private String phonenumber;

    private String email;

    private String city;
    private String address;

    private String state;

    private long zipcode;

    public AddressBookData() {

    }
    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }


    public void updateAddressBookData( AddressBookDTO addressBookDTO) {
        this.fName = addressBookDTO.getFName();
        this.lName = addressBookDTO.getLName();
        this.phonenumber = addressBookDTO.getPhonenumber();
        this.email = addressBookDTO.getEmail();
        this.city = addressBookDTO.getCity();
        this.address=addressBookDTO.getAddress();
        this.state = addressBookDTO.getState();
        this.zipcode = addressBookDTO.getZipcode();
    }
}
