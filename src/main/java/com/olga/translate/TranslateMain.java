package com.olga.translate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TranslateMain extends ApiKey{

    public static void main(String[] args) throws IOException {
        TranslateReader readerTranslate = new TranslateReader("/physicist.txt");
        String wordsTranslate = String.valueOf(readerTranslate.translateRead());
        System.out.println("Words:" + wordsTranslate);

        try {
            String string = getJsonStringYandex("en-ru", wordsTranslate);
            System.out.println("Translate: " + string);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static String getJsonStringYandex(String trans, String text) throws IOException, ParseException {

        String requestUrl = "https://translate.yandex.net/api/v1.5/tr.json/translate?key="
                + YANDEX_API_KEY + "&lang=" + trans + "&text=" + text;

        URL url = new URL(requestUrl);
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.connect();
        int rc = httpConnection.getResponseCode();

        if (rc == 200) {
            String line;
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
            StringBuilder strBuilder = new StringBuilder();
            while ((line = buffReader.readLine()) != null) {
                strBuilder.append(line + '\n');
            }

            return getTranslateFromJSON(strBuilder.toString());
        }
        return "Горіх";
    }

    public static String getTranslateFromJSON(String str) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(str);
        StringBuilder sb = new StringBuilder();
        JSONArray array = (JSONArray) object.get("text");
        for (Object s : array) {
            sb.append(s.toString() + "\n");
        }
        return sb.toString();
    }

}

