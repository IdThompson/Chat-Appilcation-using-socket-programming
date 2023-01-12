package org.example;

import org.example.service.Implementation.Server;

import java.io.IOException;
import java.net.ServerSocket;

public class MainServer {

    public static void main(String[] args) throws IOException {
        System.out.println("Server started...waiting for connection");
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
    }
}