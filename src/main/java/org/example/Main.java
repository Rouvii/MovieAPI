package org.example;

import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
        String apiKey = System.getenv("API_KEY");

        if (apiKey == null) {
            System.out.println("API_KEY is not set");
        } else {
            System.out.println("API_KEY is set");


            HttpClient client = HttpClient.newHttpClient();

        }
    }
}