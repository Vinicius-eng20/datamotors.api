package com.datamotors.carros.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.datamotors.carros.dto.CarroRequestDTO;
import com.datamotors.carros.dto.CarroResponseDTO;
import com.datamotors.carros.entity.Carro;

@Component
public class CarroMapper {


    public Carro toCarro(CarroRequestDTO carroDTO){
        return Carro.builder()
            .marca(carroDTO.getMarca())
            .modelo(carroDTO.getModelo())
            .versao(carroDTO.getVersao())
            .tipo(carroDTO.getTipo())
            .preco(carroDTO.getPreco())
            .cor(carroDTO.getCor())
            .transmissao(carroDTO.getTransmissao())
            .numPortas(carroDTO.getNumPortas())
            .carroceria(carroDTO.getCarroceria())
            .blindado(carroDTO.getBlindado())
            .quilometragem(carroDTO.getQuilometragem())
            .cidade(carroDTO.getCidade())
            .estado(carroDTO.getEstado())
            .anoFab(carroDTO.getAnoFab())
            .anoModelo(carroDTO.getAnoModelo())
            .data(carroDTO.getData())
            .build();
    }

    public CarroResponseDTO toCarroDTO(Carro carro){
        return new CarroResponseDTO(carro);
    }

    public List<CarroResponseDTO> toCarrosDTO(List<Carro> carrosList) {
        return carrosList.stream().map(CarroResponseDTO::new).collect(Collectors.toList());
    }

    public void updateCarroData(Carro carro, CarroRequestDTO carroDTO){
        carro.setMarca(carroDTO.getMarca());
        carro.setModelo(carroDTO.getModelo());
        carro.setVersao(carroDTO.getVersao());
        carro.setTipo(carroDTO.getTipo());
        carro.setPreco(carroDTO.getPreco());
        carro.setCor(carroDTO.getCor());
        carro.setTransmissao(carroDTO.getTransmissao());
        carro.setNumPortas(carroDTO.getNumPortas());
        carro.setCarroceria(carroDTO.getCarroceria());
        carro.setBlindado(carroDTO.getBlindado());
        carro.setQuilometragem(carroDTO.getQuilometragem());
        carro.setCidade(carroDTO.getCidade());
        carro.setEstado(carroDTO.getEstado());
        carro.setAnoFab(carroDTO.getAnoFab());
        carro.setAnoModelo(carroDTO.getAnoModelo());
        carro.setData(carroDTO.getData());
    }
}
