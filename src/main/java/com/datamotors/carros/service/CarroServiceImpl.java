package com.datamotors.carros.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.datamotors.carros.dto.CarroRequestDTO;
import com.datamotors.carros.dto.CarroResponseDTO;
import com.datamotors.carros.entity.Carro;
import com.datamotors.carros.repository.CarroRepository;
import com.datamotors.carros.util.CarroMapper;

import lombok.RequiredArgsConstructor;

@Service
@Primary
@RequiredArgsConstructor
public class CarroServiceImpl implements CarroService {

    private final CarroRepository carroRepository;

    private final CarroMapper carroMapper;

    @Override
    public CarroResponseDTO findById(Long id) {
        return carroMapper.toCarroDTO(returnCarro(id));
    }

    @Override
    public List<CarroResponseDTO> findAll() {
        return carroMapper.toCarrosDTO(carroRepository.findAll());
    }

    @Override
    public CarroResponseDTO register(CarroRequestDTO carroDTO) {
        Carro carro = carroMapper.toCarro(carroDTO);

        return carroMapper.toCarroDTO(carroRepository.save(carro));
    }

    @Override
    public CarroResponseDTO update(Long id, CarroRequestDTO carroDTO) {
        Carro carro = returnCarro(id);

        carroMapper.updateCarroData(carro, carroDTO);

        return carroMapper.toCarroDTO(carroRepository.save(carro));
    }

    @Override
    public String delete(Long id) {
        carroRepository.deleteById(id);
        return "Carro id: " + id + " deleted.";
    }

    private Carro returnCarro(Long id){
        return carroRepository.findById(id).orElseThrow(() -> new RuntimeException("Carros não encontrado no database."));
    }
    
}
