package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService iAddressBookService;

    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        List<AddressBookData> empData=iAddressBookService.getAddressBookData();
        ResponseDTO responseDTO=new ResponseDTO("Get Call Successfull",empData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int id) {
        AddressBookData addressBookData = iAddressBookService.getAddressBookDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get call for ID Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Address Book succesfully",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(1,addressBookDTO);
        ResponseDTO responseDTO=new ResponseDTO("update Address Boook succesfully",addressBookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int id){
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
