package com.datamotors.carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datamotors.carros.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, String>{
    
}
