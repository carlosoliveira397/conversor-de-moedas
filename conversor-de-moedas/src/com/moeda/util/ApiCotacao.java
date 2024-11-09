package com.moeda.util;

//import com.moeda.classe.Coin;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCotacao {
    
    private static final String apiKey = "SUA_API_KEY";
    private static final String baseURL = "https://v6.exchangerate-api.com/v6/";
    private static final String pair = "/pair/";

    public static String obterCotacao(String valor, String moedaInicial, String moedaFinal) throws IOException, InterruptedException {
        try {
        	
            // Construir a URL da API com os parâmetros necessários
            String url = baseURL + apiKey + pair + moedaInicial + "/" + moedaFinal + "/" + valor;

            // Criar um objeto HttpClient para fazer a requisição HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            // Enviar a requisição e receber a resposta como uma string JSON
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            // Configurar o Gson com o CotacaoAdapter
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Cotacao.class, new CotacaoAdapter())
                    .create();

            // Desserializar o JSON para um objeto Cotacao usando Gson
            Cotacao cotacao = gson.fromJson(json, Cotacao.class);

            // pega o resultado
            String resultado = cotacao.getConversion_result();

            return resultado;
            
        } catch (Exception e) {
            return "Valor invalido...";
        }
    }
}
