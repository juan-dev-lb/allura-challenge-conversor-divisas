package service;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class ConversionService {
    private final Map<Integer, String[]> conversiones = new HashMap<>();
    String apiKey = "b492c78648456d228b492298";

    public ConversionService() {
        conversiones.put(1, new String[]{"USD", "ARS"});
        conversiones.put(2, new String[]{"ARS", "USD"});
        conversiones.put(3, new String[]{"USD", "BRL"});
        conversiones.put(4, new String[]{"BRL", "USD"});
        conversiones.put(5, new String[]{"USD", "COP"});
        conversiones.put(6, new String[]{"COP", "USD"});
    }

    public void iniciarConversion (int opcion, double monto) {
        String[] monedas = conversiones.get(opcion);
        convertir(monedas[0], monedas[1], monto);
    }

    private void convertir (String base, String destino, double monto) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            String url_base = "https://v6.exchangerate-api.com/v6/"
                    + apiKey + "/latest/" + base;

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_base))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            ExchangeResponse exchangeResponse = gson.fromJson(response.body(), ExchangeResponse.class);
            Double tasa = exchangeResponse.conversion_rates().get(destino);

            if (tasa == null) {
                System.out.println("No se encontró tasa para " + destino);
                return;
            }

            double resultado = monto * tasa;

            System.out.println("==================================");
            System.out.println("Monto: " + monto + " " + base);
            System.out.println("Tasa: " + tasa);
            System.out.println("Resultado: " + resultado + " " + destino);
            System.out.println("==================================");

        } catch (IOException | InterruptedException e) {
            System.out.println("Error al consumir la API: " + e.getMessage());
        }
    }
}
