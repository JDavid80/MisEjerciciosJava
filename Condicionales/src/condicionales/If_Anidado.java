//Autor: Jesus David Calderón
package condicionales;

import java.util.Scanner;

public class If_Anidado {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        
        String UserDB = "David";
        String PassDB = "D1234";
        String UserIng = "";
        String PassIng = "";
        
        System.out.println("Por favor, ingrese su usuario: ");
        UserIng = input.nextLine();
        
        if (UserIng.equals(UserDB)){
            System.out.println("Por favor, ingrese su contraseña: ");
            PassIng = input.nextLine();
            
            if(PassIng.equals(PassDB)){
                System.out.println("Bienvenido!!");
            }
            else{
                System.out.println("Contraseña Incorrecta!!");
            }
        }
        else{
            System.out.println("Usuario Incorrecto");
        }
    }
}
