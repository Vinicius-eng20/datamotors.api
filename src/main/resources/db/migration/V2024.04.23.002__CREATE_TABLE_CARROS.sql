CREATE TABLE carros
(
    id_car character varying(36) NOT NULL,
    marca character varying(256) NOT NULL,
    modelo character varying(256) NOT NULL,
    versao character varying(256) NOT NULL,
    tipo character varying(256) NOT NULL,
    preco numeric NOT NULL,
    cor character varying(256) NOT NULL,
    transmissao character varying(256) NOT NULL,
    num_portas integer NOT NULL,
    quilometragem numeric NOT NULL,
    cidade character varying(256) NOT NULL,
    estado character varying(256) NOT NULL,
    ano_fab integer NOT NULL,
    ano_modelo integer NOT NULL,
    data character varying(10) NOT NULL,
    CONSTRAINT carros_pkey PRIMARY KEY (id_car)
);