package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    Passenger p;

    @Test
    void testTitle()
    {
        p = new Passenger("Mr");
        assertEquals("Mr", p.getTitle());
        p = new Passenger("Mrs");
        assertEquals("Mrs", p.getTitle());
        p = new Passenger("Ms");
        assertEquals("Ms", p.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        final String invalid = "Invalid title entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Miss"));

        assertEquals(invalid, exceptionThrown.getMessage());
    }


}
