/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tam
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String clientSentence;
         String capitalizedSentence;
         ServerSocket welcomeSocket = new ServerSocket(6789);

         while(true)
         {
            Socket connectionSocket = welcomeSocket.accept();
            //BufferedReader inFromClient =
            //   new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            ///clientSentence = inFromClient.readLine();
            //System.out.println("Received: " + clientSentence);
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';
            //capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes("hello hello hello hello");
            outToClient.close();
            connectionSocket.close();
         }
    }
    
}
