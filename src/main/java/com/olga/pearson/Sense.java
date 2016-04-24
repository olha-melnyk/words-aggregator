package com.olga.pearson;

import java.util.List;

public class Sense {
    private List<Example> examples;
    private String[] definitions;

    public Sense(List<Example> examples, String[] definitions) {
        this.examples = examples;
        this.definitions = definitions;
    }

    public List<Example> getExamples() {
        return examples;
    }

    public String[] getDefinitions() {
        return definitions;
    }
}
