import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage4 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS;
        edu.hawaii.ics.peruma.ProcessStatus processStatus5 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage4);
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage4);
        edu.hawaii.ics.peruma.ProcessStatus processStatus7 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage4);
        edu.hawaii.ics.peruma.ProcessStatus processStatus8 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage4);
        org.junit.Assert.assertTrue("'" + processMessage4 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS + "'", processMessage4.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        boolean boolean41 = aTM31.verifyCustomer((int) (byte) 100, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.transferFunds((int) (short) 100, (int) (short) 1, (int) 'a', (float) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.withdrawMoney(10, (-1), (float) (short) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM31.transferFunds(52, 10, (int) (byte) 1, (float) 32);
        edu.hawaii.ics.peruma.ProcessStatus processStatus59 = aTM31.depositMoney((int) (byte) 10, (int) (byte) 100, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus63 = aTM31.depositMoney((int) (byte) 100, 10, (float) 1L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus68 = aTM31.transferFunds((int) (short) 10, (int) (byte) 10, 100, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus55);
        org.junit.Assert.assertNotNull(processStatus59);
        org.junit.Assert.assertNotNull(processStatus63);
        org.junit.Assert.assertNotNull(processStatus68);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM31.transferFunds((int) '#', (int) ' ', 1, 97.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus43);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM66.depositMoney((int) (short) -1, 0, (float) 100L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus75 = aTM66.transferFunds((int) (byte) 100, 100, (int) (byte) 0, 97.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus75);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 10, 52, (-1.0f));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, 1, (float) (short) 1);
        customer3.setBalance((-1.0f));
        float float6 = customer3.getBalance();
        float float7 = customer3.getBalance();
        float float8 = customer3.getBalance();
        customer3.setPin(10);
        customer3.setBalance((float) 100L);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney(100, (int) (byte) -1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM32.transferFunds((-1), 10, (int) '4', (float) (short) 0);
        boolean boolean47 = aTM32.verifyCustomer((int) (byte) 0, (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.changePIN((int) (byte) 0, (int) '#', (int) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM32.changePIN((int) '#', (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float58 = aTM32.getCustomerBalance(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus55);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) '#', (int) (byte) 1, (-1), (float) 97);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM65.depositMoney(0, (int) (byte) 10, (float) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus78 = aTM65.depositMoney((int) (byte) -1, (int) (byte) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertNotNull(processStatus78);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM33 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM34 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM35 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM36 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM36.withdrawMoney(32, (-1), 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus40);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(100, (int) (byte) 100, (float) 1L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(1, (int) (short) 0, (float) 1);
        int int4 = customer3.getPin();
        customer3.setPin((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM67 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus71 = aTM67.depositMoney((int) (byte) 1, 100, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus75 = aTM67.withdrawMoney((int) '#', 35, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus79 = aTM67.changePIN(1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus71);
        org.junit.Assert.assertNotNull(processStatus75);
        org.junit.Assert.assertNotNull(processStatus79);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        customer3.setBalance((float) (byte) 0);
        customer3.setBalance(1.0f);
        int int14 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney((int) (byte) 0, (int) (short) -1, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM32.changePIN((int) (byte) 100, (int) (byte) 1, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.depositMoney(97, (int) (short) 100, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.depositMoney(1, (int) (byte) -1, (float) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM32.changePIN((int) (byte) -1, 0, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus59 = aTM32.changePIN((int) (byte) 100, (int) (short) -1, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus55);
        org.junit.Assert.assertNotNull(processStatus59);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM31.depositMoney(10, (int) (byte) 100, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.changePIN((int) (byte) -1, (int) (byte) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            float float50 = aTM31.getCustomerBalance(97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus47);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        boolean boolean73 = aTM65.verifyCustomer((int) (byte) 1, 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus77 = aTM65.changePIN((int) '#', (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass78 = aTM65.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(processStatus77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (byte) 0, 97, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds(97, (int) '4', (int) (byte) 10, (float) ' ');
        edu.hawaii.ics.peruma.ProcessStatus processStatus52 = aTM31.transferFunds((int) (byte) 1, 32, 0, (float) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM31.depositMoney((int) (byte) 1, 0, (float) 'a');
        java.lang.Class<?> wildcardClass57 = aTM31.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus52);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (short) -1, (float) 100L);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (int) (short) -1, (float) (byte) -1);
        int int4 = customer3.getPin();
        customer3.setBalance((float) (byte) 1);
        customer3.setBalance((float) (short) 10);
        java.lang.Class<?> wildcardClass9 = customer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 100, 100, 1.0f);
        customer3.setPin((int) (byte) 1);
        int int6 = customer3.getPin();
        int int7 = customer3.getPin();
        int int8 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus75 = aTM65.transferFunds(1, (int) (byte) 1, (int) (byte) -1, (float) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus79 = aTM65.withdrawMoney((int) (short) -1, (-1), 0.0f);
        java.lang.Class<?> wildcardClass80 = processStatus79.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus75);
        org.junit.Assert.assertNotNull(processStatus79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds((int) (short) -1, (int) (short) 1, (int) (byte) 1, (float) 0L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM31.withdrawMoney((int) (short) -1, 97, 100.0f);
        boolean boolean54 = aTM31.verifyCustomer((int) (byte) -1, (int) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus58 = aTM31.withdrawMoney(1, 1, (float) (short) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus63 = aTM31.transferFunds((int) '#', (int) (short) 10, (int) '4', (float) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(processStatus58);
        org.junit.Assert.assertNotNull(processStatus63);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        boolean boolean42 = aTM31.verifyCustomer((int) (byte) 0, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.depositMoney((int) (byte) 100, 10, (float) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.withdrawMoney(1, (int) (short) -1, (float) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.depositMoney((int) (byte) 10, 1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus54);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (-1), 97.0f);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(100, (int) (short) 10, (float) (byte) 0);
        float float4 = customer3.getBalance();
        java.lang.Class<?> wildcardClass5 = customer3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus36 = aTM31.transferFunds((int) ' ', (int) 'a', 0, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus41 = aTM31.transferFunds(97, 0, (int) (byte) 100, (float) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.transferFunds(32, 1, (int) (short) 1, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.withdrawMoney((int) (short) 100, (int) (short) 10, (float) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus36);
        org.junit.Assert.assertNotNull(processStatus41);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int4 = customer3.getAccountNumber();
        java.lang.Class<?> wildcardClass5 = customer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, 0);
        boolean boolean43 = processStatus42.isSuccess();
        boolean boolean44 = processStatus42.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (byte) 0, 97, (float) (short) 100);
        boolean boolean45 = aTM31.verifyCustomer((int) 'a', (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus49 = aTM31.withdrawMoney((int) (short) -1, (int) ' ', (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus53 = aTM31.changePIN((int) (byte) 100, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(processStatus49);
        org.junit.Assert.assertNotNull(processStatus53);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage3 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT;
        edu.hawaii.ics.peruma.ProcessStatus processStatus4 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus5 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        org.junit.Assert.assertTrue("'" + processMessage3 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT + "'", processMessage3.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        int int11 = customer3.getAccountNumber();
        int int12 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        customer3.setBalance((float) (-1));
        int int6 = customer3.getAccountNumber();
        int int7 = customer3.getAccountNumber();
        float float8 = customer3.getBalance();
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        customer3.setPin((int) (byte) 1);
        customer3.setBalance((float) (-1));
        int int8 = customer3.getPin();
        int int9 = customer3.getAccountNumber();
        int int10 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (byte) 0, 97, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds(97, (int) '4', (int) (byte) 10, (float) ' ');
        edu.hawaii.ics.peruma.ProcessStatus processStatus52 = aTM31.transferFunds((int) (byte) 1, 32, 0, (float) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM31.depositMoney((int) (byte) 1, 0, (float) 'a');
        edu.hawaii.ics.peruma.ProcessStatus processStatus60 = aTM31.withdrawMoney((int) '4', (int) (byte) 100, 52.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus64 = aTM31.changePIN(10, 52, (-1));
        edu.hawaii.ics.peruma.ProcessStatus processStatus68 = aTM31.withdrawMoney((-1), (int) 'a', 10.0f);
        boolean boolean69 = processStatus68.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus52);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertNotNull(processStatus60);
        org.junit.Assert.assertNotNull(processStatus64);
        org.junit.Assert.assertNotNull(processStatus68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean34 = aTM31.verifyCustomer((int) (byte) -1, (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus38 = aTM31.changePIN((int) (byte) -1, (int) (short) -1, (int) (byte) -1);
        boolean boolean41 = aTM31.verifyCustomer((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(processStatus38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage9 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT;
        edu.hawaii.ics.peruma.ProcessStatus processStatus10 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus11 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus12 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus13 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus14 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus15 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus16 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus17 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        edu.hawaii.ics.peruma.ProcessStatus processStatus18 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage9);
        org.junit.Assert.assertTrue("'" + processMessage9 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT + "'", processMessage9.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        customer3.setPin((int) (byte) 1);
        customer3.setBalance((float) (-1));
        customer3.setBalance(0.0f);
        int int10 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(100, (int) (short) 10, (float) (byte) 0);
        int int4 = customer3.getAccountNumber();
        customer3.setBalance((float) (-1L));
        customer3.setPin(52);
        float float9 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        boolean boolean41 = aTM31.verifyCustomer((int) 'a', 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus45 = aTM31.withdrawMoney((int) (short) 0, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus49 = aTM31.withdrawMoney((int) (byte) 0, (int) (short) -1, (float) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.transferFunds((int) '#', (int) (short) 10, (int) (short) 10, (float) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus59 = aTM31.transferFunds(10, (int) '4', (int) ' ', 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus63 = aTM31.depositMoney(0, (int) (short) 1, (float) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus45);
        org.junit.Assert.assertNotNull(processStatus49);
        org.junit.Assert.assertNotNull(processStatus54);
        org.junit.Assert.assertNotNull(processStatus59);
        org.junit.Assert.assertNotNull(processStatus63);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        int int7 = customer3.getPin();
        float float8 = customer3.getBalance();
        customer3.setPin((int) '#');
        int int11 = customer3.getAccountNumber();
        customer3.setPin((-1));
        customer3.setPin(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        int int7 = customer3.getPin();
        float float8 = customer3.getBalance();
        float float9 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus36 = aTM31.transferFunds((int) ' ', (int) 'a', 0, (float) (short) 1);
        boolean boolean39 = aTM31.verifyCustomer((int) (short) 10, (int) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM31.depositMoney(97, (int) (byte) 1, (float) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.transferFunds((int) (byte) -1, (int) '4', (int) (short) 0, (float) 0L);
        boolean boolean51 = aTM31.verifyCustomer((int) 'a', (int) (short) 1);
        boolean boolean54 = aTM31.verifyCustomer((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney(100, (int) (byte) -1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM32.transferFunds((-1), 10, (int) '4', (float) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM32.withdrawMoney((int) (byte) 10, 10, (float) 100L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        edu.hawaii.ics.peruma.Customer customer10 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int11 = customer10.getPin();
        customer10.setBalance((float) 0);
        int int14 = customer10.getPin();
        edu.hawaii.ics.peruma.Customer customer18 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int19 = customer18.getPin();
        customer18.setBalance((float) (byte) 1);
        edu.hawaii.ics.peruma.Customer customer25 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, (int) (short) 0, (float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer29 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int30 = customer29.getPin();
        customer29.setBalance((float) (short) 1);
        customer29.setBalance(1.0f);
        float float35 = customer29.getBalance();
        int int36 = customer29.getAccountNumber();
        int int37 = customer29.getPin();
        int int38 = customer29.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer42 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        edu.hawaii.ics.peruma.Customer customer46 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int47 = customer46.getPin();
        customer46.setBalance((float) (short) 1);
        customer46.setBalance((float) (byte) 0);
        int int52 = customer46.getPin();
        float float53 = customer46.getBalance();
        edu.hawaii.ics.peruma.Customer customer57 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        customer57.setPin((int) (byte) 1);
        customer57.setBalance((float) (-1));
        int int62 = customer57.getPin();
        edu.hawaii.ics.peruma.Customer customer66 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (int) (short) 100, 0.0f);
        edu.hawaii.ics.peruma.Customer customer70 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int71 = customer70.getPin();
        customer70.setBalance((float) 97);
        edu.hawaii.ics.peruma.Customer[] customerArray74 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer10, customer18, customer25, customer29, customer42, customer46, customer57, customer66, customer70 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList75 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList75, customerArray74);
        edu.hawaii.ics.peruma.ATM aTM77 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM78 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM79 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        float float82 = aTM79.getCustomerBalance((-1), 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(customerArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 97.0f + "'", float82 == 97.0f);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.withdrawMoney((int) (short) 0, 32, (-1.0f));
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM31.depositMoney((int) (byte) 10, 97, (float) 10);
        boolean boolean44 = processStatus43.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) -1, (int) (short) 0, (float) ' ');
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (short) 10, (int) (short) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.depositMoney((int) (short) 10, (int) (short) 10, (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.changePIN(100, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float53 = aTM31.getCustomerBalance(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.depositMoney((int) (short) 100, (int) (byte) -1, (float) 0L);
        boolean boolean42 = aTM32.verifyCustomer((int) (byte) 1, (int) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.transferFunds((int) (short) 10, 0, (int) (short) 10, (float) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.changePIN(97, 0, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM32.transferFunds(0, 1, (int) (byte) 1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus60 = aTM32.changePIN(35, (int) (byte) 1, (int) (short) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus64 = aTM32.withdrawMoney(97, (int) 'a', (float) 0L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertNotNull(processStatus60);
        org.junit.Assert.assertNotNull(processStatus64);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        customer3.setBalance((float) (byte) 0);
        int int12 = customer3.getPin();
        float float13 = customer3.getBalance();
        float float14 = customer3.getBalance();
        int int15 = customer3.getPin();
        customer3.setPin(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (short) 10, (int) (short) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.withdrawMoney((-1), 0, (float) (byte) 1);
        boolean boolean49 = aTM31.verifyCustomer((int) '#', (int) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus53 = aTM31.withdrawMoney((int) '4', (int) (byte) 0, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            float float56 = aTM31.getCustomerBalance((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(processStatus53);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage3 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.FAILED;
        edu.hawaii.ics.peruma.ProcessStatus processStatus4 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus5 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        org.junit.Assert.assertTrue("'" + processMessage3 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.FAILED + "'", processMessage3.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.FAILED));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        boolean boolean38 = aTM32.verifyCustomer((int) (short) 0, (int) (byte) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM32.changePIN((int) (byte) 0, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass43 = aTM32.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney((int) (byte) 0, (int) (short) -1, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM32.changePIN((int) (byte) 100, (int) (byte) 1, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.depositMoney(97, (int) (short) 100, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.depositMoney(1, (int) (byte) -1, (float) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM32.changePIN((int) (byte) -1, 0, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus59 = aTM32.withdrawMoney(0, (int) '4', (float) 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus55);
        org.junit.Assert.assertNotNull(processStatus59);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        int int11 = customer3.getPin();
        int int12 = customer3.getAccountNumber();
        float float13 = customer3.getBalance();
        customer3.setPin(10);
        customer3.setBalance(52.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 1, (int) (byte) 1, (float) 52);
        int int4 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney(100, (int) (byte) -1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM32.transferFunds((-1), 10, (int) '4', (float) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM32.changePIN(1, (int) '#', (int) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus52 = aTM32.changePIN((int) (byte) 1, 35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertNotNull(processStatus52);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) 97);
        customer3.setPin((int) ' ');
        customer3.setPin(97);
        customer3.setPin((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage3 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.FAILED;
        edu.hawaii.ics.peruma.ProcessStatus processStatus4 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus5 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage3);
        org.junit.Assert.assertTrue("'" + processMessage3 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.FAILED + "'", processMessage3.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.FAILED));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        customer3.setBalance((float) 10L);
        int int13 = customer3.getAccountNumber();
        customer3.setPin(97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM65.changePIN((int) (byte) 10, (int) (byte) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus78 = aTM65.depositMoney((int) (byte) 10, 0, (-1.0f));
        edu.hawaii.ics.peruma.ProcessStatus processStatus83 = aTM65.transferFunds((int) '#', 100, (int) (byte) 1, (float) 100L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus87 = aTM65.depositMoney((int) (byte) 0, (int) (short) 1, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertNotNull(processStatus78);
        org.junit.Assert.assertNotNull(processStatus83);
        org.junit.Assert.assertNotNull(processStatus87);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean34 = aTM31.verifyCustomer((int) (byte) -1, (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus38 = aTM31.withdrawMoney(0, 97, 1.0f);
        boolean boolean41 = aTM31.verifyCustomer((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(processStatus38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage2 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS;
        edu.hawaii.ics.peruma.ProcessStatus processStatus3 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage2);
        edu.hawaii.ics.peruma.ProcessStatus processStatus4 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage2);
        java.lang.Class<?> wildcardClass5 = processMessage2.getClass();
        org.junit.Assert.assertTrue("'" + processMessage2 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS + "'", processMessage2.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.depositMoney((int) (short) 100, (int) (byte) -1, (float) 0L);
        boolean boolean42 = aTM32.verifyCustomer((int) (byte) 1, (int) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.transferFunds((int) (short) 10, 0, (int) (short) 10, (float) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.changePIN(97, 0, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM32.transferFunds(0, 1, (int) (byte) 1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus60 = aTM32.changePIN(35, (int) (byte) 1, (int) (short) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus64 = aTM32.withdrawMoney((int) '#', (int) '4', (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertNotNull(processStatus60);
        org.junit.Assert.assertNotNull(processStatus64);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney((int) (byte) 0, (int) (short) -1, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM32.withdrawMoney(1, (int) (byte) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.depositMoney((int) (short) 100, (int) (byte) -1, (float) 0L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM32.transferFunds((int) (short) -1, (int) 'a', 10, (float) (short) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM32.changePIN(0, (int) (byte) 1, 0);
        boolean boolean51 = aTM32.verifyCustomer(0, 35);
        // The following exception was thrown during execution in test generation
        try {
            float float54 = aTM32.getCustomerBalance((int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) 97);
        int int7 = customer3.getPin();
        customer3.setBalance(97.0f);
        float float10 = customer3.getBalance();
        int int11 = customer3.getAccountNumber();
        float float12 = customer3.getBalance();
        int int13 = customer3.getPin();
        float float14 = customer3.getBalance();
        java.lang.Class<?> wildcardClass15 = customer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 97.0f + "'", float14 == 97.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        edu.hawaii.ics.peruma.Customer customer10 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int11 = customer10.getPin();
        customer10.setBalance((float) 0);
        int int14 = customer10.getPin();
        edu.hawaii.ics.peruma.Customer customer18 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int19 = customer18.getPin();
        customer18.setBalance((float) (byte) 1);
        edu.hawaii.ics.peruma.Customer customer25 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, (int) (short) 0, (float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer29 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int30 = customer29.getPin();
        customer29.setBalance((float) (short) 1);
        customer29.setBalance(1.0f);
        float float35 = customer29.getBalance();
        int int36 = customer29.getAccountNumber();
        int int37 = customer29.getPin();
        int int38 = customer29.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer42 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        edu.hawaii.ics.peruma.Customer customer46 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int47 = customer46.getPin();
        customer46.setBalance((float) (short) 1);
        customer46.setBalance((float) (byte) 0);
        int int52 = customer46.getPin();
        float float53 = customer46.getBalance();
        edu.hawaii.ics.peruma.Customer customer57 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        customer57.setPin((int) (byte) 1);
        customer57.setBalance((float) (-1));
        int int62 = customer57.getPin();
        edu.hawaii.ics.peruma.Customer customer66 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (int) (short) 100, 0.0f);
        edu.hawaii.ics.peruma.Customer customer70 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int71 = customer70.getPin();
        customer70.setBalance((float) 97);
        edu.hawaii.ics.peruma.Customer[] customerArray74 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer10, customer18, customer25, customer29, customer42, customer46, customer57, customer66, customer70 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList75 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList75, customerArray74);
        edu.hawaii.ics.peruma.ATM aTM77 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM78 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        boolean boolean81 = aTM78.verifyCustomer(0, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus85 = aTM78.changePIN((-1), (int) (short) 10, (int) 'a');
        boolean boolean86 = processStatus85.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(customerArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(processStatus85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, 97, 10.0f);
        customer3.setBalance((float) 1L);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        customer3.setPin((int) (short) 100);
        customer3.setPin(97);
        customer3.setBalance((float) ' ');
        int int16 = customer3.getAccountNumber();
        int int17 = customer3.getAccountNumber();
        customer3.setPin((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 1, 0, (float) 100);
        float float4 = customer3.getBalance();
        int int5 = customer3.getAccountNumber();
        float float6 = customer3.getBalance();
        customer3.setPin((int) (byte) 0);
        int int9 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 0, (int) (short) -1, (float) ' ');
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float4 = customer3.getBalance();
        customer3.setBalance((float) (byte) 10);
        java.lang.Class<?> wildcardClass7 = customer3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus37 = aTM32.transferFunds((int) ' ', 10, (int) '#', (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM32.transferFunds((int) (short) 0, 10, 1, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM32.changePIN((int) '#', (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus37);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (short) 0, (int) (byte) 100, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds((int) (short) 100, (int) (byte) 10, (int) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus47);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM65.changePIN((int) (byte) 10, (int) (byte) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus78 = aTM65.depositMoney((int) (byte) 10, 0, (-1.0f));
        boolean boolean81 = aTM65.verifyCustomer(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertNotNull(processStatus78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        customer3.setBalance((float) 100);
        customer3.setBalance((float) 0L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        customer3.setBalance((float) 1L);
        int int11 = customer3.getPin();
        customer3.setPin((int) (short) 100);
        customer3.setBalance((float) (short) -1);
        customer3.setBalance((float) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        float float4 = customer3.getBalance();
        int int5 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getPin();
        customer3.setPin((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM33 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM34 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus38 = aTM34.changePIN((int) (short) 1, 100, (int) ' ');
        boolean boolean41 = aTM34.verifyCustomer((int) (byte) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM34.transferFunds(1, 0, (-1), (float) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM34.withdrawMoney((int) (byte) 100, (int) (short) 10, (-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) 'a', 1, (float) ' ');
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.changePIN((int) (short) 100, (int) (short) 1, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.depositMoney(32, (int) '4', 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.withdrawMoney(97, (int) (byte) -1, (float) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus54);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) 97);
        int int7 = customer3.getPin();
        customer3.setPin((int) (short) 10);
        int int10 = customer3.getPin();
        customer3.setPin((int) (short) 100);
        int int13 = customer3.getPin();
        int int14 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        customer3.setBalance((float) 0L);
        customer3.setBalance((float) (short) 10);
        float float8 = customer3.getBalance();
        customer3.setPin(0);
        int int11 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus36 = aTM31.transferFunds((int) ' ', (int) 'a', 0, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.changePIN(0, (int) (byte) 1, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM31.depositMoney((int) '#', (int) '#', (float) 32);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.changePIN(35, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus36);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (short) 10, (int) (short) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.withdrawMoney((-1), 0, (float) (byte) 1);
        boolean boolean49 = aTM31.verifyCustomer((int) '#', (int) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus53 = aTM31.changePIN(0, 0, (int) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus58 = aTM31.transferFunds((int) 'a', (int) (short) 10, 1, 100.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus63 = aTM31.transferFunds((int) (byte) 10, 52, (int) (byte) 1, 97.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(processStatus53);
        org.junit.Assert.assertNotNull(processStatus58);
        org.junit.Assert.assertNotNull(processStatus63);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        boolean boolean42 = aTM31.verifyCustomer((int) (byte) 0, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds((int) '4', (int) '#', (int) (short) 100, (float) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM31.withdrawMoney(1, (int) (byte) 10, (float) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM31.withdrawMoney((int) (short) 100, (int) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus55);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(35, 32, (float) 35);
        int int4 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 100, 100, 1.0f);
        customer3.setPin((int) (byte) 1);
        customer3.setPin((int) (short) -1);
        int int8 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) ' ', 100, 100.0f);
        int int4 = customer3.getPin();
        int int5 = customer3.getPin();
        int int6 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((-1), 97, (float) (short) 100);
        customer3.setPin((int) '#');
        customer3.setBalance((float) 100);
        customer3.setBalance(52.0f);
        int int10 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        edu.hawaii.ics.peruma.Customer customer10 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int11 = customer10.getPin();
        customer10.setBalance((float) 0);
        int int14 = customer10.getPin();
        edu.hawaii.ics.peruma.Customer customer18 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int19 = customer18.getPin();
        customer18.setBalance((float) (byte) 1);
        edu.hawaii.ics.peruma.Customer customer25 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, (int) (short) 0, (float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer29 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int30 = customer29.getPin();
        customer29.setBalance((float) (short) 1);
        customer29.setBalance(1.0f);
        float float35 = customer29.getBalance();
        int int36 = customer29.getAccountNumber();
        int int37 = customer29.getPin();
        int int38 = customer29.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer42 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        edu.hawaii.ics.peruma.Customer customer46 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int47 = customer46.getPin();
        customer46.setBalance((float) (short) 1);
        customer46.setBalance((float) (byte) 0);
        int int52 = customer46.getPin();
        float float53 = customer46.getBalance();
        edu.hawaii.ics.peruma.Customer customer57 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        customer57.setPin((int) (byte) 1);
        customer57.setBalance((float) (-1));
        int int62 = customer57.getPin();
        edu.hawaii.ics.peruma.Customer customer66 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (int) (short) 100, 0.0f);
        edu.hawaii.ics.peruma.Customer customer70 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int71 = customer70.getPin();
        customer70.setBalance((float) 97);
        edu.hawaii.ics.peruma.Customer[] customerArray74 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer10, customer18, customer25, customer29, customer42, customer46, customer57, customer66, customer70 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList75 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList75, customerArray74);
        edu.hawaii.ics.peruma.ATM aTM77 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM78 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM79 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM80 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM81 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ProcessStatus processStatus85 = aTM81.changePIN((int) (short) 1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(customerArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(processStatus85);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean34 = aTM31.verifyCustomer((int) (byte) 0, (int) '4');
        boolean boolean37 = aTM31.verifyCustomer((int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        customer3.setPin(97);
        customer3.setBalance((float) (short) -1);
        int int8 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 1, (-1), (float) (short) 10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (short) 0, (int) (byte) 100, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.changePIN((int) (short) -1, (int) (byte) -1, (int) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.depositMoney((int) (short) 10, (int) '4', 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM31.transferFunds((int) ' ', 0, (int) (byte) 10, (float) 1L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus59 = aTM31.depositMoney((int) (byte) 0, (int) (short) 100, (float) (short) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus63 = aTM31.depositMoney((int) (byte) 10, 10, 1.0f);
        boolean boolean64 = processStatus63.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus55);
        org.junit.Assert.assertNotNull(processStatus59);
        org.junit.Assert.assertNotNull(processStatus63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney(100, (int) (byte) -1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM32.depositMoney((int) (byte) 100, (int) (byte) 1, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.changePIN(0, 52, 10);
        boolean boolean50 = aTM32.verifyCustomer(35, 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM32.transferFunds((int) (short) -1, (int) '4', (-1), (float) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(processStatus55);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        int int4 = customer3.getPin();
        customer3.setBalance(0.0f);
        customer3.setPin((int) (short) 100);
        customer3.setPin((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus37 = aTM32.transferFunds((int) (short) 100, 10, 10, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus41 = aTM32.depositMoney(97, (int) (short) 0, (float) (short) -1);
        boolean boolean44 = aTM32.verifyCustomer((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus37);
        org.junit.Assert.assertNotNull(processStatus41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        customer3.setPin((int) (short) 100);
        customer3.setPin(97);
        customer3.setBalance((float) (short) 10);
        int int16 = customer3.getPin();
        int int17 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) 'a', 10, 1.0f);
        customer3.setBalance((float) (short) 1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((-1), 97, (float) (short) 100);
        customer3.setPin((int) '#');
        customer3.setBalance((float) 100);
        customer3.setBalance(52.0f);
        int int10 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(100, (int) (short) 10, (float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer7 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int8 = customer7.getPin();
        int int9 = customer7.getAccountNumber();
        int int10 = customer7.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) '4', (int) (byte) 100, (float) (-1));
        customer14.setBalance((float) 97);
        edu.hawaii.ics.peruma.Customer customer20 = new edu.hawaii.ics.peruma.Customer((int) ' ', 100, 100.0f);
        int int21 = customer20.getPin();
        edu.hawaii.ics.peruma.Customer customer25 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int26 = customer25.getPin();
        customer25.setBalance((float) (short) 1);
        customer25.setBalance(1.0f);
        float float31 = customer25.getBalance();
        customer25.setBalance((float) (byte) 0);
        int int34 = customer25.getAccountNumber();
        customer25.setBalance((float) (byte) 100);
        edu.hawaii.ics.peruma.Customer customer40 = new edu.hawaii.ics.peruma.Customer((int) '4', (int) (byte) 100, (float) (-1));
        edu.hawaii.ics.peruma.Customer customer44 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int45 = customer44.getPin();
        customer44.setBalance((float) (byte) 1);
        customer44.setBalance(0.0f);
        edu.hawaii.ics.peruma.Customer customer53 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, 1, (float) (short) 1);
        customer53.setBalance((-1.0f));
        float float56 = customer53.getBalance();
        int int57 = customer53.getAccountNumber();
        float float58 = customer53.getBalance();
        edu.hawaii.ics.peruma.Customer customer62 = new edu.hawaii.ics.peruma.Customer((-1), 97, (float) (short) 100);
        customer62.setPin((int) '#');
        customer62.setBalance((float) 100);
        int int67 = customer62.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray68 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer7, customer14, customer20, customer25, customer40, customer44, customer53, customer62 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList69 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList69, customerArray68);
        edu.hawaii.ics.peruma.ATM aTM71 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList69);
        edu.hawaii.ics.peruma.ATM aTM72 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList69);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + (-1.0f) + "'", float58 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(customerArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) -1, (int) (byte) -1, 52.0f);
        customer3.setBalance((float) (byte) 10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 10, (int) (short) 100, (float) (short) 10);
        int int4 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 10, (int) '#', (float) 97);
        customer3.setBalance((float) 10L);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((-1), (int) '4', (float) 10);
        boolean boolean45 = aTM31.verifyCustomer((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float48 = aTM31.getCustomerBalance(52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM33 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM34 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus38 = aTM34.depositMoney((int) ' ', (int) (short) 0, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float41 = aTM34.getCustomerBalance((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus38);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((-1), 97, (float) (short) 100);
        customer3.setPin((int) '#');
        float float6 = customer3.getBalance();
        int int7 = customer3.getPin();
        float float8 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) 'a', 1, (float) ' ');
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.changePIN((int) (short) 100, (int) (short) 1, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.withdrawMoney(0, (int) (short) -1, (float) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.changePIN(97, (int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass55 = aTM31.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        customer3.setPin((int) (short) 100);
        customer3.setPin(97);
        float float14 = customer3.getBalance();
        customer3.setBalance((float) (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM67 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus72 = aTM67.transferFunds((-1), 35, (int) (short) -1, 100.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus76 = aTM67.withdrawMoney((int) (short) 100, 97, (float) 0L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus81 = aTM67.transferFunds((int) ' ', (int) (short) -1, 1, (float) 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus72);
        org.junit.Assert.assertNotNull(processStatus76);
        org.junit.Assert.assertNotNull(processStatus81);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        boolean boolean41 = aTM31.verifyCustomer((int) (byte) 100, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.transferFunds((int) (short) 100, (int) (short) 1, (int) 'a', (float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float49 = aTM31.getCustomerBalance((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus46);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (short) 10, 0, (float) 'a');
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.changePIN(35, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(52, (int) (byte) 100, (float) 'a');
        customer3.setPin(1);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM66.depositMoney(1, (int) (byte) 1, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM66.changePIN((int) 'a', (int) (byte) 0, 97);
        boolean boolean77 = aTM66.verifyCustomer((int) (byte) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus81 = aTM66.depositMoney((int) (byte) 0, (int) '4', (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus86 = aTM66.transferFunds(32, (int) '4', 0, 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus90 = aTM66.changePIN((int) (byte) 100, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(processStatus81);
        org.junit.Assert.assertNotNull(processStatus86);
        org.junit.Assert.assertNotNull(processStatus90);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(100, (int) (short) 10, (float) (byte) 0);
        int int4 = customer3.getAccountNumber();
        customer3.setBalance((float) (-1L));
        customer3.setPin(52);
        customer3.setBalance((float) (-1L));
        customer3.setPin((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        boolean boolean41 = aTM31.verifyCustomer((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(0, 35, (float) (short) -1);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM67 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM68 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM69 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM70 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM71 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus75 = aTM71.changePIN(97, (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            float float78 = aTM71.getCustomerBalance(52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus75);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.transferFunds((int) ' ', (int) (byte) 0, (-1), (float) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM31.withdrawMoney((-1), (int) (short) 10, (float) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.withdrawMoney((int) 'a', (int) (short) 0, (float) 100);
        boolean boolean51 = aTM31.verifyCustomer((int) '#', (int) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM31.depositMoney((int) (short) 100, (int) (byte) 100, (float) (short) 0);
        java.lang.Class<?> wildcardClass56 = aTM31.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(processStatus55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        boolean boolean38 = aTM31.verifyCustomer(0, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (short) 1, (int) (short) -1, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds((int) (byte) -1, (int) '#', 97, 35.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM31.withdrawMoney(0, (int) (byte) 1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM31.depositMoney((int) (byte) 100, 52, (float) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus55);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) '#', (int) (short) 1, (float) 52);
        float float4 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 52.0f + "'", float4 == 52.0f);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((-1), 97, (float) (short) 100);
        customer3.setPin((int) '#');
        customer3.setBalance((float) 100);
        int int8 = customer3.getAccountNumber();
        customer3.setPin((int) (short) 100);
        int int11 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 1, (int) (short) 100, (float) 0L);
        int int4 = customer3.getPin();
        int int5 = customer3.getPin();
        customer3.setBalance((float) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus36 = aTM31.transferFunds((int) ' ', (int) 'a', 0, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus41 = aTM31.transferFunds((int) (byte) 100, (int) (short) 0, (int) (short) 100, (float) (short) 100);
        boolean boolean44 = aTM31.verifyCustomer((int) (byte) 100, (int) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.depositMoney(35, (int) 'a', (float) (short) 100);
        boolean boolean51 = aTM31.verifyCustomer((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float54 = aTM31.getCustomerBalance((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus36);
        org.junit.Assert.assertNotNull(processStatus41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((-1), (int) '4', (float) 10);
        boolean boolean45 = aTM31.verifyCustomer((int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass46 = aTM31.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) 97);
        int int7 = customer3.getPin();
        customer3.setPin((int) (short) 10);
        customer3.setBalance((float) '4');
        float float12 = customer3.getBalance();
        int int13 = customer3.getAccountNumber();
        float float14 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 52.0f + "'", float12 == 52.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 52.0f + "'", float14 == 52.0f);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds((int) (short) -1, (int) (short) 1, (int) (byte) 1, (float) 0L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM31.withdrawMoney((int) (short) -1, 97, 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float54 = aTM31.getCustomerBalance((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        customer3.setBalance((float) 0L);
        customer3.setBalance((float) (short) 10);
        int int8 = customer3.getPin();
        java.lang.Class<?> wildcardClass9 = customer3.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        float float7 = customer3.getBalance();
        float float8 = customer3.getBalance();
        float float9 = customer3.getBalance();
        customer3.setPin(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.depositMoney((int) (short) 100, (int) (byte) -1, (float) 0L);
        boolean boolean42 = aTM32.verifyCustomer(0, (int) (short) 10);
        boolean boolean45 = aTM32.verifyCustomer(32, 10);
        java.lang.Class<?> wildcardClass46 = aTM32.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) -1, (int) (short) 1, (float) (byte) 1);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        boolean boolean38 = aTM32.verifyCustomer((int) '4', (int) '4');
        boolean boolean41 = aTM32.verifyCustomer(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        boolean boolean41 = aTM31.verifyCustomer((int) 'a', 97);
        edu.hawaii.ics.peruma.ProcessStatus processStatus45 = aTM31.changePIN((int) '4', 0, (int) (short) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus49 = aTM31.withdrawMoney((int) ' ', (int) (byte) 1, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus53 = aTM31.withdrawMoney((int) (short) 0, 0, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(processStatus45);
        org.junit.Assert.assertNotNull(processStatus49);
        org.junit.Assert.assertNotNull(processStatus53);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (int) (byte) 100, (float) 0L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        boolean boolean41 = aTM31.verifyCustomer((int) 'a', 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus45 = aTM31.withdrawMoney((int) (short) 0, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus49 = aTM31.withdrawMoney((int) (byte) 0, (int) (short) -1, (float) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus53 = aTM31.depositMoney((int) (short) 1, (int) (short) 1, (float) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus58 = aTM31.transferFunds((int) (byte) 10, 97, 35, (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus62 = aTM31.changePIN(32, (int) (short) 10, (int) ' ');
        edu.hawaii.ics.peruma.ProcessStatus processStatus66 = aTM31.depositMoney(10, 52, 100.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM31.withdrawMoney((int) (byte) 100, (int) '4', 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus45);
        org.junit.Assert.assertNotNull(processStatus49);
        org.junit.Assert.assertNotNull(processStatus53);
        org.junit.Assert.assertNotNull(processStatus58);
        org.junit.Assert.assertNotNull(processStatus62);
        org.junit.Assert.assertNotNull(processStatus66);
        org.junit.Assert.assertNotNull(processStatus70);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        customer3.setBalance((float) 100);
        customer3.setBalance((float) (byte) 100);
        float float8 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM31.transferFunds((int) (short) 100, 0, (int) (short) 0, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.transferFunds((int) (short) 1, 10, (int) (short) 10, (float) 1L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus53 = aTM31.transferFunds((int) (byte) 0, (int) (short) -1, 10, (-1.0f));
        edu.hawaii.ics.peruma.ProcessStatus processStatus58 = aTM31.transferFunds((int) (byte) 1, (int) (short) 0, (int) (short) 100, (float) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus62 = aTM31.withdrawMoney((-1), (int) (short) 100, (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus66 = aTM31.withdrawMoney((int) (short) 0, 32, (float) (short) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM31.changePIN((int) (short) 1, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertNotNull(processStatus53);
        org.junit.Assert.assertNotNull(processStatus58);
        org.junit.Assert.assertNotNull(processStatus62);
        org.junit.Assert.assertNotNull(processStatus66);
        org.junit.Assert.assertNotNull(processStatus70);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        edu.hawaii.ics.peruma.Customer customer10 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int11 = customer10.getPin();
        customer10.setBalance((float) 0);
        int int14 = customer10.getPin();
        edu.hawaii.ics.peruma.Customer customer18 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int19 = customer18.getPin();
        customer18.setBalance((float) (byte) 1);
        edu.hawaii.ics.peruma.Customer customer25 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, (int) (short) 0, (float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer29 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int30 = customer29.getPin();
        customer29.setBalance((float) (short) 1);
        customer29.setBalance(1.0f);
        float float35 = customer29.getBalance();
        int int36 = customer29.getAccountNumber();
        int int37 = customer29.getPin();
        int int38 = customer29.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer42 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        edu.hawaii.ics.peruma.Customer customer46 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int47 = customer46.getPin();
        customer46.setBalance((float) (short) 1);
        customer46.setBalance((float) (byte) 0);
        int int52 = customer46.getPin();
        float float53 = customer46.getBalance();
        edu.hawaii.ics.peruma.Customer customer57 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        customer57.setPin((int) (byte) 1);
        customer57.setBalance((float) (-1));
        int int62 = customer57.getPin();
        edu.hawaii.ics.peruma.Customer customer66 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, (int) (short) 100, 0.0f);
        edu.hawaii.ics.peruma.Customer customer70 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int71 = customer70.getPin();
        customer70.setBalance((float) 97);
        edu.hawaii.ics.peruma.Customer[] customerArray74 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer10, customer18, customer25, customer29, customer42, customer46, customer57, customer66, customer70 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList75 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList75, customerArray74);
        edu.hawaii.ics.peruma.ATM aTM77 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM78 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM79 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ATM aTM80 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList75);
        edu.hawaii.ics.peruma.ProcessStatus processStatus84 = aTM80.withdrawMoney((int) (byte) 100, 97, (-1.0f));
        float float87 = aTM80.getCustomerBalance((int) (short) 100, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus91 = aTM80.depositMoney((int) (byte) -1, 32, (float) 97);
        edu.hawaii.ics.peruma.ProcessStatus processStatus95 = aTM80.changePIN((int) 'a', (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(customerArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(processStatus84);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 0.0f + "'", float87 == 0.0f);
        org.junit.Assert.assertNotNull(processStatus91);
        org.junit.Assert.assertNotNull(processStatus95);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM32.transferFunds((int) ' ', 100, (int) (short) 0, (float) (short) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM32.withdrawMoney((int) (short) -1, 0, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM32.changePIN(1, (int) (short) -1, 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus52 = aTM32.withdrawMoney(1, 52, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus57 = aTM32.transferFunds(0, (int) 'a', 10, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus62 = aTM32.transferFunds((int) '#', 35, (int) (byte) 0, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertNotNull(processStatus52);
        org.junit.Assert.assertNotNull(processStatus57);
        org.junit.Assert.assertNotNull(processStatus62);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM65.depositMoney(0, 97, (float) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus78 = aTM65.withdrawMoney(1, 10, (float) (byte) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus82 = aTM65.changePIN((int) (byte) -1, (int) (short) 100, (int) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus86 = aTM65.depositMoney(10, 1, (float) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertNotNull(processStatus78);
        org.junit.Assert.assertNotNull(processStatus82);
        org.junit.Assert.assertNotNull(processStatus86);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 100, (-1), (float) 1L);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        customer3.setBalance((float) 1L);
        customer3.setPin((int) (short) 1);
        customer3.setBalance((float) 0L);
        customer3.setBalance((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) '4', (int) (byte) 100, (float) (-1));
        customer3.setBalance((float) 97);
        customer3.setPin((int) (short) 100);
        float float8 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.transferFunds((int) (short) 100, (int) ' ', (int) (short) 100, (-1.0f));
        boolean boolean43 = aTM31.verifyCustomer((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        int int4 = customer3.getPin();
        customer3.setBalance(0.0f);
        customer3.setBalance((-1.0f));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus36 = aTM31.transferFunds((int) ' ', (int) 'a', 0, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus41 = aTM31.transferFunds((int) (byte) 100, (int) (short) 0, (int) (short) 100, (float) (short) 100);
        boolean boolean44 = aTM31.verifyCustomer((int) (byte) 10, (int) (short) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.changePIN((-1), (int) ' ', (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus52 = aTM31.withdrawMoney((-1), (int) (short) 0, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM31.withdrawMoney(97, 32, (float) (short) 1);
        boolean boolean57 = processStatus56.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus36);
        org.junit.Assert.assertNotNull(processStatus41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertNotNull(processStatus52);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float4 = customer3.getBalance();
        customer3.setBalance((float) (byte) 10);
        float float7 = customer3.getBalance();
        int int8 = customer3.getPin();
        customer3.setBalance((float) (-1));
        int int11 = customer3.getPin();
        customer3.setPin((int) 'a');
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM33 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM34 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus38 = aTM34.changePIN((int) (short) 1, 100, (int) ' ');
        boolean boolean41 = aTM34.verifyCustomer((int) (short) -1, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM34.transferFunds((int) (byte) 1, 0, 10, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus46);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(0, (int) ' ', (float) (short) 1);
        customer3.setBalance((float) 100);
        int int6 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.transferFunds(100, (int) '#', (int) (short) 1, 0.0f);
        boolean boolean43 = aTM31.verifyCustomer((int) (short) 1, 35);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.depositMoney((int) '#', (int) (short) 100, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM31.depositMoney(0, 100, 97.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney(100, (int) (byte) -1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM32.depositMoney((int) (byte) 100, (int) (byte) 1, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.changePIN(0, 52, 10);
        boolean boolean50 = aTM32.verifyCustomer(35, 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM32.changePIN(0, (int) (byte) -1, 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus58 = aTM32.changePIN(35, (int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(processStatus54);
        org.junit.Assert.assertNotNull(processStatus58);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) '4', (int) '#');
        boolean boolean41 = aTM31.verifyCustomer((int) 'a', 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus45 = aTM31.withdrawMoney((int) (short) 0, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.transferFunds((int) (byte) 0, 97, 32, (float) (short) 10);
        java.lang.Class<?> wildcardClass51 = aTM31.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus45);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) '#', (int) (byte) 1, (-1), (float) 97);
        boolean boolean73 = aTM65.verifyCustomer((int) (short) 10, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus77 = aTM65.changePIN(0, 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(processStatus77);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus36 = aTM31.transferFunds((int) ' ', (int) 'a', 0, (float) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.changePIN(0, (int) (byte) 1, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM31.depositMoney((int) '#', (int) '#', (float) 32);
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.withdrawMoney((int) (short) 1, (int) (byte) 10, (float) 10);
        java.lang.Class<?> wildcardClass49 = processStatus48.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus36);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM32.transferFunds((int) ' ', 100, (int) (short) 0, (float) (short) -1);
        java.lang.Class<?> wildcardClass41 = processStatus40.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM65.changePIN((int) (byte) 10, (int) (byte) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus78 = aTM65.withdrawMoney(10, 35, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus83 = aTM65.transferFunds(97, (int) (byte) 100, 0, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertNotNull(processStatus78);
        org.junit.Assert.assertNotNull(processStatus83);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        boolean boolean42 = aTM31.verifyCustomer((int) (byte) 0, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.transferFunds((int) '4', (int) '#', (int) (short) 100, (float) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM31.withdrawMoney(1, (int) (byte) 10, (float) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus55 = aTM31.withdrawMoney((int) (short) 1, (int) '4', 0.0f);
        boolean boolean58 = aTM31.verifyCustomer((int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) ' ', (int) (byte) 0, (float) (byte) 10);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.changePIN((int) (byte) 10, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float42 = aTM31.getCustomerBalance((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM66.depositMoney(1, (int) (byte) 1, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM66.changePIN((int) 'a', (int) (byte) 0, 97);
        boolean boolean77 = aTM66.verifyCustomer((int) (byte) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus81 = aTM66.depositMoney((int) (byte) 0, (int) '4', (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus86 = aTM66.transferFunds((int) (byte) -1, 10, (int) (short) -1, 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(processStatus81);
        org.junit.Assert.assertNotNull(processStatus86);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM66.depositMoney(1, (int) (byte) 1, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM66.changePIN((int) 'a', (int) (byte) 0, 97);
        boolean boolean77 = aTM66.verifyCustomer((int) (byte) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus82 = aTM66.transferFunds((int) (byte) 100, 10, (-1), (float) (short) 0);
        boolean boolean85 = aTM66.verifyCustomer((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(processStatus82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) 97);
        int int7 = customer3.getPin();
        customer3.setBalance(97.0f);
        float float10 = customer3.getBalance();
        int int11 = customer3.getAccountNumber();
        float float12 = customer3.getBalance();
        int int13 = customer3.getPin();
        float float14 = customer3.getBalance();
        float float15 = customer3.getBalance();
        customer3.setBalance(35.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 97.0f + "'", float14 == 97.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.depositMoney((int) (short) 100, (int) (byte) -1, (float) 0L);
        boolean boolean42 = aTM32.verifyCustomer((int) (byte) 1, (int) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.transferFunds((int) (short) 10, 0, (int) (short) 10, (float) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.changePIN((-1), 52, (int) (byte) 0);
        boolean boolean52 = processStatus51.isSuccess();
        boolean boolean53 = processStatus51.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        boolean boolean38 = aTM31.verifyCustomer(0, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (short) 1, (int) (short) -1, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.depositMoney((int) '#', (int) (byte) 0, (float) 100L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.depositMoney(100, 97, (float) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        boolean boolean41 = aTM31.verifyCustomer((int) 'a', 97);
        edu.hawaii.ics.peruma.ProcessStatus processStatus45 = aTM31.withdrawMoney((int) (byte) 1, (int) '4', (-1.0f));
        edu.hawaii.ics.peruma.ProcessStatus processStatus49 = aTM31.changePIN((int) (byte) 100, (int) (byte) 1, (-1));
        float float52 = aTM31.getCustomerBalance((-1), (int) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM31.depositMoney(97, (int) (byte) 1, (float) 97);
        edu.hawaii.ics.peruma.ProcessStatus processStatus60 = aTM31.withdrawMoney((int) (byte) 100, 10, (float) 'a');
        // The following exception was thrown during execution in test generation
        try {
            float float63 = aTM31.getCustomerBalance((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(processStatus45);
        org.junit.Assert.assertNotNull(processStatus49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertNotNull(processStatus60);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM32.transferFunds((int) ' ', 100, (int) (short) 0, (float) (short) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM32.withdrawMoney((int) (short) -1, 0, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus49 = aTM32.transferFunds((int) (byte) 10, (int) (byte) 0, 10, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus49);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM65.transferFunds((int) (byte) 1, 0, (-1), 10.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus75 = aTM65.transferFunds(1, (int) (byte) 1, (int) (byte) -1, (float) '4');
        boolean boolean78 = aTM65.verifyCustomer(52, (-1));
        edu.hawaii.ics.peruma.ProcessStatus processStatus83 = aTM65.transferFunds((int) (byte) 10, (int) (byte) -1, 97, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(processStatus83);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        boolean boolean41 = aTM31.verifyCustomer((int) (byte) 100, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.transferFunds((int) (short) 100, (int) (short) 1, (int) 'a', (float) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.withdrawMoney(100, (int) '#', (float) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.changePIN(32, (int) '4', (int) '#');
        boolean boolean57 = aTM31.verifyCustomer(32, (int) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus62 = aTM31.transferFunds(97, 0, (-1), (float) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus67 = aTM31.transferFunds(100, (int) (byte) 0, 52, 52.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(processStatus62);
        org.junit.Assert.assertNotNull(processStatus67);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM67 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM68 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus72 = aTM68.depositMoney((int) (short) 100, 0, (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus76 = aTM68.withdrawMoney((int) (byte) -1, 52, (float) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus72);
        org.junit.Assert.assertNotNull(processStatus76);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(0, (int) (byte) -1, 52.0f);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        customer3.setBalance((float) 1L);
        customer3.setPin((int) (short) 1);
        customer3.setPin((-1));
        customer3.setBalance(0.0f);
        int int17 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage5 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT;
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus7 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus8 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus9 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus10 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage5);
        org.junit.Assert.assertTrue("'" + processMessage5 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT + "'", processMessage5.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 100, (int) (short) 0, (float) (byte) 0);
        int int4 = customer3.getAccountNumber();
        customer3.setBalance((float) 10);
        float float7 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage3 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS;
        edu.hawaii.ics.peruma.ProcessStatus processStatus4 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus5 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage3);
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage3);
        org.junit.Assert.assertTrue("'" + processMessage3 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS + "'", processMessage3.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.SUCCESS));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage6 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT;
        edu.hawaii.ics.peruma.ProcessStatus processStatus7 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage6);
        edu.hawaii.ics.peruma.ProcessStatus processStatus8 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage6);
        edu.hawaii.ics.peruma.ProcessStatus processStatus9 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage6);
        edu.hawaii.ics.peruma.ProcessStatus processStatus10 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage6);
        edu.hawaii.ics.peruma.ProcessStatus processStatus11 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage6);
        edu.hawaii.ics.peruma.ProcessStatus processStatus12 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage6);
        java.lang.Class<?> wildcardClass13 = processMessage6.getClass();
        org.junit.Assert.assertTrue("'" + processMessage6 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT + "'", processMessage6.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        int int5 = customer3.getAccountNumber();
        int int6 = customer3.getPin();
        int int7 = customer3.getPin();
        float float8 = customer3.getBalance();
        int int9 = customer3.getPin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (byte) 1);
        int int7 = customer3.getPin();
        int int8 = customer3.getPin();
        float float9 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage7 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT;
        edu.hawaii.ics.peruma.ProcessStatus processStatus8 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus9 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus10 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus11 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus12 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus13 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus14 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        org.junit.Assert.assertTrue("'" + processMessage7 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT + "'", processMessage7.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INVALID_ACCOUNT));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM67 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus71 = aTM67.depositMoney((int) (byte) 1, 100, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus75 = aTM67.withdrawMoney((int) '#', 35, (float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float78 = aTM67.getCustomerBalance((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus71);
        org.junit.Assert.assertNotNull(processStatus75);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) -1, (int) (byte) -1, 52.0f);
        int int4 = customer3.getAccountNumber();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.transferFunds((int) ' ', (int) (byte) 0, (-1), (float) '4');
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM31.withdrawMoney((int) 'a', (int) (byte) 1, (float) (short) 10);
        boolean boolean47 = aTM31.verifyCustomer(0, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage5 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.ProcessStatus processStatus6 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus7 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus8 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus9 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage5);
        edu.hawaii.ics.peruma.ProcessStatus processStatus10 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage5);
        org.junit.Assert.assertTrue("'" + processMessage5 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS + "'", processMessage5.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.depositMoney((int) (short) 100, (int) (byte) -1, (float) 0L);
        boolean boolean42 = aTM32.verifyCustomer((int) (byte) 1, (int) (byte) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.transferFunds((int) (short) 10, 0, (int) (short) 10, (float) 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.changePIN(97, 0, 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM32.transferFunds(0, 1, (int) (byte) 1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus60 = aTM32.changePIN(0, (int) (byte) 1, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus64 = aTM32.withdrawMoney((int) (byte) 100, 52, (float) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertNotNull(processStatus60);
        org.junit.Assert.assertNotNull(processStatus64);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage processMessage7 = edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.ProcessStatus processStatus8 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus9 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus10 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus11 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus12 = new edu.hawaii.ics.peruma.ProcessStatus(true, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus13 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        edu.hawaii.ics.peruma.ProcessStatus processStatus14 = new edu.hawaii.ics.peruma.ProcessStatus(false, processMessage7);
        org.junit.Assert.assertTrue("'" + processMessage7 + "' != '" + edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS + "'", processMessage7.equals(edu.hawaii.ics.peruma.ProcessStatus.ProcessMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 10, (int) ' ', (float) 1);
        float float4 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM33 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus37 = aTM33.changePIN(0, 32, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus37);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) -1, 35, (float) 1);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus40 = aTM31.transferFunds(100, (int) '#', (int) (short) 1, 0.0f);
        boolean boolean43 = aTM31.verifyCustomer((int) (short) 100, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM31.withdrawMoney((int) '#', 0, (float) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus52 = aTM31.transferFunds((int) (byte) 10, 100, (int) (short) -1, (float) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus56 = aTM31.changePIN((int) (byte) -1, (int) (short) -1, 52);
        boolean boolean59 = aTM31.verifyCustomer((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus52);
        org.junit.Assert.assertNotNull(processStatus56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus70 = aTM66.depositMoney(1, (int) (byte) 1, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus74 = aTM66.changePIN((int) 'a', (int) (byte) 0, 97);
        boolean boolean77 = aTM66.verifyCustomer((int) (byte) 0, (int) (byte) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus82 = aTM66.transferFunds((int) (byte) 100, 10, (-1), (float) (short) 0);
        boolean boolean85 = aTM66.verifyCustomer((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus70);
        org.junit.Assert.assertNotNull(processStatus74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(processStatus82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (short) 0, (int) (byte) 100, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.changePIN((int) (short) -1, (int) (byte) -1, (int) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.changePIN(0, 35, (int) 'a');
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.withdrawMoney((int) ' ', (int) (short) 0, 0.0f);
        boolean boolean57 = aTM31.verifyCustomer((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        boolean boolean38 = aTM31.verifyCustomer((int) ' ', 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.depositMoney((int) (short) 0, (int) (byte) 100, (float) (short) 100);
        edu.hawaii.ics.peruma.ProcessStatus processStatus46 = aTM31.changePIN((int) (short) -1, (int) (byte) -1, (int) (short) 0);
        boolean boolean49 = aTM31.verifyCustomer(0, 35);
        // The following exception was thrown during execution in test generation
        try {
            float float52 = aTM31.getCustomerBalance(52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertNotNull(processStatus46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer(10, (int) (byte) 0, (float) (byte) 1);
        customer3.setPin(0);
        int int6 = customer3.getAccountNumber();
        customer3.setBalance((float) 97);
        float float9 = customer3.getBalance();
        customer3.setBalance((float) 32);
        float float12 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 32.0f + "'", float12 == 32.0f);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.depositMoney(0, (int) (short) 0, (float) (byte) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.changePIN((int) (short) 100, 1, 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM31.withdrawMoney((int) (short) 1, 100, (float) 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        boolean boolean35 = aTM32.verifyCustomer((int) (short) 100, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM32.withdrawMoney(100, (int) (byte) -1, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus43 = aTM32.depositMoney((int) (byte) 100, (int) (byte) 1, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus47 = aTM32.changePIN(0, 52, 10);
        edu.hawaii.ics.peruma.ProcessStatus processStatus51 = aTM32.depositMoney((-1), (int) '4', 97.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus43);
        org.junit.Assert.assertNotNull(processStatus47);
        org.junit.Assert.assertNotNull(processStatus51);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        boolean boolean38 = aTM31.verifyCustomer(0, (int) (byte) -1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus42 = aTM31.changePIN((int) (byte) 0, (int) (short) 100, (int) '4');
        boolean boolean45 = aTM31.verifyCustomer((int) (short) 1, (int) (short) 1);
        edu.hawaii.ics.peruma.ProcessStatus processStatus50 = aTM31.transferFunds((int) (byte) 100, (int) '4', 0, (float) (short) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus54 = aTM31.withdrawMoney((-1), (int) (byte) -1, (float) (byte) 0);
        boolean boolean57 = aTM31.verifyCustomer((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(processStatus42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(processStatus50);
        org.junit.Assert.assertNotNull(processStatus54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) 1, (int) (byte) 1, (float) 52);
        float float4 = customer3.getBalance();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 52.0f + "'", float4 == 52.0f);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ATM aTM32 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus37 = aTM32.transferFunds((int) ' ', 10, (int) '#', (float) 10L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus41 = aTM32.depositMoney((int) ' ', 52, (float) 0);
        edu.hawaii.ics.peruma.ProcessStatus processStatus45 = aTM32.changePIN(0, 10, 1);
        boolean boolean48 = aTM32.verifyCustomer((int) '4', 52);
        // The following exception was thrown during execution in test generation
        try {
            float float51 = aTM32.getCustomerBalance(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus37);
        org.junit.Assert.assertNotNull(processStatus41);
        org.junit.Assert.assertNotNull(processStatus45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer12 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int13 = customer12.getPin();
        edu.hawaii.ics.peruma.Customer customer17 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int18 = customer17.getPin();
        customer17.setBalance((float) (short) 1);
        customer17.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer26 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int27 = customer26.getPin();
        edu.hawaii.ics.peruma.Customer[] customerArray28 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer12, customer17, customer26 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList29 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList29, customerArray28);
        edu.hawaii.ics.peruma.ATM aTM31 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList29);
        edu.hawaii.ics.peruma.ProcessStatus processStatus35 = aTM31.withdrawMoney((int) (byte) 100, (int) (byte) 10, 0.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus39 = aTM31.withdrawMoney(0, 10, 97.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus44 = aTM31.transferFunds(97, (int) (byte) 0, (int) (short) -1, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus48 = aTM31.withdrawMoney((int) (byte) 1, (int) 'a', (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            float float51 = aTM31.getCustomerBalance((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(customerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(processStatus35);
        org.junit.Assert.assertNotNull(processStatus39);
        org.junit.Assert.assertNotNull(processStatus44);
        org.junit.Assert.assertNotNull(processStatus48);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        boolean boolean69 = aTM66.verifyCustomer(10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float72 = aTM66.getCustomerBalance((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Invalid Customer");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (byte) 0, 0, (float) (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        edu.hawaii.ics.peruma.Customer customer3 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int4 = customer3.getPin();
        customer3.setBalance((float) (short) 1);
        customer3.setBalance(1.0f);
        float float9 = customer3.getBalance();
        int int10 = customer3.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer14 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int15 = customer14.getPin();
        customer14.setBalance((float) (short) 1);
        customer14.setBalance(1.0f);
        float float20 = customer14.getBalance();
        customer14.setBalance((float) (byte) 0);
        int int23 = customer14.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer27 = new edu.hawaii.ics.peruma.Customer(10, 0, (float) (-1L));
        float float28 = customer27.getBalance();
        edu.hawaii.ics.peruma.Customer customer32 = new edu.hawaii.ics.peruma.Customer((int) 'a', (int) 'a', (float) 100);
        int int33 = customer32.getPin();
        int int34 = customer32.getAccountNumber();
        edu.hawaii.ics.peruma.Customer customer38 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int39 = customer38.getPin();
        customer38.setBalance((float) (short) 1);
        customer38.setBalance(1.0f);
        float float44 = customer38.getBalance();
        customer38.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer50 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int51 = customer50.getPin();
        customer50.setBalance((float) (short) 1);
        customer50.setBalance((float) (byte) 0);
        edu.hawaii.ics.peruma.Customer customer59 = new edu.hawaii.ics.peruma.Customer((int) (short) -1, (int) (byte) 1, (float) 'a');
        int int60 = customer59.getPin();
        int int61 = customer59.getAccountNumber();
        edu.hawaii.ics.peruma.Customer[] customerArray62 = new edu.hawaii.ics.peruma.Customer[] { customer3, customer14, customer27, customer32, customer38, customer50, customer59 };
        java.util.ArrayList<edu.hawaii.ics.peruma.Customer> customerList63 = new java.util.ArrayList<edu.hawaii.ics.peruma.Customer>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<edu.hawaii.ics.peruma.Customer>) customerList63, customerArray62);
        edu.hawaii.ics.peruma.ATM aTM65 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM66 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ATM aTM67 = new edu.hawaii.ics.peruma.ATM((java.util.List<edu.hawaii.ics.peruma.Customer>) customerList63);
        edu.hawaii.ics.peruma.ProcessStatus processStatus72 = aTM67.transferFunds((-1), 35, (int) (short) -1, 100.0f);
        edu.hawaii.ics.peruma.ProcessStatus processStatus76 = aTM67.withdrawMoney((int) (short) 100, 97, (float) 0L);
        edu.hawaii.ics.peruma.ProcessStatus processStatus80 = aTM67.depositMoney((int) '#', (int) (byte) 0, (float) (-1L));
        edu.hawaii.ics.peruma.ProcessStatus processStatus84 = aTM67.withdrawMoney((int) (byte) 1, (int) (short) 10, (float) (-1));
        java.lang.Class<?> wildcardClass85 = aTM67.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(customerArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(processStatus72);
        org.junit.Assert.assertNotNull(processStatus76);
        org.junit.Assert.assertNotNull(processStatus80);
        org.junit.Assert.assertNotNull(processStatus84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }
}

