import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateCalculatortest {

    @Test
    void testNextDayEndOfMonth() {
        assertArrayEquals(new int[]{1, 2, 2021}, DateCalculator.nextDay(31, 1, 2021));
    }

    @Test
    void testNextDayEndOfYear() {
        assertArrayEquals(new int[]{1, 1, 2021}, DateCalculator.nextDay(31, 12, 2020));
    }

    @Test
    void testNextDayNormal() {
        assertArrayEquals(new int[]{16, 6, 2021}, DateCalculator.nextDay(15, 6, 2021));
    }

    @Test
    void testNextDayLeapYear() {
        assertArrayEquals(new int[]{29, 2, 2020}, DateCalculator.nextDay(28, 2, 2020));
    }
}
