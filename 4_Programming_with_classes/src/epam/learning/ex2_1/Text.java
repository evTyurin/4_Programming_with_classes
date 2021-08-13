package epam.learning.ex2_1;

import java.util.ArrayList;

public class Text {

    private ArrayList<Sentence> sentenceArrayList;

    public Text () {
        sentenceArrayList = new ArrayList<>();
    }

    public Text (Sentence sentence) {
        this();
        sentenceArrayList.add(sentence);
    }

    public Text (String text) {
        this();
        String[] sentences = text.split("[.!?]");
        for (String sentence : sentences) {
            sentenceArrayList.add(new Sentence(sentence.trim()));
        }
    }

    public ArrayList<Sentence> getSentenceArrayList() {
        return sentenceArrayList;
    }

    public void setSentenceArrayList(ArrayList<Sentence> sentenceArrayList) {
        this.sentenceArrayList = sentenceArrayList;
    }

    public void addSentence (Sentence sentence) {
        sentenceArrayList.add(sentence);
    }

    public void addHeading (Sentence sentence) {
        sentenceArrayList.add(0,sentence);
    }

    public String getTextArray () {

        StringBuilder string = new StringBuilder();
        for (Sentence sentence : sentenceArrayList) {
            string.append(sentence.getWordArray() + " ");
        }
        return string.toString();
    }

    public void showArrayOfStrings () {
        for (Sentence sentence: sentenceArrayList
        ) {
            System.out.println(sentence.getWordArray());
        }
    }

    public void showElementsOfSentenceArray () {
        for (Sentence sentence: sentenceArrayList) {
            sentence.showElementsOfWordArray();
        }
    }


}
