package org.example;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8000),0);
        httpServer.createContext("/hello",new HelloHandler());
        httpServer.start();
        System.out.println("server started on port 8000");
    }
}