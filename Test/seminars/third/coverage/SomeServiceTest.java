package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }


    @Test
    void testReturnFizz() {
        assertThat(this.someService.fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void testReturnBuzz() {
        assertThat(this.someService.fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void testReturnFizzBuzz() {
        assertThat(this.someService.fizzBuzz(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void testReturnFizzBuzzElse() {
        assertThat(this.someService.fizzBuzz(2)).isEqualTo("2");
    }

    @Test
    void testferstLast6First() {
        int[] testarr1 = {6, 4, 5345, 345};
        assertTrue(this.someService.firstLast6(testarr1));
    }

    @Test
    void testferstLast6Last() {
        int[] testarr1 = {4, 5345, 345, 6};
        assertTrue(this.someService.firstLast6(testarr1));
    }

    @Test
    void testferstLast6Else() {
        int[] testarr1 = {4, 5345, 345};
        assertFalse(this.someService.firstLast6(testarr1));
    }

    @Test
    void testLuckySumA() {
        assertThat(this.someService.luckySum(13, 2, 3)).isEqualTo(5);
    }

    @Test
    void testLuckySumB() {
        assertThat(this.someService.luckySum(1, 13, 3)).isEqualTo(4);
    }

    @Test
    void testLuckySumC() {
        assertThat(this.someService.luckySum(1, 2, 13)).isEqualTo(3);
    }

    @Test
    void testLuckySumElse() {
        assertThat(this.someService.luckySum(1, 2, 3)).isEqualTo(6);
    }

    @Test
    void testCalculatingDiscountNormal(){
        assertThat(someService.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(someService.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка
    }

    @Test
    void testCalculatingDiscountWrongDiscount(){
        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки больше 100%

        assertThatThrownBy(() ->
                someService.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // процент скидки меньше 0
    }

    @Test
    void testCalculatingDiscountWrongPurchaseAmount(){
        assertThatThrownBy(() ->
                someService.calculatingDiscount(-2000.0, 50))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной");
    }
}