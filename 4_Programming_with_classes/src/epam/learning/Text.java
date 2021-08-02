package epam.learning;

public class Text extends Sentence {

    private String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String addSentence (Sentence sentence) {
        this.text = sentence.getSentence();
        return text;
    }

    public void showText () {
        System.out.println(this.text);
    }

    public String addHeading  (Sentence sentence) {
        this.text = sentence.getSentence() + "\n" + this.text;
        return text;
    }
}
