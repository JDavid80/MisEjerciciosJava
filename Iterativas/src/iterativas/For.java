//Autor: Jesus David Calderón Gomez

package iterativas;

import java.util.Scanner;

public class For {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int RespuestaMenu = 0;
        String RespAddCarrito = "";
        int CodigoProducto = 0;
        int CantidadProducto = 0;
        int CostoProducto = 0;
        int ValorAcumulado = 0;
        double ValorAcumuladoConDesc = 0;
        //Bicicletas
        int BicAlligator = 1700000;
        int BicScoottScale = 2850000;
        int Specialized = 3200000;
        int Giant = 2120000;
        int Cannondale = 3550000;
        
        System.out.println("EJERCICIO FOR");
        
        System.out.println("           ===CATALOGO DE BICICLETAS===");
        System.out.println("GW Alligator..............$1.700.000 - Código(3525)");
        System.out.println("SCOTT Scale 980...........$2.850.000 - Código(5687)");
        System.out.println("Specialized Rockhopper....$3.200.000 - Código(4158)");
        System.out.println("GIANT Atx.................$2.120.000 - Código(2687)");
        System.out.println("Cannondale 700 M..........$3.550.000 - Código(3158)");
        
        System.out.println("1. Facturación");
        System.out.println("2. Salir");
        RespuestaMenu = input.nextInt();
        if(RespuestaMenu == 1)
        {
            int cliente;
           for(cliente = 1; cliente <= 3; cliente++)
           {
               System.out.println("============");
               System.out.println("Cliente N. " + cliente);
               System.out.println("============");
               System.out.print("Desea agregar productos al carrito?(Y/N) :");
               RespAddCarrito = input.next();
               while(RespAddCarrito.equals("Y"))
               {
                    System.out.println("Ingrese el código del producto: (999 para Salir)");
                    CodigoProducto = input.nextInt();

                    if(CodigoProducto != 999)
                    {
                        System.out.println("Ingrese la cantidad: ");
                        CantidadProducto = input.nextInt();
                        switch(CodigoProducto)
                         {
                            case 3525:
                                System.out.println("Usted ha seleccionado: Bicicleta GW Alligator. Cantidad: " + CantidadProducto);
                                CostoProducto = BicAlligator * CantidadProducto;
                                ValorAcumulado += CostoProducto;
                                System.out.println("El costo de este producto por la cantidad solicitada es: " + CostoProducto);
                                System.out.println("El acumulado de su compra sin descuentoes es de: " + ValorAcumulado);
                                break;
                             case 5687:
                                System.out.println("Usted ha seleccionado: Scott Scale 980 Cantidad: " + CantidadProducto);
                                 CostoProducto = BicScoottScale * CantidadProducto;
                                ValorAcumulado += CostoProducto;
                                System.out.println("El costo de este producto por la cantidad solicitada es: " + CostoProducto);
                                System.out.println("El acumulado de su compra sin descuentoes es de: " + ValorAcumulado);
                                break;
                             case 4158:
                                 System.out.println("Usted ha seleccionado: Specialized Rockhopper. Cantidad: " + CantidadProducto);
                                 CostoProducto = Specialized * CantidadProducto;
                                ValorAcumulado += CostoProducto;
                                System.out.println("El costo de este producto por la cantidad solicitada es: " + CostoProducto);
                                System.out.println("El acumulado de su compra sin descuentoes es de: " + ValorAcumulado);
                                 break;
                             case 2687:
                                 System.out.println("Usted ha seleccionado: GIANT Atx. Cantidad: " + CantidadProducto);
                                 CostoProducto = Giant * CantidadProducto;
                                ValorAcumulado += CostoProducto;
                                System.out.println("El costo de este producto por la cantidad solicitada es: " + CostoProducto);
                                System.out.println("El acumulado de su compra sin descuentoes es de: " + ValorAcumulado);
                                 break;
                             case 3158:
                                 System.out.println("Usted ha seleccionado: Cannondale 700 M. Cantidad: " + CantidadProducto);
                                CostoProducto = Cannondale * CantidadProducto;
                                ValorAcumulado += CostoProducto;
                                System.out.println("El costo de este producto por la cantidad solicitada es: " + CostoProducto);
                                System.out.println("El acumulado de su compra sin descuentoes es de: " + ValorAcumulado);
                                 break;
                             default:
                                 System.out.println("Ingrese un código válido.");
                                 break;
                         }
                    }
                    System.out.print("Desea agregar mas productos al carrito(Y/N): ");
                    RespAddCarrito = input.next();
               }
                switch(cliente){
                    case 1:
                        ValorAcumuladoConDesc = ValorAcumulado * 0.80;
                        break;
                    case 2:
                        ValorAcumuladoConDesc = ValorAcumulado * 0.85;
                        break;
                    case 3:
                        ValorAcumuladoConDesc = ValorAcumulado * 0.90;
                        break;
                    default:
                        System.out.println("Este usuario ya no tiene descuentos.");
                }
               System.out.println("El valor de la compra para el cliente N. " + cliente + " sin descuento es de: " + ValorAcumulado);
               System.out.println("El valor de la compra para el cliente N. " + cliente + " con descuento es de: " + ValorAcumuladoConDesc);
               ValorAcumulado = 0;
               ValorAcumuladoConDesc = 0;
           }
           System.out.println("=====Fin del Ejercicio=====");
        }
    }
}
