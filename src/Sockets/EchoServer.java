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
                try(
                        // The server can accept a new client and create a socket to interact with it
                        // The accept method forces the program to wait for a new client, i.e.,
                        // it executes until a new client comes

                        //  Now, we have a socket object that can be used to interact with the client.
                        Socket socket = server.accept();

                        // To send and receive data, we need input and output streams
                        DataInputStream input = new DataInputStream(socket.getInputStream());
                        DataOutputStream output  = new DataOutputStream(socket.getOutputStream());
                ) {
                    String msg = input.readUTF(); // read a message from the client
                    output.writeUTF(msg); // resend it to the client
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
