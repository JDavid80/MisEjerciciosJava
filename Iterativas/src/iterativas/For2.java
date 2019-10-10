//Autor: Jesus David Calderón Gomez

package iterativas;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int chorizo = 2000;
        int Pincho = 1500;
        int tamal = 3000;
        int Chunchulla = 4000;
        int Codigo = 0;
        int Cantidad = 0;
        int Total = 0;
        int CompraAcumulada = 0;
        double CompraAcumuladaDec = 0;
        String RespuestaUsuario = "";
        
       System.out.println("Lista de Precios");
       System.out.println("1. Chorizos(Und)......$2.000");
       System.out.println("2. Pinchos(Und)...... $1.500");
       System.out.println("3. Tamales(Und).......$3.000");
       System.out.println("4. Chunchulla(Und)....$4.000");
       
       System.out.println("Desea adquirir algún producto?(Si/No)");
       RespuestaUsuario = input.next();

       while(RespuestaUsuario.equals("Si"))
       {
            System.out.println("Ingrese el código del producto que desea comprar: ");
            Codigo = input.nextInt();
       
            System.out.println("Ingrese la cantidad del producto que desea llevar: ");
            Cantidad = input.nextInt();
            switch(Codigo)
            {
                case 1:
                    Total = chorizo * Cantidad;
                    CompraAcumulada += Total;
                    break;
                 case 2:
                    Total = Pincho * Cantidad;
                     CompraAcumulada += Total;
                    break;
                 case 3:
                     Total = tamal * Cantidad;
                    CompraAcumulada += Total;
                     break;
                 case 4:
                     Total = Chunchulla * Cantidad;
                    CompraAcumulada += Total;
                     break;
                 default:
                     System.out.println("Ingrese un código válido");
            }
            System.out.print("Desea comprar algo mas? (Si, No): ");
            RespuestaUsuario = input.next();
       }
       
       int cliente = 0;    
       for(cliente = 1; cliente <= 3; cliente++)
       {
            CompraAcumuladaDec = CompraAcumulada * 0.85;
       }
       if (cliente <= 3)
       {
         System.out.println("Por ser uno de nuestros primeros clientes tendrá un descuento del 15%");
         System.out.println("El valor total de la compra es: " + CompraAcumuladaDec);
       }
       else
       {
            System.out.println("El valor total de la compra es: " + CompraAcumulada);
       }
       //Total = Cantidad * Codigo
       //System.out.println("El valor de la compra es de: " + );
    }
}
