package com.datamotors.carros.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_carros")
@NoArgsConstructor
@Getter @Setter
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "versao")
    private String versao;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "preco")
    private Long preco;

    @Column(name = "cor")
    private String cor;

    @Column(name = "transmissao")
    private String transmissao;

    @Column(name = "num_portas")
    private Integer numPortas;

    @Column(name = "quilometragem")
    private Long quilometragem;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "ano_fab")
    private Integer anoFab;

    @Column(name = "ano_modelo")
    private Integer anoModelo;

    @Column(name = "data")
    private String data;

    @Builder
    public Carro(String marca, String modelo, String versao, String tipo, Long preco, String cor, String transmissao, Integer numPortas, Long quilometragem, String cidade, String estado, Integer anoFab, Integer anoModelo, String data) {
        this.marca = marca;
        this.modelo = modelo;
        this.versao = versao;
        this.tipo = tipo;
        this.preco = preco;
        this.cor = cor;
        this.transmissao = transmissao;
        this.numPortas = numPortas;
        this.quilometragem = quilometragem;
        this.cidade = cidade;
        this.estado = estado;
        this.anoFab = anoFab;
        this.anoModelo = anoModelo;
        this.data = data;
    }
}
