package com.myfirst.microservices.customerservice.service;


import com.myfirst.microservices.customer.Customer;

import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 04:28
 * @Project rentcloudmodel
 */
public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
