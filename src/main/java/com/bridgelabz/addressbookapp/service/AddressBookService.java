package com.bridgelabz.addressbookapp.service;



import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookData> addressBookDataList=new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        return addressBookDataList.get(id-1);
    }
    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        return null;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData=this.getAddressBookDataById(id);
        addressBookData.setfName(addressBookDTO.getfName());
        addressBookData.setlName(addressBookDTO.getlName());
        addressBookData.setPhonenumber(addressBookDTO.getPhonenumber());
        addressBookData.setEmail(addressBookDTO.getEmail());
        addressBookData.setCity(addressBookDTO.getCity());
        addressBookData.setState(addressBookDTO.getState());
        addressBookData.setZipcode(addressBookDTO.getZipcode());
        addressBookDataList.set(id-1,addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteEmployeePayrollData(int id) {
        addressBookDataList.remove(id);
    }

}
