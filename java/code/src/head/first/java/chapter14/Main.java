package head.first.java.chapter14;

public class Main {
    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
        QuizCardPlayer qReader = new QuizCardPlayer();
        qReader.go();
    }
}
