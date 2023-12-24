package com.java.eshop.eshop.controllers;

import com.java.eshop.eshop.dto.ProviderDTO;
import com.java.eshop.eshop.dto.ResponseDTO;
import com.java.eshop.eshop.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @PostMapping
    public ResponseEntity<ResponseDTO<ProviderDTO>> create(@RequestBody ProviderDTO data) {
        return new ResponseEntity<>(ResponseDTO.<ProviderDTO>builder()
                .data(providerService.createProvider(data))
                .build(), HttpStatus.OK);
    }

}
