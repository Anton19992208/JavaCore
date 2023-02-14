package http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.Scanner;

public class SocketServer {
    public static void main(String[] args) throws IOException {
       try(var serverSocket =  new ServerSocket(7777);
           var socket = serverSocket.accept();
           var outPutStream = new DataOutputStream(socket.getOutputStream());
           var inputStream = new DataInputStream(socket.getInputStream());
           var scanner = new Scanner(System.in)){
           var request = inputStream.readUTF();
           while(!"stop".equals(request)){
               System.out.println("Client request: " + request);
               var response =  scanner.nextLine();
               outPutStream.writeUTF(response);
               request = inputStream.readUTF();
           }
           }
       }
    }

