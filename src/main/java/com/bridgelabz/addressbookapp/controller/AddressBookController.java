package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }


    @GetMapping("/get/{personId}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("personId") int personId) {
        return new ResponseEntity<String>("Get Call Success for id: "+ personId, HttpStatus.OK);
    }


    @PostMapping("/addnewcontact")
    public ResponseEntity<String> addNewContact(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Created New Contact for: "+ addressBookDTO, HttpStatus.OK);
    }


    @PutMapping("/updatecontact")
    public ResponseEntity<String> updateContact(@RequestBody AddressBookDTO addressBookDTO) {
        return new ResponseEntity<String>("Updated Contact : "+ addressBookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteContact(@PathVariable("personId") int personId) {
        return new ResponseEntity<String>("Delete Call Success for id: " +personId, HttpStatus.OK);
    }
}
