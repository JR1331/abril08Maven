
package com.softtek.presentacion;

import com.softtek.modelo.Ejercicio7.Calcuadora;

import java.util.Scanner;

public class pruebaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Indique el primer numero");
        double n1= sc.nextInt();

        System.out.println("Indique el segundo numero");
        double n2= sc.nextInt();
        Calcuadora cc = new Calcuadora(n1,n2);

        System.out.println("Indica que operacion quieres realizar: 1.Sumar, 2.Restar, 3.Multiplicar, 4.Dividir");
        int n3 = sc.nextInt();
        try{
            double resultado=0;
            switch (n3){
                case 1:
                    resultado=cc.sumar();
                    break;
                case 2:
                    resultado= cc.restar();
                    break;
                case 3:
                    resultado= cc.multiplicar();
                    break;
                case 4:
                    resultado= cc.dividir();
                    break;
                default:
                    System.out.println("Operacion no registrada");
                    return;
            }
            System.out.println("Resultado de la operacion es "+resultado);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
