//Autor: Jesus David Calderón G.

package iterativas;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Login");
        
        String ClaveBD = "1234";
        String ClaveUser = "";
        int NumVeces = 0;
                
        do{
            System.out.println("Ingrese la clave: ");
            ClaveUser = input.next();
            NumVeces++;
        }while(!ClaveUser.equals(ClaveBD) && NumVeces < 3);
        if (NumVeces == 3 && !ClaveBD.equals(ClaveUser)){
            System.out.println("Acceso no permitido");
        }
        else
        {
            System.out.println("Bienvenido");
        }
    }
}
