import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.lang.RuntimeException;


    public class MonedaConsulta{


        public RuntimeException buscarConversion(String monedaAconvertir, String monedaObjetivo) {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/460446f38c452224cac52b70/latest/USD");
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), RuntimeException.class);
            } catch (Exception e){
                return new RuntimeException("NO SE PUDO RELAZAR LA CONVERSION");
            }

        }

    }