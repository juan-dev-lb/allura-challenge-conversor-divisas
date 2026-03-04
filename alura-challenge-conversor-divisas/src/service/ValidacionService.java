package service;
import java.util.Scanner;

public class ValidacionService {

    public int validarOpcion(Scanner entrada) {

        while(true){
            System.out.println("Ingrese una opcion: ");
            String opcion = entrada.nextLine();


            try {
                if(Integer.parseInt(opcion)<1 || Integer.parseInt(opcion)>7){
                    System.out.println("Opción no válida, ingrese una opción entre 1 y 7.");
                } else {
                    return Integer.parseInt(opcion);
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida, intente nuevamente.");
            }
        }
    }

    public double validarCantidad(Scanner entrada) {
        while(true){
            System.out.println("Ingrese el monto a convertir:");
            String cantidad = entrada.nextLine();

            try {
                if(Double.parseDouble(cantidad)<=0){
                    System.out.println("Cantidad no válida, intente nuevamente.");

                } else  {
                    return Double.parseDouble(cantidad);
                }

            }  catch (NumberFormatException e) {
                System.out.println("Debe ingresar únicamente números.");
            }
        }
    }
}
