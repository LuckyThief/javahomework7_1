import org.example.StatisticsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxZero() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {-1, 0, -4, 0, 0, -6, 0, 0, -3, -2, -1};
        long expected = 0;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
