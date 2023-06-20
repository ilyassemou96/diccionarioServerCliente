package com.mycompany.echoserver;

import java.net.*;
import java.io.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class DiccionarioMultiServerThread extends Thread {
    private Socket socket = null;
    private Map<String, Integer> diccionario;
    private List<DiccionarioMultiServerThread> clientList;

    public DiccionarioMultiServerThread(Socket socket, Map<String, Integer> diccionario, List<DiccionarioMultiServerThread> clientList) {
        super("DiccionarioMultiServerThread");
        this.socket = socket;
        this.diccionario = diccionario;
        this.clientList = clientList;
    }

    public void run() {
        try (
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            String inputLine, outputLine;

            // Enviar saludo inicial al cliente
            outputLine = "¡Bienvenido al servidor !";
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) {
                outputLine = processInput(inputLine);

                // Verificar si la entrada es una consulta al diccionario
                if (inputLine.startsWith("#DICTIONARY#QUERY_WORD#")) {
                    String word = inputLine.substring("#DICTIONARY#QUERY_WORD#".length());

                    // Buscar la palabra en el diccionario
                    Integer count = diccionario.getOrDefault(word, 0);
                    outputLine = "#DICTIONARY#QUERY_WORD#" + word + " = " + count;
                }

                out.println(outputLine);

                if (outputLine != null && outputLine.equals("¡Adiós!")) {
                    break;
                }
            }

            // Remover el cliente de la lista al desconectarse
            clientList.remove(this);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String processInput(String input) {
        // Implementa la lógica de procesamiento de entrada aquí
        // y devuelve la respuesta correspondiente.
        return null;
    }
}
