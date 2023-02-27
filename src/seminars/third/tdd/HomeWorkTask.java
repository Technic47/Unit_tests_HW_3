package seminars.third.tdd;

public class HomeWorkTask {
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
/*
Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100)
 */
    public static boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }
}
