//Autor: Jesus David Calderón Gomez

package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        //SUMA
        System.out.println("====SUMA====");
        int Numero1;
        int Numero2;
        int Resultado;
        
        System.out.print("Ingrese el primer número: ");
        Numero1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        Numero2 = input.nextInt();
        
        Resultado = Numero1 + Numero2;
        
        System.out.println("El resultado de la suma es: " + Resultado);
        
        //RESTA
        System.out.println("====RESTA====");
        System.out.print("Ingrese el primer número: ");
        Numero1 = input.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        Numero2 = input.nextInt();
        
        Resultado = Numero1 - Numero2;
        
        System.out.println("El resultado de la resta es: " + Resultado);
    }
    
}
