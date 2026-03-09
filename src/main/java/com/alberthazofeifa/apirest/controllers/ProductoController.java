package com.alberthazofeifa.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alberthazofeifa.apirest.entities.Producto;
import com.alberthazofeifa.apirest.repositories.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository repo;

    @GetMapping
    public List<Producto> listar(){
        return repo.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto){
        return repo.save(producto);
    }
}