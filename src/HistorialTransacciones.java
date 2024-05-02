import java.util.ArrayList;
import java.util.List;

public class HistorialTransacciones {
    private List<String> historial = new ArrayList<>();

    public void agregarTransaccion(String transaccion) {
        historial.add(transaccion);
    }

    public void mostrarHistorial() {
        System.out.println("Mostrando historial de transacciones:");
        for (String transaccion : historial) {
            System.out.println(transaccion);
        }
    }
}
