package com.example.demo.controllers;

import com.example.demo.models.Prueba;
import com.example.demo.services.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/prueba")
public class PruebaController {
    @Autowired
    private PruebaService pruebaService;
    @PostMapping()
    public Prueba MetodoPrueba(@RequestBody Prueba data){
        return pruebaService.insert(data);
    }
}
