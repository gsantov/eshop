package com.java.eshop.eshop;

import com.java.eshop.eshop.model.ClientEntity;
import com.java.eshop.eshop.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EshopApplication {

    @Autowired
    @Lazy
    private ClientService clientService;

    public static void main(String[] args) {
        SpringApplication.run(EshopApplication.class, args);
    }

    @PostConstruct
    private void createClients() {
//        clientService.createClient(ClientEntity.builder()
//                .documentNumber("1720997905")
//                .name("Genaro Sulca")
//                .email("genarosulca@hotmail.com")
//                .build());
//
//        clientService.createClient(ClientEntity.builder()
//                .documentNumber("1720997906")
//                .name("Sebastian Sulca")
//                .email("genaro@yopmail.com")
//                .build());
    }

}
