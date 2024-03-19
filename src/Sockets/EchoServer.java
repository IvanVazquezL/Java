package Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private static final int PORT = 34522;

    public static void main(String[] args) {
        // To create a server socket
        // The server object listens on port 34522 for connection requests from clients.
        try (ServerSocket server = new ServerSocket(PORT)) {
            while (true) {
                Session session = new Session(server.accept());
                session.run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
