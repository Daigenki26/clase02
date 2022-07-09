package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidad;

        System.out.println("introduzca la velocidad en Km/h");
        velocidad = sc.nextDouble();
        
        System.out.println("Velocidad en m/s: " + (velocidad*1000/3600));   
    }
}
