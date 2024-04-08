package com.softtek.modelo.Ejercicio6;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int ID;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public void comprobar() throws ExceptionID {
        if (ID==0){
            throw new ExceptionID("No tiene ID");
        }
    }
}
