package com.datamotors.carros.dto;

import lombok.Getter;

@Getter
public class CarroRequestDTO {

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

}
