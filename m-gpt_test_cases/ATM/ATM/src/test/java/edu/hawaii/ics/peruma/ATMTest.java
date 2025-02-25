import edu.hawaii.ics.peruma.ATM;
import edu.hawaii.ics.peruma.Customer;
import edu.hawaii.ics.peruma.ProcessStatus;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ATMTest {

    private ATM atm;
    private Customer customer1;
    private Customer customer2;

    @Before
    public void setUp() {
        customer1 = new Customer(1, 1234, 1000.0f);
        customer2 = new Customer(2, 5678, 500.0f);
        List<Customer> customers = Arrays.asList(customer1, customer2);
        atm = new ATM(customers);
    }

    @Test
    public void testVerifyCustomerSuccess() {
        assertTrue(atm.verifyCustomer(1, 1234));
    }

    @Test
    public void testVerifyCustomerFailure() {
        assertFalse(atm.verifyCustomer(1, 9999));
    }

    @Test
    public void testGetCustomerBalanceSuccess() throws Exception {
        assertEquals(1000.0f, atm.getCustomerBalance(1, 1234), 0);
    }

    @Test(expected = Exception.class)
    public void testGetCustomerBalanceInvalidCustomer() throws Exception {
        atm.getCustomerBalance(1, 9999);
    }

    @Test
    public void testDepositMoneySuccess() {
        ProcessStatus status = atm.depositMoney(1, 1234, 100.0f);
        assertTrue(status.isSuccess());
        assertEquals(1100.0f, customer1.getBalance(), 0);
    }

    @Test
    public void testDepositMoneyInvalidAccount() {
        ProcessStatus status = atm.depositMoney(1, 9999, 100.0f);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INVALID_ACCOUNT, status.getMessage());
    }

    @Test
    public void testDepositMoneyNegativeAmount() {
        ProcessStatus status = atm.depositMoney(1, 1234, -100.0f);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS, status.getMessage());
    }

    @Test
    public void testWithdrawMoneySuccess() {
        ProcessStatus status = atm.withdrawMoney(1, 1234, 100.0f);
        assertTrue(status.isSuccess());
        assertEquals(900.0f, customer1.getBalance(), 0);
    }

    @Test
    public void testWithdrawMoneyInsufficientFunds() {
        ProcessStatus status = atm.withdrawMoney(1, 1234, 2000.0f);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS, status.getMessage());
    }

    @Test
    public void testWithdrawMoneyInvalidAccount() {
        ProcessStatus status = atm.withdrawMoney(1, 9999, 100.0f);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INVALID_ACCOUNT, status.getMessage());
    }

    @Test
    public void testChangePINSucess() {
        ProcessStatus status = atm.changePIN(1, 1234, 987);
        assertTrue(status.isSuccess());
        assertEquals(987, customer1.getPin());
    }

    @Test
    public void testChangePINSamePIN() {
        ProcessStatus status = atm.changePIN(1, 1234, 1234);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.FAILED, status.getMessage());
    }

    @Test
    public void testChangePINInvalidPINRange() {
        ProcessStatus status = atm.changePIN(1, 1234, 99);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.FAILED, status.getMessage());
    }

    @Test
    public void testChangePINInvalidAccount() {
        ProcessStatus status = atm.changePIN(1, 9999, 987);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INVALID_ACCOUNT, status.getMessage());
    }

//    @Test
//    public void testTransferFundsSuccess() {
//        ProcessStatus status = atm.transferFunds(1, 2, 1234, 100.0f);
//        assertTrue(status.isSuccess());
//        assertEquals(900.0f, customer1.getBalance(), 0);
//        assertEquals(600.0f, customer2.getBalance(), 0);
//    }

    @Test
    public void testTransferFundsInsufficientFunds() {
        ProcessStatus status = atm.transferFunds(1, 2, 1234, 2000.0f);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS, status.getMessage());
    }

    @Test
    public void testTransferFundsInvalidOriginAccount() {
        ProcessStatus status = atm.transferFunds(1, 2, 9999, 100.0f);
        assertFalse(status.isSuccess());
        assertEquals(ProcessStatus.ProcessMessage.INVALID_ACCOUNT, status.getMessage());
    }
}