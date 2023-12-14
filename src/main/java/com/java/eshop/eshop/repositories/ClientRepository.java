package com.java.eshop.eshop.repositories;

import com.java.eshop.eshop.model.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
}
