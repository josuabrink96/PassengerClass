package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    Passenger p;

    @Test
    void testTitle()
    {
        p = new Passenger("Mr", "Stevens");
        assertEquals("Mr", p.getTitle());
        p = new Passenger("Mrs", "Stevens");
        assertEquals("Mrs", p.getTitle());
        p = new Passenger("Ms", "Stevens");
        assertEquals("Ms", p.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        final String invalid = "Invalid title entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Miss", "Stevens")
        );

        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testName()
    {
        p = new Passenger("Mr", "Stevens");
        assertEquals("Stevens", p.getName());
    }

    @Test
    void testInvalidName()
    {
        final String invalid = "Invalid name entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Ms", "1")
        );

        assertEquals(invalid, exceptionThrown.getMessage());
    }

}
