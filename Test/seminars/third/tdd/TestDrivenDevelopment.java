package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    /**
     * Нужно написать (TDD) класс MoodAnalyser, который оценивает фразы по настроению
     */
    @Test
    void testMoodAnalysisHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String phrase = "I feel good";
        assertThat(moodAnalyser.analize(phrase)).isEqualTo("Happy");
    }
    @Test
    void testMoodAnalysisSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String phrase = "I feel bad";
        assertThat(moodAnalyser.analize(phrase)).isEqualTo("Sad");
    }
    @Test
    void testMoodAnalysisElse() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String phrase = "I feel ok";
        assertThat(moodAnalyser.analize(phrase)).isEqualTo("Neutral");
    }

}