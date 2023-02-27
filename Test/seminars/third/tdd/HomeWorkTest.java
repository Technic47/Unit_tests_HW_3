package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeWorkTest {
    @Test
    void testOddNumber(){
        assertTrue(HomeWorkTask.evenOddNumber(4));
    }

    @Test
    void testNotOddNumber(){
        assertFalse(HomeWorkTask.evenOddNumber(5));
    }

    @Test
    void testIntervalLess(){
        assertFalse(HomeWorkTask.numberInInterval(24));
    }
    @Test
    void testIntervalInRange(){
        assertTrue(HomeWorkTask.numberInInterval(25));
        assertTrue(HomeWorkTask.numberInInterval(100));
    }
    @Test
    void testIntervalInMore(){
        assertFalse(HomeWorkTask.numberInInterval(101));
    }
}
