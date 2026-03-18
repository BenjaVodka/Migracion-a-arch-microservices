package com.shownow.ProductosService.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;

}
