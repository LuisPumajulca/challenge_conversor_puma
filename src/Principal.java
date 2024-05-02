
import java.util.Scanner;

public class Principal {
    private static final HistorialTransacciones historial = new HistorialTransacciones();
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ConsultaMoneda moneda = new ConsultaMoneda();
        int i = 0;
        String opciones = """
            Sea bienvenido/a al conversor de moneda :)
            ******************************************
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
            *******************************************         
            Escoge la opciones a seguir ....
            """;

        while (i != 10) {
            System.out.print(opciones);
            i = scanner.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.println("(USD -> Peso Argentino) - Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirDolarAPesoArgentino(monto);
                    System.out.println("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " ARS");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " ARS");
                }
                case 2 -> {
                    System.out.println("(Peso Argentino -> USD) - Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirPesoArgentinoADolar(monto);
                    System.out.println("Conversion realizada: " + monto + " ARS a " + monedero.conversion_result() + " USD");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " ARS a " + monedero.conversion_result() + " USD");
                }
                case 3 -> {
                    System.out.println("Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirDolarARealBrasil(monto);
                    System.out.println("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " BRL");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " BRL");
                }
                case 4 -> {
                    System.out.println("Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirRealBrasilADolar(monto);
                    System.out.println("Conversion realizada: " + monto + " BRL a " + monedero.conversion_result() + " USD");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " BRL a " + monedero.conversion_result() + " USD");
                }
                case 5 -> {
                    System.out.println("Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirDolarAPesoColombiano(monto);
                    System.out.println("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " COP");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " COP");
                }
                case 6 -> {
                    System.out.println("Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirPesoColombianoADolar(monto);
                    System.out.println("Conversion realizada: " + monto + " COP a " + monedero.conversion_result() + " USD");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " COP a " + monedero.conversion_result() + " USD");
                }
                case 7 -> {
                    System.out.println("Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirDolarASoles(monto);
                    System.out.println("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " PEN");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " USD a " + monedero.conversion_result() + " PEN");
                }
                case 8 -> {
                    System.out.println("Digite el monto a convertir");
                    double monto = scanner.nextDouble();
                    TipoMoneda monedero = moneda.convertirSolesADolar(monto);
                    System.out.println("Conversion realizada: " + monto + " PEN a " + monedero.conversion_result() + " USD");
                    historial.agregarTransaccion("Conversion realizada: " + monto + " PEN a " + monedero.conversion_result() + " USD");
                }
                case 9 -> {
                    historial.mostrarHistorial();
                }
                case 10 -> {
                    System.out.println("Gracias!!");
                    break;
                }
                default -> {
                    System.out.println("Opción invalida!, Elige una de las opciones validas");
                }
            }
            System.out.print(".... presione un boton para continuar: ");
            scanner.next();
            historial.mostrarHistorial();
//            System.out.println("\033[H\033[2J");
//            System.out.flush(); // Segun lei esto limpia la consola cmd
        }
    }
}
