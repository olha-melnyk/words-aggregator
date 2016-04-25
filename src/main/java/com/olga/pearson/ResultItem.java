package com.olga.pearson;

import java.util.List;

public class ResultItem {

    private String headword;
    private String part_of_speech;
    private List<Sense> senses;
    private List<Pronunciation> pronunciations;


    public ResultItem (String headword, String partOfSpeech, List<Pronunciation> pronunciations, List<Sense> senses) {
        this.headword = headword;
        this.part_of_speech = partOfSpeech;
        this.pronunciations = pronunciations;
        this.senses = senses;


    }
    public String getHeadword() {
        return headword;
    }

    public String getPartOfSpeech() {
        return part_of_speech;
    }

    public List<Pronunciation> getPronunciations() {
        return pronunciations;
    }

    public List<Sense> getSenses() {
        return senses;
    }
}
