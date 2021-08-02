package epam.learning;

public class Sentence {

    private String sentence = "";

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public String addWord(Word word) {
        this.sentence += word.getWord() + " ";
        return sentence;
    }
}
