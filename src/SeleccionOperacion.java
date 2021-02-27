package com.company;

import java.util.Scanner;

public class SeleccionOperacion {
    private static Scanner scn;
    private static int num;

    public SeleccionOperacion() {
        scn = new Scanner(System.in);
        System.out.print("1.Suma : , 2.Resta : , 3.Multiplicacion : , 4.Division :");
        num = scn.nextInt();
        switch(num) {
            case 1:
                com.company.Calculos.suma();
                break;
            case 2:
                com.company.Calculos.resta();
                break;
            case 3:
                com.company.Calculos.multiplicacion();
                break;
            case 4:
                com.company.Calculos.division();
                break;
            default:
                System.out.println("Operacion Invalida");
        }

        scn.close();
    }
}
