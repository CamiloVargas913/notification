package com.example.demo.services;

import com.example.demo.models.Prueba;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PruebaService {
    private static Logger logger = LoggerFactory.getLogger(PruebaService.class);
    private Prueba objPrueba;

    public Prueba insert(Prueba data) {
        try {
            objPrueba = new Prueba();
            objPrueba.numero = data.numero / 0;
            objPrueba.mesage = data.mesage;
            return objPrueba;
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            return null;
        }
    }
}
