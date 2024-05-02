import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ConsultaMoneda {
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/c2d7ca1e1f4c09e69fcbad3f/pair/";

    public TipoMoneda convertirDolarAPesoArgentino(double monto) {
        return this.convertirMoneda(CodigoMonedas.USD.name(),CodigoMonedas.ARS.name(), monto);
    }
    public TipoMoneda convertirPesoArgentinoADolar(double monto) {
        return this.convertirMoneda(CodigoMonedas.ARS.name(),CodigoMonedas.USD.name(), monto);
    }

    public TipoMoneda convertirDolarARealBrasil(double monto) {
        return this.convertirMoneda(CodigoMonedas.USD.name(), CodigoMonedas.BRL.name(), monto);
    }
    public TipoMoneda convertirRealBrasilADolar(double monto) {
        return this.convertirMoneda(CodigoMonedas.BRL.name(), CodigoMonedas.USD.name(), monto);
    }
    public TipoMoneda convertirDolarAPesoColombiano(double monto) {
        return this.convertirMoneda(CodigoMonedas.USD.name(), CodigoMonedas.COP.name(), monto);
    }
    public TipoMoneda convertirPesoColombianoADolar(double monto) {
        return this.convertirMoneda(CodigoMonedas.COP.name(), CodigoMonedas.USD.name(), monto);
    }
    public TipoMoneda convertirDolarASoles(double monto) {
        return this.convertirMoneda(CodigoMonedas.USD.name(), CodigoMonedas.PEN.name(), monto);
    }
    public TipoMoneda convertirSolesADolar(double monto) {
        return this.convertirMoneda(CodigoMonedas.PEN.name(), CodigoMonedas.USD.name(), monto);
    }

    public TipoMoneda convertirMoneda(String monedaOrigen, String monedaDestino, double valorConvertido) {
        URI direccion = URI.create(BASE_URL + monedaOrigen + "/" + monedaDestino + "/" + valorConvertido);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TipoMoneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
