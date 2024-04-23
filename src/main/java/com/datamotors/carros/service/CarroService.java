package com.datamotors.carros.service;

import java.util.List;

import com.datamotors.carros.dto.CarroRequestDTO;
import com.datamotors.carros.dto.CarroResponseDTO;

public interface CarroService {
    CarroResponseDTO findById(Long id);

    List<CarroResponseDTO> findAll();

    CarroResponseDTO register(CarroRequestDTO carrosDTO);

    CarroResponseDTO update(Long id, CarroRequestDTO carrosDTO);

    String delete(Long id);

}
