package org.example;

import org.example.service.Implementation.Client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientServer {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username for the group chat: ");
        String username = scanner.nextLine();
        Socket socket = new Socket("localhost",1234);

        Client client = new Client(socket,username);
        System.out.println("Welcome " + username + ", go ahead and send message");
        System.out.println("****************************************************");
        client.listenForMessage();
        client.sendMessage();
    }
}
