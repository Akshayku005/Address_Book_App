package com.bridgelabz.addressbookapp.service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int id);
<<<<<<< HEAD
    AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
    AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO);
=======
    AddressBookData createAddressBookData(AddressBookDTO addressbookDTO);
    AddressBookData updateAddressBookData( int id, AddressBookDTO addressBookDTO);
>>>>>>> uc7-LombokLibrary_For_Logging
    void deleteAddressBookData(int id);
}
