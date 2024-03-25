package com.myfirst.microservices.comboservice.service;

import com.myfirst.microservices.rent.DetailResponse;
import com.myfirst.microservices.rent.Rent;

import java.util.List;

public interface ComboService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findComboResponse(int id);
}
