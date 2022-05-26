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
    public ResponseEntity<ResponseDTO> getAddressbookData() {
        List<AddressBookData> addressBookData = iAddressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable int id) {
        AddressBookData addressBookData = iAddressBookService.getAddressBookDataById(id);
        ResponseDTO responseDTO = new ResponseDTO("Get call Success", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = iAddressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("created Addressbook data succesfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable int id, @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = iAddressBookService.updateAddressBookData(id, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("updated Addressbook data succesfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int id) {
        iAddressBookService.deleteAddressBookData(id);
        ResponseDTO responseDTO = new ResponseDTO("deleted succesfully", id);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
