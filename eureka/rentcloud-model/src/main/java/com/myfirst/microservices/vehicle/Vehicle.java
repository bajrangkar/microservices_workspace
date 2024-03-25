package com.myfirst.microservices.vehicle;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 14-October-2019 16:32
 * @Project rentcloudmodel
 */

@Entity
@Table(name="vehicle")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String make;
    String model;
    String type;
    int year;
    int odometerValueOnRegister;
    String color;


}
