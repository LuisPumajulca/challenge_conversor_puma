import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<String> historial = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda moneda = new ConsultaMoneda();

        String opciones = """
            Sea bienvenido/a al conversor de moneda :)

            1.- Dólar >> Peso argentino
            2.- Peso argentino >> Dólar
            3.- Dólar >> Real brasileño
            4.- Real brasileño >> Dólar
            5.- Dólar >> Peso colombiano
            6.- Peso colombiano >> Dólar
            7.- Dólar >> Sol Peruano
            8.- Sol Peruano >> Dólar
            9.- Mostrar historial
            10.- Salir
            """;

        int opcion;

        do {
            System.out.println(opciones);
            System.out.print("Elija una opción válida: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "ARS", moneda, scanner);
                    break;
                case 2:
                    convertirMoneda("ARS", "USD", moneda, scanner);
                    break;
                case 3:
                    convertirMoneda("USD", "BRL", moneda, scanner);
                    break;
                case 4:
                    convertirMoneda("BRL", "USD", moneda, scanner);
                    break;
                case 5:
                    convertirMoneda("USD", "COP", moneda, scanner);
                    break;
                case 6:
                    convertirMoneda("COP", "USD", moneda, scanner);
                    break;
                case 7:
                    convertirMoneda("USD", "PEN", moneda, scanner);
                    break;
                case 8:
                    convertirMoneda("PEN", "USD", moneda, scanner);
                    break;
                case 9:
                    mostrarHistorial();
                    break;
                case 10:
                    System.out.println("Gracias por usar el conversor de moneda. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 10);
    }

    private static void convertirMoneda(String monedaOrigen, String monedaDestino, ConsultaMoneda moneda, Scanner scanner) {
        System.out.print("Ingrese el monto a convertir: ");
        double monto = scanner.nextDouble();
        TipoMoneda tipoMoneda = moneda.convertirMoneda(monedaOrigen);
        double tasaCambio = tipoMoneda.conversion_rates().get(monedaDestino);
        double resultado = monto * tasaCambio;
        System.out.printf("%.2f %s equivale a %.2f %s%n%n", monto, monedaOrigen, resultado, monedaDestino);
        historial.add(String.format("%.2f %s -> %.2f %s", monto, monedaOrigen, resultado, monedaDestino));
    }

    private static void mostrarHistorial() {
        System.out.println("Historial de Conversiones:");
        for (String conversion : historial) {
            System.out.println(conversion);
        }
        System.out.println();
    }
}
