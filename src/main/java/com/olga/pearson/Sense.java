package com.olga.pearson;

import java.util.List;

public class Sense {
    private List<Example> examples;

    public Sense(List<Example> examples, String definitions) {
        this.examples = examples;
    }

    public List<Example> getExamples() {
        return examples;
    }

}
