import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorArchivos {
    public void guardarJson(String resultado, String nombreArchivo) {
        Gson gson = new Gson();
        String json = gson.toJson(resultado);

        try (FileWriter escritura = new FileWriter(nombreArchivo)) {
            escritura.write(json);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo JSON");
        }
    }
}
