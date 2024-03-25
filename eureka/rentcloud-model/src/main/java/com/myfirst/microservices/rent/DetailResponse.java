package com.myfirst.microservices.rent;

import com.myfirst.microservices.customer.Customer;
import com.myfirst.microservices.vehicle.Vehicle;
import lombok.Data;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 22-October-2019 23:24
 * @Project rent-service
 */
@Data
public class DetailResponse implements Response {

    Rent rent;
    Customer customer;
    Vehicle vehicle;

    public DetailResponse(Rent rent, Customer customer, Vehicle vehicle) {
        this.rent = rent;
        this.customer = customer;
        this.vehicle = vehicle;
    }
}
