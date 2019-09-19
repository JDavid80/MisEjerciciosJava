//Jesus David Calderón Gomez
package condicionales;

import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       int NumeroEstudiante = 1;
       int TotalEstudiantes = 0;
       int NotaEstudiante = 0;
       int Excelente = 0;
       int Bueno = 0;
       int Regular = 0;
       int Malo = 0;
       int NotaErrada = 0;
       
       System.out.println("====Registro de Calificaciones====");
       System.out.println("Ingrese el número de estudiantes: ");
       TotalEstudiantes = input.nextInt();
       
       while(NumeroEstudiante <= TotalEstudiantes)
       {
           System.out.println("Ingrese la nota del estudiante N. " + NumeroEstudiante);
           NotaEstudiante = input.nextInt();
           NumeroEstudiante++;
           switch(NotaEstudiante){
               case 10:
               case 9:
                   Excelente++;
                   break;
               case 8:
               case 7:
               case 6:
                   Bueno++;
                   break;
               case 5:
               case 4:
                   Regular++;
                   break;
               case 3:
               case 2:
               case 1:
                   Malo++;
                   break;
               default:
                   NotaErrada++;
                   break;
           }
       }
       System.out.println("***Resultados***");
       System.out.println("Excelente: " + Excelente);
       System.out.println("Bueno: " + Bueno);
       System.out.println("Regular: " + Regular);
       System.out.println("Mao: " + Malo);
       System.out.println("Notas ingresadas de forma incorrecta: " + NotaErrada);
       System.out.println("________FIN DEL EJERCICIO______");
   }
}
