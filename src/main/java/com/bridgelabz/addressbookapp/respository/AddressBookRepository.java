package com.bridgelabz.addressbookapp.respository;

import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer> {
    @Query(value = "select * from address_book_table where city = :city", nativeQuery = true)
    List<AddressBookData> findAddressBookByCity(String city);

    @Query(value = "select *from address_book_table where state= :state", nativeQuery = true)
    List<AddressBookData> findAddressBookByState(String state);
    @Query(value = "select *from address_book_table order by city asc", nativeQuery = true)
    List<AddressBookData> sortByCity();
    @Query(value = "select *from address_book_table order by state asc", nativeQuery = true)
    List<AddressBookData> sortByState();
}
