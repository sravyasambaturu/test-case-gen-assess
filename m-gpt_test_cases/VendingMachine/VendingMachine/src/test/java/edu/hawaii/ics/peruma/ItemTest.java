package edu.hawaii.ics.peruma;

import edu.hawaii.ics.peruma.Item;
import edu.hawaii.ics.peruma.Location;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {

    private Item item;
    private Location location;

    @Before
    public void setUp() {
        location = new Location(1, 2);
        item = new Item("Soda", 1.50, 5, location);
    }

    @Test
    public void testGetName() {
        assertEquals("Soda", item.getName());
    }

    @Test
    public void testGetLocation() {
        assertEquals(location, item.getLocation());
    }

    @Test
    public void testGetPrice() {
        assertEquals(1.50, item.getPrice(), 0.01);
    }

    @Test
    public void testGetQuantity() {
        assertEquals(5, item.getQuantity());
    }

    @Test
    public void testSetQuantity() {
        item.setQuantity(10);
        assertEquals(10, item.getQuantity());
    }
}