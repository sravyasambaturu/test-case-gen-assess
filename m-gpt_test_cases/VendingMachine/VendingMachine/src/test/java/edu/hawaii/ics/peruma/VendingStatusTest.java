package edu.hawaii.ics.peruma;

import edu.hawaii.ics.peruma.VendingStatus;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendingStatusTest {

    @Test
    public void testVendingStatusSuccess() {
        VendingStatus status = new VendingStatus(true, 1.00, VendingStatus.VendingMessage.SUCCESS);
        assertTrue(status.isSuccess());
        assertEquals(1.00, status.getChange(), 0.01);
        assertEquals(VendingStatus.VendingMessage.SUCCESS, status.getMessage());
    }

    @Test
    public void testVendingStatusInsufficientFunds() {
        VendingStatus status = new VendingStatus(false, 0, VendingStatus.VendingMessage.INSUFFICIENT_FUNDS);
        assertFalse(status.isSuccess());
        assertEquals(0, status.getChange(), 0.01);
        assertEquals(VendingStatus.VendingMessage.INSUFFICIENT_FUNDS, status.getMessage());
    }

    @Test
    public void testVendingStatusOutOfStock() {
        VendingStatus status = new VendingStatus(false, 0, VendingStatus.VendingMessage.OUT_OF_STOCK);
        assertFalse(status.isSuccess());
        assertEquals(0, status.getChange(), 0.01);
        assertEquals(VendingStatus.VendingMessage.OUT_OF_STOCK, status.getMessage());
    }

    @Test
    public void testVendingStatusUnknownLocation() {
        VendingStatus status = new VendingStatus(false, 0, VendingStatus.VendingMessage.UNKNOWN_LOCATION);
        assertFalse(status.isSuccess());
        assertEquals(0, status.getChange(), 0.01);
        assertEquals(VendingStatus.VendingMessage.UNKNOWN_LOCATION, status.getMessage());
    }
}