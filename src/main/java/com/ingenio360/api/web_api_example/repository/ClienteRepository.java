package com.ingenio360.api.web_api_example.repository;

import com.ingenio360.api.web_api_example.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
