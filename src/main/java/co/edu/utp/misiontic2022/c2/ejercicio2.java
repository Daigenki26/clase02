package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class ejercicio2 {
private static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        double precioUnidad, cantidadProductos, iva, precioSiniva, Totaliva;
        
        System.out.print("Introduzca precio por unidad del producto: ");
        precioUnidad = sc.nextDouble();

        System.out.print("Introduzca el numero de productos vendidos: ");
        cantidadProductos = sc.nextDouble();

        System.out.print("Introduzca el IVA%");
        iva = sc.nextDouble();

        precioSiniva = precioUnidad * cantidadProductos;
        Totaliva = precioSiniva * iva/100;

        System.out.println("Precio de venta = "+ (precioSiniva + Totaliva));

        
    }
}
