package com.datamotors.carros.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.datamotors.carros.dto.CarroRequestDTO;
import com.datamotors.carros.dto.CarroResponseDTO;
import com.datamotors.carros.service.CarroService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/carros")
@RequiredArgsConstructor
public class CarroController {
    
    private final CarroService carroService;

    @GetMapping(value = "{id}")
    public ResponseEntity<CarroResponseDTO> findById(@PathVariable(name = "id") String id){
        return ResponseEntity.ok().body(carroService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<CarroResponseDTO>> findAll(){
        return ResponseEntity.ok().body(carroService.findAll());
    }

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World datamotors!";
    }

    @PostMapping
    public ResponseEntity<CarroResponseDTO> register(@RequestBody CarroRequestDTO carroRequestDTO, UriComponentsBuilder uriBuilder){
        CarroResponseDTO carroResponseDTO = carroService.register(carroRequestDTO);
        
        URI uri = uriBuilder.path("/carros/{id}").buildAndExpand(carroResponseDTO.getId()).toUri();

        return ResponseEntity.created(uri).body(carroResponseDTO);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<CarroResponseDTO> update(@RequestBody CarroRequestDTO carroDTO, @PathVariable(name = "id") String id){
        return ResponseEntity.ok().body(carroService.update(id, carroDTO));
    }

    @DeleteMapping(value = "{id}")
    @Transactional
    public ResponseEntity<String> delete(@PathVariable String id){
        return ResponseEntity.ok().body(carroService.delete(id));
    }

    @DeleteMapping(value = "/delete")
    @Transactional
    public ResponseEntity<String> deleteAll(){
        return ResponseEntity.ok().body(carroService.deleteAll());
    }

}
