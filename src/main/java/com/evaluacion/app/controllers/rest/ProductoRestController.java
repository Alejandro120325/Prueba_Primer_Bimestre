package com.evaluacion.app.controllers.rest;

import com.evaluacion.app.model.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductoRestController {

    @GetMapping("/productos")
    public Producto obtenerProductoRest() {
        return new Producto(102, "Hajime no Ippo - Tomo 1", "Mangas & Cómics", 14, 18.50);
    }
}