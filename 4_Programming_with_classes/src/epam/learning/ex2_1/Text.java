package epam.learning.ex2_1;

import java.util.ArrayList;

public class Text {
    //TODO из строки текст сделать массив предложений (которые должны быть разбиты на массив слов) и сделать это в конструкторе
    private ArrayList<Sentence> sentenceArrayList;

    public Text (Sentence sentence) {
        this();
        sentenceArrayList.add(sentence);
    }

    public Text () {
        sentenceArrayList = new ArrayList<>();
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


}
