package com.myfirst.microservices.rentservice.controller;

import com.myfirst.microservices.rent.Rent;
import com.myfirst.microservices.rent.Response;
import com.myfirst.microservices.rent.SimpleResponse;
import com.myfirst.microservices.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:36
 * @Project rentcloudmodel
 */
@RestController
@RequestMapping("/services/rents")
public class RentController {


    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return  new SimpleResponse(rentService.findById(id));
        }else{
         return  rentService.findDetailResponse(id);
        }
    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }


}
