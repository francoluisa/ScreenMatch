package br.com.alura.screenmatch.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class PrincipalComBusca {
    public static void main(String[] args) {
           HttpClient client = HttpClient.newHttpClient();
   HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=21e14386"))
         .build();

    }
}
