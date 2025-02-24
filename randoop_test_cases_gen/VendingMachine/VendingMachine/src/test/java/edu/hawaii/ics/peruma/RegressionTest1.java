import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        int int24 = location2.getRow();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0.0f, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 52, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, 10.0d, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getRow();
        int int13 = location9.getColumn();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int17 = location16.getColumn();
        int int18 = location16.getRow();
        int int19 = location16.getColumn();
        boolean boolean20 = location9.equals((java.lang.Object) location16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage24);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage26 = addStatus25.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage26);
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage26);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage29 = addStatus28.getAddMessage();
        boolean boolean30 = location9.equals((java.lang.Object) addMessage29);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine0.vendItem(location9, (double) (-1L));
        java.lang.Class<?> wildcardClass33 = vendingMachine0.getClass();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage26 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage26.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage29 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage29.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(vendingStatus32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean5 = addStatus4.isSuccess();
        boolean boolean6 = addStatus4.isSuccess();
        boolean boolean7 = addStatus4.isSuccess();
        java.lang.Class<?> wildcardClass8 = addStatus4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, 32.0d, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int5 = location4.getColumn();
        int int6 = location4.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass8 = vendingMessage7.getClass();
        boolean boolean9 = location4.equals((java.lang.Object) vendingMessage7);
        boolean boolean11 = location4.equals((java.lang.Object) 10.0f);
        int int12 = location4.getColumn();
        int int13 = location4.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location4, (double) 52);
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getRow();
        int int22 = location18.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage24);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage26 = addStatus25.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = addStatus25.getAddMessage();
        boolean boolean28 = location18.equals((java.lang.Object) addMessage27);
        int int29 = location18.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage32 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus33 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage32);
        edu.hawaii.ics.peruma.AddStatus addStatus34 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage32);
        boolean boolean35 = addStatus34.isSuccess();
        boolean boolean36 = location18.equals((java.lang.Object) addStatus34);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location18, (double) 10L);
        double double39 = vendingStatus38.getChange();
        java.lang.Class<?> wildcardClass40 = vendingStatus38.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage26 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage26.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + addMessage32 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage32.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location12, (double) 'a');
        edu.hawaii.ics.peruma.Location location15 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location15, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(vendingStatus17);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) 'a');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        int int5 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        boolean boolean10 = addStatus7.isSuccess();
        boolean boolean11 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        double double39 = vendingStatus38.getChange();
        double double40 = vendingStatus38.getChange();
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int14 = location13.getColumn();
        int int15 = location13.getColumn();
        int int16 = location13.getRow();
        int int17 = location13.getRow();
        int int18 = location13.getRow();
        int int19 = location13.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location13, (double) 35);
        int int22 = location13.getColumn();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        int int8 = location6.getRow();
        boolean boolean9 = location3.equals((java.lang.Object) int8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        boolean boolean13 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus12.getAddMessage();
        boolean boolean17 = location3.equals((java.lang.Object) addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage16);
        boolean boolean19 = addStatus18.isSuccess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        boolean boolean6 = vendingStatus3.isSuccess();
        double double7 = vendingStatus3.getChange();
        java.lang.Class<?> wildcardClass8 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (-1));
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine3.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList5 = vendingMachine3.getItems();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine3.vendItem(location8, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine3.getItems();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine3.vendItem(location14, (double) 1);
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int20 = location19.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine3.vendItem(location19, (double) (byte) -1);
        boolean boolean23 = location2.equals((java.lang.Object) vendingStatus22);
        boolean boolean24 = vendingStatus22.isSuccess();
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertNotNull(itemList5);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) (byte) 0);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        edu.hawaii.ics.peruma.Location location17 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine0.vendItem(location17, (double) 'a');
        edu.hawaii.ics.peruma.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus21 = vendingMachine0.addItem(item20);
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
        org.junit.Assert.assertNotNull(vendingStatus19);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage5);
        java.lang.Class<?> wildcardClass7 = vendingStatus6.getClass();
        boolean boolean8 = location2.equals((java.lang.Object) wildcardClass7);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        boolean boolean14 = location2.equals((java.lang.Object) location11);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', 10);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        double double9 = vendingStatus8.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        boolean boolean12 = addStatus9.isSuccess();
        boolean boolean13 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 35);
        java.lang.Object obj3 = null;
        boolean boolean4 = location2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getColumn();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        boolean boolean14 = location3.equals((java.lang.Object) (byte) 10);
        int int15 = location3.getColumn();
        int int16 = location3.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage22);
        boolean boolean28 = addStatus27.isSuccess();
        boolean boolean29 = location3.equals((java.lang.Object) addStatus27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 35);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 0, (int) (short) 10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage15);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        double double7 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0.0f, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 52, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) -1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, (int) '#');
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList34 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList35 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass36 = itemList35.getClass();
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
        org.junit.Assert.assertNotNull(itemList34);
        org.junit.Assert.assertNotNull(itemList35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int8 = location7.getColumn();
        int int9 = location7.getRow();
        int int10 = location7.getColumn();
        int int11 = location7.getColumn();
        int int12 = location7.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine4.vendItem(location7, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage17 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage17);
        boolean boolean19 = location7.equals((java.lang.Object) vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage17);
        double double22 = vendingStatus21.getChange();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + vendingMessage17 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage17.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass25 = itemList24.getClass();
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
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        int int8 = location5.getRow();
        boolean boolean10 = location5.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        int int8 = location6.getRow();
        boolean boolean9 = location3.equals((java.lang.Object) int8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        boolean boolean13 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus12.getAddMessage();
        boolean boolean17 = location3.equals((java.lang.Object) addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus18.getAddMessage();
        boolean boolean20 = addStatus18.isSuccess();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int12 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location11, (double) '4');
        double double15 = vendingStatus14.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) (short) 1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10.0f, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        int int15 = location9.getRow();
        int int16 = location9.getRow();
        java.lang.Class<?> wildcardClass17 = location9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int7 = location6.getColumn();
        int int8 = location6.getColumn();
        int int9 = location6.getRow();
        boolean boolean10 = location2.equals((java.lang.Object) location6);
        java.lang.Class<?> wildcardClass11 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList3 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine5 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int9 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine5.vendItem(location8, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine12 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location15 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine12.vendItem(location15, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine5.vendItem(location15, (double) (byte) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location15, (double) (byte) 100);
        double double22 = vendingStatus21.getChange();
        double double23 = vendingStatus21.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList3);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage8);
        boolean boolean13 = vendingStatus12.isSuccess();
        java.lang.Class<?> wildcardClass14 = vendingStatus12.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean10 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        edu.hawaii.ics.peruma.Location location36 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location36, 0.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList39);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine0.addItem(item16);
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
        org.junit.Assert.assertNotNull(itemList15);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (short) 10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        boolean boolean11 = location3.equals((java.lang.Object) addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(32, (int) (byte) 10);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        java.lang.Class<?> wildcardClass8 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(itemList25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) -1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage6);
        double double10 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine6 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        int int14 = location9.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine6.vendItem(location9, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage19 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage19);
        boolean boolean21 = location9.equals((java.lang.Object) vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(true, 1.0d, vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 0, vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 52, vendingMessage19);
        boolean boolean25 = vendingStatus24.isSuccess();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + vendingMessage19 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage19.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.lang.Class<?> wildcardClass6 = vendingStatus5.getClass();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean12 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) ' ', vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, 35);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage8);
        boolean boolean13 = vendingStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (byte) 10);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int8 = location7.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine4.vendItem(location7, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine4.getItems();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine4.vendItem(location14, (double) (short) 100);
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location((int) ' ', 0);
        int int20 = location19.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine4.vendItem(location19, 32.0d);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage28);
        boolean boolean30 = addStatus29.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus32 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage31);
        edu.hawaii.ics.peruma.AddStatus addStatus33 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage31);
        edu.hawaii.ics.peruma.AddStatus addStatus34 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage31);
        edu.hawaii.ics.peruma.AddStatus addStatus35 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage31);
        boolean boolean36 = addStatus35.isSuccess();
        boolean boolean37 = location19.equals((java.lang.Object) boolean36);
        boolean boolean38 = location2.equals((java.lang.Object) boolean36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        boolean boolean28 = vendingStatus27.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 52);
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        double double34 = vendingStatus33.getChange();
        boolean boolean35 = vendingStatus33.isSuccess();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1.0f), vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        int int22 = location16.getColumn();
        int int23 = location16.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (byte) -1);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        boolean boolean11 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean14 = addStatus13.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        boolean boolean13 = location2.equals((java.lang.Object) location9);
        int int14 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        java.lang.Class<?> wildcardClass20 = vendingMachine0.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        java.lang.Class<?> wildcardClass5 = addMessage2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        boolean boolean6 = vendingStatus5.isSuccess();
        boolean boolean7 = vendingStatus5.isSuccess();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine19 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine19.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine19.getItems();
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = vendingMachine19.vendItem(location24, (double) 10.0f);
        int int27 = location24.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine0.vendItem(location24, (double) 1L);
        int int30 = location24.getRow();
        int int31 = location24.getRow();
        int int32 = location24.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(vendingStatus26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        boolean boolean11 = addStatus7.isSuccess();
        boolean boolean12 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location(52, 35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location13, (double) (byte) 10);
        boolean boolean16 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 1, (int) (short) 1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 52);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        int int10 = location6.getColumn();
        int int11 = location6.getRow();
        boolean boolean12 = location2.equals((java.lang.Object) location6);
        int int13 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage20 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage20);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage20);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage20);
        boolean boolean24 = location2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + vendingMessage20 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage20.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, 100);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage12);
        boolean boolean17 = location2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '#');
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) -1);
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location(10, 0);
        boolean boolean21 = location17.equals((java.lang.Object) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine7.vendItem(location17, (double) (-1L));
        double double24 = vendingStatus23.getChange();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(vendingStatus23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        boolean boolean13 = addStatus11.isSuccess();
        boolean boolean14 = addStatus11.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, 97.0d, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1L), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '4', vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 0, 0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        boolean boolean13 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus11.getAddMessage();
        boolean boolean15 = addStatus11.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus15.getAddMessage();
        boolean boolean18 = addStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        boolean boolean15 = vendingStatus14.isSuccess();
        boolean boolean16 = vendingStatus14.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getRow();
        int int11 = location3.getRow();
        int int12 = location3.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        int int7 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '#', vendingMessage12);
        java.lang.Class<?> wildcardClass15 = vendingMessage12.getClass();
        boolean boolean16 = location2.equals((java.lang.Object) wildcardClass15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage9 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage9);
        boolean boolean13 = location2.equals((java.lang.Object) vendingMessage9);
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) '#', 32);
        boolean boolean17 = location2.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass18 = location2.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage9 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage9.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine19 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine19.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine19.getItems();
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = vendingMachine19.vendItem(location24, (double) 10.0f);
        int int27 = location24.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine0.vendItem(location24, (double) 1L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(vendingStatus26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(52, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1.0f);
        int int14 = location11.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage5);
        double double7 = vendingStatus6.getChange();
        boolean boolean8 = vendingStatus6.isSuccess();
        boolean boolean9 = vendingStatus6.isSuccess();
        boolean boolean10 = vendingStatus6.isSuccess();
        boolean boolean11 = location2.equals((java.lang.Object) boolean10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.VendingMachine vendingMachine8 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        int int14 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine8.vendItem(location11, 100.0d);
        int int17 = location11.getRow();
        int int18 = location11.getRow();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        boolean boolean22 = location11.equals((java.lang.Object) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location11, (double) (byte) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(itemList25);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage11 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage11);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage11);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage11);
        boolean boolean15 = location4.equals((java.lang.Object) vendingMessage11);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 1.0f, vendingMessage11);
        java.lang.Class<?> wildcardClass17 = vendingStatus16.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage11 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage11.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        boolean boolean8 = vendingStatus7.isSuccess();
        boolean boolean9 = vendingStatus7.isSuccess();
        double double10 = vendingStatus7.getChange();
        boolean boolean11 = vendingStatus7.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.lang.Class<?> wildcardClass7 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), 97);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.Class<?> wildcardClass17 = vendingStatus14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass26 = vendingMachine0.getClass();
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
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage2);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage2);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage8);
        java.lang.Class<?> wildcardClass13 = vendingStatus12.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        edu.hawaii.ics.peruma.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus22 = vendingMachine0.addItem(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        boolean boolean9 = addStatus7.isSuccess();
        boolean boolean10 = addStatus7.isSuccess();
        boolean boolean11 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) '#', vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingMessage6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, 1.0d, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, 32.0d, vendingMessage2);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine2.vendItem(location5, (double) 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList12 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine20 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location23 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = vendingMachine20.vendItem(location23, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine13.vendItem(location23, (double) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList28 = vendingMachine13.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine29 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine29.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList31 = vendingMachine29.getItems();
        edu.hawaii.ics.peruma.Location location34 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine29.vendItem(location34, (double) 10.0f);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine13.vendItem(location34, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine0.vendItem(location34, (double) 0);
        edu.hawaii.ics.peruma.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus42 = vendingMachine0.addItem(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(itemList12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(vendingStatus25);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertNotNull(itemList28);
        org.junit.Assert.assertNotNull(itemList30);
        org.junit.Assert.assertNotNull(itemList31);
        org.junit.Assert.assertNotNull(vendingStatus36);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(vendingStatus40);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        boolean boolean6 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location29 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = vendingMachine0.vendItem(location29, 0.0d);
        edu.hawaii.ics.peruma.Location location32 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus34 = vendingMachine0.vendItem(location32, (double) 1);
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
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
        org.junit.Assert.assertNotNull(vendingStatus31);
        org.junit.Assert.assertNotNull(vendingStatus34);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int8 = location7.getColumn();
        int int9 = location7.getRow();
        int int10 = location7.getColumn();
        int int11 = location7.getColumn();
        int int12 = location7.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine4.vendItem(location7, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage17 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage17);
        boolean boolean19 = location7.equals((java.lang.Object) vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, 1.0d, vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, 35.0d, vendingMessage17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + vendingMessage17 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage17.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        boolean boolean9 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus7.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 1.0f, vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(52, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1.0f);
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location16, (double) (short) -1);
        edu.hawaii.ics.peruma.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus20 = vendingMachine0.addItem(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(vendingStatus18);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10.0f, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        double double6 = vendingStatus3.getChange();
        java.lang.Class<?> wildcardClass7 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        boolean boolean8 = vendingStatus7.isSuccess();
        boolean boolean9 = vendingStatus7.isSuccess();
        double double10 = vendingStatus7.getChange();
        java.lang.Class<?> wildcardClass11 = vendingStatus7.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean13 = addStatus12.isSuccess();
        boolean boolean14 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage15);
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage15);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = addStatus17.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus17.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, 35);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(10, 100);
        boolean boolean6 = location2.equals((java.lang.Object) location5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        int int8 = location6.getRow();
        int int9 = location6.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine3.vendItem(location6, 100.0d);
        int int12 = location6.getRow();
        int int13 = location6.getColumn();
        int int14 = location6.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine0.vendItem(location6, (double) (byte) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertNotNull(itemList17);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage18 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage18);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage18);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage18);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0.0f, vendingMessage18);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage18);
        boolean boolean24 = location5.equals((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + vendingMessage18 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage18.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        double double28 = vendingStatus27.getChange();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine3.getItems();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine3.vendItem(location13, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine3.getItems();
        boolean boolean17 = location2.equals((java.lang.Object) vendingMachine3);
        int int18 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine19 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine19.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine19.getItems();
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = vendingMachine19.vendItem(location24, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList27 = vendingMachine19.getItems();
        edu.hawaii.ics.peruma.Location location30 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine19.vendItem(location30, (double) 1);
        edu.hawaii.ics.peruma.Location location35 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int36 = location35.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine19.vendItem(location35, (double) (byte) -1);
        boolean boolean39 = location2.equals((java.lang.Object) vendingMachine19);
        java.lang.Class<?> wildcardClass40 = vendingMachine19.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(vendingStatus26);
        org.junit.Assert.assertNotNull(itemList27);
        org.junit.Assert.assertNotNull(vendingStatus32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, 1);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean13 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine6.getItems();
        edu.hawaii.ics.peruma.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus32 = vendingMachine6.addItem(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        boolean boolean8 = location2.equals((java.lang.Object) int7);
        int int9 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine10 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine10.vendItem(location13, (double) (-1L));
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getRow();
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) -1);
        boolean boolean25 = location18.equals((java.lang.Object) location24);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine10.vendItem(location18, 32.0d);
        boolean boolean28 = location2.equals((java.lang.Object) vendingMachine10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        double double23 = vendingStatus22.getChange();
        boolean boolean24 = vendingStatus22.isSuccess();
        double double25 = vendingStatus22.getChange();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 1, vendingMessage8);
        java.lang.Class<?> wildcardClass13 = vendingStatus12.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, 35);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int8 = location7.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine4.vendItem(location7, (double) 100L);
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int14 = location13.getColumn();
        int int15 = location13.getRow();
        int int16 = location13.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine4.vendItem(location13, (double) 1.0f);
        boolean boolean20 = location13.equals((java.lang.Object) 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage22);
        boolean boolean24 = addStatus23.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage25 = addStatus23.getAddMessage();
        boolean boolean26 = location13.equals((java.lang.Object) addMessage25);
        boolean boolean27 = location3.equals((java.lang.Object) addMessage25);
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage25);
        boolean boolean29 = addStatus28.isSuccess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + addMessage25 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage25.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.Class<?> wildcardClass17 = addStatus16.getClass();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) '#');
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        boolean boolean9 = vendingStatus8.isSuccess();
        double double10 = vendingStatus8.getChange();
        double double11 = vendingStatus8.getChange();
        boolean boolean12 = vendingStatus8.isSuccess();
        double double13 = vendingStatus8.getChange();
        java.lang.Class<?> wildcardClass14 = vendingStatus8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 10.0f);
        int int10 = location2.getColumn();
        int int11 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine12 = new edu.hawaii.ics.peruma.VendingMachine();
        boolean boolean13 = location2.equals((java.lang.Object) vendingMachine12);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine12.getItems();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(itemList14);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage13 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage13);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage13);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage13);
        boolean boolean17 = location6.equals((java.lang.Object) vendingMessage13);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 1.0f, vendingMessage13);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage13);
        org.junit.Assert.assertTrue("'" + vendingMessage13 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage13.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        double double18 = vendingStatus17.getChange();
        boolean boolean19 = vendingStatus17.isSuccess();
        double double20 = vendingStatus17.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        int int15 = location9.getColumn();
        java.lang.Object obj16 = null;
        boolean boolean17 = location9.equals(obj16);
        int int18 = location9.getColumn();
        int int19 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), (int) 'a');
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (byte) -1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        java.lang.Class<?> wildcardClass14 = addMessage9.getClass();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage35 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus36 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage35);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage37 = addStatus36.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus38 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage37);
        edu.hawaii.ics.peruma.AddStatus addStatus39 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage37);
        edu.hawaii.ics.peruma.AddStatus addStatus40 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage37);
        boolean boolean41 = addStatus40.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage42 = addStatus40.getAddMessage();
        boolean boolean43 = location9.equals((java.lang.Object) addStatus40);
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
        org.junit.Assert.assertTrue("'" + addMessage35 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage35.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage37 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage37.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + addMessage42 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage42.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus2.getAddMessage();
        boolean boolean8 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) (byte) 10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int3 = location2.getRow();
        boolean boolean5 = location2.equals((java.lang.Object) (byte) 100);
        int int6 = location2.getColumn();
        int int7 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean10 = addStatus9.isSuccess();
        boolean boolean11 = addStatus9.isSuccess();
        boolean boolean12 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage14);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus28 = vendingMachine0.addItem(item27);
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
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage34 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage34);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage34);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus37 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage34);
        boolean boolean38 = vendingStatus37.isSuccess();
        boolean boolean39 = location25.equals((java.lang.Object) vendingStatus37);
        edu.hawaii.ics.peruma.Location location42 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 0);
        boolean boolean43 = location25.equals((java.lang.Object) location42);
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
        org.junit.Assert.assertTrue("'" + vendingMessage34 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage34.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int11 = location10.getColumn();
        int int12 = location10.getColumn();
        boolean boolean14 = location10.equals((java.lang.Object) 10);
        int int15 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine0.vendItem(location10, (double) (short) 100);
        int int18 = location10.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage23 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage23);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage23);
        boolean boolean26 = location10.equals((java.lang.Object) vendingMessage23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage23 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage23.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        boolean boolean4 = addStatus2.isSuccess();
        boolean boolean5 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) ' ', vendingMessage10);
        java.lang.Class<?> wildcardClass16 = vendingStatus15.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus11 = vendingMachine0.addItem(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        int int7 = location3.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus10.getAddMessage();
        boolean boolean13 = location3.equals((java.lang.Object) addMessage12);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean15 = addStatus14.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus14.getAddMessage();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass8 = itemList7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        java.lang.Class<?> wildcardClass9 = addStatus8.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList5 = vendingMachine4.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine4.getItems();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine4.vendItem(location9, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList12 = vendingMachine4.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine4.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine4.getItems();
        boolean boolean15 = location2.equals((java.lang.Object) itemList14);
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        boolean boolean25 = location19.equals((java.lang.Object) int24);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        boolean boolean29 = addStatus28.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus28.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus28.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage32 = addStatus28.getAddMessage();
        boolean boolean33 = location19.equals((java.lang.Object) addMessage32);
        edu.hawaii.ics.peruma.AddStatus addStatus34 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage32);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage35 = addStatus34.getAddMessage();
        boolean boolean36 = location2.equals((java.lang.Object) addMessage35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(itemList5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(itemList12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage32 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage32.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + addMessage35 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage35.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        boolean boolean8 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        double double7 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        int int16 = location9.getColumn();
        int int17 = location9.getRow();
        int int18 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        int int20 = location17.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 52);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage5);
        boolean boolean7 = location2.equals((java.lang.Object) vendingStatus6);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        boolean boolean14 = location2.equals((java.lang.Object) addStatus13);
        boolean boolean15 = addStatus13.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) (short) -1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        int int17 = location5.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage24 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage24);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage24);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage24);
        boolean boolean28 = vendingStatus27.isSuccess();
        boolean boolean29 = location5.equals((java.lang.Object) boolean28);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine34 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location37 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int38 = location37.getColumn();
        int int39 = location37.getRow();
        int int40 = location37.getColumn();
        int int41 = location37.getColumn();
        int int42 = location37.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus44 = vendingMachine34.vendItem(location37, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage47 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus48 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage47);
        boolean boolean49 = location37.equals((java.lang.Object) vendingMessage47);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus50 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage47);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus51 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage47);
        boolean boolean52 = location5.equals((java.lang.Object) 'a');
        int int53 = location5.getColumn();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + vendingMessage24 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage24.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 52 + "'", int41 == 52);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(vendingStatus44);
        org.junit.Assert.assertTrue("'" + vendingMessage47 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage47.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        boolean boolean14 = addStatus13.isSuccess();
        boolean boolean15 = addStatus13.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus13.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus19 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = addStatus19.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, 97);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        edu.hawaii.ics.peruma.Location location32 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (-1));
        edu.hawaii.ics.peruma.Location location35 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (short) 0);
        boolean boolean36 = location32.equals((java.lang.Object) location35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location32, (double) 1.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus41 = vendingMachine0.addItem(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(itemList39);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        int int25 = location22.getRow();
        int int26 = location22.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage28);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus29.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        boolean boolean32 = location22.equals((java.lang.Object) addMessage31);
        int int33 = location22.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location22, 0.0d);
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        int int39 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location38, (double) 35);
        java.lang.Class<?> wildcardClass42 = vendingStatus41.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(vendingStatus41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        boolean boolean5 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList3 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine5 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int9 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine5.vendItem(location8, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine12 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location15 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine12.vendItem(location15, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine5.vendItem(location15, (double) (byte) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location15, (double) (byte) 100);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine22 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int26 = location25.getColumn();
        int int27 = location25.getRow();
        int int28 = location25.getColumn();
        int int29 = location25.getColumn();
        int int30 = location25.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine22.vendItem(location25, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage35 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage35);
        boolean boolean37 = location25.equals((java.lang.Object) vendingMessage35);
        int int38 = location25.getRow();
        int int39 = location25.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location25, (double) 0);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList42 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList3);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(vendingStatus32);
        org.junit.Assert.assertTrue("'" + vendingMessage35 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage35.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(vendingStatus41);
        org.junit.Assert.assertNotNull(itemList42);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList27 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
        org.junit.Assert.assertNotNull(itemList27);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, (int) (byte) 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass10 = itemList9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, (int) '4');
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine2.vendItem(location5, (double) 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList12 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus14 = vendingMachine0.addItem(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(itemList12);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        int int25 = location22.getRow();
        int int26 = location22.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage28);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus29.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        boolean boolean32 = location22.equals((java.lang.Object) addMessage31);
        int int33 = location22.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location22, 0.0d);
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        int int39 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location38, (double) 35);
        double double42 = vendingStatus41.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(vendingStatus41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(itemList14);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        java.lang.Class<?> wildcardClass24 = itemList23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList28 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList29 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass30 = vendingMachine0.getClass();
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
        org.junit.Assert.assertNotNull(itemList28);
        org.junit.Assert.assertNotNull(itemList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        java.lang.Class<?> wildcardClass15 = location10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, 35);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int5 = location4.getColumn();
        int int6 = location4.getRow();
        int int7 = location4.getRow();
        int int8 = location4.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus11.getAddMessage();
        boolean boolean14 = location4.equals((java.lang.Object) addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus16.getAddMessage();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        boolean boolean56 = vendingStatus55.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0L, vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingMessage6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        double double23 = vendingStatus22.getChange();
        double double24 = vendingStatus22.getChange();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        java.lang.Class<?> wildcardClass10 = addMessage9.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus13.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage16 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 10, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(false, 97.0d, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10, vendingMessage16);
        org.junit.Assert.assertTrue("'" + vendingMessage16 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage16.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        edu.hawaii.ics.peruma.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus37 = vendingMachine0.addItem(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        edu.hawaii.ics.peruma.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus40 = vendingMachine0.addItem(item39);
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
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, 35);
        boolean boolean9 = location2.equals((java.lang.Object) 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) '#', vendingMessage6);
        double double10 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1.0f), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) ' ', vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine21 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine21.getItems();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int26 = location25.getColumn();
        int int27 = location25.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage28 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass29 = vendingMessage28.getClass();
        boolean boolean30 = location25.equals((java.lang.Object) vendingMessage28);
        boolean boolean32 = location25.equals((java.lang.Object) 10.0f);
        int int33 = location25.getColumn();
        int int34 = location25.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine21.vendItem(location25, (double) 52);
        edu.hawaii.ics.peruma.Location location39 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int40 = location39.getColumn();
        int int41 = location39.getRow();
        int int42 = location39.getRow();
        int int43 = location39.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage45 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus46 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage45);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage47 = addStatus46.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage48 = addStatus46.getAddMessage();
        boolean boolean49 = location39.equals((java.lang.Object) addMessage48);
        int int50 = location39.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage53 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus54 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage53);
        edu.hawaii.ics.peruma.AddStatus addStatus55 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage53);
        boolean boolean56 = addStatus55.isSuccess();
        boolean boolean57 = location39.equals((java.lang.Object) addStatus55);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus59 = vendingMachine21.vendItem(location39, (double) 10L);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus61 = vendingMachine0.vendItem(location39, (double) 0L);
        edu.hawaii.ics.peruma.Location location64 = new edu.hawaii.ics.peruma.Location(0, 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus66 = vendingMachine0.vendItem(location64, (double) 'a');
        java.util.List<edu.hawaii.ics.peruma.Item> itemList67 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage28 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage28.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(vendingStatus36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + addMessage45 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage45.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage47 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage47.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage48 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage48.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + addMessage53 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage53.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(vendingStatus59);
        org.junit.Assert.assertNotNull(vendingStatus61);
        org.junit.Assert.assertNotNull(vendingStatus66);
        org.junit.Assert.assertNotNull(itemList67);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.VendingMachine vendingMachine8 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        int int14 = location11.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine8.vendItem(location11, 100.0d);
        int int17 = location11.getRow();
        int int18 = location11.getRow();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        boolean boolean22 = location11.equals((java.lang.Object) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location11, (double) (byte) 100);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage27 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage27);
        boolean boolean29 = location11.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertTrue("'" + vendingMessage27 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage27.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, (int) (byte) 100);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.Class<?> wildcardClass23 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine21 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine21.getItems();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int26 = location25.getColumn();
        int int27 = location25.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage28 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass29 = vendingMessage28.getClass();
        boolean boolean30 = location25.equals((java.lang.Object) vendingMessage28);
        boolean boolean32 = location25.equals((java.lang.Object) 10.0f);
        int int33 = location25.getColumn();
        int int34 = location25.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine21.vendItem(location25, (double) 52);
        edu.hawaii.ics.peruma.Location location39 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int40 = location39.getColumn();
        int int41 = location39.getRow();
        int int42 = location39.getRow();
        int int43 = location39.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage45 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus46 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage45);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage47 = addStatus46.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage48 = addStatus46.getAddMessage();
        boolean boolean49 = location39.equals((java.lang.Object) addMessage48);
        int int50 = location39.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage53 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus54 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage53);
        edu.hawaii.ics.peruma.AddStatus addStatus55 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage53);
        boolean boolean56 = addStatus55.isSuccess();
        boolean boolean57 = location39.equals((java.lang.Object) addStatus55);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus59 = vendingMachine21.vendItem(location39, (double) 10L);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus61 = vendingMachine0.vendItem(location39, (double) 0L);
        int int62 = location39.getColumn();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage28 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage28.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(vendingStatus36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + addMessage45 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage45.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage47 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage47.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage48 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage48.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + addMessage53 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage53.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(vendingStatus59);
        org.junit.Assert.assertNotNull(vendingStatus61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 0, vendingMessage6);
        double double10 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) -1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        boolean boolean22 = vendingStatus21.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine2.vendItem(location5, (double) 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine0.vendItem(location5, (double) (-1L));
        boolean boolean12 = vendingStatus11.isSuccess();
        boolean boolean13 = vendingStatus11.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        double double8 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        boolean boolean8 = location2.equals((java.lang.Object) int7);
        int int9 = location2.getRow();
        int int10 = location2.getRow();
        int int11 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        edu.hawaii.ics.peruma.AddStatus addStatus19 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage17);
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', 35);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList28 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location29 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = vendingMachine0.vendItem(location29, 32.0d);
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
        org.junit.Assert.assertNotNull(itemList28);
        org.junit.Assert.assertNotNull(vendingStatus31);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        java.lang.Class<?> wildcardClass5 = addStatus4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 10, vendingMessage12);
        boolean boolean19 = vendingStatus18.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage19);
        boolean boolean21 = addStatus20.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = addStatus20.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage25 = addStatus24.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage25);
        boolean boolean27 = location3.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage25 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage25.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean10 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        double double11 = vendingStatus9.getChange();
        boolean boolean12 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        boolean boolean6 = location2.equals((java.lang.Object) 100.0f);
        int int7 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) -1);
        int int11 = location10.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus14.getAddMessage();
        boolean boolean16 = location10.equals((java.lang.Object) addMessage15);
        boolean boolean17 = location2.equals((java.lang.Object) location10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, (int) (short) 1);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        boolean boolean13 = addStatus11.isSuccess();
        boolean boolean14 = location2.equals((java.lang.Object) addStatus11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus11.getAddMessage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        boolean boolean19 = vendingStatus18.isSuccess();
        double double20 = vendingStatus18.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        boolean boolean10 = location2.equals((java.lang.Object) addMessage8);
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int15 = location14.getColumn();
        int int16 = location14.getRow();
        int int17 = location14.getRow();
        int int18 = location14.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = addStatus21.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = addStatus21.getAddMessage();
        boolean boolean24 = location14.equals((java.lang.Object) addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage26 = addStatus25.getAddMessage();
        java.lang.Class<?> wildcardClass27 = addStatus25.getClass();
        boolean boolean28 = location2.equals((java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = location2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + addMessage26 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage26.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine16 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine16.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine16.getItems();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine16.vendItem(location21, (double) 10.0f);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = vendingMachine0.vendItem(location21, (double) (byte) 0);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location29 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int30 = location29.getColumn();
        edu.hawaii.ics.peruma.Location location33 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int34 = location33.getColumn();
        int int35 = location33.getColumn();
        int int36 = location33.getRow();
        boolean boolean37 = location29.equals((java.lang.Object) location33);
        int int38 = location33.getColumn();
        int int39 = location33.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location33, (double) 1L);
        edu.hawaii.ics.peruma.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus43 = vendingMachine0.addItem(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(vendingStatus23);
        org.junit.Assert.assertNotNull(vendingStatus25);
        org.junit.Assert.assertNotNull(itemList26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(vendingStatus41);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        boolean boolean4 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus2.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        boolean boolean9 = vendingStatus8.isSuccess();
        double double10 = vendingStatus8.getChange();
        double double11 = vendingStatus8.getChange();
        boolean boolean12 = vendingStatus8.isSuccess();
        boolean boolean13 = vendingStatus8.isSuccess();
        java.lang.Class<?> wildcardClass14 = vendingStatus8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        int int25 = location22.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine13.vendItem(location22, (double) 1.0f);
        int int28 = location22.getColumn();
        java.lang.Class<?> wildcardClass29 = location22.getClass();
        boolean boolean30 = location12.equals((java.lang.Object) wildcardClass29);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine0.vendItem(location12, 32.0d);
        int int33 = location12.getRow();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(vendingStatus32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getRow();
        int int14 = location10.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine15 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine15.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine15.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine15.vendItem(location20, (double) 10.0f);
        boolean boolean23 = location10.equals((java.lang.Object) vendingMachine15);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = vendingMachine0.vendItem(location10, (double) (byte) 10);
        boolean boolean26 = vendingStatus25.isSuccess();
        double double27 = vendingStatus25.getChange();
        boolean boolean28 = vendingStatus25.isSuccess();
        double double29 = vendingStatus25.getChange();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(vendingStatus25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) -1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) '#', 32);
        int int21 = location20.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine0.vendItem(location20, (double) (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(vendingStatus23);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        int int15 = location9.getColumn();
        java.lang.Object obj16 = null;
        boolean boolean17 = location9.equals(obj16);
        int int18 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        double double8 = vendingStatus6.getChange();
        double double9 = vendingStatus6.getChange();
        boolean boolean10 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        boolean boolean39 = vendingStatus38.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass17 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        double double11 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage14 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0.0f, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 52, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 97, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 1, vendingMessage14);
        org.junit.Assert.assertTrue("'" + vendingMessage14 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage14.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        edu.hawaii.ics.peruma.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus25 = vendingMachine7.addItem(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1);
        double double14 = vendingStatus13.getChange();
        double double15 = vendingStatus13.getChange();
        double double16 = vendingStatus13.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        edu.hawaii.ics.peruma.VendingMachine vendingMachine17 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine17.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList19 = vendingMachine17.getItems();
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine17.vendItem(location22, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine17.getItems();
        edu.hawaii.ics.peruma.Location location28 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus30 = vendingMachine17.vendItem(location28, (double) 1);
        edu.hawaii.ics.peruma.Location location33 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int34 = location33.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine17.vendItem(location33, (double) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location33, (double) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList19);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(vendingStatus30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(vendingStatus36);
        org.junit.Assert.assertNotNull(vendingStatus38);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList12 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(itemList12);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.lang.Class<?> wildcardClass18 = addMessage17.getClass();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int11 = location10.getColumn();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int15 = location14.getColumn();
        int int16 = location14.getColumn();
        int int17 = location14.getRow();
        boolean boolean18 = location10.equals((java.lang.Object) location14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine0.vendItem(location10, (double) (byte) 10);
        edu.hawaii.ics.peruma.Location location21 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine0.vendItem(location21, (double) 0);
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(vendingStatus23);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getRow();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (byte) -1);
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        boolean boolean17 = location13.equals((java.lang.Object) (byte) 10);
        boolean boolean18 = location3.equals((java.lang.Object) boolean17);
        java.lang.Class<?> wildcardClass19 = location3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int9 = location8.getColumn();
        int int10 = location8.getRow();
        int int11 = location8.getColumn();
        int int12 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        boolean boolean20 = location8.equals((java.lang.Object) vendingMachine13);
        boolean boolean21 = location3.equals((java.lang.Object) location8);
        int int22 = location3.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine23 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine23.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine23.getItems();
        edu.hawaii.ics.peruma.Location location28 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus30 = vendingMachine23.vendItem(location28, (double) 10.0f);
        boolean boolean31 = location3.equals((java.lang.Object) vendingStatus30);
        int int32 = location3.getColumn();
        java.lang.Class<?> wildcardClass33 = location3.getClass();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(itemList24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(vendingStatus30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        boolean boolean15 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        edu.hawaii.ics.peruma.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus22 = vendingMachine0.addItem(item21);
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
        org.junit.Assert.assertNotNull(vendingStatus20);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, 32);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 100, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        int int22 = location11.getColumn();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 52);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine9 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int13 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine9.vendItem(location12, (double) 100L);
        int int16 = location12.getColumn();
        int int17 = location12.getRow();
        boolean boolean18 = location8.equals((java.lang.Object) location12);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage19 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        boolean boolean20 = location12.equals((java.lang.Object) vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 0, vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage19);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage19 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage19.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = addStatus16.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(35, (int) (byte) 10);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', 32);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage25 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage25);
        boolean boolean27 = vendingStatus26.isSuccess();
        boolean boolean28 = location20.equals((java.lang.Object) vendingStatus26);
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
        org.junit.Assert.assertTrue("'" + vendingMessage25 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage25.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        boolean boolean6 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        int int25 = location22.getRow();
        int int26 = location22.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage28);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus29.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        boolean boolean32 = location22.equals((java.lang.Object) addMessage31);
        int int33 = location22.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location22, 0.0d);
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        int int39 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location38, (double) 35);
        int int42 = location38.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(vendingStatus41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(97, (int) (short) -1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine7.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine7.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine7.vendItem(location12, (double) 10.0f);
        boolean boolean15 = location2.equals((java.lang.Object) vendingMachine7);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine7.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine7.getItems();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', 35);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 0, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        java.lang.Class<?> wildcardClass5 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) (short) 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        int int7 = location2.getRow();
        int int8 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage15 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage15);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage15);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage15);
        boolean boolean19 = vendingStatus18.isSuccess();
        double double20 = vendingStatus18.getChange();
        boolean boolean21 = location2.equals((java.lang.Object) vendingStatus18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + vendingMessage15 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage15.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 32, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        double double14 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) '4');
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', (int) (byte) 1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        boolean boolean13 = addStatus12.isSuccess();
        boolean boolean14 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        boolean boolean12 = location2.equals((java.lang.Object) addMessage11);
        int int13 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        boolean boolean19 = addStatus18.isSuccess();
        boolean boolean20 = location2.equals((java.lang.Object) addStatus18);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage21 = addStatus18.getAddMessage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + addMessage21 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage21.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int5 = location4.getColumn();
        int int6 = location4.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass8 = vendingMessage7.getClass();
        boolean boolean9 = location4.equals((java.lang.Object) vendingMessage7);
        boolean boolean11 = location4.equals((java.lang.Object) 10.0f);
        int int12 = location4.getColumn();
        int int13 = location4.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location4, (double) 52);
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getRow();
        int int22 = location18.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage24);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage26 = addStatus25.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = addStatus25.getAddMessage();
        boolean boolean28 = location18.equals((java.lang.Object) addMessage27);
        int int29 = location18.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage32 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus33 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage32);
        edu.hawaii.ics.peruma.AddStatus addStatus34 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage32);
        boolean boolean35 = addStatus34.isSuccess();
        boolean boolean36 = location18.equals((java.lang.Object) addStatus34);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location18, (double) 10L);
        edu.hawaii.ics.peruma.Location location41 = new edu.hawaii.ics.peruma.Location(52, 52);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus43 = vendingMachine0.vendItem(location41, (double) 32);
        edu.hawaii.ics.peruma.Location location44 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus46 = vendingMachine0.vendItem(location44, 97.0d);
        edu.hawaii.ics.peruma.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus48 = vendingMachine0.addItem(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage26 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage26.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + addMessage32 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage32.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(vendingStatus43);
        org.junit.Assert.assertNotNull(vendingStatus46);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        int int39 = location36.getRow();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        edu.hawaii.ics.peruma.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus24 = vendingMachine0.addItem(item23);
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
        org.junit.Assert.assertNotNull(vendingStatus22);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, 52);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 52);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (short) 1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int4 = location3.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        boolean boolean10 = addStatus7.isSuccess();
        boolean boolean11 = location3.equals((java.lang.Object) addStatus7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus13.getAddMessage();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) 10);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(0, (-1));
        edu.hawaii.ics.peruma.VendingMachine vendingMachine6 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        int int14 = location9.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine6.vendItem(location9, (double) (byte) 0);
        boolean boolean17 = location5.equals((java.lang.Object) vendingMachine6);
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int21 = location20.getColumn();
        int int22 = location20.getRow();
        int int23 = location20.getRow();
        int int24 = location20.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine25 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine25.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList27 = vendingMachine25.getItems();
        edu.hawaii.ics.peruma.Location location30 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine25.vendItem(location30, (double) 10.0f);
        boolean boolean33 = location20.equals((java.lang.Object) vendingMachine25);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine6.vendItem(location20, (double) ' ');
        boolean boolean36 = location2.equals((java.lang.Object) location20);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(itemList26);
        org.junit.Assert.assertNotNull(itemList27);
        org.junit.Assert.assertNotNull(vendingStatus32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        boolean boolean23 = location10.equals((java.lang.Object) false);
        int int24 = location10.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        boolean boolean13 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        boolean boolean15 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, 10);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage14 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, 32.0d, vendingMessage14);
        java.lang.Class<?> wildcardClass22 = vendingMessage14.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage14 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage14.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        int int28 = location20.getRow();
        int int29 = location20.getRow();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getColumn();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        boolean boolean14 = location3.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass15 = location3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(52, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1.0f);
        edu.hawaii.ics.peruma.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus15 = vendingMachine0.addItem(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(vendingStatus13);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        boolean boolean7 = addStatus6.isSuccess();
        boolean boolean8 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus6.getAddMessage();
        boolean boolean10 = addStatus6.isSuccess();
        boolean boolean11 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean10 = addStatus9.isSuccess();
        boolean boolean11 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage12);
        boolean boolean14 = addStatus13.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int25 = location24.getColumn();
        edu.hawaii.ics.peruma.Location location28 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int29 = location28.getColumn();
        int int30 = location28.getColumn();
        int int31 = location28.getRow();
        boolean boolean32 = location24.equals((java.lang.Object) location28);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus34 = vendingMachine0.vendItem(location28, (double) (byte) -1);
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(vendingStatus34);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int21 = location20.getRow();
        int int22 = location20.getColumn();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (-1));
        boolean boolean26 = location20.equals((java.lang.Object) (byte) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = vendingMachine7.vendItem(location20, 0.0d);
        edu.hawaii.ics.peruma.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus30 = vendingMachine7.addItem(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(vendingStatus28);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, 32);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus15.getAddMessage();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage25 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage25);
        boolean boolean27 = addStatus26.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = addStatus26.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage28);
        edu.hawaii.ics.peruma.AddStatus addStatus30 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage28);
        edu.hawaii.ics.peruma.AddStatus addStatus31 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage28);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage32 = addStatus31.getAddMessage();
        boolean boolean33 = addStatus31.isSuccess();
        boolean boolean34 = addStatus31.isSuccess();
        boolean boolean35 = location2.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + addMessage25 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage25.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage32 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage32.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        boolean boolean11 = addStatus10.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location12, (double) 'a');
        java.lang.Class<?> wildcardClass15 = location12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList34 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus36 = vendingMachine0.addItem(item35);
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
        org.junit.Assert.assertNotNull(itemList34);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        boolean boolean11 = addStatus9.isSuccess();
        boolean boolean12 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        boolean boolean15 = addStatus14.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus14.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        boolean boolean18 = addStatus17.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = addStatus23.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage24);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage24);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage24);
        boolean boolean28 = addStatus27.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage29 = addStatus27.getAddMessage();
        boolean boolean30 = location10.equals((java.lang.Object) addStatus27);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus27.getAddMessage();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + addMessage29 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage29.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        int int16 = location9.getColumn();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        boolean boolean20 = location9.equals((java.lang.Object) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage25 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage25);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage25);
        boolean boolean28 = vendingStatus27.isSuccess();
        double double29 = vendingStatus27.getChange();
        boolean boolean30 = location9.equals((java.lang.Object) vendingStatus27);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine31 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList32 = vendingMachine31.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList33 = vendingMachine31.getItems();
        edu.hawaii.ics.peruma.Location location36 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine31.vendItem(location36, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine31.getItems();
        edu.hawaii.ics.peruma.Location location42 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus44 = vendingMachine31.vendItem(location42, (double) (byte) 0);
        boolean boolean45 = location9.equals((java.lang.Object) vendingMachine31);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList46 = vendingMachine31.getItems();
        edu.hawaii.ics.peruma.Location location49 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus51 = vendingMachine31.vendItem(location49, (double) 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage25 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage25.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(itemList32);
        org.junit.Assert.assertNotNull(itemList33);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(itemList39);
        org.junit.Assert.assertNotNull(vendingStatus44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(itemList46);
        org.junit.Assert.assertNotNull(vendingStatus51);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        int int7 = location3.getColumn();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getColumn();
        boolean boolean14 = location3.equals((java.lang.Object) location10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus19 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage18);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = addStatus19.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = addStatus22.getAddMessage();
        boolean boolean24 = location3.equals((java.lang.Object) addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage23);
        boolean boolean26 = addStatus25.isSuccess();
        boolean boolean27 = addStatus25.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 1.0d, vendingMessage6);
        double double10 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        boolean boolean6 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine17 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine17.getItems();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int22 = location21.getColumn();
        int int23 = location21.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage24 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass25 = vendingMessage24.getClass();
        boolean boolean26 = location21.equals((java.lang.Object) vendingMessage24);
        boolean boolean28 = location21.equals((java.lang.Object) 10.0f);
        int int29 = location21.getColumn();
        int int30 = location21.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = vendingMachine17.vendItem(location21, (double) 52);
        int int33 = location21.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location21, (-1.0d));
        boolean boolean36 = vendingStatus35.isSuccess();
        java.lang.Class<?> wildcardClass37 = vendingStatus35.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage24 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage24.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(vendingStatus32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        int int8 = location6.getRow();
        boolean boolean9 = location3.equals((java.lang.Object) int8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        boolean boolean13 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus12.getAddMessage();
        boolean boolean17 = location3.equals((java.lang.Object) addMessage16);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage16);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus18.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = addStatus18.getAddMessage();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        int int16 = location9.getColumn();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        boolean boolean20 = location9.equals((java.lang.Object) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage25 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage25);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage25);
        boolean boolean28 = vendingStatus27.isSuccess();
        double double29 = vendingStatus27.getChange();
        boolean boolean30 = location9.equals((java.lang.Object) vendingStatus27);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine31 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList32 = vendingMachine31.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList33 = vendingMachine31.getItems();
        edu.hawaii.ics.peruma.Location location36 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine31.vendItem(location36, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine31.getItems();
        edu.hawaii.ics.peruma.Location location42 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus44 = vendingMachine31.vendItem(location42, (double) (byte) 0);
        boolean boolean45 = location9.equals((java.lang.Object) vendingMachine31);
        int int46 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage25 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage25.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(itemList32);
        org.junit.Assert.assertNotNull(itemList33);
        org.junit.Assert.assertNotNull(vendingStatus38);
        org.junit.Assert.assertNotNull(itemList39);
        org.junit.Assert.assertNotNull(vendingStatus44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        edu.hawaii.ics.peruma.Location location36 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location36, 0.0d);
        edu.hawaii.ics.peruma.Location location41 = new edu.hawaii.ics.peruma.Location((-1), (int) (short) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus43 = vendingMachine0.vendItem(location41, (double) (-1L));
        edu.hawaii.ics.peruma.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus45 = vendingMachine0.addItem(item44);
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
        org.junit.Assert.assertNotNull(vendingStatus43);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingStatus9.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        boolean boolean6 = location2.equals((java.lang.Object) 100.0f);
        int int7 = location2.getColumn();
        int int8 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        edu.hawaii.ics.peruma.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus24 = vendingMachine0.addItem(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass6 = addStatus2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        boolean boolean6 = vendingStatus3.isSuccess();
        double double7 = vendingStatus3.getChange();
        boolean boolean8 = vendingStatus3.isSuccess();
        boolean boolean9 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        boolean boolean9 = addStatus7.isSuccess();
        boolean boolean10 = addStatus7.isSuccess();
        boolean boolean11 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        int int8 = location5.getColumn();
        int int9 = location5.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine10 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int14 = location13.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine10.vendItem(location13, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine10.getItems();
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine10.vendItem(location20, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine10.getItems();
        edu.hawaii.ics.peruma.Location location26 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int27 = location26.getRow();
        int int28 = location26.getColumn();
        int int29 = location26.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = vendingMachine10.vendItem(location26, 0.0d);
        int int32 = location26.getColumn();
        boolean boolean33 = location5.equals((java.lang.Object) location26);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(vendingStatus31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) -1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        boolean boolean15 = location9.equals((java.lang.Object) addMessage14);
        boolean boolean16 = location6.equals((java.lang.Object) location9);
        boolean boolean17 = location2.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        boolean boolean11 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus5.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location3, (double) 100);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine8 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int12 = location11.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine8.vendItem(location11, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine15 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine15.vendItem(location18, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine8.vendItem(location18, (double) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location18, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus27 = vendingMachine0.addItem(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(itemList25);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location((int) '#', 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location16, (double) 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(vendingStatus18);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), (int) ' ');
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus19 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage18);
        boolean boolean20 = addStatus19.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage21 = addStatus19.getAddMessage();
        boolean boolean22 = location9.equals((java.lang.Object) addMessage21);
        int int23 = location9.getColumn();
        int int24 = location9.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + addMessage21 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage21.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine3.getItems();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine3.vendItem(location13, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine3.getItems();
        boolean boolean17 = location2.equals((java.lang.Object) vendingMachine3);
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 0);
        boolean boolean21 = location2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        boolean boolean7 = addStatus5.isSuccess();
        boolean boolean8 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus5.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        boolean boolean11 = addStatus10.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0L, vendingMessage2);
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        boolean boolean8 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        double double16 = vendingStatus15.getChange();
        java.lang.Class<?> wildcardClass17 = vendingStatus15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        int int26 = location25.getColumn();
        int int27 = location25.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine0.vendItem(location25, (double) (byte) -1);
        edu.hawaii.ics.peruma.Location location32 = new edu.hawaii.ics.peruma.Location(52, 52);
        int int33 = location32.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location32, (double) '#');
        int int36 = location32.getColumn();
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
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) -1);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        boolean boolean11 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '#', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 32.0d, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        double double23 = vendingStatus22.getChange();
        double double24 = vendingStatus22.getChange();
        double double25 = vendingStatus22.getChange();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        int int18 = location10.getColumn();
        int int19 = location10.getColumn();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 0.0d);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine10 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine10.vendItem(location13, (double) (byte) 0);
        double double16 = vendingStatus15.getChange();
        boolean boolean17 = location2.equals((java.lang.Object) vendingStatus15);
        int int18 = location2.getColumn();
        int int19 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) -1, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        double double8 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList34 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList35 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList36 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList37 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList34);
        org.junit.Assert.assertNotNull(itemList35);
        org.junit.Assert.assertNotNull(itemList36);
        org.junit.Assert.assertNotNull(itemList37);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location3, (double) 100);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine8 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int12 = location11.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine8.vendItem(location11, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine15 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine15.vendItem(location18, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = vendingMachine8.vendItem(location18, (double) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location18, (double) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        double double36 = vendingStatus35.getChange();
        boolean boolean37 = vendingStatus35.isSuccess();
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        boolean boolean9 = addStatus8.isSuccess();
        boolean boolean10 = addStatus8.isSuccess();
        boolean boolean11 = addStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) -1);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(32, 35);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        int int23 = location5.getColumn();
        int int24 = location5.getColumn();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        double double21 = vendingStatus20.getChange();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int14 = location13.getColumn();
        int int15 = location13.getRow();
        int int16 = location13.getColumn();
        int int17 = location13.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine18 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int22 = location21.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine18.vendItem(location21, (double) 100L);
        boolean boolean25 = location13.equals((java.lang.Object) vendingMachine18);
        edu.hawaii.ics.peruma.Location location26 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = vendingMachine18.vendItem(location26, (double) 0.0f);
        edu.hawaii.ics.peruma.Location location31 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int32 = location31.getRow();
        int int33 = location31.getColumn();
        edu.hawaii.ics.peruma.Location location36 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (-1));
        boolean boolean37 = location31.equals((java.lang.Object) (byte) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus39 = vendingMachine18.vendItem(location31, 0.0d);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location31, (double) 0.0f);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(vendingStatus24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(vendingStatus28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(vendingStatus39);
        org.junit.Assert.assertNotNull(vendingStatus41);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        int int25 = location22.getRow();
        int int26 = location22.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage28);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus29.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        boolean boolean32 = location22.equals((java.lang.Object) addMessage31);
        int int33 = location22.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location22, 0.0d);
        double double36 = vendingStatus35.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int5 = location4.getColumn();
        int int6 = location4.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass8 = vendingMessage7.getClass();
        boolean boolean9 = location4.equals((java.lang.Object) vendingMessage7);
        boolean boolean11 = location4.equals((java.lang.Object) 10.0f);
        int int12 = location4.getColumn();
        int int13 = location4.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location4, (double) 52);
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine0.addItem(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        boolean boolean8 = vendingStatus6.isSuccess();
        double double9 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        boolean boolean13 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(35, 32);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine3.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList5 = vendingMachine3.getItems();
        boolean boolean6 = location2.equals((java.lang.Object) vendingMachine3);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine3.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine3.vendItem(location10, (double) 1);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertNotNull(itemList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        boolean boolean11 = addStatus9.isSuccess();
        boolean boolean12 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = null;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        boolean boolean4 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus2.getAddMessage();
        boolean boolean6 = addStatus2.isSuccess();
        boolean boolean7 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus2.getAddMessage();
        org.junit.Assert.assertNull(addMessage3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(addMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(addMessage8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int5 = location4.getColumn();
        int int6 = location4.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass8 = vendingMessage7.getClass();
        boolean boolean9 = location4.equals((java.lang.Object) vendingMessage7);
        boolean boolean11 = location4.equals((java.lang.Object) 10.0f);
        int int12 = location4.getColumn();
        int int13 = location4.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = vendingMachine0.vendItem(location4, (double) 52);
        int int16 = location4.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage27 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage27);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage27);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus30 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage27);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 52, vendingMessage27);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 52, vendingMessage27);
        boolean boolean33 = location4.equals((java.lang.Object) vendingStatus32);
        boolean boolean34 = vendingStatus32.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + vendingMessage27 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage27.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean12 = addStatus11.isSuccess();
        boolean boolean13 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage15);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int5 = location4.getColumn();
        int int6 = location4.getRow();
        int int7 = location4.getRow();
        int int8 = location4.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus11.getAddMessage();
        boolean boolean14 = location4.equals((java.lang.Object) addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage17 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage17);
        boolean boolean19 = vendingStatus18.isSuccess();
        boolean boolean20 = vendingStatus18.isSuccess();
        boolean boolean21 = location9.equals((java.lang.Object) boolean20);
        int int22 = location9.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location7 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int8 = location7.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine4.vendItem(location7, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine4.getItems();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine4.vendItem(location14, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine4.getItems();
        boolean boolean18 = location3.equals((java.lang.Object) vendingMachine4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        boolean boolean22 = addStatus21.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = addStatus21.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = addStatus21.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage25 = addStatus21.getAddMessage();
        boolean boolean26 = location3.equals((java.lang.Object) addMessage25);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage25);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage25 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage25.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage15 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage15);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage15);
        boolean boolean18 = location3.equals((java.lang.Object) true);
        int int19 = location3.getRow();
        int int20 = location3.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage15 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage15.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int9 = location8.getColumn();
        int int10 = location8.getRow();
        int int11 = location8.getColumn();
        int int12 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        boolean boolean20 = location8.equals((java.lang.Object) vendingMachine13);
        boolean boolean21 = location3.equals((java.lang.Object) location8);
        int int22 = location3.getRow();
        int int23 = location3.getColumn();
        int int24 = location3.getColumn();
        int int25 = location3.getColumn();
        int int26 = location3.getRow();
        java.lang.Class<?> wildcardClass27 = location3.getClass();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, (int) '#');
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        int int8 = location5.getRow();
        int int9 = location5.getRow();
        int int10 = location5.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) 'a');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine5 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int9 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine5.vendItem(location8, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine12 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location15 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine12.vendItem(location15, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine5.vendItem(location15, (double) (byte) 1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine5.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine5.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine22 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine22.getItems();
        edu.hawaii.ics.peruma.Location location26 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int27 = location26.getColumn();
        int int28 = location26.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage29 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass30 = vendingMessage29.getClass();
        boolean boolean31 = location26.equals((java.lang.Object) vendingMessage29);
        boolean boolean33 = location26.equals((java.lang.Object) 10.0f);
        int int34 = location26.getColumn();
        int int35 = location26.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus37 = vendingMachine22.vendItem(location26, (double) 52);
        int int38 = location26.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine5.vendItem(location26, (-1.0d));
        boolean boolean41 = vendingStatus40.isSuccess();
        boolean boolean42 = location2.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(itemList23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage29 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage29.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(vendingStatus37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 52 + "'", int38 == 52);
        org.junit.Assert.assertNotNull(vendingStatus40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (-1));
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) -1);
        edu.hawaii.ics.peruma.Location location20 = new edu.hawaii.ics.peruma.Location(10, 0);
        boolean boolean21 = location17.equals((java.lang.Object) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine7.vendItem(location17, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList24 = vendingMachine7.getItems();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(vendingStatus23);
        org.junit.Assert.assertNotNull(itemList24);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, 97);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage9 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, 1.0d, vendingMessage9);
        boolean boolean13 = vendingStatus12.isSuccess();
        boolean boolean14 = location2.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + vendingMessage9 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage9.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine6 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        int int13 = location9.getColumn();
        int int14 = location9.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine6.vendItem(location9, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage19 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage19);
        boolean boolean21 = location9.equals((java.lang.Object) vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage19);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(false, 10.0d, vendingMessage19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + vendingMessage19 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage19.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, (int) (short) 0);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        int int15 = location9.getColumn();
        java.lang.Object obj16 = null;
        boolean boolean17 = location9.equals(obj16);
        int int18 = location9.getColumn();
        int int19 = location9.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getRow();
        int int11 = location3.getColumn();
        int int12 = location3.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        double double6 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, 97.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 100, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1L), vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean9 = addStatus8.isSuccess();
        boolean boolean10 = addStatus8.isSuccess();
        boolean boolean11 = addStatus8.isSuccess();
        boolean boolean12 = addStatus8.isSuccess();
        boolean boolean13 = addStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (-1.0d), vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        int int9 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage16 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100L, vendingMessage16);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage16);
        boolean boolean20 = location3.equals((java.lang.Object) 10L);
        int int21 = location3.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage16 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage16.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus10 = vendingMachine0.addItem(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1), vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int9 = location8.getColumn();
        int int10 = location8.getRow();
        boolean boolean11 = location5.equals((java.lang.Object) int10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        boolean boolean15 = addStatus14.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus14.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus14.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage18 = addStatus14.getAddMessage();
        boolean boolean19 = location5.equals((java.lang.Object) addMessage18);
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage18);
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage18);
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage18);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage18 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage18.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        java.lang.Class<?> wildcardClass9 = addStatus7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        boolean boolean18 = vendingStatus14.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', 1);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        java.lang.Class<?> wildcardClass10 = addMessage7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) (byte) 0);
        edu.hawaii.ics.peruma.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus15 = vendingMachine0.addItem(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList15 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass16 = itemList15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        edu.hawaii.ics.peruma.Location location4 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        boolean boolean12 = location4.equals((java.lang.Object) addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        boolean boolean15 = addStatus14.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus27.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage32 = addStatus27.getAddMessage();
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
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage32 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage32.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage8);
        java.lang.Class<?> wildcardClass13 = vendingMessage8.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        boolean boolean9 = addStatus6.isSuccess();
        boolean boolean10 = location2.equals((java.lang.Object) addStatus6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus6.getAddMessage();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus24 = vendingMachine0.addItem(item23);
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
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertNotNull(itemList22);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        int int15 = location3.getColumn();
        int int16 = location3.getRow();
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1.0f), vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        double double8 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        boolean boolean6 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean11 = addStatus10.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, (int) (short) 10);
        java.lang.Object obj3 = null;
        boolean boolean4 = location2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        edu.hawaii.ics.peruma.Location location22 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int23 = location22.getColumn();
        int int24 = location22.getRow();
        int int25 = location22.getRow();
        int int26 = location22.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage28 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage28);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus29.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus29.getAddMessage();
        boolean boolean32 = location22.equals((java.lang.Object) addMessage31);
        int int33 = location22.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location22, 0.0d);
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        int int39 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = vendingMachine0.vendItem(location38, (double) 35);
        edu.hawaii.ics.peruma.Location location44 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int45 = location44.getColumn();
        int int46 = location44.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage47 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass48 = vendingMessage47.getClass();
        boolean boolean49 = location44.equals((java.lang.Object) vendingMessage47);
        int int50 = location44.getRow();
        boolean boolean51 = location38.equals((java.lang.Object) location44);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + addMessage28 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage28.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(vendingStatus41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage47 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage47.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, (-1));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean11 = addStatus10.isSuccess();
        boolean boolean12 = addStatus10.isSuccess();
        boolean boolean13 = addStatus10.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        edu.hawaii.ics.peruma.Location location23 = new edu.hawaii.ics.peruma.Location(0, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = vendingMachine0.vendItem(location23, (double) 100);
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertNotNull(vendingStatus25);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 0, vendingMessage6);
        double double10 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        java.lang.Class<?> wildcardClass8 = addStatus6.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, 97.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 97);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0.0f, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        boolean boolean13 = location2.equals((java.lang.Object) location9);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage17);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus18.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage19);
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage19);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = addStatus21.getAddMessage();
        boolean boolean23 = location2.equals((java.lang.Object) addMessage22);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage26 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage26);
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage26);
        boolean boolean29 = location2.equals((java.lang.Object) false);
        int int30 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + addMessage26 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage26.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(itemList18);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1.0f), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage10);
        double double16 = vendingStatus15.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList19 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList21 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        int int14 = location11.getRow();
        int int15 = location11.getColumn();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int19 = location18.getColumn();
        int int20 = location18.getRow();
        int int21 = location18.getColumn();
        boolean boolean22 = location11.equals((java.lang.Object) location18);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = vendingMachine0.vendItem(location11, (double) (short) 100);
        edu.hawaii.ics.peruma.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus26 = vendingMachine0.addItem(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(vendingStatus24);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int11 = location10.getColumn();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int15 = location14.getColumn();
        int int16 = location14.getColumn();
        int int17 = location14.getRow();
        boolean boolean18 = location10.equals((java.lang.Object) location14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine0.vendItem(location10, (double) (byte) 10);
        int int21 = location10.getColumn();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        int int8 = location5.getColumn();
        int int9 = location5.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (-1));
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (short) 0);
        boolean boolean6 = location2.equals((java.lang.Object) location5);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location(35, (int) (byte) 10);
        boolean boolean10 = location5.equals((java.lang.Object) (byte) 10);
        int int11 = location5.getRow();
        int int12 = location5.getRow();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        int int26 = location25.getColumn();
        int int27 = location25.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine0.vendItem(location25, (double) (byte) -1);
        edu.hawaii.ics.peruma.Location location32 = new edu.hawaii.ics.peruma.Location(52, 52);
        int int33 = location32.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus35 = vendingMachine0.vendItem(location32, (double) '#');
        int int36 = location32.getRow();
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
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(vendingStatus35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        boolean boolean9 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        edu.hawaii.ics.peruma.Location location32 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (-1));
        edu.hawaii.ics.peruma.Location location35 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (short) 0);
        boolean boolean36 = location32.equals((java.lang.Object) location35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus38 = vendingMachine0.vendItem(location32, (double) 1.0f);
        edu.hawaii.ics.peruma.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus40 = vendingMachine0.addItem(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(vendingStatus38);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (-1));
        edu.hawaii.ics.peruma.Location location28 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (short) 0);
        boolean boolean29 = location25.equals((java.lang.Object) location28);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = vendingMachine0.vendItem(location25, (double) (byte) 0);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage35 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus36 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage35);
        boolean boolean37 = addStatus36.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage38 = addStatus36.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus39 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage38);
        edu.hawaii.ics.peruma.AddStatus addStatus40 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage38);
        boolean boolean41 = location25.equals((java.lang.Object) true);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(vendingStatus31);
        org.junit.Assert.assertTrue("'" + addMessage35 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage35.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + addMessage38 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage38.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        boolean boolean9 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        boolean boolean11 = addStatus7.isSuccess();
        boolean boolean12 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage7);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage7);
        boolean boolean10 = vendingStatus9.isSuccess();
        boolean boolean11 = location2.equals((java.lang.Object) vendingStatus9);
        boolean boolean12 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), (int) (short) 1);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, (int) (byte) 0);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        edu.hawaii.ics.peruma.Location location23 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage30 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus31 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage30);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus32 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage30);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus33 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage30);
        boolean boolean34 = location23.equals((java.lang.Object) vendingMessage30);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine0.vendItem(location23, 10.0d);
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + vendingMessage30 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage30.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(vendingStatus36);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass10 = vendingMachine0.getClass();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(97, 100);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        boolean boolean6 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList3 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine5 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int9 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine5.vendItem(location8, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine12 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location15 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine12.vendItem(location15, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine5.vendItem(location15, (double) (byte) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location15, (double) (byte) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList23 = vendingMachine0.getItems();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList3);
        org.junit.Assert.assertNotNull(itemList4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertNotNull(itemList23);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine21 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine21.getItems();
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int26 = location25.getColumn();
        int int27 = location25.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage28 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass29 = vendingMessage28.getClass();
        boolean boolean30 = location25.equals((java.lang.Object) vendingMessage28);
        boolean boolean32 = location25.equals((java.lang.Object) 10.0f);
        int int33 = location25.getColumn();
        int int34 = location25.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus36 = vendingMachine21.vendItem(location25, (double) 52);
        edu.hawaii.ics.peruma.Location location39 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int40 = location39.getColumn();
        int int41 = location39.getRow();
        int int42 = location39.getRow();
        int int43 = location39.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage45 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus46 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage45);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage47 = addStatus46.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage48 = addStatus46.getAddMessage();
        boolean boolean49 = location39.equals((java.lang.Object) addMessage48);
        int int50 = location39.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage53 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus54 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage53);
        edu.hawaii.ics.peruma.AddStatus addStatus55 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage53);
        boolean boolean56 = addStatus55.isSuccess();
        boolean boolean57 = location39.equals((java.lang.Object) addStatus55);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus59 = vendingMachine21.vendItem(location39, (double) 10L);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus61 = vendingMachine0.vendItem(location39, (double) 0L);
        edu.hawaii.ics.peruma.Location location64 = new edu.hawaii.ics.peruma.Location(0, 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus66 = vendingMachine0.vendItem(location64, (double) 'a');
        int int67 = location64.getColumn();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage28 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage28.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(vendingStatus36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + addMessage45 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage45.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage47 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage47.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage48 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage48.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + addMessage53 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage53.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(vendingStatus59);
        org.junit.Assert.assertNotNull(vendingStatus61);
        org.junit.Assert.assertNotNull(vendingStatus66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 100 + "'", int67 == 100);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 0, vendingMessage10);
        double double16 = vendingStatus15.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean13 = addStatus12.isSuccess();
        java.lang.Class<?> wildcardClass14 = addStatus12.getClass();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 100, vendingMessage10);
        double double16 = vendingStatus15.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, 97);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        double double28 = vendingStatus27.getChange();
        double double29 = vendingStatus27.getChange();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        boolean boolean11 = location3.equals((java.lang.Object) addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        boolean boolean13 = addStatus12.isSuccess();
        boolean boolean14 = addStatus12.isSuccess();
        boolean boolean15 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (byte) 10);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1L), vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int9 = location8.getColumn();
        int int10 = location8.getRow();
        int int11 = location8.getColumn();
        int int12 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        boolean boolean20 = location8.equals((java.lang.Object) vendingMachine13);
        boolean boolean21 = location3.equals((java.lang.Object) location8);
        int int22 = location8.getColumn();
        int int23 = location8.getRow();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int13 = location12.getColumn();
        int int14 = location12.getColumn();
        boolean boolean16 = location12.equals((java.lang.Object) 100.0f);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location12, (double) 52);
        edu.hawaii.ics.peruma.Location location19 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location19, (double) (byte) 0);
        double double22 = vendingStatus21.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        int int16 = location9.getColumn();
        edu.hawaii.ics.peruma.Location location19 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        boolean boolean20 = location9.equals((java.lang.Object) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage25 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage25);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage25);
        boolean boolean28 = vendingStatus27.isSuccess();
        double double29 = vendingStatus27.getChange();
        boolean boolean30 = location9.equals((java.lang.Object) vendingStatus27);
        boolean boolean31 = vendingStatus27.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage25 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage25.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList28 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass29 = itemList28.getClass();
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
        org.junit.Assert.assertNotNull(itemList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (byte) 1);
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        boolean boolean13 = addStatus12.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        boolean boolean16 = location8.equals((java.lang.Object) addMessage14);
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        boolean boolean19 = location3.equals((java.lang.Object) addMessage14);
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage14);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage13);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 100, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 0, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int9 = location8.getColumn();
        int int10 = location8.getRow();
        int int11 = location8.getColumn();
        int int12 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        boolean boolean20 = location8.equals((java.lang.Object) vendingMachine13);
        boolean boolean21 = location3.equals((java.lang.Object) location8);
        int int22 = location3.getRow();
        int int23 = location3.getRow();
        int int24 = location3.getRow();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.Location location8 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int9 = location8.getColumn();
        int int10 = location8.getRow();
        int int11 = location8.getColumn();
        int int12 = location8.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine13 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int17 = location16.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine13.vendItem(location16, (double) 100L);
        boolean boolean20 = location8.equals((java.lang.Object) vendingMachine13);
        boolean boolean21 = location3.equals((java.lang.Object) location8);
        int int22 = location3.getRow();
        int int23 = location3.getRow();
        int int24 = location3.getColumn();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean10 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus9.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, 100);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, 52);
        java.lang.Object obj3 = null;
        boolean boolean4 = location2.equals(obj3);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage9 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage9);
        boolean boolean12 = location2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage9 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage9.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int7 = location6.getRow();
        int int8 = location6.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine9 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList10 = vendingMachine9.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine9.getItems();
        edu.hawaii.ics.peruma.Location location14 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine9.vendItem(location14, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList17 = vendingMachine9.getItems();
        boolean boolean18 = location6.equals((java.lang.Object) vendingMachine9);
        boolean boolean19 = location2.equals((java.lang.Object) vendingMachine9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        double double23 = vendingStatus22.getChange();
        boolean boolean24 = vendingStatus22.isSuccess();
        boolean boolean25 = vendingStatus22.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(vendingStatus22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int11 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine7.vendItem(location10, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine7.getItems();
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = vendingMachine7.vendItem(location17, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList20 = vendingMachine7.getItems();
        edu.hawaii.ics.peruma.Location location23 = new edu.hawaii.ics.peruma.Location(100, 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = vendingMachine7.vendItem(location23, 97.0d);
        int int26 = location23.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus28 = vendingMachine0.vendItem(location23, 0.0d);
        boolean boolean29 = vendingStatus28.isSuccess();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(vendingStatus25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(vendingStatus28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (byte) -1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        boolean boolean11 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        boolean boolean16 = location2.equals((java.lang.Object) addStatus15);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        int int7 = location2.getRow();
        int int8 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage17 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage17);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage17);
        boolean boolean22 = location2.equals((java.lang.Object) vendingStatus21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + vendingMessage17 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage17.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 10.0f);
        int int10 = location2.getColumn();
        int int11 = location2.getColumn();
        int int12 = location2.getRow();
        int int13 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage22 = addStatus21.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage22);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage22);
        boolean boolean28 = addStatus27.isSuccess();
        boolean boolean29 = location2.equals((java.lang.Object) addStatus27);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage40 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus41 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage40);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus42 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage40);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus43 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage40);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus44 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0.0f, vendingMessage40);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus45 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 52, vendingMessage40);
        boolean boolean46 = location2.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage22 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage22.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + vendingMessage40 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage40.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }
}

