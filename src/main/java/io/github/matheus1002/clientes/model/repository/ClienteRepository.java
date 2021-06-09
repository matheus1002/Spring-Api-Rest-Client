package io.github.matheus1002.clientes.model.repository;

import io.github.matheus1002.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
