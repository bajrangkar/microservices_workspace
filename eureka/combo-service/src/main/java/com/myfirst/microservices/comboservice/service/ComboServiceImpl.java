package com.myfirst.microservices.comboservice.service;

import com.myfirst.microservices.comboservice.repository.ComboRepository;
import com.myfirst.microservices.customer.Customer;
import com.myfirst.microservices.rent.DetailResponse;
import com.myfirst.microservices.rent.Rent;
import com.myfirst.microservices.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ComboServiceImpl implements ComboService {
    @Autowired
    ComboRepository comboRepository;
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Rent save(Rent customer) {
        return comboRepository.save(customer);
    }

    @Override
    public Rent findById(int id) {
        Optional<Rent> rent = comboRepository.findById(id);
        if (rent.isPresent())
            return rent.get();
        else
            return new Rent();
    }

    @Override
    public List<Rent> findAll() {
        return comboRepository.findAll();
    }

    @Override
    public DetailResponse findComboResponse(int id) {
        Rent rent=findById(id);
        Customer customer=getCustomer(rent.getCustomerId());
        Vehicle vehicle= getVehicle(rent.getVehicleId());
        return new DetailResponse(rent,customer,vehicle);
    }

    private Customer getCustomer(int customerId){
        Customer customer=restTemplate.getForObject("http://customer/services/customers/"+customerId,Customer.class);
        return customer;
    }

    private Vehicle getVehicle(int vehicleId){
        return restTemplate.getForObject("http://vehicle/services/vehicles/"+vehicleId,Vehicle.class);
    }
}
