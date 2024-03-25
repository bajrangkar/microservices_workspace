package com.myfirst.microservices.rent;

import lombok.Data;

/**
 * @author Krishantha Dinesh
 * krishantha@krishantha.com
 * www.krishantha.com
 * twitter @krishantha
 * on 22-October-2019 23:25
 * @Project rent-service
 */
@Data
public class SimpleResponse implements Response {

    Rent rent;

    public SimpleResponse(Rent rent) {
        this.rent = rent;
    }
}
