package epam.learning.ex2_1;

import java.util.ArrayList;

public class Text {


    private ArrayList<Sentence> sentenceArrayList;

    public Text (ArrayList<Sentence> text) {
        sentenceArrayList = text;
    }

    public ArrayList<Sentence> getSentenceArrayList() {
        return sentenceArrayList;
    }

    public void setSentenceArrayList(ArrayList<Sentence> sentenceArrayList) {
        this.sentenceArrayList = sentenceArrayList;
    }

    public ArrayList<Sentence> addSentence (Sentence sentence) {
        sentenceArrayList.add(sentence);
        return sentenceArrayList;
    }


}
