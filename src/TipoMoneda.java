import java.util.Map;

public record TipoMoneda(String base_code, Map<String, Double> conversion_rates) {
}
