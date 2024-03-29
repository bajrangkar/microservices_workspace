package com.myfirst.microservices.faultcheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.github.resilience4j.ratelimiter.RequestNotPermitted;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
public class BulkHeadController {

    Logger logger = LoggerFactory.getLogger(BulkHeadController.class);
    public static int counter = 0;
    @GetMapping("/getMessageBH")
    @Bulkhead(name = "getMessageBH", fallbackMethod = "getMessageFallBack")
    public ResponseEntity<String> getMessage(@RequestParam(value="name", defaultValue = "Hello") String name) throws InterruptedException {
        logger.info("Reached : "+counter++);
        //Thread.sleep(1000);
        return ResponseEntity.ok().body("Message from getMessage() :" +name);
    }

    public ResponseEntity<String> getMessageFallBack(RequestNotPermitted exception) {

        logger.info("Bulkhead has applied, So no further calls are getting accepted");

        return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS)
                .body("Too many requests : No further request will be accepted. Plese try after sometime");
    }
}
