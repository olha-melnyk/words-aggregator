package com.olga;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main{

    public static void main(String[] args) throws IOException {
        WordsReader reader = new WordsReader("/physicist.txt");
        String words = String.valueOf(reader.read());
        System.out.println( "Words:" + words);

        final String urlString = "http://api.pearson.com/v2/dictionaries/entries?headword=nut";

        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        InputStream inputStream = connection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = "";
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println("s = " + s);
        }

    }





}
