package com.shownow.ProductosService.service;

import com.shownow.ProductosService.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    private List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> listaProductos(){
        return listaProductos;
    }

    public ProductoService(){
        listaProductos.add(new Producto(1, "Laptop", 800000, 10));
        listaProductos.add(new Producto(2, "Mouse", 15000, 50));
    }

}
