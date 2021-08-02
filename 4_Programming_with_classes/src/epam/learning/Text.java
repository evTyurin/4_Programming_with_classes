package epam.learning;

import java.util.ArrayList;

public class Text {

    private String text;
    private ArrayList<Sentence> sentenceArrayList;

    Text (String text) {
        sentenceArrayList = new ArrayList<Sentence>();
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public ArrayList<Sentence> addSentence (Sentence sentence) {
        sentenceArrayList.add(sentence);;
        return sentenceArrayList;
    }

    public void showText () {
        System.out.println(this.text);
    }

    public void addHeading  (Sentence sentence) {
        text = sentence.getSentence() + "\n" + text;
    }

    public void addHeading  (String string) {
        text = string + "\n" + text;
    }

    public void addToText (String string) {
        text = text + " " + string;
    }

    public void addToText (Sentence sentence) {
        text = text + " " + sentence.getSentence();
    }
}
