package com.mycompany.echoserver;

import java.util.Map;

public class DictionaryProtocol {
    private static final int WAITING = 0;
    private static final int SENT_QUERY = 1;
    private static final int SENT_INSERT = 2;

    private int state = WAITING;
    private Map<String, Integer> dictionary;

    public DictionaryProtocol(Map<String, Integer> dictionary) {
        this.dictionary = dictionary;
    }

    public String processInput(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "DICTIONARY#CONNECTION#miUsuario";
            state = SENT_QUERY;
        } else if (state == SENT_QUERY) {
            if (theInput != null && theInput.startsWith("#DICTIONARY#QUERY_WORD#")) {
                theOutput = getQueryResult(theInput);
            } else if (theInput != null && theInput.startsWith("#DICTIONARY#INSERT_WORD#")) {
                String word = theInput.substring("#DICTIONARY#INSERT_WORD#".length());
                addWordToDictionary(word);
                theOutput = "Palabra añadida al diccionario " + word;
                state = SENT_INSERT;
            } else {
                theOutput = processWords(theInput);
            }
        } else if (state == SENT_INSERT) {
            if (theInput != null && theInput.equals("#DICTIONARY#NEXT")) {
                theOutput = "Knock! Knock!";
                state = SENT_QUERY;
            } else {
                theOutput = "Adios!";
            }
        }

        return theOutput;
    }

    private String getQueryResult(String input) {
        String word = input.substring("#DICTIONARY#QUERY_WORD#".length());
        int count = dictionary.getOrDefault(word, 0);
        return "Word count: " + count;
    }

    private void addWordToDictionary(String word) {
        dictionary.put(word, dictionary.getOrDefault(word, 0) + 1);
    }

    private String processWords(String input) {
        return null;
    }
}
