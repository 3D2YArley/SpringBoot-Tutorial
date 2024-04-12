package com.ejemplo.demo.controladores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HolaMundoController {

    @GetMapping("/")
    public String hola() {
        return "Hola Mundo";
    }

}