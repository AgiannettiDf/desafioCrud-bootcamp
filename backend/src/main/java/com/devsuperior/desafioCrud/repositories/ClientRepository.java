package com.devsuperior.desafioCrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.desafioCrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
