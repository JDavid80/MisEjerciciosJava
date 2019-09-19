//Autor: Jesus David Calderón Gomez
package holamundo;

import java.util.Scanner;

public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        //SUMA
        int Numero1;
        int Numero2;
        int Resultado;
        
        System.out.println("Ingrese el primer número: ");
        Numero1 = input.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        Numero2 = input.nextInt();
        
        Resultado = Numero1 + Numero2;
        
        System.out.println("El resultado es: " + Resultado);
        
        
    }
    
}
