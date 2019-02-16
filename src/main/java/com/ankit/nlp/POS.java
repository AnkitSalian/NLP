package com.ankit.nlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class POS {

    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hey! This is Ankit Salian.";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for (CoreLabel coreLabel : coreLabelList){
            String pos = coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText()+" = "+pos);
        }
    }
}
