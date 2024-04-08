package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio6.ExceptionID;
import com.softtek.modelo.Ejercicio6.Producto;

public class pruebaProducto {
    public static void main(String[] args) {
        try {
            Producto p1 = new Producto();
            Producto p2 = new Producto(1, "raton", 13, "hp", "raton inalambrico");
            p2.comprobar();
            //p1.comprobar();

        } catch (ExceptionID e) {
            System.out.println(e.getMessage());

        }
    }
}
