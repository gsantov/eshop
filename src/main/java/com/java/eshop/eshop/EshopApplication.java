package com.java.eshop.eshop;

import com.java.eshop.eshop.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
//@Import({SecurityConfig.class})
public class EshopApplication {

    @Autowired
    @Lazy
    private ClientService clientService;

    public static void main(String[] args) {
        SpringApplication.run(EshopApplication.class, args);
    }

}
