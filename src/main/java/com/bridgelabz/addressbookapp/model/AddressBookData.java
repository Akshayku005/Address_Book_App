package com.bridgelabz.addressbookapp.model;


import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fName;

    private String lName;

    private String phonenumber;

    private String email;

    private String city;

    private String state;

    private long zipcode;

    public AddressBookData() {

    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.fName = addressBookDTO.getfName();
        this.lName = addressBookDTO.getlName();
        this.phonenumber = addressBookDTO.getPhonenumber();
        this.email = addressBookDTO.getEmail();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.zipcode = addressBookDTO.getZipcode();
    }
}
