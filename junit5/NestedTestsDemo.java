import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedTestsDemo {

    @Test
    void additionTest(){
        assertEquals(2, 0 + 2);
    }


    @Nested
    class NestedTests
    {
        //no @BeforeAll and @AfterAll possible here as java does not allow static methods in inner classes

        @Test
        void nestedAdditionTest(){
            assertEquals(5, 2 + 3);
        }

        @Nested
        class NestedInNestedTests{

            @Test
            void nestedInNestedAdditionTest(){
                assertEquals(6, 5 + 1);
            }
        }
    }
}
