package com.olga;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WordsReader {

    private String path;

    public WordsReader(String path) {
        this.path = path;
    }

    public List<String> read() throws IOException {
        List<String> result = new ArrayList<String>();
        try {
            File file = new File(getClass().getResource(path).getFile());
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                result.add(line);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        }
    }


}
