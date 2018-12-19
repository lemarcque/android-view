import main.StringManipulation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class StringTest {


    // Mocks
    // mock objects are simulated objects that mimic the behavior of real objects in controlled ways.
    private String str1;
    private String str2;


    /**
     * When writing tests, it is common to find that several tests need similar objects created before they can run.
     */
    @BeforeEach
    void setUp() {
        // Arrange
        str1 = "abcHello";
        str2 = "World";
    }

    @AfterEach
    void tearDown() {
        // Called after end of each test
        // Uninstalling the fixtures to restore the initial state of the system,
        // in order not to pollute the following tests.
        // All tests must be independent and reproducible unitarily (when performed alone).

        // This can be for example used for closing a database connection.
    }

    @Test
    void testConcatenation() {

        // Act
        final String concatenate = StringManipulation.concatenate(str1, str2);

        // Assert
        assertEquals("abcHelloWorld", concatenate);
        assertEquals("abcHelloWorld", str1 + str2);
    }

    /**
     * Verify that the string that with a specified char
     */
    @Test
    void startWith() {

        // Act
        boolean assertions = StringManipulation.startWith(str1);

        // Assert
        assertTrue(assertions);
    }


    //@Test(expected = NullPointerException.class)
    @Disabled("Test not yet ready !")
    @Test
    void testNullException() {
        // TODO : Implement the Unit Test
        assertThrows(NullPointerException.class,
            ()->{
                //do whatever you want to do here
                //ex : objectName.thisMethodShoulThrowNullPointerExceptionForNullParameter(null);
            });
    }
}
