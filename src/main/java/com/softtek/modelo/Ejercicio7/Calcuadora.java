package com.softtek.modelo.Ejercicio7;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Calcuadora {
    private double num1;
    private double num2;

    public double sumar(){
        return num1+num2;
    }

    public double restar(){
        return num1-num2;
    }
    public double multiplicar(){
        return num1*num2;
    }
    public double dividir(){
        if(num2==0){
            throw new ArithmeticException("Division no permitida");
        }
        return num1/num2;
    }

}
