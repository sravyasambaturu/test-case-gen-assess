import edu.hawaii.ics.peruma.ProcessStatus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProcessStatusTest {

    @Test
    public void testIsSuccess() {
        ProcessStatus status = new ProcessStatus(true, ProcessStatus.ProcessMessage.SUCCESS);
        assertTrue(status.isSuccess());
    }

    @Test
    public void testGetMessage() {
        ProcessStatus status = new ProcessStatus(false, ProcessStatus.ProcessMessage.INVALID_ACCOUNT);
        assertEquals(ProcessStatus.ProcessMessage.INVALID_ACCOUNT, status.getMessage());
    }
}