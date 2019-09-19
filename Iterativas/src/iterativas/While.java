//Autor: Jesus David Calderón Gomez

package iterativas;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
        String NumDoc = "";
        int NumeroParticipantes = 0;
        
        
        while(NumeroParticipantes <= 3)
        {
            NumeroParticipantes++;
            System.out.println("Participante N: " + NumeroParticipantes);
            System.out.println("Ingrese su número de documento: ");
            NumDoc = input.nextLine();
        }
        System.out.println("Se ha completado el cupo. No se pueden ingresar mas participantes.");
    }
}
