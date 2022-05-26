package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int id);
    AddressBookData createAddressBookData(AddressBookDTO addressbookDTO);
    AddressBookData updateAddressBookData( int id, AddressBookDTO addressBookDTO);
    void deleteAddressBookData(int id);
}
