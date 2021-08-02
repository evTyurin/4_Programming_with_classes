package epam.learning;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> wordArrayList;
    private String sentence;

    Sentence (String sentence){
        wordArrayList = new ArrayList<Word>();
        this.sentence = sentence;
    }

    public ArrayList<Word> getWordArrayList() {
        return wordArrayList;
    }

    public void setWordArrayList(ArrayList<Word> wordArrayList) {
        this.wordArrayList = wordArrayList;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public ArrayList<Word> addWord(Word word) {
        wordArrayList.add(word);
        return wordArrayList;
    }

    public String getWordArray () {
        String string = "";
        for (int i = 0; i < wordArrayList.size(); i++) {
            string = string + wordArrayList.get(i).getWord() + " ";
        }
        return string;
    }

    public void addToSentence (String string) {
        sentence = sentence + " " + string;
        System.out.println(sentence);
    }

    public void addToSentence (Word word) {
        sentence = sentence + " " + word.getWord();
    }
}
