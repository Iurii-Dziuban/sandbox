import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class DynamicTestsDemo {

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection(){
        return Arrays.asList(
                dynamicTest("assert 2+1 == 3", () -> assertEquals(3, 2 + 1)),
                dynamicTest("assert 2+ 2 == 4", () -> assertEquals(4, 2 + 2))
        );
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestFromStream(){
        return Stream.of("", "asd", "a").map(string -> dynamicTest("verify length of " + string, () -> assertTrue(string.length() > -1)));
    }
}
