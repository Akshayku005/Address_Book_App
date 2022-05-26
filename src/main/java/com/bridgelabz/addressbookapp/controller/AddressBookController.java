package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO
                ("Akshay", "Kumar", "Girinagar", "9113268769"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("personId") int personId) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, new AddressBookDTO
                ("Pavan", "kumar", "Chinthamani", "9888882223"));
        ResponseDTO responseDTO = new ResponseDTO("Get Call For ID Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @PostMapping("/addnewcontact")
    public ResponseEntity<ResponseDTO> addNewContact(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("New Contact Added Sucessfully", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @PutMapping("/updatecontact")
    public ResponseEntity<ResponseDTO> updateContact(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Sucessfully", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }


    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteContact(@PathVariable("personId") int personId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Contact Sucessfully", "Deleted Id: " + personId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
