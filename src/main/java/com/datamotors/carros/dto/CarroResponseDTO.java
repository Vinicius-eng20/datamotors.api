package com.datamotors.carros.dto;

import com.datamotors.carros.entity.Carro;

import lombok.Getter;

@Getter
public class CarroResponseDTO {
    
    private Long id;
    private String marca;
    private String modelo;
    private String versao;
    private String tipo;
    private Long preco;
    private String cor;
    private String transmissao;
    private Integer numPortas;
    private Long quilometragem;
    private String cidade; 
    private String estado;
    private Integer anoFab;
    private Integer anoModelo;
    private String data;

    public CarroResponseDTO(Carro carro){
        this.id = carro.getId();
        this.marca = carro.getMarca();
        this.modelo = carro.getModelo();
        this.versao = carro.getVersao();
        this.tipo = carro.getTipo();
        this.preco = carro.getPreco();
        this.cor = carro.getCor();
        this.transmissao = carro.getTransmissao();
        this.numPortas = carro.getNumPortas();
        this.quilometragem = carro.getQuilometragem();
        this.cidade = carro.getCidade();
        this.estado = carro.getEstado();
        this.anoFab = carro.getAnoFab();
        this.anoModelo = carro.getAnoModelo();
        this.data = carro.getData();
    }
}
