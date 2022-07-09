package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class ejercicio1 {
    private static Scanner sc;

    public static void main (String[] args){
        sc = new Scanner(System.in);
        int dia, mes, año, suerte, suma, calc1 , calc2 , calc3, calc4;

        System.out.println("Introduca su fecha de nacimiento para obtener su numero de suert");
        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("Mes: ");
        mes = sc.nextInt();
        System.out.print("Año: ");
        año = sc.nextInt();

        suma = dia + mes + año;

        calc1 = suma/1000;
        calc2 = suma/100%10;
        calc3 = suma/10%10;
        calc4 = suma/10;

        suerte= calc1 + calc2 + calc3 + calc4;

        System.out.println("Su numero de la suerte es : " + suerte);



    }
}
