import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage0 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        java.lang.Class<?> wildcardClass1 = vendingMessage0.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage0 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage0.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Item item1 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus2 = vendingMachine0.addItem(item1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage0 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        java.lang.Class<?> wildcardClass1 = addMessage0.getClass();
        org.junit.Assert.assertTrue("'" + addMessage0 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage0.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage0 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        java.lang.Class<?> wildcardClass1 = addMessage0.getClass();
        org.junit.Assert.assertTrue("'" + addMessage0 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage0.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.lang.Class<?> wildcardClass1 = vendingMachine0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine7.addItem(item16);
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
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        edu.hawaii.ics.peruma.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus7 = vendingMachine0.addItem(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vendingStatus5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item2 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus3 = vendingMachine0.addItem(item2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getRow();
        java.lang.Class<?> wildcardClass4 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus4 = vendingMachine0.addItem(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = vendingStatus5.getClass();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        boolean boolean7 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine0.addItem(item16);
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
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        java.lang.Class<?> wildcardClass5 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus7 = vendingMachine0.addItem(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vendingStatus5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
        java.lang.Class<?> wildcardClass16 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus8 = vendingMachine0.addItem(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage2);
        java.lang.Class<?> wildcardClass4 = vendingMessage2.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        boolean boolean7 = location2.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
        java.lang.Class<?> wildcardClass13 = addMessage11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass7 = addMessage6.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus10 = vendingMachine0.addItem(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getColumn();
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        edu.hawaii.ics.peruma.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus12 = vendingMachine0.addItem(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vendingStatus10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        boolean boolean16 = vendingStatus15.isSuccess();
        boolean boolean17 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine0.addItem(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        java.lang.Class<?> wildcardClass8 = addStatus7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        boolean boolean12 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus9.getAddMessage();
        boolean boolean14 = addStatus9.isSuccess();
        boolean boolean15 = location3.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getColumn();
        int int11 = location3.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass10 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, 35);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass9 = vendingMessage8.getClass();
        boolean boolean10 = location5.equals((java.lang.Object) vendingMessage8);
        boolean boolean12 = location5.equals((java.lang.Object) 10.0f);
        boolean boolean14 = location5.equals((java.lang.Object) (byte) -1);
        boolean boolean15 = location2.equals((java.lang.Object) location5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, (int) (byte) -1);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
        java.lang.Class<?> wildcardClass17 = itemList16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', 52);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.lang.Class<?> wildcardClass9 = location3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass13 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) '#');
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        java.lang.Class<?> wildcardClass8 = addMessage5.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus9 = vendingMachine0.addItem(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        java.lang.Class<?> wildcardClass18 = vendingMachine3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertNotNull(itemList10);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        int int17 = location9.getRow();
        java.lang.Class<?> wildcardClass18 = location9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
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
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingMessage4.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        boolean boolean6 = location2.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass7 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        int int17 = location5.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        boolean boolean5 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        java.lang.Class<?> wildcardClass8 = addMessage6.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        boolean boolean9 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus7.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList3 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus5 = vendingMachine0.addItem(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        int int8 = location5.getRow();
        java.lang.Class<?> wildcardClass9 = location5.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        edu.hawaii.ics.peruma.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus18 = vendingMachine0.addItem(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass7 = addStatus2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        double double6 = vendingStatus5.getChange();
        double double7 = vendingStatus5.getChange();
        double double8 = vendingStatus5.getChange();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        boolean boolean6 = location2.equals((java.lang.Object) 10);
        int int7 = location2.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus14.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage15);
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage15);
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage15);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus18.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage19);
        boolean boolean21 = location2.equals((java.lang.Object) addMessage19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass5 = addMessage4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        edu.hawaii.ics.peruma.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus19 = vendingMachine7.addItem(item18);
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
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus8 = vendingMachine0.addItem(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int10 = location9.getColumn();
        int int11 = location9.getRow();
        int int12 = location9.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location9, (double) 1.0f);
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine0.addItem(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine7.addItem(item15);
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
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        java.lang.Class<?> wildcardClass18 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getColumn();
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        int int11 = location3.getColumn();
        java.lang.Object obj12 = null;
        boolean boolean13 = location3.equals(obj12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(35, 1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass7 = addStatus2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        java.lang.Class<?> wildcardClass15 = addMessage12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        double double8 = vendingStatus7.getChange();
        boolean boolean9 = vendingStatus7.isSuccess();
        double double10 = vendingStatus7.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        java.lang.Class<?> wildcardClass8 = addMessage7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine0.addItem(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        boolean boolean7 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        int int13 = location10.getRow();
        java.lang.Class<?> wildcardClass14 = location10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getColumn();
        int int7 = location2.getRow();
        int int8 = location2.getColumn();
        int int9 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        double double17 = vendingStatus15.getChange();
        boolean boolean18 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        boolean boolean9 = vendingStatus8.isSuccess();
        double double10 = vendingStatus8.getChange();
        java.lang.Class<?> wildcardClass11 = vendingStatus8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        boolean boolean8 = vendingStatus7.isSuccess();
        double double9 = vendingStatus7.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus2.getAddMessage();
        boolean boolean6 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) (byte) -1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int7 = location6.getColumn();
        int int8 = location6.getColumn();
        int int9 = location6.getRow();
        boolean boolean10 = location2.equals((java.lang.Object) location6);
        int int11 = location6.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage17);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage19 = addStatus18.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus20 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage19);
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage19);
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage19);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = addStatus22.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        boolean boolean25 = location6.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage19 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage19.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, 1);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        int int13 = location10.getColumn();
        int int14 = location10.getColumn();
        int int15 = location10.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        double double8 = vendingStatus7.getChange();
        double double9 = vendingStatus7.getChange();
        java.lang.Class<?> wildcardClass10 = vendingStatus7.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        boolean boolean6 = vendingStatus5.isSuccess();
        boolean boolean7 = vendingStatus5.isSuccess();
        double double8 = vendingStatus5.getChange();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        boolean boolean13 = vendingStatus12.isSuccess();
        java.lang.Class<?> wildcardClass14 = vendingStatus12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass10 = vendingMachine0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) 10);
        java.lang.Class<?> wildcardClass15 = vendingStatus14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        int int22 = location18.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        boolean boolean4 = addStatus2.isSuccess();
        boolean boolean5 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        boolean boolean6 = vendingStatus3.isSuccess();
        boolean boolean7 = vendingStatus3.isSuccess();
        boolean boolean8 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10.0f, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int18 = location17.getRow();
        int int19 = location17.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location17, (double) 32);
        int int22 = location17.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        boolean boolean6 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        java.lang.Class<?> wildcardClass9 = addStatus8.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        boolean boolean6 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        edu.hawaii.ics.peruma.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus25 = vendingMachine0.addItem(item24);
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
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        java.lang.Class<?> wildcardClass11 = addMessage8.getClass();
        boolean boolean12 = location3.equals((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        edu.hawaii.ics.peruma.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus35 = vendingMachine0.addItem(item34);
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
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        int int15 = location10.getRow();
        int int16 = location10.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        edu.hawaii.ics.peruma.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus22 = vendingMachine0.addItem(item21);
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
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList19);
        org.junit.Assert.assertNotNull(itemList20);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        edu.hawaii.ics.peruma.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus37 = vendingMachine0.addItem(item36);
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
        org.junit.Assert.assertNotNull(itemList35);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList3 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList4 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus6 = vendingMachine0.addItem(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList3);
        org.junit.Assert.assertNotNull(itemList4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getColumn();
        int int7 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        boolean boolean7 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass7 = addMessage6.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage8);
        boolean boolean13 = vendingStatus12.isSuccess();
        double double14 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList16 = vendingMachine7.getItems();
        java.lang.Class<?> wildcardClass17 = itemList16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean10 = addStatus9.isSuccess();
        boolean boolean11 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        boolean boolean6 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        java.lang.Class<?> wildcardClass9 = addMessage4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean9 = addStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean7 = addStatus6.isSuccess();
        boolean boolean8 = addStatus6.isSuccess();
        boolean boolean9 = addStatus6.isSuccess();
        boolean boolean10 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        boolean boolean17 = vendingStatus15.isSuccess();
        double double18 = vendingStatus15.getChange();
        double double19 = vendingStatus15.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean13 = addStatus12.isSuccess();
        boolean boolean14 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean5 = addStatus4.isSuccess();
        java.lang.Class<?> wildcardClass6 = addStatus4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getColumn();
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        int int11 = location3.getColumn();
        int int12 = location3.getRow();
        int int13 = location3.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        edu.hawaii.ics.peruma.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus19 = vendingMachine0.addItem(item18);
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
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        boolean boolean8 = location2.equals((java.lang.Object) int7);
        int int9 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 'a', vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        boolean boolean15 = vendingStatus14.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1);
        java.lang.Class<?> wildcardClass14 = vendingStatus13.getClass();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        boolean boolean10 = addStatus7.isSuccess();
        java.lang.Class<?> wildcardClass11 = addStatus7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.lang.Class<?> wildcardClass26 = location10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        java.lang.Class<?> wildcardClass5 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        edu.hawaii.ics.peruma.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus26 = vendingMachine0.addItem(item25);
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
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        double double10 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        edu.hawaii.ics.peruma.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus19 = vendingMachine0.addItem(item18);
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
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1);
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        int int17 = location9.getRow();
        int int18 = location9.getRow();
        java.lang.Class<?> wildcardClass19 = location9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        boolean boolean13 = vendingStatus12.isSuccess();
        boolean boolean14 = vendingStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getColumn();
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList12 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(itemList12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        int int3 = location2.getColumn();
        java.lang.Class<?> wildcardClass4 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        double double18 = vendingStatus17.getChange();
        boolean boolean19 = vendingStatus17.isSuccess();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus11 = vendingMachine0.addItem(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(itemList9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        double double6 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        boolean boolean9 = location2.equals((java.lang.Object) 0.0d);
        int int10 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (-1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10.0f, vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 'a', vendingMessage6);
        double double10 = vendingStatus9.getChange();
        double double11 = vendingStatus9.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (byte) 1);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, 100);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        boolean boolean14 = location2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        java.lang.Class<?> wildcardClass4 = addStatus2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int22 = location21.getColumn();
        int int23 = location21.getRow();
        int int24 = location21.getRow();
        int int25 = location21.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage29 = addStatus28.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage30 = addStatus28.getAddMessage();
        boolean boolean31 = location21.equals((java.lang.Object) addMessage30);
        edu.hawaii.ics.peruma.AddStatus addStatus32 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage30);
        edu.hawaii.ics.peruma.AddStatus addStatus33 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage30);
        boolean boolean34 = location5.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage29 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage29.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage30 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage30.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage5 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass6 = vendingMessage5.getClass();
        boolean boolean7 = location2.equals((java.lang.Object) vendingMessage5);
        int int8 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getColumn();
        int int7 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        java.lang.Class<?> wildcardClass10 = addMessage7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, (int) (byte) -1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean7 = addStatus6.isSuccess();
        java.lang.Class<?> wildcardClass8 = addStatus6.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        double double6 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getColumn();
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine0.getItems();
        java.lang.Class<?> wildcardClass12 = itemList11.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, 0);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        int int7 = location3.getRow();
        int int8 = location3.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        boolean boolean6 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        int int8 = location5.getRow();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        double double21 = vendingStatus19.getChange();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        edu.hawaii.ics.peruma.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus20 = vendingMachine7.addItem(item19);
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
        org.junit.Assert.assertNotNull(itemList18);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) -1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        boolean boolean8 = location2.equals((java.lang.Object) addMessage7);
        java.lang.Class<?> wildcardClass9 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean10 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        double double6 = vendingStatus3.getChange();
        boolean boolean7 = vendingStatus3.isSuccess();
        double double8 = vendingStatus3.getChange();
        double double9 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, 35);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 0, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        boolean boolean11 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine7.addItem(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        edu.hawaii.ics.peruma.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus45 = vendingMachine0.addItem(item44);
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
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage7);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0.0f, vendingMessage7);
        boolean boolean10 = location2.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int19 = location18.getRow();
        int int20 = location18.getColumn();
        int int21 = location18.getRow();
        boolean boolean22 = location9.equals((java.lang.Object) location18);
        java.lang.Class<?> wildcardClass23 = location18.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        boolean boolean8 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getColumn();
        java.lang.Class<?> wildcardClass11 = location3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (-1L));
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus9 = vendingMachine0.addItem(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage9 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage9);
        boolean boolean11 = location3.equals((java.lang.Object) vendingMessage9);
        int int12 = location3.getRow();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage9 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage9.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList19);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        edu.hawaii.ics.peruma.Item item62 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus63 = vendingMachine0.addItem(item62);
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
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, 32);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        boolean boolean22 = vendingStatus21.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        boolean boolean8 = vendingStatus7.isSuccess();
        boolean boolean9 = vendingStatus7.isSuccess();
        boolean boolean10 = vendingStatus7.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        boolean boolean20 = vendingStatus18.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int39 = location38.getRow();
        int int40 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus42 = vendingMachine0.vendItem(location38, (double) (-1.0f));
        edu.hawaii.ics.peruma.Item item43 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus44 = vendingMachine0.addItem(item43);
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
        org.junit.Assert.assertNotNull(itemList35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(vendingStatus42);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) -1, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        java.lang.Class<?> wildcardClass11 = addMessage5.getClass();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(vendingStatus19);
        org.junit.Assert.assertNotNull(itemList20);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        edu.hawaii.ics.peruma.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus18 = vendingMachine0.addItem(item17);
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
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getColumn();
        java.lang.Class<?> wildcardClass7 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        boolean boolean23 = location18.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        int int14 = location9.getRow();
        int int15 = location9.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        boolean boolean6 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.lang.Class<?> wildcardClass9 = vendingStatus8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 100, 35);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        boolean boolean5 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        java.lang.Class<?> wildcardClass9 = addStatus7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        int int7 = location2.getRow();
        int int8 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        edu.hawaii.ics.peruma.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus19 = vendingMachine0.addItem(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (-1L), vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 1, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        double double14 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(100, 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location16, 97.0d);
        double double19 = vendingStatus18.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        java.lang.Class<?> wildcardClass9 = addMessage4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus6.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList40 = vendingMachine19.getItems();
        edu.hawaii.ics.peruma.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus42 = vendingMachine19.addItem(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(itemList40);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        java.lang.Class<?> wildcardClass9 = addMessage6.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getRow();
        int int6 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass14 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        edu.hawaii.ics.peruma.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus31 = vendingMachine0.addItem(item30);
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
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList20);
        org.junit.Assert.assertNotNull(itemList21);
        org.junit.Assert.assertNotNull(vendingStatus26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(vendingStatus29);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        edu.hawaii.ics.peruma.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus38 = vendingMachine0.addItem(item37);
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
        org.junit.Assert.assertNotNull(itemList35);
        org.junit.Assert.assertNotNull(itemList36);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        double double8 = vendingStatus7.getChange();
        double double9 = vendingStatus7.getChange();
        boolean boolean10 = vendingStatus7.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage9);
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage9);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = null;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        java.lang.Class<?> wildcardClass3 = addStatus2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.Class<?> wildcardClass17 = itemList16.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 10);
        boolean boolean7 = location2.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 52);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', 32);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        java.lang.Class<?> wildcardClass5 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine2.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int11 = location10.getColumn();
        int int12 = location10.getRow();
        int int13 = location10.getColumn();
        int int14 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine15 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int19 = location18.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine15.vendItem(location18, (double) 100L);
        boolean boolean22 = location10.equals((java.lang.Object) vendingMachine15);
        boolean boolean23 = location5.equals((java.lang.Object) location10);
        int int24 = location5.getRow();
        int int25 = location5.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location5, (double) 52);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(vendingStatus27);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        int int40 = location25.getColumn();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        boolean boolean8 = vendingStatus7.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        int int14 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine10 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList11 = vendingMachine10.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList12 = vendingMachine10.getItems();
        edu.hawaii.ics.peruma.Location location15 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine10.vendItem(location15, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList18 = vendingMachine10.getItems();
        edu.hawaii.ics.peruma.Location location21 = new edu.hawaii.ics.peruma.Location(35, (int) ' ');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = vendingMachine10.vendItem(location21, (double) 1);
        edu.hawaii.ics.peruma.Location location26 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) -1);
        int int27 = location26.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus29 = vendingMachine10.vendItem(location26, (double) (byte) -1);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine10.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList31 = vendingMachine10.getItems();
        boolean boolean32 = location3.equals((java.lang.Object) itemList31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemList11);
        org.junit.Assert.assertNotNull(itemList12);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(vendingStatus23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(vendingStatus29);
        org.junit.Assert.assertNotNull(itemList30);
        org.junit.Assert.assertNotNull(itemList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        edu.hawaii.ics.peruma.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus21 = vendingMachine0.addItem(item20);
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
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 52);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage6);
        boolean boolean8 = location2.equals((java.lang.Object) vendingStatus7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        boolean boolean34 = vendingStatus33.isSuccess();
        double double35 = vendingStatus33.getChange();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.Class<?> wildcardClass37 = itemList36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        int int17 = location9.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        java.lang.Class<?> wildcardClass5 = addStatus4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        java.lang.Class<?> wildcardClass9 = addMessage7.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        double double6 = vendingStatus3.getChange();
        double double7 = vendingStatus3.getChange();
        boolean boolean8 = vendingStatus3.isSuccess();
        boolean boolean9 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) -1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus13.getAddMessage();
        boolean boolean15 = addStatus13.isSuccess();
        boolean boolean16 = addStatus13.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus13.getAddMessage();
        boolean boolean18 = location2.equals((java.lang.Object) addStatus13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int19 = location18.getRow();
        int int20 = location18.getColumn();
        int int21 = location18.getRow();
        boolean boolean22 = location9.equals((java.lang.Object) location18);
        int int23 = location18.getColumn();
        int int24 = location18.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 35);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        boolean boolean5 = vendingStatus3.isSuccess();
        boolean boolean6 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        boolean boolean6 = location2.equals((java.lang.Object) 10);
        int int7 = location2.getColumn();
        int int8 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean12 = addStatus11.isSuccess();
        boolean boolean13 = addStatus11.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage14 = addStatus11.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage14);
        boolean boolean16 = addStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage2);
        java.lang.Class<?> wildcardClass4 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) 'a', 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine0.addItem(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(itemList14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        boolean boolean5 = vendingStatus3.isSuccess();
        double double6 = vendingStatus3.getChange();
        double double7 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, 52);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '#', vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        boolean boolean8 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.Class<?> wildcardClass35 = vendingStatus33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.lang.Class<?> wildcardClass27 = itemList26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        edu.hawaii.ics.peruma.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus14 = vendingMachine0.addItem(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        double double26 = vendingStatus25.getChange();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), (int) (byte) 100);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        java.lang.Class<?> wildcardClass7 = addMessage5.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        boolean boolean8 = vendingStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, 32);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0.0f, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 52, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage2);
        java.lang.Class<?> wildcardClass4 = vendingMessage2.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.lang.Class<?> wildcardClass41 = vendingStatus40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0.0f, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        double double8 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '#');
        java.lang.Object obj3 = null;
        boolean boolean4 = location2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 1L, vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean5 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean9 = addStatus8.isSuccess();
        boolean boolean10 = addStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        java.lang.Class<?> wildcardClass15 = vendingStatus14.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, 97.0d, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        boolean boolean8 = vendingStatus6.isSuccess();
        boolean boolean9 = vendingStatus6.isSuccess();
        boolean boolean10 = vendingStatus6.isSuccess();
        double double11 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        boolean boolean7 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        boolean boolean13 = addStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Class<?> wildcardClass28 = location25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) '#', vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        edu.hawaii.ics.peruma.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus20 = vendingMachine0.addItem(item19);
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
        org.junit.Assert.assertNotNull(itemList18);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus41 = vendingMachine0.addItem(item40);
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
        org.junit.Assert.assertNotNull(itemList39);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        java.lang.Class<?> wildcardClass9 = addMessage8.getClass();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) ' ', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) (byte) 0);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine0.addItem(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(itemList14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) '#', vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingStatus9.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, 10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int3 = location2.getRow();
        int int4 = location2.getColumn();
        int int5 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        int int8 = location5.getColumn();
        int int9 = location5.getColumn();
        int int10 = location5.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine2.vendItem(location5, (double) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage15 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage15);
        boolean boolean17 = location5.equals((java.lang.Object) vendingMessage15);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, 1.0d, vendingMessage15);
        boolean boolean19 = vendingStatus18.isSuccess();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + vendingMessage15 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage15.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) -1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        edu.hawaii.ics.peruma.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus18 = vendingMachine7.addItem(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(itemList16);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) -1, vendingMessage8);
        boolean boolean13 = vendingStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, 35);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int13 = location12.getColumn();
        int int14 = location12.getRow();
        int int15 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine3.vendItem(location12, (double) 1.0f);
        boolean boolean19 = location12.equals((java.lang.Object) 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage21 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage21);
        boolean boolean23 = addStatus22.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = addStatus22.getAddMessage();
        boolean boolean25 = location12.equals((java.lang.Object) addMessage24);
        boolean boolean26 = location2.equals((java.lang.Object) addMessage24);
        int int27 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + addMessage21 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage21.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        boolean boolean5 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus2.getAddMessage();
        boolean boolean7 = addStatus2.isSuccess();
        boolean boolean8 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        double double40 = vendingStatus37.getChange();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 35.0d + "'", double40 == 35.0d);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        boolean boolean6 = addStatus5.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) ' ');
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(32, (-1));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean5 = addStatus4.isSuccess();
        java.lang.Class<?> wildcardClass6 = addStatus4.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) '4', vendingMessage2);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (byte) 10);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        int int10 = location6.getColumn();
        edu.hawaii.ics.peruma.Location location13 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int14 = location13.getColumn();
        int int15 = location13.getRow();
        int int16 = location13.getColumn();
        int int17 = location13.getColumn();
        boolean boolean18 = location6.equals((java.lang.Object) int17);
        int int19 = location6.getColumn();
        boolean boolean20 = location2.equals((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage24);
        boolean boolean26 = addStatus25.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = addStatus25.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage27);
        edu.hawaii.ics.peruma.AddStatus addStatus29 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        edu.hawaii.ics.peruma.AddStatus addStatus30 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage27);
        edu.hawaii.ics.peruma.AddStatus addStatus31 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        boolean boolean32 = addStatus31.isSuccess();
        boolean boolean33 = location15.equals((java.lang.Object) boolean32);
        java.lang.Class<?> wildcardClass34 = location15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(vendingStatus18);
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.lang.Class<?> wildcardClass23 = vendingStatus21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 32, vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingMessage4.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(35, (int) '#');
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        int int5 = location2.getRow();
        int int6 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        edu.hawaii.ics.peruma.Location location32 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int33 = location32.getColumn();
        int int34 = location32.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage35 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        java.lang.Class<?> wildcardClass36 = vendingMessage35.getClass();
        boolean boolean37 = location32.equals((java.lang.Object) vendingMessage35);
        int int38 = location32.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine6.vendItem(location32, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage35 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage35.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(vendingStatus40);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList9 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location12, (double) 'a');
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
        org.junit.Assert.assertNotNull(itemList9);
        org.junit.Assert.assertNotNull(vendingStatus14);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 100, vendingMessage8);
        boolean boolean13 = vendingStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage18 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage18);
        boolean boolean20 = vendingStatus19.isSuccess();
        boolean boolean21 = vendingStatus19.isSuccess();
        boolean boolean22 = vendingStatus19.isSuccess();
        boolean boolean23 = location9.equals((java.lang.Object) boolean22);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage27 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus28 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage27);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage29 = addStatus28.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus30 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage29);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage31 = addStatus30.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus32 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage31);
        boolean boolean33 = location9.equals((java.lang.Object) addStatus32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + addMessage27 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage27.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage29 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage29.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage31 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage31.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        int int14 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        boolean boolean7 = vendingStatus3.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 35, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage8);
        java.lang.Class<?> wildcardClass13 = vendingMessage8.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage8);
        double double13 = vendingStatus12.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        double double18 = vendingStatus17.getChange();
        double double19 = vendingStatus17.getChange();
        double double20 = vendingStatus17.getChange();
        org.junit.Assert.assertNotNull(vendingStatus5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, 52);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (short) 0);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int6 = location5.getColumn();
        int int7 = location5.getRow();
        boolean boolean8 = location2.equals((java.lang.Object) int7);
        int int9 = location2.getRow();
        java.lang.Class<?> wildcardClass10 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage9 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage9);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10L, vendingMessage9);
        boolean boolean13 = location2.equals((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + vendingMessage9 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage9.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        boolean boolean8 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 0L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        edu.hawaii.ics.peruma.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus31 = vendingMachine0.addItem(item30);
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
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.Object obj41 = null;
        boolean boolean42 = location33.equals(obj41);
        int int43 = location33.getRow();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage2);
        double double4 = vendingStatus3.getChange();
        double double5 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10, vendingMessage2);
        java.lang.Class<?> wildcardClass4 = vendingStatus3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        boolean boolean17 = addStatus15.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage14 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage14.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        boolean boolean9 = vendingStatus8.isSuccess();
        double double10 = vendingStatus8.getChange();
        boolean boolean11 = vendingStatus8.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        boolean boolean5 = addStatus4.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, 35);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        edu.hawaii.ics.peruma.Location location12 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int13 = location12.getColumn();
        int int14 = location12.getRow();
        int int15 = location12.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = vendingMachine3.vendItem(location12, (double) 1.0f);
        boolean boolean19 = location12.equals((java.lang.Object) 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage21 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage21);
        boolean boolean23 = addStatus22.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage24 = addStatus22.getAddMessage();
        boolean boolean25 = location12.equals((java.lang.Object) addMessage24);
        boolean boolean26 = location2.equals((java.lang.Object) addMessage24);
        java.lang.Class<?> wildcardClass27 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + addMessage21 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage21.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + addMessage24 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage24.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage21 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage21);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = addStatus22.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus27 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        boolean boolean28 = location3.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + addMessage21 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage21.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        boolean boolean36 = vendingStatus35.isSuccess();
        double double37 = vendingStatus35.getChange();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, 97);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage6);
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 100, 52);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine4 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList5 = vendingMachine4.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList6 = vendingMachine4.getItems();
        edu.hawaii.ics.peruma.Location location9 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = vendingMachine4.vendItem(location9, (double) 10.0f);
        boolean boolean12 = location2.equals((java.lang.Object) location9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(itemList5);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(vendingStatus11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '4');
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.lang.Class<?> wildcardClass23 = location8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        double double18 = vendingStatus17.getChange();
        double double19 = vendingStatus17.getChange();
        double double20 = vendingStatus17.getChange();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        boolean boolean7 = addStatus6.isSuccess();
        boolean boolean8 = addStatus6.isSuccess();
        boolean boolean9 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, (-1.0d), vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 'a', vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingStatus9.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.Class<?> wildcardClass25 = location3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        edu.hawaii.ics.peruma.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus23 = vendingMachine0.addItem(item22);
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
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1.0f, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 0, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        double double11 = vendingStatus9.getChange();
        double double12 = vendingStatus9.getChange();
        boolean boolean13 = vendingStatus9.isSuccess();
        boolean boolean14 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, 100.0d, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, (int) ' ');
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int3 = location2.getRow();
        java.lang.Class<?> wildcardClass4 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(35, (-1));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        edu.hawaii.ics.peruma.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus23 = vendingMachine0.addItem(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList30 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList30);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1), vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage8);
        boolean boolean13 = vendingStatus12.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        double double18 = vendingStatus17.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        boolean boolean18 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        int int22 = location11.getRow();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location3, (double) 100);
        double double8 = vendingStatus7.getChange();
        double double9 = vendingStatus7.getChange();
        java.lang.Class<?> wildcardClass10 = vendingStatus7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) -1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) (byte) 0);
        boolean boolean14 = vendingStatus13.isSuccess();
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (-1));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, (int) ' ');
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, 0.0d);
        edu.hawaii.ics.peruma.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus29 = vendingMachine0.addItem(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 35, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10.0f, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage11);
        boolean boolean14 = addStatus13.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        int int27 = location3.getRow();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) 0);
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        boolean boolean23 = vendingStatus21.isSuccess();
        boolean boolean24 = vendingStatus21.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 97);
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '#', (int) (short) 100);
        int int6 = location5.getRow();
        boolean boolean7 = location2.equals((java.lang.Object) location5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        boolean boolean7 = addStatus6.isSuccess();
        boolean boolean8 = addStatus6.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus6.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        double double30 = vendingStatus29.getChange();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        boolean boolean10 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        edu.hawaii.ics.peruma.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus43 = vendingMachine0.addItem(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage4);
        java.lang.Class<?> wildcardClass7 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getColumn();
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = vendingMachine0.vendItem(location3, (double) (byte) 0);
        int int11 = location3.getColumn();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage17);
        boolean boolean19 = addStatus18.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = addStatus18.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage20);
        edu.hawaii.ics.peruma.AddStatus addStatus22 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        edu.hawaii.ics.peruma.AddStatus addStatus23 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage20);
        edu.hawaii.ics.peruma.AddStatus addStatus24 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage20);
        boolean boolean25 = addStatus24.isSuccess();
        boolean boolean26 = location3.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(vendingStatus10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 100, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        edu.hawaii.ics.peruma.AddStatus addStatus15 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage13);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        int int16 = location9.getColumn();
        int int17 = location9.getRow();
        java.lang.Class<?> wildcardClass18 = location9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), 52);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (int) 'a');
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 10);
        boolean boolean6 = location2.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        edu.hawaii.ics.peruma.Location location25 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus27 = vendingMachine0.vendItem(location25, 0.0d);
        int int28 = location25.getColumn();
        java.lang.Class<?> wildcardClass29 = location25.getClass();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.Object obj15 = null;
        boolean boolean16 = location3.equals(obj15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        int int30 = location2.getColumn();
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (short) 100, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 52, vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingStatus9.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus2.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus2.getAddMessage();
        boolean boolean6 = addStatus2.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus2.getAddMessage();
        boolean boolean8 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) -1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        java.lang.Class<?> wildcardClass5 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) ' ', vendingMessage2);
        double double4 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage8 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus10 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 1L, vendingMessage8);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage8);
        org.junit.Assert.assertTrue("'" + vendingMessage8 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage8.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        int int5 = location2.getColumn();
        int int6 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        int int3 = location2.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage6);
        boolean boolean8 = vendingStatus7.isSuccess();
        double double9 = vendingStatus7.getChange();
        double double10 = vendingStatus7.getChange();
        java.lang.Class<?> wildcardClass11 = vendingStatus7.getClass();
        boolean boolean12 = location2.equals((java.lang.Object) vendingStatus7);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage15 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage15);
        boolean boolean17 = vendingStatus16.isSuccess();
        boolean boolean18 = vendingStatus16.isSuccess();
        double double19 = vendingStatus16.getChange();
        boolean boolean20 = location2.equals((java.lang.Object) vendingStatus16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        boolean boolean9 = addStatus8.isSuccess();
        boolean boolean10 = addStatus8.isSuccess();
        boolean boolean11 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage12);
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        boolean boolean18 = vendingStatus17.isSuccess();
        boolean boolean19 = vendingStatus17.isSuccess();
        double double20 = vendingStatus17.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(32, (int) (short) -1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList39 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList40 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus42 = vendingMachine0.addItem(item41);
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
        org.junit.Assert.assertNotNull(itemList39);
        org.junit.Assert.assertNotNull(itemList40);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus12.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (byte) 0);
        int int3 = location2.getColumn();
        int int4 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.Class<?> wildcardClass27 = vendingStatus25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '#', (int) '#');
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (int) (byte) -1);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location(52, (int) (short) 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) 1.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList14 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertNotNull(itemList14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine2 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int6 = location5.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine2.vendItem(location5, (double) 100L);
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        int int12 = location11.getColumn();
        int int13 = location11.getRow();
        int int14 = location11.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = vendingMachine2.vendItem(location11, (double) 1.0f);
        boolean boolean18 = location11.equals((java.lang.Object) 52);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage20 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus21 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage20);
        boolean boolean22 = addStatus21.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage23 = addStatus21.getAddMessage();
        boolean boolean24 = location11.equals((java.lang.Object) addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus25 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage23);
        edu.hawaii.ics.peruma.AddStatus addStatus26 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage23);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(vendingStatus8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + addMessage20 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage20.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + addMessage23 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage23.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (short) 0, (int) '#');
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList19 = vendingMachine7.getItems();
        edu.hawaii.ics.peruma.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus21 = vendingMachine7.addItem(item20);
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
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(itemList19);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) -1, vendingMessage2);
        boolean boolean4 = vendingStatus3.isSuccess();
        double double5 = vendingStatus3.getChange();
        boolean boolean6 = vendingStatus3.isSuccess();
        boolean boolean7 = vendingStatus3.isSuccess();
        double double8 = vendingStatus3.getChange();
        double double9 = vendingStatus3.getChange();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        boolean boolean11 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.Class<?> wildcardClass42 = location33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.Object obj18 = null;
        boolean boolean19 = location9.equals(obj18);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INVALID_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        boolean boolean22 = vendingStatus21.isSuccess();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(97, 32);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (byte) 10, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 0.0f, vendingMessage4);
        double double7 = vendingStatus6.getChange();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        edu.hawaii.ics.peruma.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus19 = vendingMachine0.addItem(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage12 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage12);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage12);
        org.junit.Assert.assertTrue("'" + vendingMessage12 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage12.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, (int) (byte) -1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage2);
        java.lang.Class<?> wildcardClass4 = vendingStatus3.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage2 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage2.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        int int42 = location25.getColumn();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int18 = location17.getRow();
        int int19 = location17.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location17, (double) 32);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList22 = vendingMachine0.getItems();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertNotNull(itemList22);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, 35);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage4 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage4);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage4);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage4 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage4.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(vendingStatus16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(vendingStatus24);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus10.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage12 = addStatus10.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 100);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        double double23 = vendingStatus22.getChange();
        java.lang.Class<?> wildcardClass24 = vendingStatus22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.Class<?> wildcardClass23 = location19.getClass();
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        int int19 = location10.getRow();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus9 = vendingMachine0.addItem(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location(32, 35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus40 = vendingMachine0.vendItem(location38, (double) (byte) 0);
        int int41 = location38.getRow();
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
        org.junit.Assert.assertNotNull(vendingStatus40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean11 = addStatus10.isSuccess();
        boolean boolean12 = addStatus10.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage13 = addStatus10.getAddMessage();
        boolean boolean14 = addStatus10.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 0, vendingMessage17);
        boolean boolean22 = vendingStatus21.isSuccess();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + vendingMessage17 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION + "'", vendingMessage17.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.UNKNOWN_LOCATION));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) ' ');
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus addStatus5 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = addStatus5.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage6);
        boolean boolean8 = addStatus7.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus7.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage1 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus2 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage1);
        boolean boolean3 = addStatus2.isSuccess();
        boolean boolean4 = addStatus2.isSuccess();
        boolean boolean5 = addStatus2.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage1 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage1.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        edu.hawaii.ics.peruma.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus17 = vendingMachine0.addItem(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(itemList14);
        org.junit.Assert.assertNotNull(itemList15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass19 = vendingStatus14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        edu.hawaii.ics.peruma.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus48 = vendingMachine0.addItem(item47);
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
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        boolean boolean42 = vendingStatus41.isSuccess();
        boolean boolean43 = vendingStatus41.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, (int) ' ');
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, 52);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine3 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location6 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int7 = location6.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = vendingMachine3.vendItem(location6, (double) 100L);
        int int10 = location6.getColumn();
        int int11 = location6.getRow();
        boolean boolean12 = location2.equals((java.lang.Object) location6);
        int int13 = location2.getColumn();
        int int14 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(vendingStatus9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(1, 0);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        edu.hawaii.ics.peruma.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus43 = vendingMachine0.addItem(item42);
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        edu.hawaii.ics.peruma.VendingMachine vendingMachine7 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, (int) (short) 0);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine7.vendItem(location10, (double) (-1L));
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = vendingMachine0.vendItem(location10, (double) (byte) 1);
        edu.hawaii.ics.peruma.Location location17 = new edu.hawaii.ics.peruma.Location(0, (-1));
        int int18 = location17.getRow();
        int int19 = location17.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = vendingMachine0.vendItem(location17, (double) 32);
        double double22 = vendingStatus21.getChange();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, 100.0d, vendingMessage6);
        java.lang.Class<?> wildcardClass10 = vendingStatus9.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (short) 100);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage2);
        java.lang.Class<?> wildcardClass5 = addMessage2.getClass();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList13 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location16 = new edu.hawaii.ics.peruma.Location(100, 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = vendingMachine0.vendItem(location16, 97.0d);
        edu.hawaii.ics.peruma.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus20 = vendingMachine0.addItem(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertNotNull(vendingStatus18);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100.0f, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 0, vendingMessage10);
        boolean boolean16 = vendingStatus15.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, (int) '4');
        java.lang.Class<?> wildcardClass3 = location2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(10, 100);
        int int3 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage7);
        boolean boolean10 = addStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.Class<?> wildcardClass26 = location21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(vendingStatus23);
        org.junit.Assert.assertNotNull(vendingStatus25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) -1, 10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int39 = location38.getRow();
        int int40 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus42 = vendingMachine0.vendItem(location38, (double) (-1.0f));
        java.lang.Class<?> wildcardClass43 = location38.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(vendingStatus42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        int int7 = location3.getColumn();
        int int8 = location3.getRow();
        java.lang.Class<?> wildcardClass9 = location3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        boolean boolean36 = vendingStatus35.isSuccess();
        boolean boolean37 = vendingStatus35.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 0, (-1));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(52, (int) (byte) 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage2 = null;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus3 = new edu.hawaii.ics.peruma.VendingStatus(true, (-1.0d), vendingMessage2);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage4);
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.OUT_OF_STOCK));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        int int15 = location2.getRow();
        int int16 = location2.getColumn();
        int int17 = location2.getColumn();
        int int18 = location2.getRow();
        int int19 = location2.getRow();
        int int20 = location2.getRow();
        int int21 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) ' ', 0);
        int int3 = location2.getColumn();
        int int4 = location2.getRow();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        edu.hawaii.ics.peruma.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus16 = vendingMachine3.addItem(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        edu.hawaii.ics.peruma.Location location24 = new edu.hawaii.ics.peruma.Location((int) (short) 10, (int) (short) 100);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus26 = vendingMachine7.vendItem(location24, 32.0d);
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
        org.junit.Assert.assertNotNull(vendingStatus26);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage2 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus3 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage2);
        boolean boolean4 = addStatus3.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus3.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean7 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + addMessage2 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage2.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        int int5 = location3.getRow();
        int int6 = location3.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = vendingMachine0.vendItem(location3, 100.0d);
        int int9 = location3.getRow();
        int int10 = location3.getColumn();
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (byte) 1);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS;
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        boolean boolean10 = addStatus9.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage11 = addStatus9.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        boolean boolean13 = location5.equals((java.lang.Object) addMessage11);
        edu.hawaii.ics.peruma.AddStatus addStatus14 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage11);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage15 = addStatus14.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus16 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage15);
        edu.hawaii.ics.peruma.AddStatus addStatus17 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage15);
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + addMessage11 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage11.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + addMessage15 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS + "'", addMessage15.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.SUCCESS));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Class<?> wildcardClass22 = vendingStatus21.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList16);
        org.junit.Assert.assertNotNull(vendingStatus21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(vendingStatus17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(vendingStatus24);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location3 = new edu.hawaii.ics.peruma.Location(1, 1);
        int int4 = location3.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = vendingMachine0.vendItem(location3, (double) 100L);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList7 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) '4');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) (short) 100);
        int int13 = location10.getColumn();
        int int14 = location10.getColumn();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage21 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus22 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus23 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage21);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus24 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) (-1L), vendingMessage21);
        boolean boolean25 = location10.equals((java.lang.Object) vendingStatus24);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + vendingMessage21 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage21.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage6 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 1, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 35, vendingMessage6);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 10.0f, vendingMessage6);
        boolean boolean10 = vendingStatus9.isSuccess();
        org.junit.Assert.assertTrue("'" + vendingMessage6 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage6.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage10 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus11 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = new edu.hawaii.ics.peruma.VendingStatus(false, 35.0d, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus14 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 32, vendingMessage10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(true, 0.0d, vendingMessage10);
        org.junit.Assert.assertTrue("'" + vendingMessage10 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage10.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        int int46 = location9.getColumn();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, (int) (short) 1);
        int int3 = location2.getRow();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus6.getAddMessage();
        boolean boolean9 = addStatus6.isSuccess();
        boolean boolean10 = location2.equals((java.lang.Object) addStatus6);
        boolean boolean11 = addStatus6.isSuccess();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        boolean boolean36 = vendingStatus35.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int3 = location2.getRow();
        int int4 = location2.getRow();
        java.lang.Class<?> wildcardClass5 = location2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        boolean boolean6 = addStatus4.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, (int) (byte) 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        int int15 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(itemList6);
        org.junit.Assert.assertNotNull(itemList7);
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(itemList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage4 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus5 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage4);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus6 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 100L, vendingMessage4);
        boolean boolean7 = vendingStatus6.isSuccess();
        boolean boolean8 = vendingStatus6.isSuccess();
        java.lang.Class<?> wildcardClass9 = vendingStatus6.getClass();
        org.junit.Assert.assertTrue("'" + vendingMessage4 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage4.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        edu.hawaii.ics.peruma.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus31 = vendingMachine0.addItem(item30);
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
        org.junit.Assert.assertNotNull(vendingStatus27);
        org.junit.Assert.assertNotNull(itemList28);
        org.junit.Assert.assertNotNull(itemList29);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Class<?> wildcardClass25 = vendingStatus24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) '4', (int) '#');
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) 10.0f);
        java.util.List<edu.hawaii.ics.peruma.Item> itemList8 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location11 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 10);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus13 = vendingMachine0.vendItem(location11, (double) (byte) 0);
        int int14 = location11.getRow();
        edu.hawaii.ics.peruma.VendingMachine vendingMachine15 = new edu.hawaii.ics.peruma.VendingMachine();
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location(1, 1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine15.vendItem(location18, (double) (byte) 0);
        int int21 = location18.getRow();
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage24 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus25 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage24);
        boolean boolean26 = location18.equals((java.lang.Object) vendingMessage24);
        boolean boolean27 = location11.equals((java.lang.Object) vendingMessage24);
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(itemList8);
        org.junit.Assert.assertNotNull(vendingStatus13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(vendingStatus20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + vendingMessage24 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage24.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((int) (byte) 1, (int) (byte) 1);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        boolean boolean9 = addStatus8.isSuccess();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage10 = addStatus8.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage10);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage10);
        boolean boolean13 = addStatus12.isSuccess();
        java.lang.Class<?> wildcardClass14 = addStatus12.getClass();
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage3 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus4 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage3);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage5 = addStatus4.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus6 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage5);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage7 = addStatus6.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus8 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage7);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage9 = addStatus8.getAddMessage();
        org.junit.Assert.assertTrue("'" + addMessage3 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage3.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage5 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage5.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage7 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage7.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage9 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage9.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.util.List<edu.hawaii.ics.peruma.Item> itemList25 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList26 = vendingMachine0.getItems();
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
        org.junit.Assert.assertNotNull(itemList25);
        org.junit.Assert.assertNotNull(itemList26);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location(100, (int) '4');
        int int3 = location2.getColumn();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        int int17 = location9.getRow();
        int int18 = location9.getColumn();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        edu.hawaii.ics.peruma.Location location38 = new edu.hawaii.ics.peruma.Location((int) '4', (int) (byte) 10);
        int int39 = location38.getRow();
        int int40 = location38.getRow();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus42 = vendingMachine0.vendItem(location38, (double) (-1.0f));
        edu.hawaii.ics.peruma.Location location45 = new edu.hawaii.ics.peruma.Location((int) (short) 10, 1);
        int int46 = location45.getColumn();
        edu.hawaii.ics.peruma.VendingStatus vendingStatus48 = vendingMachine0.vendItem(location45, (double) (-1L));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(vendingStatus42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(vendingStatus48);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        edu.hawaii.ics.peruma.Location location2 = new edu.hawaii.ics.peruma.Location((-1), (int) (byte) 0);
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage7 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus8 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage7);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus9 = new edu.hawaii.ics.peruma.VendingStatus(false, 0.0d, vendingMessage7);
        double double10 = vendingStatus9.getChange();
        boolean boolean11 = location2.equals((java.lang.Object) vendingStatus9);
        org.junit.Assert.assertTrue("'" + vendingMessage7 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage7.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.junit.Assert.assertNotNull(vendingStatus12);
        org.junit.Assert.assertNotNull(vendingStatus14);
        org.junit.Assert.assertNotNull(itemList15);
        org.junit.Assert.assertNotNull(itemList17);
        org.junit.Assert.assertNotNull(itemList18);
        org.junit.Assert.assertNotNull(vendingStatus23);
        org.junit.Assert.assertNotNull(vendingStatus25);
        org.junit.Assert.assertNotNull(itemList26);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage16 = addStatus15.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage17 = addStatus15.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus18 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + addMessage10 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage10.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage12 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage12.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage13 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage13.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + addMessage16 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage16.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage17 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage17.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        edu.hawaii.ics.peruma.Location location18 = new edu.hawaii.ics.peruma.Location((int) (byte) 10, 32);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = vendingMachine0.vendItem(location18, 32.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(vendingStatus6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(vendingStatus15);
        org.junit.Assert.assertNotNull(vendingStatus20);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage6 = edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE;
        edu.hawaii.ics.peruma.AddStatus addStatus7 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage6);
        edu.hawaii.ics.peruma.AddStatus.AddMessage addMessage8 = addStatus7.getAddMessage();
        edu.hawaii.ics.peruma.AddStatus addStatus9 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus10 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus11 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus12 = new edu.hawaii.ics.peruma.AddStatus(true, addMessage8);
        edu.hawaii.ics.peruma.AddStatus addStatus13 = new edu.hawaii.ics.peruma.AddStatus(false, addMessage8);
        org.junit.Assert.assertTrue("'" + addMessage6 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage6.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
        org.junit.Assert.assertTrue("'" + addMessage8 + "' != '" + edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE + "'", addMessage8.equals(edu.hawaii.ics.peruma.AddStatus.AddMessage.INSUFFICIENT_SPACE));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        edu.hawaii.ics.peruma.VendingStatus.VendingMessage vendingMessage14 = edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS;
        edu.hawaii.ics.peruma.VendingStatus vendingStatus15 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (short) 1, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus16 = new edu.hawaii.ics.peruma.VendingStatus(true, (double) 'a', vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus17 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) (byte) 10, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus18 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10L, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus19 = new edu.hawaii.ics.peruma.VendingStatus(true, 97.0d, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus20 = new edu.hawaii.ics.peruma.VendingStatus(false, (double) 10.0f, vendingMessage14);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus21 = new edu.hawaii.ics.peruma.VendingStatus(true, 35.0d, vendingMessage14);
        org.junit.Assert.assertTrue("'" + vendingMessage14 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage14.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        edu.hawaii.ics.peruma.VendingMachine vendingMachine0 = new edu.hawaii.ics.peruma.VendingMachine();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList1 = vendingMachine0.getItems();
        java.util.List<edu.hawaii.ics.peruma.Item> itemList2 = vendingMachine0.getItems();
        edu.hawaii.ics.peruma.Location location5 = new edu.hawaii.ics.peruma.Location((int) ' ', (int) (byte) -1);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus7 = vendingMachine0.vendItem(location5, (double) (-1L));
        edu.hawaii.ics.peruma.Location location10 = new edu.hawaii.ics.peruma.Location(0, 35);
        edu.hawaii.ics.peruma.VendingStatus vendingStatus12 = vendingMachine0.vendItem(location10, (double) ' ');
        org.junit.Assert.assertNotNull(itemList1);
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(vendingStatus7);
        org.junit.Assert.assertNotNull(vendingStatus12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        edu.hawaii.ics.peruma.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            edu.hawaii.ics.peruma.AddStatus addStatus15 = vendingMachine12.addItem(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"edu.hawaii.ics.peruma.Item.getQuantity()\" because \"item\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + vendingMessage5 + "' != '" + edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS + "'", vendingMessage5.equals(edu.hawaii.ics.peruma.VendingStatus.VendingMessage.INSUFFICIENT_FUNDS));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

