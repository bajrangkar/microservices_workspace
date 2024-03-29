package com.myfirst.microservices.customerservice.controller;

import com.myfirst.microservices.customer.Customer;
import com.myfirst.microservices.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 04:09
 * @Project rentcloudmodel
 */

@RestController
@RequestMapping("/services/customers")
public class CustomerServiceController {


    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/{id}")
    public Customer getCustomer(@PathVariable int id) {

        System.out.println("request came on "+LocalDateTime.now() + " 3 ++++++++++++++++++++++");
        return customerService.findById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }




}
