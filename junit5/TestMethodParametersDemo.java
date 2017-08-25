import org.junit.jupiter.api.*;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class TestMethodParametersDemo {

    @RepeatedTest(value = 2, name = "{currentRepetition}")
    @Tag("parameters test")
    @Test
    void test(TestInfo testInfo, TestReporter testReporter, RepetitionInfo repetitionInfo){
        assertTrue(testInfo.getTags().contains("parameters test"));
        assertEquals(2, repetitionInfo.getTotalRepetitions());
        assertEquals(String.valueOf(repetitionInfo.getCurrentRepetition()), testInfo.getDisplayName());

        HashMap<String, String> values = new HashMap<>();
        values.put("running info", "Running the test!!!");
        values.put("repetition", String.valueOf(repetitionInfo.getCurrentRepetition()));
        values.put("tags", testInfo.getTags().toString());
        testReporter.publishEntry(values);
    }
}
