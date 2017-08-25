import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class JupiterAssertionsDemo {

    @Test
    void groupedAssertions() {
        final String testString = "testing string!";
        assertAll("verifying string",
                () -> assertEquals(15, testString.length()),
                () -> assertTrue(testString.contains("!"))
        );
    }

    @Test
    void exceptionTesting() {
       Exception exception = assertThrows(RuntimeException.class, () -> {throw new RuntimeException("Exception!");});
       assertEquals("Exception!", exception.getMessage());
    }

    @Test
    void timeoutTesting(){
        assertTimeout(Duration.ofSeconds(2), () -> {Thread.sleep(1000);});

        String result = assertTimeout(Duration.ofSeconds(1), () -> {Thread.sleep(500); return "Result!";});
        assertEquals("Result!", result);
    }

}
