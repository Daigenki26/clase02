package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1,cateto2,hipotenusa;

        System.out.println("introduzca la longitud del cateto 1: ");
        cateto1 = sc.nextDouble();
        System.out.println("Introduzca la longitud del cateto 2");
        cateto2 = sc.nextDouble();
        
        //h^2 = c^2 + c^2 o h = sqrt(c^2 + c^2)
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2)) + Math.pow(cateto2, 2);
        System.out.println("La longitud de la hipotenusa es:" + hipotenusa);
    }
    
}
