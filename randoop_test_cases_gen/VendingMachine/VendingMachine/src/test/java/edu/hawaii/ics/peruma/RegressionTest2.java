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
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) '#', vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        double double6 = vendingStatus3.getChange();
        boolean boolean7 = vendingStatus3.isSuccess();
        double double8 = vendingStatus3.getChange();
        boolean boolean9 = vendingStatus3.isSuccess();
        boolean boolean10 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        boolean boolean6 = location2.equals((java.lang.Object) 10);
        int int7 = location2.getRow();
        int int8 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        boolean boolean9 = addStatus6.isSuccess();
        boolean boolean10 = location2.equals((java.lang.Object) addStatus6);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage13 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage13);
        boolean boolean15 = vendingStatus14.isSuccess();
        double double16 = vendingStatus14.getChange();
        boolean boolean17 = location2.equals((java.lang.Object) vendingStatus14);
        double double18 = vendingStatus14.getChange();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage13 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage13.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage14 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 100, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, 35.0d, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage14);
        org.junit.Assert.assertTrue("'" + vendingMessage14 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage14.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage14 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 10, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage14);
        boolean boolean22 = vendingStatus21.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage14 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage14.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage9 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage9);
        boolean boolean13 = location2.equals((java.lang.Object) vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage16 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage16);
        double double18 = vendingStatus17.getChange();
        java.lang.Class<?> wildcardClass19 = vendingStatus17.getClass();
        boolean boolean20 = location2.equals((java.lang.Object) vendingStatus17);
        org.junit.Assert.assertTrue("'" + vendingMessage9 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage9.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage16 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage16.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 52);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus12 = vendingMachine0.addItem(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        boolean boolean12 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus14.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage15);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus16.getAddMessage();
        boolean boolean18 = addStatus16.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location9, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location20, (double) 10.0f);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage29 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus30 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage29);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage29);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage29);
        boolean boolean33 = location20.equals((java.lang.Object) 35.0d);
        int int34 = location20.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertTrue("'" + vendingMessage29 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage29.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (byte) -1);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 32);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine8 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        int int14 = location11.getColumn();
        int int15 = location11.getColumn();
        int int16 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine8.vendItem(location11, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage21 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage21);
        boolean boolean23 = location11.equals((java.lang.Object) vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage21);
        boolean boolean25 = location5.equals((java.lang.Object) vendingMessage21);
        boolean boolean26 = location2.equals((java.lang.Object) location5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + vendingMessage21 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage21.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int5 = location4.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        boolean boolean11 = addStatus8.isSuccess();
        boolean boolean12 = location4.equals((java.lang.Object) addStatus8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        boolean boolean15 = location9.equals((java.lang.Object) addMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location9, (double) 100L);
        edu.hawaii.ics.peruma.Location location18 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine0.vendItem(location18, (double) (byte) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int25 = location24.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage29 = addStatus28.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus28.getAddMessage();
        boolean boolean31 = addStatus28.isSuccess();
        boolean boolean32 = location24.equals((java.lang.Object) addStatus28);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus34 = vendingMachine0.vendItem(location24, 100.0d);
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage29 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage29.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(vendingStatus34);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int13 = location12.getColumn();
        int int14 = location12.getRow();
        int int15 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine3.vendItem(location12, (double) 1.0f);
        int int18 = location12.getColumn();
        java.lang.Class<?> wildcardClass19 = location12.getClass();
        boolean boolean20 = location2.equals((java.lang.Object) wildcardClass19);
        int int21 = location2.getRow();
        java.lang.Class<?> wildcardClass22 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine13.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine13.getItems();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine13.vendItem(location18, (double) 10.0f);
        boolean boolean21 = location10.equals((java.lang.Object) location18);
        int int22 = location18.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine1 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int5 = location4.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine1.vendItem(location4, (double) 100L);
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine1.vendItem(location10, (double) 1.0f);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        boolean boolean17 = location10.equals((java.lang.Object) addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage16);
        boolean boolean19 = addStatus18.isSuccess();
        boolean boolean20 = addStatus18.isSuccess();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, (int) (byte) 1);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        edu.hawaii.ics.peruma.Location location15 = new edu.hawaii.ics.peruma.Location((int) ' ', 0);
        int int16 = location15.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location15, 32.0d);
        double double19 = vendingStatus18.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        boolean boolean16 = location9.equals((java.lang.Object) addMessage15);
        int int17 = location9.getRow();
        int int18 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1.0f), vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location(52, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location19, (double) 1L);
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((-1), (int) (byte) 0);
        edu.hawaii.ics.peruma.Location location27 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int28 = location27.getColumn();
        edu.hawaii.ics.peruma.Location location31 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int32 = location31.getColumn();
        int int33 = location31.getColumn();
        int int34 = location31.getRow();
        boolean boolean35 = location27.equals((java.lang.Object) location31);
        int int36 = location31.getColumn();
        java.lang.Object obj37 = null;
        boolean boolean38 = location31.equals(obj37);
        boolean boolean39 = location24.equals(obj37);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location24, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(vendingStatus41);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) ' ');
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage10);
        boolean boolean16 = vendingStatus15.isSuccess();
        boolean boolean17 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(itemList11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int8 = location7.getColumn();
        int int9 = location7.getRow();
        boolean boolean10 = location4.equals((java.lang.Object) int9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean14 = addStatus13.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus13.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus13.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus13.getAddMessage();
        boolean boolean18 = location4.equals((java.lang.Object) addMessage17);
        edu.hawaii.ics.peruma.AddStatus addStatus19 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage17);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = addStatus19.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine5 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine5.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine5.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine5.vendItem(location10, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine5.getItems();
        boolean boolean14 = location2.equals((java.lang.Object) vendingMachine5);
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location(0, 35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine5.vendItem(location17, (double) 100.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine5.getItems();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, 52);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (-1.0d), vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        double double6 = vendingStatus3.getChange();
        boolean boolean7 = vendingStatus3.isSuccess();
        boolean boolean8 = vendingStatus3.isSuccess();
        double double9 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, 1.0d, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        double double6 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '4', vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean5 = addStatus4.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine2.vendItem(location5, (double) (byte) 0);
        int int8 = location5.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage11 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage11);
        boolean boolean13 = location5.equals((java.lang.Object) vendingMessage11);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage11);
        double double15 = vendingStatus14.getChange();
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage11 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage11.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 0, (int) (byte) 10);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int20 = location19.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location19, 10.0d);
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location(1, (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, (double) '4');
        edu.hawaii.ics.peruma.Location location30 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, (int) '4');
        int int31 = location30.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus33 = vendingMachine0.vendItem(location30, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(vendingStatus33);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(97, (int) (byte) 100);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int12 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location11, (double) '4');
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine0.addItem(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vendingStatus14);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) -1);
        boolean boolean9 = location2.equals((java.lang.Object) location8);
        int int10 = location8.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        double double6 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(32, (int) ' ');
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        boolean boolean16 = location9.equals((java.lang.Object) 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        boolean boolean28 = addStatus27.isSuccess();
        boolean boolean29 = addStatus27.isSuccess();
        boolean boolean30 = location9.equals((java.lang.Object) addStatus27);
        int int31 = location9.getColumn();
        int int32 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 10.0f);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine10 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int14 = location13.getColumn();
        int int15 = location13.getRow();
        int int16 = location13.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine10.vendItem(location13, 100.0d);
        boolean boolean19 = location2.equals((java.lang.Object) vendingStatus18);
        int int20 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage25 = addStatus24.getAddMessage();
        boolean boolean26 = addStatus24.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = addStatus24.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage29 = addStatus28.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus28.getAddMessage();
        boolean boolean31 = location2.equals((java.lang.Object) addStatus28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage25 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage25.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage29 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage29.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        boolean boolean12 = location4.equals((java.lang.Object) addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus13.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage14);
        boolean boolean16 = addStatus15.isSuccess();
        boolean boolean17 = addStatus15.isSuccess();
        boolean boolean18 = addStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        int int8 = location5.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine9 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int13 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine9.vendItem(location12, (double) 100L);
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getColumn();
        int int22 = location18.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine9.vendItem(location18, (double) 1);
        double double25 = vendingStatus24.getChange();
        boolean boolean26 = location5.equals((java.lang.Object) double25);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage33 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus34 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage33);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage33);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage33);
        boolean boolean37 = vendingStatus36.isSuccess();
        double double38 = vendingStatus36.getChange();
        boolean boolean39 = location5.equals((java.lang.Object) vendingStatus36);
        int int40 = location5.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage33 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage33.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 35.0d + "'", double38 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (-1));
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int7 = location6.getColumn();
        int int8 = location6.getRow();
        int int9 = location6.getColumn();
        int int10 = location6.getColumn();
        int int11 = location6.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine3.vendItem(location6, (double) (byte) 0);
        boolean boolean14 = location2.equals((java.lang.Object) vendingMachine3);
        int int15 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getRow();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        boolean boolean14 = location3.equals((java.lang.Object) '4');
        int int15 = location3.getRow();
        int int16 = location3.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine9 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int13 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine9.vendItem(location12, (double) 100L);
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getColumn();
        int int22 = location18.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine9.vendItem(location18, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine9.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine9.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList27 = vendingMachine9.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine28 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList29 = vendingMachine28.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine28.getItems();
        edu.hawaii.ics.peruma.Location location33 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine28.vendItem(location33, (double) 10.0f);
        int int36 = location33.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine9.vendItem(location33, (double) 1L);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine0.vendItem(location33, (double) 0L);
        int int41 = location33.getColumn();
        int int42 = location33.getColumn();
        java.lang.Class<?> wildcardClass43 = location33.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
        org.junit.Assert.assertNotNull(itemList27);
        org.junit.Assert.assertNotNull(itemList29);
        org.junit.Assert.assertNotNull(itemList30);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(vendingStatus40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(35, 52);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        boolean boolean11 = addStatus10.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        boolean boolean15 = location9.equals((java.lang.Object) addMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location9, (double) 100L);
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int21 = location20.getColumn();
        int int22 = location20.getRow();
        int int23 = location20.getColumn();
        int int24 = location20.getColumn();
        int int25 = location20.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location20, 35.0d);
        edu.hawaii.ics.peruma.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus29 = vendingMachine0.addItem(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(vendingStatus27);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int12 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location11, (double) '4');
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int19 = location18.getRow();
        int int20 = location18.getColumn();
        int int21 = location18.getColumn();
        int int22 = location18.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location18, 10.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(vendingStatus24);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean8 = location2.equals((java.lang.Object) addMessage5);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        java.lang.Class<?> wildcardClass10 = addMessage8.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, 32);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) 1);
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        boolean boolean11 = addStatus10.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean14 = location6.equals((java.lang.Object) addMessage12);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean16 = location2.equals((java.lang.Object) addStatus15);
        int int17 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus9.getAddMessage();
        boolean boolean13 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', 0);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        boolean boolean12 = addStatus11.isSuccess();
        boolean boolean13 = addStatus11.isSuccess();
        boolean boolean14 = location2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location(35, 0);
        int int15 = location14.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location14, (double) 100);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(vendingStatus17);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        boolean boolean13 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        boolean boolean16 = location5.equals((java.lang.Object) addStatus15);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage19 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 32, vendingMessage19);
        boolean boolean21 = location5.equals((java.lang.Object) true);
        int int22 = location5.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine23 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location26 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int27 = location26.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine23.vendItem(location26, (double) 100L);
        edu.hawaii.ics.peruma.Location location32 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int33 = location32.getColumn();
        int int34 = location32.getRow();
        int int35 = location32.getColumn();
        int int36 = location32.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine23.vendItem(location32, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine23.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList40 = vendingMachine23.getItems();
        boolean boolean41 = location5.equals((java.lang.Object) itemList40);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage19 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage19.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(itemList39);
        org.junit.Assert.assertNotNull(itemList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (byte) 1);
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        boolean boolean12 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        boolean boolean15 = location7.equals((java.lang.Object) addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        boolean boolean18 = location2.equals((java.lang.Object) addMessage13);
        int int19 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, (int) 'a');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location16, (double) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(vendingStatus18);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        boolean boolean13 = addStatus12.isSuccess();
        boolean boolean14 = addStatus12.isSuccess();
        boolean boolean15 = addStatus12.isSuccess();
        boolean boolean16 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 0, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        double double15 = vendingStatus14.getChange();
        double double16 = vendingStatus14.getChange();
        boolean boolean17 = vendingStatus14.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        boolean boolean9 = addStatus6.isSuccess();
        boolean boolean10 = location2.equals((java.lang.Object) addStatus6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus6.getAddMessage();
        java.lang.Class<?> wildcardClass12 = addMessage11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 10.0f);
        boolean boolean11 = location2.equals((java.lang.Object) (byte) -1);
        int int12 = location2.getRow();
        java.lang.Class<?> wildcardClass13 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine8 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        int int14 = location11.getColumn();
        int int15 = location11.getColumn();
        int int16 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine8.vendItem(location11, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage21 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage21);
        boolean boolean23 = location11.equals((java.lang.Object) vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(true, 1.0d, vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 0, vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 52, vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage21);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + vendingMessage21 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage21.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', (int) ' ');
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 0, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1);
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int17 = location16.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine0.vendItem(location16, (double) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine20 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location23 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int24 = location23.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = vendingMachine20.vendItem(location23, (double) 100L);
        int int27 = location23.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine0.vendItem(location23, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(vendingStatus26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location19, (double) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(vendingStatus21);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location9, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location20, (double) (short) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location26 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = vendingMachine0.vendItem(location26, (double) (byte) 10);
        java.lang.Class<?> wildcardClass29 = location26.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertNotNull(vendingStatus28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, (int) (byte) 100);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int20 = location19.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location19, 10.0d);
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (short) 1, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, 97.0d);
        edu.hawaii.ics.peruma.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus29 = vendingMachine0.addItem(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus27);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int11 = location10.getColumn();
        int int12 = location10.getColumn();
        boolean boolean14 = location10.equals((java.lang.Object) 10);
        int int15 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location10, (double) (short) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) (short) 100, 52);
        int int22 = location21.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location21, (double) '4');
        edu.hawaii.ics.peruma.Location location27 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, (int) 'a');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine0.vendItem(location27, (double) 0L);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(vendingStatus29);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage13 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass14 = vendingMessage13.getClass();
        boolean boolean15 = location10.equals((java.lang.Object) vendingMessage13);
        boolean boolean17 = location10.equals((java.lang.Object) 10.0f);
        int int18 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine0.vendItem(location10, (double) (short) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage13 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage13.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(itemList21);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        boolean boolean15 = location9.equals((java.lang.Object) addMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location9, (double) 100L);
        edu.hawaii.ics.peruma.Location location18 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine0.vendItem(location18, (double) (byte) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(itemList22);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine6 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine6.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine6.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine6.vendItem(location11, (double) 10.0f);
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        int int18 = location16.getRow();
        int int19 = location16.getRow();
        int int20 = location16.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = addStatus23.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage25 = addStatus23.getAddMessage();
        boolean boolean26 = location16.equals((java.lang.Object) addMessage25);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = vendingMachine6.vendItem(location16, (double) 100.0f);
        boolean boolean29 = location2.equals((java.lang.Object) vendingMachine6);
        java.lang.Object obj30 = null;
        boolean boolean31 = location2.equals(obj30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage25 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage25.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(vendingStatus28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        double double15 = vendingStatus14.getChange();
        double double16 = vendingStatus14.getChange();
        double double17 = vendingStatus14.getChange();
        double double18 = vendingStatus14.getChange();
        boolean boolean19 = vendingStatus14.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage14 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass15 = vendingMessage14.getClass();
        boolean boolean16 = location11.equals((java.lang.Object) vendingMessage14);
        boolean boolean18 = location11.equals((java.lang.Object) 10.0f);
        int int19 = location11.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location11, 35.0d);
        boolean boolean22 = vendingStatus21.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage14 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage14.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine7.vendItem(location10, (double) 100L);
        boolean boolean14 = location2.equals((java.lang.Object) vendingMachine7);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine7.getItems();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int19 = location18.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine7.vendItem(location18, (double) (byte) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine7.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine7.getItems();
        java.lang.Class<?> wildcardClass24 = itemList23.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) ' ', vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage10);
        double double16 = vendingStatus15.getChange();
        boolean boolean17 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        boolean boolean16 = location9.equals((java.lang.Object) 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        boolean boolean28 = addStatus27.isSuccess();
        boolean boolean29 = addStatus27.isSuccess();
        boolean boolean30 = location9.equals((java.lang.Object) addStatus27);
        java.lang.Class<?> wildcardClass31 = addStatus27.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass10 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getRow();
        int int14 = location10.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = addStatus17.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus17.getAddMessage();
        boolean boolean20 = location10.equals((java.lang.Object) addMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location10, (double) 100.0f);
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) ' ', 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, 32.0d);
        boolean boolean28 = vendingStatus27.isSuccess();
        boolean boolean29 = vendingStatus27.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine7.vendItem(location10, (double) 100L);
        boolean boolean14 = location2.equals((java.lang.Object) vendingMachine7);
        edu.hawaii.ics.peruma.Location location15 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine7.vendItem(location15, (double) 0.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine7.getItems();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 97);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine7.vendItem(location21, (double) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(vendingStatus23);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        boolean boolean9 = vendingStatus8.isSuccess();
        boolean boolean10 = vendingStatus8.isSuccess();
        double double11 = vendingStatus8.getChange();
        boolean boolean12 = vendingStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) 'a');
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(10, 0);
        boolean boolean6 = location2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getRow();
        int int14 = location10.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = addStatus17.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus17.getAddMessage();
        boolean boolean20 = location10.equals((java.lang.Object) addMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location10, (double) 100.0f);
        int int23 = location10.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location12, (double) 'a');
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 10);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage31 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus33 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus34 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus37 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage31);
        boolean boolean38 = location18.equals((java.lang.Object) vendingMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine0.vendItem(location18, 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertTrue("'" + vendingMessage31 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage31.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(vendingStatus40);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        java.lang.Class<?> wildcardClass11 = addMessage10.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '#', vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location9, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location(0, (int) '#');
        edu.hawaii.ics.peruma.VendingMachine vendingMachine21 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine21.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine21.getItems();
        edu.hawaii.ics.peruma.Location location26 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = vendingMachine21.vendItem(location26, (double) 10.0f);
        int int29 = location26.getColumn();
        boolean boolean30 = location20.equals((java.lang.Object) int29);
        int int31 = location20.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus33 = vendingMachine0.vendItem(location20, (double) 1.0f);
        edu.hawaii.ics.peruma.Location location36 = new edu.hawaii.ics.peruma.Location(100, 32);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location36, (double) 'a');
        edu.hawaii.ics.peruma.Location location41 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int42 = location41.getRow();
        int int43 = location41.getColumn();
        int int44 = location41.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus46 = vendingMachine0.vendItem(location41, (double) (byte) 0);
        edu.hawaii.ics.peruma.Location location49 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) -1);
        edu.hawaii.ics.peruma.Location location52 = new edu.hawaii.ics.peruma.Location(10, 0);
        boolean boolean53 = location49.equals((java.lang.Object) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus55 = vendingMachine0.vendItem(location49, (double) 0L);
        edu.hawaii.ics.peruma.Item item56 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus57 = vendingMachine0.addItem(item56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertNotNull(vendingStatus28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(vendingStatus33);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(vendingStatus46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(vendingStatus55);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 52);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) -1, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        boolean boolean8 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean8 = addStatus7.isSuccess();
        boolean boolean9 = addStatus7.isSuccess();
        boolean boolean10 = addStatus7.isSuccess();
        boolean boolean11 = addStatus7.isSuccess();
        boolean boolean12 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, (int) '4');
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int8 = location7.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine4.vendItem(location7, (double) 100L);
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int14 = location13.getColumn();
        int int15 = location13.getRow();
        int int16 = location13.getColumn();
        int int17 = location13.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine4.vendItem(location13, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine4.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine4.getItems();
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = vendingMachine4.vendItem(location24, (double) (short) 10);
        edu.hawaii.ics.peruma.Location location29 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) 'a');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = vendingMachine4.vendItem(location29, (double) (-1.0f));
        boolean boolean32 = location2.equals((java.lang.Object) location29);
        int int33 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(vendingStatus26);
        org.junit.Assert.assertNotNull(vendingStatus31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine9 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int13 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine9.vendItem(location12, (double) 100L);
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getColumn();
        int int22 = location18.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine9.vendItem(location18, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine9.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine9.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList27 = vendingMachine9.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine28 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList29 = vendingMachine28.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine28.getItems();
        edu.hawaii.ics.peruma.Location location33 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine28.vendItem(location33, (double) 10.0f);
        int int36 = location33.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine9.vendItem(location33, (double) 1L);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine0.vendItem(location33, (double) 0L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList41 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList42 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location43 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus45 = vendingMachine0.vendItem(location43, 10.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList46 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
        org.junit.Assert.assertNotNull(itemList27);
        org.junit.Assert.assertNotNull(itemList29);
        org.junit.Assert.assertNotNull(itemList30);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(vendingStatus40);
        org.junit.Assert.assertNotNull(itemList41);
        org.junit.Assert.assertNotNull(itemList42);
        org.junit.Assert.assertNotNull(vendingStatus45);
        org.junit.Assert.assertNotNull(itemList46);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int17 = location16.getRow();
        int int18 = location16.getColumn();
        int int19 = location16.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location16, 0.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertNotNull(itemList24);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean12 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus11.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location9, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location20, (double) 10.0f);
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, 35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, (double) (short) 10);
        int int28 = location25.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList3 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine5 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine5.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine5.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine5.vendItem(location10, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine5.getItems();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine5.vendItem(location16, (double) 1);
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int22 = location21.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine5.vendItem(location21, (double) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine25 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location28 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int29 = location28.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = vendingMachine25.vendItem(location28, (double) 100L);
        int int32 = location28.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus34 = vendingMachine5.vendItem(location28, (double) (short) 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine0.vendItem(location28, (double) 10);
        edu.hawaii.ics.peruma.Location location39 = new edu.hawaii.ics.peruma.Location(52, 52);
        boolean boolean40 = location28.equals((java.lang.Object) 52);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList3);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(vendingStatus31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(vendingStatus34);
        org.junit.Assert.assertNotNull(vendingStatus36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 100, vendingMessage10);
        java.lang.Class<?> wildcardClass16 = vendingStatus15.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage12);
        java.lang.Class<?> wildcardClass19 = vendingMessage12.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine4.vendItem(location7, (double) (byte) 0);
        int int10 = location7.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage13 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage13);
        boolean boolean15 = location7.equals((java.lang.Object) vendingMessage13);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage13);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage13);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage13 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage13.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage10);
        double double16 = vendingStatus15.getChange();
        double double17 = vendingStatus15.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) 1);
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        boolean boolean11 = addStatus10.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean14 = location6.equals((java.lang.Object) addMessage12);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean16 = location2.equals((java.lang.Object) addStatus15);
        boolean boolean17 = addStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location9, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location20, (double) (short) 10);
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) 'a');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, (double) (-1.0f));
        edu.hawaii.ics.peruma.Location location30 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine0.vendItem(location30, (-1.0d));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertNotNull(vendingStatus32);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 10.0f);
        boolean boolean11 = location2.equals((java.lang.Object) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine12 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine12.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine12.getItems();
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine12.vendItem(location17, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine12.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine12.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine12.getItems();
        boolean boolean23 = location2.equals((java.lang.Object) itemList22);
        java.lang.Class<?> wildcardClass24 = itemList22.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 1, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int13 = location12.getColumn();
        int int14 = location12.getRow();
        int int15 = location12.getRow();
        int int16 = location12.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus19 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage18);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = addStatus19.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage21 = addStatus19.getAddMessage();
        boolean boolean22 = location12.equals((java.lang.Object) addMessage21);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage26 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage26);
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage26);
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage26);
        boolean boolean30 = addStatus29.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        java.lang.Class<?> wildcardClass32 = addMessage31.getClass();
        boolean boolean33 = location12.equals((java.lang.Object) addMessage31);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location12, 10.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList36 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList37 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList38 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage21 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage21.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + addMessage26 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage26.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertNotNull(itemList36);
        org.junit.Assert.assertNotNull(itemList37);
        org.junit.Assert.assertNotNull(itemList38);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1);
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int17 = location16.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine0.vendItem(location16, (double) (byte) -1);
        double double20 = vendingStatus19.getChange();
        boolean boolean21 = vendingStatus19.isSuccess();
        double double22 = vendingStatus19.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) -1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getRow();
        int int14 = location10.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = addStatus17.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus17.getAddMessage();
        boolean boolean20 = location10.equals((java.lang.Object) addMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine0.vendItem(location10, (double) 100.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(itemList23);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean11 = addStatus10.isSuccess();
        boolean boolean12 = addStatus10.isSuccess();
        boolean boolean13 = addStatus10.isSuccess();
        boolean boolean14 = addStatus10.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus10.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (short) -1);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        boolean boolean12 = location4.equals((java.lang.Object) addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus13.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage14);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus15.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location9, (double) 1);
        int int16 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }
}

