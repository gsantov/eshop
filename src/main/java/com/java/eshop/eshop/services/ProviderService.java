package com.java.eshop.eshop.services;

import com.java.eshop.eshop.dto.ProviderDTO;
import com.java.eshop.eshop.mapper.ProviderMapper;
import com.java.eshop.eshop.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    @Transactional
    public ProviderDTO createProvider(ProviderDTO provider){
        return ProviderMapper.INSTANCE.providerEntityToProviderDto(providerRepository
                .save(ProviderMapper.INSTANCE.providerDtoToProviderEntity(provider)));
    }

}
