package com.olga.translate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TranslateReader {

    private String PATH;

    public TranslateReader(String path) {
        this.PATH = path;
    }

    public List<String> translateRead() throws IOException {
        List<String> result = new ArrayList<String>();
        try {
            File fileTranslate = new File(getClass().getResource(PATH).getFile());
            FileReader frTranslate = new FileReader(fileTranslate);
            BufferedReader readerTranslate = new BufferedReader(frTranslate);
            String line = readerTranslate.readLine();
            while (line != null) {
                line = readerTranslate.readLine();
                result.add(line);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        }

    }
}
