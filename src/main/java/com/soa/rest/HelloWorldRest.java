/**
 * 
 */
package com.soa.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class HelloWorldRest {
    
    @GetMapping("/saludar/{nombre}/{apellido}") //URL donde lo va a publicar, es el mas simple
    public ResponseEntity<String> saludo(@PathVariable String nombre, @PathVariable String apellido) {
        ResponseEntity<String> re = null;
        String respuesta = "Hola mundo " + nombre + " " + apellido;
        System.out.println(respuesta);
        re = new ResponseEntity<String>(respuesta, HttpStatus.OK);
        return re;
    }
}
