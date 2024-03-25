package com.myfirst.microservices.rentservice.repository;

import com.myfirst.microservices.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 15-October-2019 06:32
 * @Project rentcloudmodel
 */
public interface RentRepository extends JpaRepository<Rent,Integer> {
}
