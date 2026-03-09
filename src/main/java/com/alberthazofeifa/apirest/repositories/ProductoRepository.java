package com.alberthazofeifa.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alberthazofeifa.apirest.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}