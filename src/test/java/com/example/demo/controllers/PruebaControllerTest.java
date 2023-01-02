package com.example.demo.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PruebaControllerTest {
    @InjectMocks
    private PruebaController pruebaController;
    @Mock
    private PruebaService pruebaService;
    private Prueba pruebaModel;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        pruebaModel = new Prueba();
        pruebaModel.numero = 1;
        pruebaModel.mesage = "camilo";
    }

    @Test
    void metodoPrueba() {
        Prueba enviado = new Prueba();
        enviado.numero = 1;
        enviado.mesage = "camilo";
        when(pruebaService.insert(enviado)).thenReturn(pruebaModel);
        assertNotNull(pruebaService.insert(enviado));
        assertEquals(enviado.numero,pruebaModel.numero);
    }
}