import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class AssumptionsDemo {

    @Test
    void mondayAssertions(){
        //assertions executed only on Mondays
        assumingThat(DayOfWeek.MONDAY.equals(LocalDate.now().getDayOfWeek()),
                () -> {
                    assertEquals(4, 4);
                    assertEquals(1, 1);
                });

        //assertions executed always
        assertEquals(5, 5);
    }

    @Test
    void testDisabledOnFailedAssumption(){
        //if assumption fails, test is disabled
        assumeTrue(DayOfWeek.TUESDAY.equals(LocalDate.now().getDayOfWeek()));
        assertEquals(1, 2);
    }
}
