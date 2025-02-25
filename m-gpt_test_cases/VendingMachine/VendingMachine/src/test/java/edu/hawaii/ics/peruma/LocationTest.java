package edu.hawaii.ics.peruma;

import edu.hawaii.ics.peruma.Location;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocationTest {

    private Location location1;
    private Location location2;

    @Before
    public void setUp() {
        location1 = new Location(1, 2);
        location2 = new Location(1, 2);
    }

    @Test
    public void testGetRow() {
        assertEquals(1, location1.getRow());
    }

    @Test
    public void testGetColumn() {
        assertEquals(2, location1.getColumn());
    }

    @Test
    public void testEqualsSameLocation() {
        assertTrue(location1.equals(location2));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(location1.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(location1.equals(new String("Not a location")));
    }

    @Test
    public void testNotEqualsDifferentLocation() {
        Location differentLocation = new Location(2, 3);
        assertFalse(location1.equals(differentLocation));
    }
}