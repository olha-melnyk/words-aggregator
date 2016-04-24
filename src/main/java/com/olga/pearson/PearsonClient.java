package com.olga.pearson;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class PearsonClient {

    public PearsonClient() {
    }

    public Response parseFile(File file) throws IOException {

        String result = FileUtils.readFileToString(file);
        Gson gsonJson = new Gson();
        Response response = gsonJson.fromJson(result, Response.class);
        return response;
    }
}
