package org.informatorio;

import org.informatorio.domain.*;
import org.informatorio.entreis.InputConsoleService;

public class App 
{
    public static void main( String[] args )
    {
        InputConsoleService.createScanner();

        //menu
        int opc;
        do {
            System.out.println("1: Ver Productos");
            System.out.println("2: agregar producto al carrito");
            System.out.println("3: Comprar Producto");
            System.out.println("4: Ver pedidos");
            System.out.println("5: Salir");

            System.out.println("ingrese una oopcion: ");
            opc=InputConsoleService.getScanner().nextInt();

            switch (opc) {
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    System.out.println("opcion 2");

                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("CHAUUUU GRACIAS POR VENIR!!!!");
                    break;
                default:
                    System.out.println("Error ! Opciones invalida");
                    break;
            }

        } while (opc!=5);
        /*
        Cuenta cuenta1 = new Cuenta(1L,"usuario1",25.00);
        System.out.println("numCuenta: "+cuenta1.getNumCuenta());
        System.out.println("consultar saldo: "+cuenta1.ConsultarSaldo());
        cuenta1.DepositarSaldo(20.20);
        System.out.println("consultar saldo: "+cuenta1.ConsultarSaldo());
        cuenta1.RetirarSaldo(50.0);
        System.out.println("consultar saldo: "+cuenta1.ConsultarSaldo());
        */
        CuentaCorriente cuentaC1 = new CuentaCorriente();
        System.out.println(cuentaC1.getNumCuenta()+cuentaC1.getTitular()+cuentaC1.getSaldo());
    }

}
