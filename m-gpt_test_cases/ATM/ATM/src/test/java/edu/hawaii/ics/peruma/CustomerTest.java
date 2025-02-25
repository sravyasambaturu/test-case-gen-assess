package edu.hawaii.ics.peruma;

import edu.hawaii.ics.peruma.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer(1, 1234, 1000.0f);
    }

    @Test
    public void testGetAccountNumber() {
        assertEquals(1, customer.getAccountNumber());
    }

    @Test
    public void testGetPin() {
        assertEquals(1234, customer.getPin());
    }

    @Test
    public void testSetPin() {
        customer.setPin(5678);
        assertEquals(5678, customer.getPin());
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.0f, customer.getBalance(), 0);
    }

    @Test
    public void testSetBalance() {
        customer.setBalance(2000.0f);
        assertEquals(2000.0f, customer.getBalance(), 0);
    }
}