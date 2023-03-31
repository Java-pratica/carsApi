package com.testcamp.carsapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testcamp.carsapi.dto.carsDTO;

@RestController
@RequestMapping("/api/cars")

public class carsApi {
    
    @PostMapping
    public void create(@RequestBody carsDTO req) {
        System.out.println(req.anoModelo());
        System.out.println(req.dataFabricacao());
        System.out.println(req.fabricante());
        System.out.println(req.valor());
        System.out.println(req.modelo());
    }
}
