import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//class and test method should not be public any more
@DisplayName("First tests")
class BasicAttributesDemo {

    // = JUnit4 @BeforeClass
    @BeforeAll
    static void setupAll(){
        System.out.println("Executed before all tests in class");
    }

    // = JUnit4 @Before
    @BeforeEach
    void setup(){
        System.out.println("Executed before each tests in class");
    }

    @Tag("Simple tests")
    @DisplayName("test 1+2 == 3")
    @Test
    void simpleAdditionTest(){
        //optional message is the last parameter, not the first one
        assertEquals(3, 2 + 1, "Addition of 1 and 2 was not equal to 3");
    }

    @Tag("Simple tests")
    @DisplayName("test 2-1 == 1")
    @Test
    void simpleSubtractionTest(){
        assertEquals(1, 2 - 1);
    }

    //@Disabled = JUnit4 @Ignore
    @Disabled ("to demonstrate")
    @Test
    void disabledTest(){
        assertEquals(2, 3);
    }

    // = JUnit4 @After
    @AfterEach
    void cleanup(){
        System.out.println("Executed after each tests in class");
    }

    // = JUnit4 @AfterClass
    @AfterAll
    static void cleanupAll(){
        System.out.println("Executed after all tests in class");
    }
}
