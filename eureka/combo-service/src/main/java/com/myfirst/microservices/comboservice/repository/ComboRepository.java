package com.myfirst.microservices.comboservice.repository;

import com.myfirst.microservices.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComboRepository extends JpaRepository<Rent,Integer> {
}
