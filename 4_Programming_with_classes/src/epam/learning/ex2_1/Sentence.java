package epam.learning.ex2_1;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> wordArrayList;

    public Sentence (ArrayList<Word> sentence){
        wordArrayList = sentence;
    }

    public ArrayList<Word> getWordArrayList() {
        return wordArrayList;
    }

    public void setWordArrayList(ArrayList<Word> wordArrayList) {
        this.wordArrayList = wordArrayList;
    }


    public ArrayList<Word> addWord(Word word) {
        wordArrayList.add(word);
        return wordArrayList;
    }

    public String getWordArray () {

        StringBuilder string = new StringBuilder();
        for (int i = 0; i < wordArrayList.size(); i++) {
            string.append(wordArrayList.get(i).getWord())
                  .append(" ");
        }
        return string.toString();
    }

}
