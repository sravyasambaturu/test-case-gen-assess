package edu.hawaii.ics.peruma;

import edu.hawaii.ics.peruma.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendingMachineTest {

    private VendingMachine vendingMachine;
    private Location location;
    private Item item;

    @Before
    public void setUp() {
        vendingMachine = new VendingMachine();
        location = new Location(1, 1);
        item = new Item("Chips", 2.00, 5, location);
        vendingMachine.addItem(item);
    }

    @Test
    public void testAddItemSuccess() {
        AddStatus status = vendingMachine.addItem(item);
        assertTrue(status.isSuccess());
        assertEquals(AddStatus.AddMessage.SUCCESS, status.getAddMessage());
    }

    @Test
    public void testAddItemInsufficientSpace() {
        Item largeItem = new Item("Gum", 0.50, 20, location);
        AddStatus status = vendingMachine.addItem(largeItem);
        assertFalse(status.isSuccess());
        assertEquals(AddStatus.AddMessage.INSUFFICIENT_SPACE, status.getAddMessage());
    }

    @Test
    public void testAddItemInvalidLocation() {
        Location invalidLocation = new Location(11, 11);
        Item invalidItem = new Item("Cookies", 1.00, 5, invalidLocation);
        AddStatus status = vendingMachine.addItem(invalidItem);
        assertFalse(status.isSuccess());
        assertEquals(AddStatus.AddMessage.INVALID_LOCATION, status.getAddMessage());
    }

    @Test
    public void testVendItemSuccess() {
        VendingStatus status = vendingMachine.vendItem(location, 3.00);
        assertTrue(status.isSuccess());
        assertEquals(VendingStatus.VendingMessage.SUCCESS, status.getMessage());
        assertEquals(1.00, status.getChange(), 0.01);
        assertEquals(4, item.getQuantity());
    }

    @Test
    public void testVendItemInsufficientFunds() {
        VendingStatus status = vendingMachine.vendItem(location, 1.00);
        assertFalse(status.isSuccess());
        assertEquals(VendingStatus.VendingMessage.INSUFFICIENT_FUNDS, status.getMessage());
    }

    @Test
    public void testVendItemOutOfStock() {
        item.setQuantity(0);
        VendingStatus status = vendingMachine.vendItem(location, 3.00);
        assertFalse(status.isSuccess());
        assertEquals(VendingStatus.VendingMessage.OUT_OF_STOCK, status.getMessage());
    }

    @Test
    public void testVendItemUnknownLocation() {
        Location unknownLocation = new Location(2, 2);
        VendingStatus status = vendingMachine.vendItem(unknownLocation, 3.00);
        assertFalse(status.isSuccess());
        assertEquals(VendingStatus.VendingMessage.UNKNOWN_LOCATION, status.getMessage());
    }
}