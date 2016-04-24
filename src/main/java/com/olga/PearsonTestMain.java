package com.olga;

import com.olga.pearson.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class PearsonTestMain {
    public static void main(String[] args) throws IOException {

        File file = new File(PearsonTestMain.class.getResource("/response.json").getFile());

        PearsonClient client = new PearsonClient();
        Response response = client.parseFile(file);

        System.out.println("Status: " + response.getStatus() +
                "\n" + "Offset: " + response.getOffset() +
                "\n" + "Limit: " + response.getLimit() +
                "\n" + "Count: " + response.getCount() +
                "\n" + "Total: " + response.getTotal() +
                "\n" + "Json List size: " + response.getResults().size());

        List<ResultItem> resultItems = response.getResults();
        for (ResultItem resultItem : resultItems) {
            System.out.println("\t" + resultItem.getHeadword());

            List<Pronunciation> pronunciations = resultItem.getPronunciations();
            if (pronunciations != null) {
                for (Pronunciation pronunciation : pronunciations) {
                    System.out.println("\t\t" + pronunciation.getIpa());
                }
            }

            List<Sense> senses = resultItem.getSenses();
            if (senses != null) {
                for (int k = 0; k < senses.size(); k++) {
                    List<Example> example = resultItem.getSenses().get(k).getExamples();
                    if (example != null) {
                        System.out.println("Example: " + example.get(k).getText());
                    }
                }
            }
        }
    }
}
