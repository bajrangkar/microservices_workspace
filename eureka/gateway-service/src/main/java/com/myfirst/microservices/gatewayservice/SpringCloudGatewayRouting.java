package com.myfirst.microservices.gatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("customerId", r->r.path("/services/customers/**").uri("lb://customer"))
                .route("vehicleId", r->r.path("/services/vehicles/**").uri("lb://vehicle"))
                .route("rentId", r->r.path("/services/rents/**").uri("lb://rent"))
                .route("comboId", r->r.path("/services/combo/**").uri("lb://combo"))
                .build();
    }
}
