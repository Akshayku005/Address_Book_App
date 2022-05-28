package com.bridgelabz.addressbookapp.controller;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.AddressBookService;
import com.bridgelabz.addressbookapp.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService iAddressBookService;

    @GetMapping("/get")
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

    @GetMapping("/getcity/{city}")
    public ResponseEntity<ResponseDTO> getAddressBookByCity(@PathVariable("city") String city) {
        List<AddressBookData> addressBookList = null;
        addressBookList = iAddressBookService.getAddressBookByCity(city);
        ResponseDTO responseDTO = new ResponseDTO("Get call search by city is successful!", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
@GetMapping("/get/sortbycity")
    public ResponseEntity<ResponseDTO> sortByCity() {
        List<AddressBookData> addressBookList = null ;
        addressBookList = iAddressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("Sort by city call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/getstate/{state}")
    public ResponseEntity<ResponseDTO> getAddressBookByState(@PathVariable("state") String state) {
        List<AddressBookData> addressBookList = null;
        addressBookList = iAddressBookService.getAddressBookByState(state);
        ResponseDTO responseDTO = new ResponseDTO("Get call search by state is successful!", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
    @GetMapping("/get/sortbystate")
    public ResponseEntity<ResponseDTO> sortByState() {
        List<AddressBookData> addressBookList = null;
        addressBookList = iAddressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("Sort by state call is successful! ", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = iAddressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("created Addressbook data succesfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable int id, @Valid @RequestBody AddressBookDTO addressBookDTO) {
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
