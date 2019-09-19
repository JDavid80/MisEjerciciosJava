//Autor: Jesus 
package condicionales;

import java.util.Scanner;
public class If {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String PassSystem = "David";
        String PassIngresada = "";
        
        System.out.println("Ingrese la contraseña: ");
        PassIngresada = input.nextLine();
        
        if (PassIngresada.equals(PassSystem)){
            System.out.println("Bienvenido!!");
        }
    }
    
}
