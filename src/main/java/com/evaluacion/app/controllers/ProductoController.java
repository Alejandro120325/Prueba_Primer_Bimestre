package com.evaluacion.app.controllers;

import com.evaluacion.app.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

    @GetMapping("/ver-producto")
    public String verProducto(Model model) {
        Producto producto = new Producto(101, "Manga One Piece - Vol. 100", "Mangas & Cómics", 25, 14.99);

        model.addAttribute("item", producto);

        return "detalleProducto";
    }
}