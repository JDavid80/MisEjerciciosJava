//Autor: Jesus David Calderón G.
//Calculadora
package operadores;

import java.util.Scanner;

public class Calculadora {
   public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("====Calculadora====");
        int Numero1;
        int Numero2;
        int Resultado = 0;
        int TipoOperacion = 0;
        System.out.println("Seleccione un tipo de operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        System.out.print("Ingrese el tipo de operación: ");
        TipoOperacion = input.nextInt();
        
        System.out.print("Ingrese el primer entero: ");
        Numero1 = input.nextInt();
        
        System.out.print("Ingrese el segundo entero: ");
        Numero2 = input.nextInt();
        if(TipoOperacion > 1 || TipoOperacion < 2){
            Resultado = Numero1 + Numero2;
        }
        else if(TipoOperacion == 2){
            Resultado = Numero1 - Numero2;
        }
        else{
            System.out.println("Debe ingresar un entero válido");
        }
        System.out.println("El resultado es: " + Resultado);
        
        
       
    }
    
}
