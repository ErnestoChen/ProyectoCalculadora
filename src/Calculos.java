package com.company;

import java.util.Scanner;

public class Calculos  {
    private static Scanner in;

    public static void suma() {
        in = new Scanner(System.in);
        System.out.print("Escriba el primer numero :");
        int num1 = in.nextInt();
        System.out.print("Escriba el segundo numero :");
        int num2 = in.nextInt();
        int result = num1 + num2;
        System.out.println(result);
        in.close();
    }

    public static void resta() {
        in = new Scanner(System.in);
        System.out.print("Escriba el primer numero :");
        int num1 = in.nextInt();
        System.out.print("Escriba el segundo numero :");
        int num2 = in.nextInt();
        int result = num1 - num2;
        System.out.println(result);
        in.close();
    }

    public static void multiplicacion() {
        in = new Scanner(System.in);
        System.out.print("Escriba el primer numero :");
        int num1 = in.nextInt();
        System.out.print("Escriba el segundo numero :");
        int num2 = in.nextInt();
        int result = num1 * num2;
        System.out.println(result);
        in.close();
    }

    public static void division() {
        in = new Scanner(System.in);
        System.out.print("Escriba el primer numero :");
        int num1 = in.nextInt();
        System.out.print("Escriba el segundo numero :");
        int num2 = in.nextInt();
        if (num2 == 0)
            System.out.println("No se puede dividir entre 0");
        else {
            int result = num1 / num2;
            System.out.println(result);
            in.close();
        }
    }
}
