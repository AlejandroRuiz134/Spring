package edu.modelos.holamundo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saludo(@RequestParam(defaultValue = "Mundo") String nombre) {
        String mensaje = "Hola, " + nombre;
        return new Saludo(mensaje, mensaje.length());
    }
}