package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    Passenger p;

    @Test
    void testTitle()
    {
        p = new Passenger("Mr", "Stevens", "0123456789", "01234567");
        assertEquals("Mr", p.getTitle());
        p = new Passenger("Mrs", "Stevens", "0123456789", "01234567");
        assertEquals("Mrs", p.getTitle());
        p = new Passenger("Ms", "Stevens", "0123456789", "01234567");
        assertEquals("Ms", p.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        final String invalid = "Invalid title entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Miss", "Stevens", "0123456789", "01234567")
        );

        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testName()
    {
        p = new Passenger("Mr", "Stevens", "0123456789", "01234567");
        assertEquals("Stevens", p.getName());
    }

    @Test
    void testInvalidName()
    {
        final String invalid = "Invalid name entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Ms", "1", "0123456789", "01234567")
        );

        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testID()
    {
        p = new Passenger("Mr", "Stevens", "0123456789", "01234567");
        assertEquals("0123456789", p.getID());
    }

    @Test
    void testInvalidID()
    {
        final String invalid = "Invalid ID entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Ms", "Jones", "1", "01234567")
        );
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void testPhone()
    {
        p = new Passenger("Mr", "Stevens", "0123456789", "01234567");
        assertEquals(p.getPhone(), "01234567");
    }

    @Test
    void testInvalidPhone()
    {
        final String invalid = "Invalid Phone Number entered";
        Exception exceptionThrown = assertThrows(
                IllegalArgumentException.class,
                ()-> new Passenger("Ms", "Jones", "0123456789", "1")
        );
        assertEquals(invalid, exceptionThrown.getMessage());
    }
}
