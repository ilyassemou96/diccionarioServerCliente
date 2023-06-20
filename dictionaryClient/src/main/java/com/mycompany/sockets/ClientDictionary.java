package com.mycompany.sockets;

import static com.mycompany.sockets.FormClientDictionary.jTAMsgFromServer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;


public class ClientDictionary extends Thread{
    public  String HOST = "localhost";
    public  int PORT = 8000;
    public String palabra = "";
    public PrintWriter out ;
    public BufferedReader in ;
    public BufferedReader stdIn ;
    public Socket socket;
    public JTextArea jTAMsgFromServer;
    
    public ClientDictionary(String ip, int portnumber, JTextArea jTAMsgFromServer) throws IOException{
        this.socket = new Socket(ip, portnumber);
        this.out = new PrintWriter(this.socket.getOutputStream(), true);
        this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        this.jTAMsgFromServer = jTAMsgFromServer;
    }

    public void enviarMensaje (PrintWriter out , BufferedReader in, String palabra  ) throws IOException{
        String fromServer = "";
        String fromUser = "";

            // Mapa para almacenar las palabras y su conteo
            Map<String, Integer> wordCountMap = new HashMap<>();
            int totalWordCount = 0;
    
                System.out.println("Server: " + fromServer);
                if (fromServer.equals("¡Adiós!")) {
                    //break;
                }
                fromUser = palabra;
                
                //fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    out.println(fromUser);
                    //fromUser = "";
                    palabra = "";
                    // Verifica si la entrada es "Bye." para salir
                    if (fromUser.equalsIgnoreCase("Bye.")) {
                        //break;
                    // System.out.println("Linea 42. Primer If");

                    }

                    // Verifica si la entrada es una consulta al diccionario
                    if (fromUser.startsWith("#DICTIONARY#QUERY_WORD#")) {
                        System.out.println("Linea 48. Segundo If");
                        // Envía la consulta al servidor
                        String queryResult = getQueryResult(fromUser.substring("#DICTIONARY#QUERY_WORD#".length()), out, in);
                        System.out.println("Server Response: " + queryResult);
                        //continue;
                    }

                    // Divide la entrada en palabras individuales
                    String[] words = fromUser.trim().split("\\s+");

                    for (String word : words) {
                        // Procesa cada palabra
                        int count = wordCountMap.getOrDefault(word, 0);
                        count++;
                        wordCountMap.put(word, count);
                        totalWordCount++;
                    }

                    // Muestra todas las palabras introducidas con sus contadores
                    System.out.println("Server Response: Palabras introducidas:");
                    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                        String word = entry.getKey();
                        int count = entry.getValue();
                        System.out.println(word + " = " + count);
                    }

                    // Muestra el conteo total de palabras introducidas
                    System.out.println("Server Response: Conteo total de palabras introducidas: " + totalWordCount);
                }
            }
        
   public synchronized void esperar() throws InterruptedException{
       wait();
   }
   
   public synchronized void reanudar() throws InterruptedException{
       notify();
   }
   
    @Override
    public void run(){
        try {
            while((palabra = in.readLine())!= null){
                this.reanudar(); // Para notificar a la hebra
                //jTAMsgFromServer.setText(palabra+ "\n");
                jTAMsgFromServer.append(palabra+ "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClientDictionary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getQueryResult(String query, PrintWriter out, BufferedReader in) throws IOException {
        String result = "";

        // Envía la consulta al servidor
        out.println(query);
        out.flush();

        // Recibe la respuesta del servidor
        String fromServer;
        while ((fromServer = in.readLine()) != null) {
            if (fromServer.startsWith("#DICTIONARY#QUERY_WORD#")) {
                result = fromServer;
                break;
            }
        }
   return result;
    }
}