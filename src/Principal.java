import java.io.IOException;
import java.util.Scanner;
import java.lang.RuntimeException;

public class Principal{
    public static void main(String[] args) throws IOException, RuntimeException {
        Scanner lectura = new Scanner(System.in);

        MonedaConsulta monedaConsulta = new MonedaConsulta();
        RuntimeException conversor = monedaConsulta.buscarConversion ("USD", "ARG");
        System.out.println(conversor);

        System.out.println("*******************************************");
        System.out.println("    BIENVENIDO AL CONVERSOR DE MONEDAS  \n");
        String menu = """ 
                Elija el tipo de moneda que desea convertir:
        1) DÓLAR A PESO ARGENTINO
        2) PESO ARGENTINO A DÓLAR
        3) DÓLAR A REAL BRASILEÑO
        4) REAL BRASILEÑO A DÓLAR
        5) DÓLAR A PESO COLOMBIANO
        6) PESO COLOMBIANO A DÓLAR
        7) SALIR

                ELIJA UNA OPCIÓN VÁLIDA
        """;
        int opcion = 0;

        while (opcion != 7) {
            System.out.println(menu);
            System.out.println("********************************************");
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    conversor = monedaConsulta.buscarConversion("USD","ARG");
                    System.out.println("1 USD EQUIVALE A: " + conversor.hashCode() + "  PESOS ARGENTINOS");
                    System.out.println("********************************************");
                    break;
                case 2:
                    conversor = monedaConsulta.buscarConversion("ARG","USD");
                    System.out.println("1 ARG EQUIVALE A: " + conversor.hashCode() + " DÓLARES");
                    System.out.println("********************************************");
                    break;
                case 3:
                    conversor = monedaConsulta.buscarConversion("USD", "BRL");
                    System.out.println("1 USD EQUIVALE A: " + conversor.hashCode() + " REAL BRASILEÑO");
                    System.out.println("********************************************");
                    break;
                case 4:
                    conversor = monedaConsulta.buscarConversion("BRL", "USD");
                    System.out.println("1 BRL EQUIVALE A: " + conversor.hashCode() + " DÓLARES");
                    System.out.println("********************************************");
                    break;
                case 5:
                    conversor = monedaConsulta.buscarConversion("USD", "COP");
                    System.out.println("1 USD EQUIVALE A: " + conversor.hashCode() + " PESO COLOMBIANO");
                    System.out.println("********************************************");
                    break;
                case 6:
                    conversor = monedaConsulta.buscarConversion("COP", "USD");
                    System.out.println("1 COP EQUIVALE A: " + conversor.hashCode() + " DÓLARES");
                    System.out.println("********************************************");
                    break;
                case 7:
                    System.out.println("GRACIAS POR UTILIZAR LA APLICACIÓN");
                    System.out.println("********************************************");
                    break;
                default:
                    System.out.println("LO SENTIMOS, OPCIÓN NO VALIDA");
                    System.out.println("********************************************");
                    break;
            }
        }
    }
}
