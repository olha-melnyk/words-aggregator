package com.olga.pearson;

import java.util.List;

public class ResultItem {

    private String headword;
    private List<Sense> senses;
    private List<Pronunciation> pronunciations;

    public ResultItem (String headword, List<Pronunciation> pronunciations, List<Sense> senses) {
        this.headword = headword;
        this.pronunciations = pronunciations;
        this.senses = senses;


    }
    public String getHeadword() {
        return headword;
    }

    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public List<Sense> getSenses() {
        return senses;
    }
}
