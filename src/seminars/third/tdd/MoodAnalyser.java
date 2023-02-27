package seminars.third.tdd;

public class MoodAnalyser {

    public String analize(String phrase) {
        if (phrase.contains("good")) {
            return "Happy";
        } else if (phrase.contains("bad")) {
            return "Sad";
        } else {
            return "Neutral";
        }
    }
}
