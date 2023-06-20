package com.mycompany.echoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.util.Map.entry;
import javax.swing.JTextArea;


public class DiccionarioServer extends Thread {
    public static Map<String, Integer> wordCountMap = new HashMap<>();
    public JTextArea jTAServerDictionary;
    int portNumber = 8000;
    
    public DiccionarioServer(JTextArea jTAServerDictionary){
        this.jTAServerDictionary = jTAServerDictionary;
    }

    @Override
    public void run() {
        
        int clientCount = 0;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server runed. Listening on port " + portNumber);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                clientCount++;
                jTAServerDictionary.setText(jTAServerDictionary.getText()+"\n" + "Client " + clientCount + " connected.");

                Thread clientThread = new Thread(() -> {
                    try (
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
                    ) {
                        String inputLine, outputLine;

                        // Inicia la conversación con el cliente
                        outputLine = "Introduce una palabra o escribe \"Bye.\" para salir:";
                        out.println(outputLine);

                        while ((inputLine = in.readLine()) != null) {
                            // Verifica si se recibió "Bye." para salir
                            if (inputLine.equals("Bye.")) {
                                outputLine = "¡Adiós!";
                                out.println(outputLine);
                                break;
                            }

                            // Procesa las palabras utilizando el método actualizado
                            String[] words = inputLine.trim().split("\\s+");
                            processWords(words);

                            //outputLine = wordCountMap.get(0).toString();
                            for (Iterator<Map.Entry<String, Integer>> it = wordCountMap.entrySet().iterator(); it.hasNext();) {
                                Map.Entry<String, Integer> entry = it.next();
                                String key = entry.getKey();
                                int tab = entry.getValue();
                                
                                outputLine = outputLine + key + "->" + tab + "\n";
                            }
                                   // + "Introduce otra palabra o escribe \"Bye.\" para salir:";
                            out.println(outputLine);
                        }

                        clientSocket.close();
                        // System.out.println("Client " + clientCount + " disconnected.");
                    } catch (IOException e) {
                        //System.out.println("Error al comunicarse con el cliente " + clientCount + ": " + e.getMessage());
                    }
                });

                clientThread.run();
            }
        } catch (IOException e) {
            System.out.println("Error al intentar escuchar en el puerto " + portNumber + " o al esperar una conexión");
            System.out.println(e.getMessage());
        }
    }

    public static synchronized void processWords(String[] words) {
        for (String word : words) {
            // Procesa cada palabra
            String lowercaseWord = word.toLowerCase();
            int count = wordCountMap.getOrDefault(lowercaseWord, 0);
            count++;
            wordCountMap.put(lowercaseWord, count);
        }
    }
}
