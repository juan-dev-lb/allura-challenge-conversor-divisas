import java.util.Scanner;
import service.ValidacionService;
import service.ConversionService;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ValidacionService validacion = new ValidacionService();
        ConversionService conversion = new ConversionService();
        boolean estado = true;

        while (estado) {
            System.out.println("[==========================================]");
            System.out.println("[== Bienvenido/a al conversor de divisas ==]");
            System.out.println("");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("[==========================================]");
            int opcion = validacion.validarOpcion(entrada);

            if(opcion == 7) {
                estado = false;
                System.out.println("Hasta Luego!");
                break;
            }

            double monto = validacion.validarCantidad(entrada);

            conversion.iniciarConversion(opcion, monto);

        }


    }
}