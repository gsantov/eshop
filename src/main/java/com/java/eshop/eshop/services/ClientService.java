package com.java.eshop.eshop.services;

import com.java.eshop.eshop.dto.ClientDTO;
import com.java.eshop.eshop.mapper.ClientMapper;
import com.java.eshop.eshop.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * Metodo para encontrar todos los clientes
     * @return
     */
    public List<ClientDTO> findAll(){
        return clientRepository.findAll()
                .stream().map(ClientMapper.INSTANCE::clientEntToClientDto)
                .toList();
    }

    /**
     * Meotod para crear un cliente
     * @param data
     * @return
     */
    @Transactional
    public ClientDTO createPerson(ClientDTO data){
        return ClientMapper.INSTANCE.clientEntToClientDto(clientRepository
                .save(ClientMapper.INSTANCE.personDtoToPersonEnt(data)));
    }
}
