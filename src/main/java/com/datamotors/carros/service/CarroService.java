package com.datamotors.carros.service;

import java.util.List;

import com.datamotors.carros.dto.CarroRequestDTO;
import com.datamotors.carros.dto.CarroResponseDTO;

public interface CarroService {
    CarroResponseDTO findById(String id);

    List<CarroResponseDTO> findAll();

    CarroResponseDTO register(CarroRequestDTO carrosDTO);

    CarroResponseDTO update(String id, CarroRequestDTO carrosDTO);

    String delete(String id);

    String deleteAll();

}
