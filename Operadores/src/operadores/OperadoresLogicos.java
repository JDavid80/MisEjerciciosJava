//Autor: Jesus David Calderón G.
package operadores;

import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int Sede = 0;
        int DiaFacturacion = 0;
        double ValorCompra = 0;
        int Edad = 0;
        
        System.out.print("Ingrese la sede del almacén: ");
        Sede = input.nextInt();
        System.out.print("Ingrese el día de facturación: ");
        DiaFacturacion = input.nextInt();
        System.out.print("Ingrese el valor de la compra: ");
        ValorCompra = input.nextInt();
        System.out.print("Ingrese la edad: ");
        Edad = input.nextInt();
        
        if (Sede != 11001){
            System.out.println("Los descuentos no aplican para esta sede");
        }
        else{
            if ((DiaFacturacion == 15 || DiaFacturacion == 30) && ValorCompra >= 50000){
                ValorCompra = ValorCompra * 0.90;
                System.out.println("Felicitaciones. Has obtenido un 10% de descuento en tus compras");
            }
            else if (DiaFacturacion == 5 && Edad >= 65){
                ValorCompra = ValorCompra * 0.95;
                System.out.println("Felicitaciones. Has obtenido un 5% de descuento en tus compras");
            }
        }
        System.out.print("El valor total de la compra es: " + ValorCompra);
    }
}
