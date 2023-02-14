package http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;
import java.util.Scanner;

public class SocketRunner {
    public static  void main(String[] args) throws IOException {
        var inetAddress = Inet4Address.getByName("localhost");
       try(var socket = new Socket(inetAddress, 7777);
        var outPutStream = new DataOutputStream(socket.getOutputStream());
        var inPutStream =  new DataInputStream(socket.getInputStream());
        var scanner = new Scanner(System.in)){
           while (scanner.hasNextLine()){
               var request = scanner.nextLine();
               outPutStream.writeUTF(request);
               System.out.println("Response from server: " + inPutStream.readUTF());
           }

       }


 }
}
