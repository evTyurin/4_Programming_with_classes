package epam.learning.ex2_1;

import java.util.ArrayList;

public class Sentence {

    private ArrayList<Word> wordArrayList;

    public Sentence (Word word){
        this();
        wordArrayList.add(word);
    }
    //TODO из строки sentence сделать массив слов (разбить) и сделать это в конструкторе
    public Sentence (){
        wordArrayList = new ArrayList<>();
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
        for (Word word : wordArrayList) {
            string.append(word.getWord())
                    .append(" ");
        }
        string.deleteCharAt(string.length() - 1)
                .append(".");

        return string.toString();
    }

    public void showArrayOfWords () {
        for (Word word: wordArrayList
        ) {
            System.out.println(word.getWord());
        }
    }

}
