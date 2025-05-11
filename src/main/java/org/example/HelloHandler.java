package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String response = "Hello, World!";
        exchange.getResponseHeaders().add("Content-Type", "text/plain");
        exchange.getResponseHeaders().add("X-MyApp-Version", "v0.1");
        exchange.sendResponseHeaders(200,response.length());


        OutputStream outputStream = exchange.getResponseBody();

        outputStream.write(response.getBytes());
        outputStream.close();

    }
}
