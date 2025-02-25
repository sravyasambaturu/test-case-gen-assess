package edu.hawaii.ics.peruma;

import edu.hawaii.ics.peruma.AddStatus;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddStatusTest {

    @Test
    public void testAddStatusSuccess() {
        AddStatus status = new AddStatus(true, AddStatus.AddMessage.SUCCESS);
        assertTrue(status.isSuccess());
        assertEquals(AddStatus.AddMessage.SUCCESS, status.getAddMessage());
    }

    @Test
    public void testAddStatusInvalidLocation() {
        AddStatus status = new AddStatus(false, AddStatus.AddMessage.INVALID_LOCATION);
        assertFalse(status.isSuccess());
        assertEquals(AddStatus.AddMessage.INVALID_LOCATION, status.getAddMessage());
    }

    @Test
    public void testAddStatusInsufficientSpace() {
        AddStatus status = new AddStatus(false, AddStatus.AddMessage.INSUFFICIENT_SPACE);
        assertFalse(status.isSuccess());
        assertEquals(AddStatus.AddMessage.INSUFFICIENT_SPACE, status.getAddMessage());
    }
}