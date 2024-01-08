package com.vivekanandpv.customerservice.apis;

import com.vivekanandpv.customerservice.models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerApi {
    @GetMapping
    public ResponseEntity<Customer> get() {
        return ResponseEntity.ok(new Customer(457, "John", "Doe", "john@gmail.com"));
    }
}
