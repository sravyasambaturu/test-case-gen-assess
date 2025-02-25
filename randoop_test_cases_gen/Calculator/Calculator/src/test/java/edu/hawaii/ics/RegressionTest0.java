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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = calculator0.Average(doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        int int2 = calculator0.factorial((int) (short) -1);
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = calculator0.sum(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double4 = calculator1.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double7 = calculator1.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double10 = calculator1.divide(0.0d, (double) (byte) -1);
        double[] doubleArray17 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double18 = calculator1.sum(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        java.lang.Class<?> wildcardClass20 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 451.0d + "'", double18 == 451.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 451.0d + "'", double19 == 451.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray69 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double70 = calculator59.Multiplication(doubleArray69);
        double double71 = calculator52.sum(doubleArray69);
        double double72 = calculator26.subtract(doubleArray69);
        double double73 = calculator0.Average(doubleArray69);
        double[] doubleArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = calculator0.subtract(doubleArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from double array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 34.0d + "'", double71 == 34.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-34.0d) + "'", double72 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double7 = calculator4.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double10 = calculator4.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double13 = calculator4.divide(0.0d, (double) (byte) -1);
        double[] doubleArray20 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double21 = calculator4.sum(doubleArray20);
        double double22 = calculator3.sum(doubleArray20);
        double double23 = calculator0.sum(doubleArray20);
        double double26 = calculator0.moduloOfTwoNum((double) 10, 0.13303769401330376d);
        java.lang.Class<?> wildcardClass27 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 451.0d + "'", double21 == 451.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 451.0d + "'", double22 == 451.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.02217294900222938d + "'", double26 == 0.02217294900222938d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double18 = calculator16.squareRoot((-1.0d));
        double double20 = calculator16.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        double double40 = calculator21.sum(doubleArray38);
        double double41 = calculator16.Average(doubleArray38);
        double double42 = calculator0.subtract(doubleArray38);
        int int44 = calculator0.factorial((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 451.0d + "'", double40 == 451.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 75.16666666666667d + "'", double41 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-251.0d) + "'", double42 == (-251.0d));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        double double17 = calculator0.squareRoot((-108.0d));
        java.lang.Class<?> wildcardClass18 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.9E-324d + "'", double17 == 4.9E-324d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double31 = calculator26.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator32 = new edu.hawaii.ics.Calculator();
        double double35 = calculator32.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double38 = calculator32.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator39 = new edu.hawaii.ics.Calculator();
        double double42 = calculator39.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray49 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double50 = calculator39.Multiplication(doubleArray49);
        double double51 = calculator32.sum(doubleArray49);
        double[] doubleArray56 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double57 = calculator32.subtract(doubleArray56);
        double double58 = calculator26.sum(doubleArray56);
        double double59 = calculator0.sum(doubleArray56);
        edu.hawaii.ics.Calculator calculator60 = new edu.hawaii.ics.Calculator();
        double double63 = calculator60.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double66 = calculator60.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double69 = calculator60.divide(0.0d, (double) (byte) -1);
        double[] doubleArray76 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double77 = calculator60.sum(doubleArray76);
        edu.hawaii.ics.Calculator calculator78 = new edu.hawaii.ics.Calculator();
        double double81 = calculator78.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double83 = calculator78.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator84 = new edu.hawaii.ics.Calculator();
        double double87 = calculator84.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray94 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double95 = calculator84.Multiplication(doubleArray94);
        double double96 = calculator78.subtract(doubleArray94);
        double double97 = calculator60.Average(doubleArray94);
        double double98 = calculator0.subtract(doubleArray94);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 2.378414230005442d + "'", double31 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 34.0d + "'", double51 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-108.0d) + "'", double57 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 110.0d + "'", double58 == 110.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 110.0d + "'", double59 == 110.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-0.0d) + "'", double69 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 451.0d + "'", double77 == 451.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 4.9E-324d + "'", double83 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertArrayEquals(doubleArray94, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-34.0d) + "'", double96 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 5.666666666666667d + "'", double97 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-34.0d) + "'", double98 == (-34.0d));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        double double18 = calculator0.divide((double) (byte) 10, 75.16666666666667d);
        double double21 = calculator0.moduloOfTwoNum((double) (-1L), 2.378414230005442d);
        double double24 = calculator0.moduloOfTwoNum((double) (-1L), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13303769401330376d + "'", double18 == 0.13303769401330376d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.9E-324d + "'", double24 == 4.9E-324d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator18.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray34 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double35 = calculator24.Multiplication(doubleArray34);
        double double36 = calculator18.subtract(doubleArray34);
        double double37 = calculator0.Average(doubleArray34);
        edu.hawaii.ics.Calculator calculator38 = new edu.hawaii.ics.Calculator();
        double double41 = calculator38.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray48 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double49 = calculator38.Multiplication(doubleArray48);
        double double50 = calculator0.sum(doubleArray48);
        java.lang.Class<?> wildcardClass51 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-34.0d) + "'", double36 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.666666666666667d + "'", double37 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 34.0d + "'", double50 == 34.0d);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray69 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double70 = calculator59.Multiplication(doubleArray69);
        double double71 = calculator52.sum(doubleArray69);
        double double72 = calculator26.subtract(doubleArray69);
        double double73 = calculator0.Average(doubleArray69);
        double[] doubleArray74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = calculator0.Multiplication(doubleArray74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 34.0d + "'", double71 == 34.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-34.0d) + "'", double72 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator0.subtract(doubleArray16);
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double22 = calculator19.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double25 = calculator19.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray36 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double37 = calculator26.Multiplication(doubleArray36);
        double double38 = calculator19.sum(doubleArray36);
        double[] doubleArray43 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double44 = calculator19.subtract(doubleArray43);
        edu.hawaii.ics.Calculator calculator45 = new edu.hawaii.ics.Calculator();
        double double48 = calculator45.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double51 = calculator45.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray62 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double63 = calculator52.Multiplication(doubleArray62);
        double double64 = calculator45.sum(doubleArray62);
        double[] doubleArray69 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double70 = calculator45.subtract(doubleArray69);
        double double71 = calculator19.Multiplication(doubleArray69);
        double double72 = calculator0.subtract(doubleArray69);
        java.lang.Class<?> wildcardClass73 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-34.0d) + "'", double18 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 34.0d + "'", double38 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-108.0d) + "'", double44 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 34.0d + "'", double64 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-108.0d) + "'", double70 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1000.0d) + "'", double71 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-108.0d) + "'", double72 == (-108.0d));
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) '4');
        double double9 = calculator0.squareRoot(100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.211102550927978d + "'", double7 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double28 = calculator0.divide((double) (short) -1, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.019230769230769232d) + "'", double28 == (-0.019230769230769232d));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator18.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray34 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double35 = calculator24.Multiplication(doubleArray34);
        double double36 = calculator18.subtract(doubleArray34);
        double double37 = calculator0.Average(doubleArray34);
        double double39 = calculator0.squareRoot((double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-34.0d) + "'", double36 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.666666666666667d + "'", double37 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        double double19 = calculator0.squareRoot(2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.5422108254079407d + "'", double19 == 1.5422108254079407d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double4 = calculator1.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double7 = calculator1.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double10 = calculator1.divide(0.0d, (double) (byte) -1);
        double[] doubleArray17 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double18 = calculator1.sum(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double double21 = calculator0.squareRoot((-5.2E9d));
        double double23 = calculator0.squareRoot(0.0d);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double30 = calculator24.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator31 = new edu.hawaii.ics.Calculator();
        double double34 = calculator31.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray41 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double42 = calculator31.Multiplication(doubleArray41);
        double double43 = calculator24.sum(doubleArray41);
        double[] doubleArray48 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double49 = calculator24.subtract(doubleArray48);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double56 = calculator50.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator57 = new edu.hawaii.ics.Calculator();
        double double60 = calculator57.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray67 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double68 = calculator57.Multiplication(doubleArray67);
        double double69 = calculator50.sum(doubleArray67);
        double[] doubleArray74 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double75 = calculator50.subtract(doubleArray74);
        edu.hawaii.ics.Calculator calculator76 = new edu.hawaii.ics.Calculator();
        double double79 = calculator76.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double82 = calculator76.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator83 = new edu.hawaii.ics.Calculator();
        double double86 = calculator83.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray93 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double94 = calculator83.Multiplication(doubleArray93);
        double double95 = calculator76.sum(doubleArray93);
        double double96 = calculator50.subtract(doubleArray93);
        double double97 = calculator24.Average(doubleArray93);
        double double98 = calculator0.sum(doubleArray93);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 451.0d + "'", double18 == 451.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 451.0d + "'", double19 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 34.0d + "'", double43 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-108.0d) + "'", double49 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 34.0d + "'", double69 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-108.0d) + "'", double75 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 34.0d + "'", double95 == 34.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-34.0d) + "'", double96 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 5.666666666666667d + "'", double97 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 34.0d + "'", double98 == 34.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double16 = calculator13.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double19 = calculator13.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator20 = new edu.hawaii.ics.Calculator();
        double double23 = calculator20.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray30 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double31 = calculator20.Multiplication(doubleArray30);
        double double32 = calculator13.sum(doubleArray30);
        double[] doubleArray37 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double38 = calculator13.subtract(doubleArray37);
        edu.hawaii.ics.Calculator calculator39 = new edu.hawaii.ics.Calculator();
        double double42 = calculator39.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double45 = calculator39.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator46 = new edu.hawaii.ics.Calculator();
        double double49 = calculator46.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray56 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double57 = calculator46.Multiplication(doubleArray56);
        double double58 = calculator39.sum(doubleArray56);
        double[] doubleArray63 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double64 = calculator39.subtract(doubleArray63);
        edu.hawaii.ics.Calculator calculator65 = new edu.hawaii.ics.Calculator();
        double double68 = calculator65.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double71 = calculator65.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator72 = new edu.hawaii.ics.Calculator();
        double double75 = calculator72.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray82 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double83 = calculator72.Multiplication(doubleArray82);
        double double84 = calculator65.sum(doubleArray82);
        double double85 = calculator39.subtract(doubleArray82);
        double double86 = calculator13.Average(doubleArray82);
        double double87 = calculator0.subtract(doubleArray82);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 34.0d + "'", double32 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-108.0d) + "'", double38 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 34.0d + "'", double58 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-108.0d) + "'", double64 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 34.0d + "'", double84 == 34.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-34.0d) + "'", double85 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 5.666666666666667d + "'", double86 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-34.0d) + "'", double87 == (-34.0d));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double4 = calculator1.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double7 = calculator1.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator8 = new edu.hawaii.ics.Calculator();
        double double11 = calculator8.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray18 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double19 = calculator8.Multiplication(doubleArray18);
        double double20 = calculator1.sum(doubleArray18);
        double[] doubleArray25 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double26 = calculator1.subtract(doubleArray25);
        edu.hawaii.ics.Calculator calculator27 = new edu.hawaii.ics.Calculator();
        double double30 = calculator27.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double33 = calculator27.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator34 = new edu.hawaii.ics.Calculator();
        double double37 = calculator34.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray44 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double45 = calculator34.Multiplication(doubleArray44);
        double double46 = calculator27.sum(doubleArray44);
        double double47 = calculator1.subtract(doubleArray44);
        edu.hawaii.ics.Calculator calculator48 = new edu.hawaii.ics.Calculator();
        double double50 = calculator48.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator51 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double61 = calculator52.divide(0.0d, (double) (byte) -1);
        double[] doubleArray68 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double69 = calculator52.sum(doubleArray68);
        double double70 = calculator51.sum(doubleArray68);
        double double71 = calculator48.sum(doubleArray68);
        double double72 = calculator1.Average(doubleArray68);
        double double73 = calculator0.subtract(doubleArray68);
        java.lang.Class<?> wildcardClass74 = doubleArray68.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 34.0d + "'", double20 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-108.0d) + "'", double26 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 34.0d + "'", double46 == 34.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-34.0d) + "'", double47 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.9E-324d + "'", double50 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.0d) + "'", double61 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 451.0d + "'", double69 == 451.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 451.0d + "'", double70 == 451.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 451.0d + "'", double71 == 451.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 75.16666666666667d + "'", double72 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-251.0d) + "'", double73 == (-251.0d));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double18 = calculator16.squareRoot((-1.0d));
        double double20 = calculator16.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        double double40 = calculator21.sum(doubleArray38);
        double double41 = calculator16.Average(doubleArray38);
        double double42 = calculator0.subtract(doubleArray38);
        java.lang.Class<?> wildcardClass43 = doubleArray38.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 451.0d + "'", double40 == 451.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 75.16666666666667d + "'", double41 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-251.0d) + "'", double42 == (-251.0d));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        double double17 = calculator0.squareRoot((-108.0d));
        int int19 = calculator0.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.9E-324d + "'", double17 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        int int2 = calculator0.factorial((int) (short) -1);
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double6 = calculator4.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator4.Multiplication(doubleArray17);
        double double21 = calculator4.squareRoot((-108.0d));
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        edu.hawaii.ics.Calculator calculator40 = new edu.hawaii.ics.Calculator();
        double double43 = calculator40.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double45 = calculator40.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator46 = new edu.hawaii.ics.Calculator();
        double double49 = calculator46.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray56 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double57 = calculator46.Multiplication(doubleArray56);
        double double58 = calculator40.subtract(doubleArray56);
        double double59 = calculator22.Average(doubleArray56);
        edu.hawaii.ics.Calculator calculator60 = new edu.hawaii.ics.Calculator();
        double double63 = calculator60.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray70 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double71 = calculator60.Multiplication(doubleArray70);
        double double72 = calculator22.sum(doubleArray70);
        double double73 = calculator4.Average(doubleArray70);
        double double74 = calculator3.Multiplication(doubleArray70);
        double double75 = calculator0.subtract(doubleArray70);
        double double78 = calculator0.divide((-5.2E9d), (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.9E-324d + "'", double45 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-34.0d) + "'", double58 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 5.666666666666667d + "'", double59 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 34.0d + "'", double72 == 34.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-34.0d) + "'", double75 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-5.2E9d) + "'", double78 == (-5.2E9d));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator18.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray34 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double35 = calculator24.Multiplication(doubleArray34);
        double double36 = calculator18.subtract(doubleArray34);
        double double37 = calculator0.Average(doubleArray34);
        int int39 = calculator0.factorial((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-34.0d) + "'", double36 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.666666666666667d + "'", double37 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double4 = calculator1.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double7 = calculator1.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double10 = calculator1.divide(0.0d, (double) (byte) -1);
        double[] doubleArray17 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double18 = calculator1.sum(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double double21 = calculator0.squareRoot((-5.2E9d));
        double double24 = calculator0.divide((-251.0d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.0d) + "'", double10 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 451.0d + "'", double18 == 451.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 451.0d + "'", double19 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-25.1d) + "'", double24 == (-25.1d));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.9E-324d + "'", double27 == 4.9E-324d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray69 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double70 = calculator59.Multiplication(doubleArray69);
        double double71 = calculator52.sum(doubleArray69);
        double double72 = calculator26.subtract(doubleArray69);
        double double73 = calculator0.Average(doubleArray69);
        double[] doubleArray78 = new double[] { 34.0d, 10, (byte) 100, (-108.0d) };
        double double79 = calculator0.Average(doubleArray78);
        double double82 = calculator0.divide(10.0d, (double) (-1));
        double double84 = calculator0.squareRoot((-25.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 34.0d + "'", double71 == 34.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-34.0d) + "'", double72 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 34.0d, 10.0d, 100.0d, (-108.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 9.0d + "'", double79 == 9.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-10.0d) + "'", double82 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 4.9E-324d + "'", double84 == 4.9E-324d);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double35 = calculator26.divide(0.0d, (double) (byte) -1);
        double[] doubleArray42 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double43 = calculator26.sum(doubleArray42);
        edu.hawaii.ics.Calculator calculator44 = new edu.hawaii.ics.Calculator();
        double double47 = calculator44.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double49 = calculator44.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray60 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double61 = calculator50.Multiplication(doubleArray60);
        double double62 = calculator44.subtract(doubleArray60);
        double double63 = calculator26.Average(doubleArray60);
        edu.hawaii.ics.Calculator calculator64 = new edu.hawaii.ics.Calculator();
        double double67 = calculator64.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray74 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double75 = calculator64.Multiplication(doubleArray74);
        double double76 = calculator26.sum(doubleArray74);
        double double77 = calculator0.Average(doubleArray74);
        edu.hawaii.ics.Calculator calculator78 = new edu.hawaii.ics.Calculator();
        double double81 = calculator78.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray88 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double89 = calculator78.Multiplication(doubleArray88);
        double double90 = calculator0.sum(doubleArray88);
        java.lang.Class<?> wildcardClass91 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 451.0d + "'", double43 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.9E-324d + "'", double49 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-34.0d) + "'", double62 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 5.666666666666667d + "'", double63 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 34.0d + "'", double76 == 34.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 5.666666666666667d + "'", double77 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 34.0d + "'", double90 == 34.0d);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        double double28 = calculator0.divide((double) (short) 1, (-34.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.029411764705882353d) + "'", double28 == (-0.029411764705882353d));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double7 = calculator4.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double10 = calculator4.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double13 = calculator4.divide(0.0d, (double) (byte) -1);
        double[] doubleArray20 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double21 = calculator4.sum(doubleArray20);
        double double22 = calculator3.sum(doubleArray20);
        double double23 = calculator0.sum(doubleArray20);
        int int25 = calculator0.factorial((-2147483648));
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double28 = calculator26.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        double double32 = calculator29.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray39 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double40 = calculator29.Multiplication(doubleArray39);
        double double41 = calculator26.Multiplication(doubleArray39);
        edu.hawaii.ics.Calculator calculator42 = new edu.hawaii.ics.Calculator();
        double double44 = calculator42.squareRoot((-1.0d));
        double double46 = calculator42.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator47 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator48 = new edu.hawaii.ics.Calculator();
        double double51 = calculator48.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double54 = calculator48.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double57 = calculator48.divide(0.0d, (double) (byte) -1);
        double[] doubleArray64 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double65 = calculator48.sum(doubleArray64);
        double double66 = calculator47.sum(doubleArray64);
        double double67 = calculator42.Average(doubleArray64);
        double double68 = calculator26.subtract(doubleArray64);
        double double69 = calculator0.subtract(doubleArray64);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 451.0d + "'", double21 == 451.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 451.0d + "'", double22 == 451.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.9E-324d + "'", double28 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 4.9E-324d + "'", double44 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.9E-324d + "'", double46 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-0.0d) + "'", double57 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 451.0d + "'", double65 == 451.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 451.0d + "'", double66 == 451.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 75.16666666666667d + "'", double67 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-251.0d) + "'", double68 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-251.0d) + "'", double69 == (-251.0d));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        double double52 = calculator0.Multiplication(doubleArray50);
        double double55 = calculator0.moduloOfTwoNum((double) (byte) 100, 7.211102550927978d);
        double double58 = calculator0.moduloOfTwoNum((double) (-1L), (-251.0d));
        int int60 = calculator0.factorial((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1000.0d) + "'", double52 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 6.255666837936304d + "'", double55 == 6.255666837936304d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator10 = new edu.hawaii.ics.Calculator();
        double double13 = calculator10.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double15 = calculator10.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator10.subtract(doubleArray26);
        double double29 = calculator0.subtract(doubleArray26);
        edu.hawaii.ics.Calculator calculator30 = new edu.hawaii.ics.Calculator();
        double double33 = calculator30.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double35 = calculator30.squareRoot((double) (byte) -1);
        double double37 = calculator30.squareRoot((double) ' ');
        double double39 = calculator30.squareRoot((double) (short) 1);
        double double42 = calculator30.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double45 = calculator43.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator46 = new edu.hawaii.ics.Calculator();
        double double49 = calculator46.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray56 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double57 = calculator46.Multiplication(doubleArray56);
        double double58 = calculator43.Multiplication(doubleArray56);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double65 = calculator59.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double68 = calculator59.divide(0.0d, (double) (byte) -1);
        double[] doubleArray75 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double76 = calculator59.sum(doubleArray75);
        double double77 = calculator43.sum(doubleArray75);
        double double78 = calculator30.Multiplication(doubleArray75);
        double double79 = calculator0.subtract(doubleArray75);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-34.0d) + "'", double28 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-34.0d) + "'", double29 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.9E-324d + "'", double35 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.656854249492381d + "'", double37 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.9E-324d + "'", double42 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.9E-324d + "'", double45 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-0.0d) + "'", double68 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 451.0d + "'", double76 == 451.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 451.0d + "'", double77 == 451.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-5.2E9d) + "'", double78 == (-5.2E9d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-251.0d) + "'", double79 == (-251.0d));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator18.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray34 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double35 = calculator24.Multiplication(doubleArray34);
        double double36 = calculator18.subtract(doubleArray34);
        double double37 = calculator0.Average(doubleArray34);
        double double39 = calculator0.squareRoot((double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-34.0d) + "'", double36 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.666666666666667d + "'", double37 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double22 = calculator16.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double25 = calculator16.divide(0.0d, (double) (byte) -1);
        double[] doubleArray32 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double33 = calculator16.sum(doubleArray32);
        double double34 = calculator0.sum(doubleArray32);
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        double double38 = calculator35.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double41 = calculator35.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator42 = new edu.hawaii.ics.Calculator();
        double double45 = calculator42.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray52 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double53 = calculator42.Multiplication(doubleArray52);
        double double54 = calculator35.sum(doubleArray52);
        double[] doubleArray59 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double60 = calculator35.subtract(doubleArray59);
        edu.hawaii.ics.Calculator calculator61 = new edu.hawaii.ics.Calculator();
        double double64 = calculator61.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double67 = calculator61.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator68 = new edu.hawaii.ics.Calculator();
        double double71 = calculator68.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray78 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double79 = calculator68.Multiplication(doubleArray78);
        double double80 = calculator61.sum(doubleArray78);
        double double81 = calculator35.subtract(doubleArray78);
        double double82 = calculator0.Multiplication(doubleArray78);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.0d) + "'", double25 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 451.0d + "'", double33 == 451.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 451.0d + "'", double34 == 451.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 34.0d + "'", double54 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-108.0d) + "'", double60 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 34.0d + "'", double80 == 34.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-34.0d) + "'", double81 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.divide((-0.0d), (double) 'a');
        java.lang.Class<?> wildcardClass4 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        double double18 = calculator0.divide((double) (byte) 10, 75.16666666666667d);
        double double21 = calculator0.moduloOfTwoNum((double) (-1L), 2.378414230005442d);
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double27 = calculator22.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double31 = calculator28.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray38 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double39 = calculator28.Multiplication(doubleArray38);
        double double40 = calculator22.subtract(doubleArray38);
        double double41 = calculator0.Multiplication(doubleArray38);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13303769401330376d + "'", double18 == 0.13303769401330376d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.9E-324d + "'", double27 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-34.0d) + "'", double40 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double15 = calculator13.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator13.Multiplication(doubleArray26);
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        double double32 = calculator29.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double35 = calculator29.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double38 = calculator29.divide(0.0d, (double) (byte) -1);
        double[] doubleArray45 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double46 = calculator29.sum(doubleArray45);
        double double47 = calculator13.sum(doubleArray45);
        double double48 = calculator0.Multiplication(doubleArray45);
        double double50 = calculator0.squareRoot((double) '#');
        double double53 = calculator0.divide((double) 1L, (-108.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.0d) + "'", double38 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 451.0d + "'", double46 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-5.2E9d) + "'", double48 == (-5.2E9d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5.916079783099616d + "'", double50 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.009259259259259259d) + "'", double53 == (-0.009259259259259259d));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator18.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray34 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double35 = calculator24.Multiplication(doubleArray34);
        double double36 = calculator18.subtract(doubleArray34);
        double double37 = calculator0.Average(doubleArray34);
        edu.hawaii.ics.Calculator calculator38 = new edu.hawaii.ics.Calculator();
        double double41 = calculator38.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray48 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double49 = calculator38.Multiplication(doubleArray48);
        double double50 = calculator0.sum(doubleArray48);
        double double53 = calculator0.moduloOfTwoNum((double) '4', (double) (byte) 10);
        double double56 = calculator0.moduloOfTwoNum((double) (short) 10, (-0.029411764705882353d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-34.0d) + "'", double36 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.666666666666667d + "'", double37 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 34.0d + "'", double50 == 34.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2.0d + "'", double53 == 2.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 3.17731951859912E-14d + "'", double56 == 3.17731951859912E-14d);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        double double17 = calculator0.squareRoot((-108.0d));
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double24 = calculator18.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double27 = calculator18.divide(0.0d, (double) (byte) -1);
        double[] doubleArray34 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double35 = calculator18.sum(doubleArray34);
        edu.hawaii.ics.Calculator calculator36 = new edu.hawaii.ics.Calculator();
        double double39 = calculator36.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double41 = calculator36.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator42 = new edu.hawaii.ics.Calculator();
        double double45 = calculator42.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray52 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double53 = calculator42.Multiplication(doubleArray52);
        double double54 = calculator36.subtract(doubleArray52);
        double double55 = calculator18.Average(doubleArray52);
        edu.hawaii.ics.Calculator calculator56 = new edu.hawaii.ics.Calculator();
        double double59 = calculator56.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray66 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double67 = calculator56.Multiplication(doubleArray66);
        double double68 = calculator18.sum(doubleArray66);
        double double69 = calculator0.Average(doubleArray66);
        double double72 = calculator0.divide((-0.029411764705882353d), 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.9E-324d + "'", double17 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-0.0d) + "'", double27 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 451.0d + "'", double35 == 451.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.9E-324d + "'", double41 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-34.0d) + "'", double54 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 5.666666666666667d + "'", double55 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 34.0d + "'", double68 == 34.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 5.666666666666667d + "'", double69 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-0.0049714956160500975d) + "'", double72 == (-0.0049714956160500975d));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double21 = calculator18.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator18.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray34 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double35 = calculator24.Multiplication(doubleArray34);
        double double36 = calculator18.subtract(doubleArray34);
        double double37 = calculator0.Average(doubleArray34);
        edu.hawaii.ics.Calculator calculator38 = new edu.hawaii.ics.Calculator();
        double double41 = calculator38.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray48 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double49 = calculator38.Multiplication(doubleArray48);
        double double50 = calculator0.sum(doubleArray48);
        double double53 = calculator0.moduloOfTwoNum((double) '4', (double) (byte) 10);
        int int55 = calculator0.factorial(100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-34.0d) + "'", double36 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 5.666666666666667d + "'", double37 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 34.0d + "'", double50 == 34.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2.0d + "'", double53 == 2.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.divide((-0.0d), (double) 'a');
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = calculator0.Multiplication(doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double15 = calculator13.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator13.Multiplication(doubleArray26);
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        double double32 = calculator29.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double35 = calculator29.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double38 = calculator29.divide(0.0d, (double) (byte) -1);
        double[] doubleArray45 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double46 = calculator29.sum(doubleArray45);
        double double47 = calculator13.sum(doubleArray45);
        double double48 = calculator0.Multiplication(doubleArray45);
        int int50 = calculator0.factorial((int) '4');
        int int52 = calculator0.factorial(1);
        edu.hawaii.ics.Calculator calculator53 = new edu.hawaii.ics.Calculator();
        double double56 = calculator53.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double59 = calculator53.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator60 = new edu.hawaii.ics.Calculator();
        double double63 = calculator60.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray70 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double71 = calculator60.Multiplication(doubleArray70);
        double double72 = calculator53.sum(doubleArray70);
        double double73 = calculator0.subtract(doubleArray70);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.0d) + "'", double38 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 451.0d + "'", double46 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-5.2E9d) + "'", double48 == (-5.2E9d));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 34.0d + "'", double72 == 34.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-34.0d) + "'", double73 == (-34.0d));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double22 = calculator16.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double25 = calculator16.divide(0.0d, (double) (byte) -1);
        double[] doubleArray32 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double33 = calculator16.sum(doubleArray32);
        double double34 = calculator0.sum(doubleArray32);
        double double37 = calculator0.moduloOfTwoNum((double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.0d) + "'", double25 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 451.0d + "'", double33 == 451.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 451.0d + "'", double34 == 451.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double10 = calculator0.moduloOfTwoNum(1.0d, (-0.009259259259259259d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.009259259259257677d + "'", double10 == 0.009259259259257677d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray69 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double70 = calculator59.Multiplication(doubleArray69);
        double double71 = calculator52.sum(doubleArray69);
        double double72 = calculator26.subtract(doubleArray69);
        double double73 = calculator0.Average(doubleArray69);
        double[] doubleArray78 = new double[] { 34.0d, 10, (byte) 100, (-108.0d) };
        double double79 = calculator0.Average(doubleArray78);
        double double82 = calculator0.divide(10.0d, (double) (-1));
        edu.hawaii.ics.Calculator calculator83 = new edu.hawaii.ics.Calculator();
        double double85 = calculator83.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator86 = new edu.hawaii.ics.Calculator();
        double double89 = calculator86.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray96 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double97 = calculator86.Multiplication(doubleArray96);
        double double98 = calculator83.Multiplication(doubleArray96);
        double double99 = calculator0.subtract(doubleArray96);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 34.0d + "'", double71 == 34.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-34.0d) + "'", double72 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 34.0d, 10.0d, 100.0d, (-108.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 9.0d + "'", double79 == 9.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-10.0d) + "'", double82 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 4.9E-324d + "'", double85 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.0d + "'", double98 == 0.0d);
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + (-34.0d) + "'", double99 == (-34.0d));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        int int2 = calculator0.factorial((int) (short) -1);
        int int4 = calculator0.factorial((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot((double) 100.0f);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double31 = calculator28.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double34 = calculator28.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        double double38 = calculator35.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray45 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double46 = calculator35.Multiplication(doubleArray45);
        double double47 = calculator28.sum(doubleArray45);
        double[] doubleArray52 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double53 = calculator28.subtract(doubleArray52);
        edu.hawaii.ics.Calculator calculator54 = new edu.hawaii.ics.Calculator();
        double double57 = calculator54.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double60 = calculator54.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator61 = new edu.hawaii.ics.Calculator();
        double double64 = calculator61.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray71 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double72 = calculator61.Multiplication(doubleArray71);
        double double73 = calculator54.sum(doubleArray71);
        double[] doubleArray78 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double79 = calculator54.subtract(doubleArray78);
        double double80 = calculator28.Multiplication(doubleArray78);
        double double81 = calculator0.subtract(doubleArray78);
        java.lang.Class<?> wildcardClass82 = doubleArray78.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 34.0d + "'", double47 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-108.0d) + "'", double53 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 34.0d + "'", double73 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-108.0d) + "'", double79 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1000.0d) + "'", double80 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-108.0d) + "'", double81 == (-108.0d));
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        double double28 = calculator0.divide(5.916079783099616d, (double) (byte) 10);
        double double31 = calculator0.moduloOfTwoNum(5.656854249492381d, 110.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.5916079783099616d + "'", double28 == 0.5916079783099616d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 5.656854249492381d + "'", double31 == 5.656854249492381d);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        double double15 = calculator0.moduloOfTwoNum((double) (byte) 0, 5.666666666666667d);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double22 = calculator16.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator23 = new edu.hawaii.ics.Calculator();
        double double25 = calculator23.squareRoot((-1.0d));
        double double27 = calculator23.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double31 = calculator28.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double34 = calculator28.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        double double38 = calculator35.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray45 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double46 = calculator35.Multiplication(doubleArray45);
        double double47 = calculator28.sum(doubleArray45);
        double double48 = calculator23.subtract(doubleArray45);
        double double49 = calculator16.subtract(doubleArray45);
        double double50 = calculator0.Average(doubleArray45);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.9E-324d + "'", double25 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 34.0d + "'", double47 == 34.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-34.0d) + "'", double48 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-34.0d) + "'", double49 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 5.666666666666667d + "'", double50 == 5.666666666666667d);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray69 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double70 = calculator59.Multiplication(doubleArray69);
        double double71 = calculator52.sum(doubleArray69);
        double double72 = calculator26.subtract(doubleArray69);
        double double73 = calculator0.Average(doubleArray69);
        int int75 = calculator0.factorial((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 34.0d + "'", double71 == 34.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-34.0d) + "'", double72 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double6 = calculator4.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator4.Multiplication(doubleArray17);
        double double21 = calculator4.squareRoot((-108.0d));
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        edu.hawaii.ics.Calculator calculator40 = new edu.hawaii.ics.Calculator();
        double double43 = calculator40.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double45 = calculator40.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator46 = new edu.hawaii.ics.Calculator();
        double double49 = calculator46.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray56 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double57 = calculator46.Multiplication(doubleArray56);
        double double58 = calculator40.subtract(doubleArray56);
        double double59 = calculator22.Average(doubleArray56);
        edu.hawaii.ics.Calculator calculator60 = new edu.hawaii.ics.Calculator();
        double double63 = calculator60.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray70 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double71 = calculator60.Multiplication(doubleArray70);
        double double72 = calculator22.sum(doubleArray70);
        double double73 = calculator4.Average(doubleArray70);
        double double74 = calculator0.sum(doubleArray70);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.9E-324d + "'", double45 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-34.0d) + "'", double58 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 5.666666666666667d + "'", double59 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 34.0d + "'", double72 == 34.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 34.0d + "'", double74 == 34.0d);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double5 = calculator3.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator3.Multiplication(doubleArray16);
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double21 = calculator19.squareRoot((-1.0d));
        double double23 = calculator19.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator25 = new edu.hawaii.ics.Calculator();
        double double28 = calculator25.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double31 = calculator25.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double34 = calculator25.divide(0.0d, (double) (byte) -1);
        double[] doubleArray41 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double42 = calculator25.sum(doubleArray41);
        double double43 = calculator24.sum(doubleArray41);
        double double44 = calculator19.Average(doubleArray41);
        double double45 = calculator3.subtract(doubleArray41);
        double double46 = calculator0.Average(doubleArray41);
        double double48 = calculator0.squareRoot((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.0d) + "'", double34 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 451.0d + "'", double42 == 451.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 451.0d + "'", double43 == 451.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 75.16666666666667d + "'", double44 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-251.0d) + "'", double45 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 75.16666666666667d + "'", double46 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double5 = calculator0.moduloOfTwoNum((double) (short) 1, 1.0d);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double16 = calculator13.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray23 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double24 = calculator13.Multiplication(doubleArray23);
        double double25 = calculator6.sum(doubleArray23);
        double double26 = calculator0.Average(doubleArray23);
        java.lang.Class<?> wildcardClass27 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 34.0d + "'", double25 == 34.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5.666666666666667d + "'", double26 == 5.666666666666667d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot((double) 100.0f);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double31 = calculator28.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double34 = calculator28.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        double double38 = calculator35.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray45 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double46 = calculator35.Multiplication(doubleArray45);
        double double47 = calculator28.sum(doubleArray45);
        double[] doubleArray52 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double53 = calculator28.subtract(doubleArray52);
        edu.hawaii.ics.Calculator calculator54 = new edu.hawaii.ics.Calculator();
        double double57 = calculator54.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double60 = calculator54.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator61 = new edu.hawaii.ics.Calculator();
        double double64 = calculator61.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray71 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double72 = calculator61.Multiplication(doubleArray71);
        double double73 = calculator54.sum(doubleArray71);
        double[] doubleArray78 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double79 = calculator54.subtract(doubleArray78);
        double double80 = calculator28.Multiplication(doubleArray78);
        double double81 = calculator0.subtract(doubleArray78);
        double double83 = calculator0.squareRoot(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 34.0d + "'", double47 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-108.0d) + "'", double53 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 34.0d + "'", double73 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-108.0d) + "'", double79 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1000.0d) + "'", double80 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-108.0d) + "'", double81 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 2.2227587494850775E-162d + "'", double83 == 2.2227587494850775E-162d);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double7 = calculator4.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double10 = calculator4.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double13 = calculator4.divide(0.0d, (double) (byte) -1);
        double[] doubleArray20 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double21 = calculator4.sum(doubleArray20);
        double double22 = calculator3.sum(doubleArray20);
        double double23 = calculator0.sum(doubleArray20);
        int int25 = calculator0.factorial((-2147483648));
        double double28 = calculator0.divide((double) 1, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 451.0d + "'", double21 == 451.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 451.0d + "'", double22 == 451.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        int int4 = calculator0.factorial((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3628800 + "'", int4 == 3628800);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot((-0.0049714956160500975d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.9E-324d + "'", double27 == 4.9E-324d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double3 = calculator1.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double7 = calculator4.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray14 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double15 = calculator4.Multiplication(doubleArray14);
        double double16 = calculator1.Multiplication(doubleArray14);
        double double18 = calculator1.squareRoot((-108.0d));
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double22 = calculator19.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double25 = calculator19.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double28 = calculator19.divide(0.0d, (double) (byte) -1);
        double[] doubleArray35 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double36 = calculator19.sum(doubleArray35);
        edu.hawaii.ics.Calculator calculator37 = new edu.hawaii.ics.Calculator();
        double double40 = calculator37.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double42 = calculator37.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double46 = calculator43.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray53 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double54 = calculator43.Multiplication(doubleArray53);
        double double55 = calculator37.subtract(doubleArray53);
        double double56 = calculator19.Average(doubleArray53);
        edu.hawaii.ics.Calculator calculator57 = new edu.hawaii.ics.Calculator();
        double double60 = calculator57.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray67 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double68 = calculator57.Multiplication(doubleArray67);
        double double69 = calculator19.sum(doubleArray67);
        double double70 = calculator1.Average(doubleArray67);
        double double71 = calculator0.Multiplication(doubleArray67);
        double double74 = calculator0.moduloOfTwoNum((-10.0d), 0.13303769401330376d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.9E-324d + "'", double3 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.0d) + "'", double28 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 451.0d + "'", double36 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.9E-324d + "'", double42 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-34.0d) + "'", double55 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 5.666666666666667d + "'", double56 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 34.0d + "'", double69 == 34.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 5.666666666666667d + "'", double70 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.02217294900222938d + "'", double74 == 0.02217294900222938d);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double15 = calculator13.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator13.Multiplication(doubleArray26);
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        double double32 = calculator29.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double35 = calculator29.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double38 = calculator29.divide(0.0d, (double) (byte) -1);
        double[] doubleArray45 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double46 = calculator29.sum(doubleArray45);
        double double47 = calculator13.sum(doubleArray45);
        double double48 = calculator0.Multiplication(doubleArray45);
        int int50 = calculator0.factorial((int) '4');
        edu.hawaii.ics.Calculator calculator51 = new edu.hawaii.ics.Calculator();
        double double54 = calculator51.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double56 = calculator51.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator57 = new edu.hawaii.ics.Calculator();
        double double60 = calculator57.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray67 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double68 = calculator57.Multiplication(doubleArray67);
        double double69 = calculator51.subtract(doubleArray67);
        double double70 = calculator0.subtract(doubleArray67);
        double double73 = calculator0.moduloOfTwoNum((-41.75827464497663d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.0d) + "'", double38 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 451.0d + "'", double46 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-5.2E9d) + "'", double48 == (-5.2E9d));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.9E-324d + "'", double56 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-34.0d) + "'", double69 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-34.0d) + "'", double70 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.7582746449766304d + "'", double73 == 0.7582746449766304d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        int int27 = calculator0.factorial((int) (short) 100);
        java.lang.Class<?> wildcardClass28 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        double double52 = calculator0.sum(doubleArray50);
        double double55 = calculator0.moduloOfTwoNum((double) (byte) 10, 0.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 110.0d + "'", double52 == 110.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.8790524691780774E-14d + "'", double55 == 1.8790524691780774E-14d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        double double7 = calculator0.divide((double) 1.0f, (double) 10L);
        double double10 = calculator0.moduloOfTwoNum((double) (byte) 0, 0.0049714956160500975d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1d + "'", double7 == 0.1d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray36 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double37 = calculator26.Multiplication(doubleArray36);
        double double38 = calculator0.subtract(doubleArray36);
        java.lang.Class<?> wildcardClass39 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-34.0d) + "'", double38 == (-34.0d));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        java.lang.Class<?> wildcardClass16 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        edu.hawaii.ics.Calculator calculator8 = new edu.hawaii.ics.Calculator();
        double double10 = calculator8.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator11 = new edu.hawaii.ics.Calculator();
        double double14 = calculator11.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray21 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double22 = calculator11.Multiplication(doubleArray21);
        double double23 = calculator8.Multiplication(doubleArray21);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double26 = calculator24.squareRoot((-1.0d));
        double double28 = calculator24.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator30 = new edu.hawaii.ics.Calculator();
        double double33 = calculator30.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double36 = calculator30.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double39 = calculator30.divide(0.0d, (double) (byte) -1);
        double[] doubleArray46 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double47 = calculator30.sum(doubleArray46);
        double double48 = calculator29.sum(doubleArray46);
        double double49 = calculator24.Average(doubleArray46);
        double double50 = calculator8.subtract(doubleArray46);
        double double51 = calculator0.subtract(doubleArray46);
        int int53 = calculator0.factorial((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.9E-324d + "'", double10 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.9E-324d + "'", double26 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.9E-324d + "'", double28 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-0.0d) + "'", double39 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 451.0d + "'", double48 == 451.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 75.16666666666667d + "'", double49 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-251.0d) + "'", double50 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-251.0d) + "'", double51 == (-251.0d));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double double12 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) 100);
        double double14 = calculator0.squareRoot((double) 0.0f);
        edu.hawaii.ics.Calculator calculator15 = new edu.hawaii.ics.Calculator();
        double double17 = calculator15.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator18 = new edu.hawaii.ics.Calculator();
        double double20 = calculator18.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        double double24 = calculator21.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray31 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double32 = calculator21.Multiplication(doubleArray31);
        double double33 = calculator18.Multiplication(doubleArray31);
        edu.hawaii.ics.Calculator calculator34 = new edu.hawaii.ics.Calculator();
        double double36 = calculator34.squareRoot((-1.0d));
        double double38 = calculator34.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator39 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator40 = new edu.hawaii.ics.Calculator();
        double double43 = calculator40.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double46 = calculator40.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double49 = calculator40.divide(0.0d, (double) (byte) -1);
        double[] doubleArray56 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double57 = calculator40.sum(doubleArray56);
        double double58 = calculator39.sum(doubleArray56);
        double double59 = calculator34.Average(doubleArray56);
        double double60 = calculator18.subtract(doubleArray56);
        double double61 = calculator15.Average(doubleArray56);
        double double62 = calculator0.Multiplication(doubleArray56);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.9E-324d + "'", double17 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.9E-324d + "'", double36 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.9E-324d + "'", double38 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-0.0d) + "'", double49 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 451.0d + "'", double57 == 451.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 451.0d + "'", double58 == 451.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 75.16666666666667d + "'", double59 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-251.0d) + "'", double60 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 75.16666666666667d + "'", double61 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-5.2E9d) + "'", double62 == (-5.2E9d));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        double double15 = calculator0.moduloOfTwoNum((double) (byte) 0, 5.666666666666667d);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double21 = calculator16.squareRoot((double) (byte) -1);
        double double23 = calculator16.squareRoot((double) '#');
        int int25 = calculator16.factorial((int) ' ');
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double28 = calculator26.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator30 = new edu.hawaii.ics.Calculator();
        double double33 = calculator30.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double36 = calculator30.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double39 = calculator30.divide(0.0d, (double) (byte) -1);
        double[] doubleArray46 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double47 = calculator30.sum(doubleArray46);
        double double48 = calculator29.sum(doubleArray46);
        double double49 = calculator26.sum(doubleArray46);
        double double50 = calculator16.sum(doubleArray46);
        double double51 = calculator0.sum(doubleArray46);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5.916079783099616d + "'", double23 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.9E-324d + "'", double28 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-0.0d) + "'", double39 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 451.0d + "'", double48 == 451.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 451.0d + "'", double49 == 451.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 451.0d + "'", double50 == 451.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 451.0d + "'", double51 == 451.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double16 = calculator13.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray23 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double24 = calculator13.Multiplication(doubleArray23);
        double double25 = calculator6.sum(doubleArray23);
        double[] doubleArray30 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double31 = calculator6.subtract(doubleArray30);
        double double32 = calculator0.sum(doubleArray30);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double38 = calculator33.squareRoot((double) (byte) -1);
        double double40 = calculator33.squareRoot((double) ' ');
        double double42 = calculator33.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double46 = calculator43.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double48 = calculator43.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator49 = new edu.hawaii.ics.Calculator();
        double double52 = calculator49.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray59 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double60 = calculator49.Multiplication(doubleArray59);
        double double61 = calculator43.subtract(doubleArray59);
        double double62 = calculator33.subtract(doubleArray59);
        double double63 = calculator0.subtract(doubleArray59);
        int int65 = calculator0.factorial((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.378414230005442d + "'", double5 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 34.0d + "'", double25 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-108.0d) + "'", double31 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 110.0d + "'", double32 == 110.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.9E-324d + "'", double38 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5.656854249492381d + "'", double40 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4.9E-324d + "'", double48 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-34.0d) + "'", double61 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-34.0d) + "'", double62 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-34.0d) + "'", double63 == (-34.0d));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double16 = calculator13.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray23 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double24 = calculator13.Multiplication(doubleArray23);
        double double25 = calculator6.sum(doubleArray23);
        double[] doubleArray30 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double31 = calculator6.subtract(doubleArray30);
        double double32 = calculator0.sum(doubleArray30);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double38 = calculator33.squareRoot((double) (byte) -1);
        double double40 = calculator33.squareRoot((double) ' ');
        double double42 = calculator33.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double46 = calculator43.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double48 = calculator43.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator49 = new edu.hawaii.ics.Calculator();
        double double52 = calculator49.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray59 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double60 = calculator49.Multiplication(doubleArray59);
        double double61 = calculator43.subtract(doubleArray59);
        double double62 = calculator33.subtract(doubleArray59);
        double double63 = calculator0.subtract(doubleArray59);
        java.lang.Class<?> wildcardClass64 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.378414230005442d + "'", double5 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 34.0d + "'", double25 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-108.0d) + "'", double31 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 110.0d + "'", double32 == 110.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.9E-324d + "'", double38 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 5.656854249492381d + "'", double40 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 4.9E-324d + "'", double48 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-34.0d) + "'", double61 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-34.0d) + "'", double62 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-34.0d) + "'", double63 == (-34.0d));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double double46 = calculator0.subtract(doubleArray43);
        java.lang.Class<?> wildcardClass47 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-34.0d) + "'", double46 == (-34.0d));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.divide((-0.0d), (double) 'a');
        double double6 = calculator0.divide(1.5422108254079407d, (double) (byte) 0);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double9 = calculator7.squareRoot((-1.0d));
        double double11 = calculator7.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double18 = calculator12.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double22 = calculator19.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray29 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double30 = calculator19.Multiplication(doubleArray29);
        double double31 = calculator12.sum(doubleArray29);
        double double32 = calculator7.Average(doubleArray29);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double35 = calculator33.squareRoot((-1.0d));
        double double37 = calculator33.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator38 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator39 = new edu.hawaii.ics.Calculator();
        double double42 = calculator39.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double45 = calculator39.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double48 = calculator39.divide(0.0d, (double) (byte) -1);
        double[] doubleArray55 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double56 = calculator39.sum(doubleArray55);
        double double57 = calculator38.sum(doubleArray55);
        double double58 = calculator33.Average(doubleArray55);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double64 = calculator59.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator65 = new edu.hawaii.ics.Calculator();
        double double68 = calculator65.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double71 = calculator65.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator72 = new edu.hawaii.ics.Calculator();
        double double75 = calculator72.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray82 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double83 = calculator72.Multiplication(doubleArray82);
        double double84 = calculator65.sum(doubleArray82);
        double[] doubleArray89 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double90 = calculator65.subtract(doubleArray89);
        double double91 = calculator59.sum(doubleArray89);
        double double92 = calculator33.sum(doubleArray89);
        double double93 = calculator7.Multiplication(doubleArray89);
        double double94 = calculator0.subtract(doubleArray89);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.9E-324d + "'", double6 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.9E-324d + "'", double9 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 34.0d + "'", double31 == 34.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 5.666666666666667d + "'", double32 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.9E-324d + "'", double35 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.9E-324d + "'", double37 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-0.0d) + "'", double48 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 451.0d + "'", double56 == 451.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 451.0d + "'", double57 == 451.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 75.16666666666667d + "'", double58 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2.378414230005442d + "'", double64 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 34.0d + "'", double84 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-108.0d) + "'", double90 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 110.0d + "'", double91 == 110.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 110.0d + "'", double92 == 110.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1000.0d) + "'", double93 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + (-108.0d) + "'", double94 == (-108.0d));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double double12 = calculator0.divide(2.378414230005442d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        int int27 = calculator0.factorial((int) (short) 100);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double31 = calculator28.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double34 = calculator28.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        double double37 = calculator35.squareRoot((-1.0d));
        double double39 = calculator35.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator40 = new edu.hawaii.ics.Calculator();
        double double43 = calculator40.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double46 = calculator40.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator47 = new edu.hawaii.ics.Calculator();
        double double50 = calculator47.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray57 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double58 = calculator47.Multiplication(doubleArray57);
        double double59 = calculator40.sum(doubleArray57);
        double double60 = calculator35.subtract(doubleArray57);
        double double61 = calculator28.subtract(doubleArray57);
        double double62 = calculator0.Average(doubleArray57);
        java.lang.Class<?> wildcardClass63 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.9E-324d + "'", double37 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 34.0d + "'", double59 == 34.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-34.0d) + "'", double60 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-34.0d) + "'", double61 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5.666666666666667d + "'", double62 == 5.666666666666667d);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) '#');
        double double10 = calculator0.divide((double) (-1.0f), (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.916079783099616d + "'", double7 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-0.019230769230769232d) + "'", double10 == (-0.019230769230769232d));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) '#');
        double double9 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator10 = new edu.hawaii.ics.Calculator();
        double double12 = calculator10.squareRoot((-1.0d));
        double double14 = calculator10.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator15 = new edu.hawaii.ics.Calculator();
        double double18 = calculator15.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double21 = calculator15.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray32 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double33 = calculator22.Multiplication(doubleArray32);
        double double34 = calculator15.sum(doubleArray32);
        double double35 = calculator10.Average(doubleArray32);
        edu.hawaii.ics.Calculator calculator36 = new edu.hawaii.ics.Calculator();
        double double38 = calculator36.squareRoot((-1.0d));
        double double40 = calculator36.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator41 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator42 = new edu.hawaii.ics.Calculator();
        double double45 = calculator42.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double48 = calculator42.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double51 = calculator42.divide(0.0d, (double) (byte) -1);
        double[] doubleArray58 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double59 = calculator42.sum(doubleArray58);
        double double60 = calculator41.sum(doubleArray58);
        double double61 = calculator36.Average(doubleArray58);
        edu.hawaii.ics.Calculator calculator62 = new edu.hawaii.ics.Calculator();
        double double65 = calculator62.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double67 = calculator62.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator68 = new edu.hawaii.ics.Calculator();
        double double71 = calculator68.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double74 = calculator68.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator75 = new edu.hawaii.ics.Calculator();
        double double78 = calculator75.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray85 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double86 = calculator75.Multiplication(doubleArray85);
        double double87 = calculator68.sum(doubleArray85);
        double[] doubleArray92 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double93 = calculator68.subtract(doubleArray92);
        double double94 = calculator62.sum(doubleArray92);
        double double95 = calculator36.sum(doubleArray92);
        double double96 = calculator10.Multiplication(doubleArray92);
        double double97 = calculator0.Average(doubleArray92);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.916079783099616d + "'", double7 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.9E-324d + "'", double9 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 34.0d + "'", double34 == 34.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 5.666666666666667d + "'", double35 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.9E-324d + "'", double38 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.9E-324d + "'", double40 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-0.0d) + "'", double51 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 451.0d + "'", double59 == 451.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 451.0d + "'", double60 == 451.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 75.16666666666667d + "'", double61 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 2.378414230005442d + "'", double67 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 34.0d + "'", double87 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-108.0d) + "'", double93 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 110.0d + "'", double94 == 110.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 110.0d + "'", double95 == 110.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + (-1000.0d) + "'", double96 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 27.5d + "'", double97 == 27.5d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double double46 = calculator0.subtract(doubleArray43);
        int int48 = calculator0.factorial((int) (short) -1);
        java.lang.Class<?> wildcardClass49 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-34.0d) + "'", double46 == (-34.0d));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double28 = calculator0.moduloOfTwoNum(10.0d, 110.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double5 = calculator0.moduloOfTwoNum((double) (short) 1, 1.0d);
        double double8 = calculator0.moduloOfTwoNum(0.52d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.52d + "'", double8 == 0.52d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        double double7 = calculator0.moduloOfTwoNum((double) (byte) 10, 5.666666666666667d);
        int int9 = calculator0.factorial((-1));
        java.lang.Class<?> wildcardClass10 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.333333333333333d + "'", double7 == 4.333333333333333d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double4 = calculator1.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double7 = calculator1.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator8 = new edu.hawaii.ics.Calculator();
        double double11 = calculator8.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray18 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double19 = calculator8.Multiplication(doubleArray18);
        double double20 = calculator1.sum(doubleArray18);
        double[] doubleArray25 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double26 = calculator1.subtract(doubleArray25);
        edu.hawaii.ics.Calculator calculator27 = new edu.hawaii.ics.Calculator();
        double double30 = calculator27.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double33 = calculator27.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator34 = new edu.hawaii.ics.Calculator();
        double double37 = calculator34.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray44 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double45 = calculator34.Multiplication(doubleArray44);
        double double46 = calculator27.sum(doubleArray44);
        double double47 = calculator1.subtract(doubleArray44);
        edu.hawaii.ics.Calculator calculator48 = new edu.hawaii.ics.Calculator();
        double double50 = calculator48.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator51 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double61 = calculator52.divide(0.0d, (double) (byte) -1);
        double[] doubleArray68 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double69 = calculator52.sum(doubleArray68);
        double double70 = calculator51.sum(doubleArray68);
        double double71 = calculator48.sum(doubleArray68);
        double double72 = calculator1.Average(doubleArray68);
        double double73 = calculator0.subtract(doubleArray68);
        double double76 = calculator0.moduloOfTwoNum((-108.0d), 0.5916079783099616d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 34.0d + "'", double20 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-108.0d) + "'", double26 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 34.0d + "'", double46 == 34.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-34.0d) + "'", double47 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 4.9E-324d + "'", double50 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-0.0d) + "'", double61 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 451.0d + "'", double69 == 451.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 451.0d + "'", double70 == 451.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 451.0d + "'", double71 == 451.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 75.16666666666667d + "'", double72 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-251.0d) + "'", double73 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.3273479475867742d + "'", double76 == 0.3273479475867742d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) '#');
        int int9 = calculator0.factorial((int) ' ');
        int int11 = calculator0.factorial(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.916079783099616d + "'", double7 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) '4');
        double double10 = calculator0.moduloOfTwoNum(0.1d, 0.0d);
        edu.hawaii.ics.Calculator calculator11 = new edu.hawaii.ics.Calculator();
        double double13 = calculator11.squareRoot((-1.0d));
        double double15 = calculator11.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator17 = new edu.hawaii.ics.Calculator();
        double double20 = calculator17.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double23 = calculator17.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double26 = calculator17.divide(0.0d, (double) (byte) -1);
        double[] doubleArray33 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double34 = calculator17.sum(doubleArray33);
        double double35 = calculator16.sum(doubleArray33);
        double double36 = calculator11.Average(doubleArray33);
        double double37 = calculator0.sum(doubleArray33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.211102550927978d + "'", double7 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.9E-324d + "'", double10 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.9E-324d + "'", double13 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-0.0d) + "'", double26 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 451.0d + "'", double34 == 451.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 451.0d + "'", double35 == 451.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 75.16666666666667d + "'", double36 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 451.0d + "'", double37 == 451.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) '4');
        edu.hawaii.ics.Calculator calculator8 = new edu.hawaii.ics.Calculator();
        double double10 = calculator8.squareRoot((-1.0d));
        double double12 = calculator8.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double16 = calculator13.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double19 = calculator13.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double22 = calculator13.divide(0.0d, (double) (byte) -1);
        double[] doubleArray29 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double30 = calculator13.sum(doubleArray29);
        double double31 = calculator8.sum(doubleArray29);
        double double32 = calculator0.subtract(doubleArray29);
        double double35 = calculator0.divide(7.211102550927978d, (-5.2E9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.211102550927978d + "'", double7 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.9E-324d + "'", double10 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-0.0d) + "'", double22 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 451.0d + "'", double30 == 451.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 451.0d + "'", double31 == 451.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-251.0d) + "'", double32 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.3867504905630727E-9d) + "'", double35 == (-1.3867504905630727E-9d));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray10 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double11 = calculator0.Multiplication(doubleArray10);
        int int13 = calculator0.factorial((int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double5 = calculator3.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator3.Multiplication(doubleArray16);
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double21 = calculator19.squareRoot((-1.0d));
        double double23 = calculator19.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator25 = new edu.hawaii.ics.Calculator();
        double double28 = calculator25.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double31 = calculator25.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double34 = calculator25.divide(0.0d, (double) (byte) -1);
        double[] doubleArray41 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double42 = calculator25.sum(doubleArray41);
        double double43 = calculator24.sum(doubleArray41);
        double double44 = calculator19.Average(doubleArray41);
        double double45 = calculator3.subtract(doubleArray41);
        double double46 = calculator0.Average(doubleArray41);
        double[] doubleArray52 = new double[] { 2.0d, 2.0d, 100.0d, (byte) 100, 0.3273479475867742d };
        double double53 = calculator0.subtract(doubleArray52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.9E-324d + "'", double21 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.9E-324d + "'", double23 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-0.0d) + "'", double34 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 451.0d + "'", double42 == 451.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 451.0d + "'", double43 == 451.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 75.16666666666667d + "'", double44 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-251.0d) + "'", double45 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 75.16666666666667d + "'", double46 == 75.16666666666667d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 2.0d, 2.0d, 100.0d, 100.0d, 0.3273479475867742d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-200.3273479475868d) + "'", double53 == (-200.3273479475868d));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator0.subtract(doubleArray16);
        double double21 = calculator0.divide((double) (short) 0, (double) (byte) 100);
        double double24 = calculator0.moduloOfTwoNum((double) 0, (-0.029411764705882353d));
        java.lang.Class<?> wildcardClass25 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-34.0d) + "'", double18 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        double double15 = calculator0.moduloOfTwoNum((double) (byte) 0, 5.666666666666667d);
        int int17 = calculator0.factorial((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        int int2 = calculator0.factorial((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double7 = calculator4.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double10 = calculator4.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double13 = calculator4.divide(0.0d, (double) (byte) -1);
        double[] doubleArray20 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double21 = calculator4.sum(doubleArray20);
        double double22 = calculator3.sum(doubleArray20);
        double double23 = calculator0.sum(doubleArray20);
        int int25 = calculator0.factorial(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 451.0d + "'", double21 == 451.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 451.0d + "'", double22 == 451.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double15 = calculator13.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator13.Multiplication(doubleArray26);
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        double double32 = calculator29.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double35 = calculator29.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double38 = calculator29.divide(0.0d, (double) (byte) -1);
        double[] doubleArray45 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double46 = calculator29.sum(doubleArray45);
        double double47 = calculator13.sum(doubleArray45);
        double double48 = calculator0.Multiplication(doubleArray45);
        double double51 = calculator0.moduloOfTwoNum(5.666666666666667d, 0.3273479475867742d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.0d) + "'", double38 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 451.0d + "'", double46 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-5.2E9d) + "'", double48 == (-5.2E9d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.10175155769150779d + "'", double51 == 0.10175155769150779d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        double double18 = calculator0.divide((double) (byte) 10, 75.16666666666667d);
        java.lang.Class<?> wildcardClass19 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13303769401330376d + "'", double18 == 0.13303769401330376d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double30 = calculator28.squareRoot((-1.0d));
        double double32 = calculator28.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator34 = new edu.hawaii.ics.Calculator();
        double double37 = calculator34.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double40 = calculator34.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double43 = calculator34.divide(0.0d, (double) (byte) -1);
        double[] doubleArray50 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double51 = calculator34.sum(doubleArray50);
        double double52 = calculator33.sum(doubleArray50);
        double double53 = calculator28.Average(doubleArray50);
        double double54 = calculator0.subtract(doubleArray50);
        double[] doubleArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double56 = calculator0.Average(doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.378414230005442d + "'", double27 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.9E-324d + "'", double30 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.9E-324d + "'", double32 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.0d) + "'", double43 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 451.0d + "'", double51 == 451.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 451.0d + "'", double52 == 451.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 75.16666666666667d + "'", double53 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-251.0d) + "'", double54 == (-251.0d));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot(5.656854249492381d);
        double double29 = calculator0.squareRoot(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.378414230005442d + "'", double27 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 2.378414230005442d + "'", double29 == 2.378414230005442d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        double double7 = calculator0.moduloOfTwoNum((double) (byte) 10, 5.666666666666667d);
        int int9 = calculator0.factorial((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.333333333333333d + "'", double7 == 4.333333333333333d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double22 = calculator16.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double25 = calculator16.divide(0.0d, (double) (byte) -1);
        double[] doubleArray32 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double33 = calculator16.sum(doubleArray32);
        double double34 = calculator0.sum(doubleArray32);
        double double37 = calculator0.divide((-25.1d), (double) (short) -1);
        edu.hawaii.ics.Calculator calculator38 = new edu.hawaii.ics.Calculator();
        double double40 = calculator38.squareRoot((-1.0d));
        double double42 = calculator38.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double46 = calculator43.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double49 = calculator43.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray60 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double61 = calculator50.Multiplication(doubleArray60);
        double double62 = calculator43.sum(doubleArray60);
        double[] doubleArray67 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double68 = calculator43.subtract(doubleArray67);
        edu.hawaii.ics.Calculator calculator69 = new edu.hawaii.ics.Calculator();
        double double72 = calculator69.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray79 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double80 = calculator69.Multiplication(doubleArray79);
        double double81 = calculator43.subtract(doubleArray79);
        double double82 = calculator38.sum(doubleArray79);
        double double83 = calculator0.Multiplication(doubleArray79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.0d) + "'", double25 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 451.0d + "'", double33 == 451.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 451.0d + "'", double34 == 451.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 25.1d + "'", double37 == 25.1d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.9E-324d + "'", double40 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.9E-324d + "'", double42 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 34.0d + "'", double62 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-108.0d) + "'", double68 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-34.0d) + "'", double81 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 34.0d + "'", double82 == 34.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double35 = calculator26.divide(0.0d, (double) (byte) -1);
        double[] doubleArray42 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double43 = calculator26.sum(doubleArray42);
        edu.hawaii.ics.Calculator calculator44 = new edu.hawaii.ics.Calculator();
        double double47 = calculator44.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double49 = calculator44.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray60 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double61 = calculator50.Multiplication(doubleArray60);
        double double62 = calculator44.subtract(doubleArray60);
        double double63 = calculator26.Average(doubleArray60);
        edu.hawaii.ics.Calculator calculator64 = new edu.hawaii.ics.Calculator();
        double double67 = calculator64.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray74 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double75 = calculator64.Multiplication(doubleArray74);
        double double76 = calculator26.sum(doubleArray74);
        double double77 = calculator0.Average(doubleArray74);
        edu.hawaii.ics.Calculator calculator78 = new edu.hawaii.ics.Calculator();
        double double81 = calculator78.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray88 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double89 = calculator78.Multiplication(doubleArray88);
        double double90 = calculator0.sum(doubleArray88);
        int int92 = calculator0.factorial((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 451.0d + "'", double43 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.9E-324d + "'", double49 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-34.0d) + "'", double62 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 5.666666666666667d + "'", double63 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 34.0d + "'", double76 == 34.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 5.666666666666667d + "'", double77 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 34.0d + "'", double90 == 34.0d);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-2147483648) + "'", int92 == (-2147483648));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum((-0.0049714956160500975d), (double) 100.0f);
        double double15 = calculator0.moduloOfTwoNum(100.0d, 1.0d);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double18 = calculator16.squareRoot((-1.0d));
        double double20 = calculator16.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        double double40 = calculator21.sum(doubleArray38);
        double double41 = calculator16.Average(doubleArray38);
        int int43 = calculator16.factorial((int) (short) 100);
        edu.hawaii.ics.Calculator calculator44 = new edu.hawaii.ics.Calculator();
        double double47 = calculator44.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double50 = calculator44.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator51 = new edu.hawaii.ics.Calculator();
        double double53 = calculator51.squareRoot((-1.0d));
        double double55 = calculator51.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator56 = new edu.hawaii.ics.Calculator();
        double double59 = calculator56.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double62 = calculator56.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator63 = new edu.hawaii.ics.Calculator();
        double double66 = calculator63.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray73 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double74 = calculator63.Multiplication(doubleArray73);
        double double75 = calculator56.sum(doubleArray73);
        double double76 = calculator51.subtract(doubleArray73);
        double double77 = calculator44.subtract(doubleArray73);
        double double78 = calculator16.Average(doubleArray73);
        double double79 = calculator0.subtract(doubleArray73);
        java.lang.Class<?> wildcardClass80 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0049714956160500975d + "'", double12 == 0.0049714956160500975d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 451.0d + "'", double40 == 451.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 75.16666666666667d + "'", double41 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.9E-324d + "'", double53 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 34.0d + "'", double75 == 34.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-34.0d) + "'", double76 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-34.0d) + "'", double77 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 5.666666666666667d + "'", double78 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-34.0d) + "'", double79 == (-34.0d));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator0.subtract(doubleArray16);
        double double21 = calculator0.divide((double) (short) 0, (double) (byte) 100);
        double double24 = calculator0.moduloOfTwoNum((double) 0, (-0.029411764705882353d));
        double double27 = calculator0.divide(0.3273479475867742d, 6.255666837936304d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-34.0d) + "'", double18 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.05232822592175701d + "'", double27 == 0.05232822592175701d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double18 = calculator16.squareRoot((-1.0d));
        double double20 = calculator16.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        double double40 = calculator21.sum(doubleArray38);
        double double41 = calculator16.Average(doubleArray38);
        double double42 = calculator0.subtract(doubleArray38);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator44 = new edu.hawaii.ics.Calculator();
        double double47 = calculator44.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double50 = calculator44.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double53 = calculator44.divide(0.0d, (double) (byte) -1);
        double[] doubleArray60 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double61 = calculator44.sum(doubleArray60);
        double double62 = calculator43.sum(doubleArray60);
        double double63 = calculator0.sum(doubleArray60);
        double double65 = calculator0.squareRoot(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 451.0d + "'", double40 == 451.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 75.16666666666667d + "'", double41 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-251.0d) + "'", double42 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-0.0d) + "'", double53 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 451.0d + "'", double61 == 451.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 451.0d + "'", double62 == 451.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 451.0d + "'", double63 == 451.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double9 = calculator0.divide(0.0d, (double) (byte) -1);
        double[] doubleArray16 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double17 = calculator0.sum(doubleArray16);
        double double20 = calculator0.moduloOfTwoNum(110.0d, 0.0049714956160500975d);
        double double23 = calculator0.moduloOfTwoNum(2.378414230005442d, (-25.1d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-0.0d) + "'", double9 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 451.0d + "'", double17 == 451.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.879993190313793E-4d + "'", double20 == 6.879993190313793E-4d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 2.378414230005442d + "'", double23 == 2.378414230005442d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double58 = calculator52.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator59 = new edu.hawaii.ics.Calculator();
        double double62 = calculator59.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray69 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double70 = calculator59.Multiplication(doubleArray69);
        double double71 = calculator52.sum(doubleArray69);
        double double72 = calculator26.subtract(doubleArray69);
        double double73 = calculator0.Average(doubleArray69);
        double[] doubleArray78 = new double[] { 34.0d, 10, (byte) 100, (-108.0d) };
        double double79 = calculator0.Average(doubleArray78);
        double double82 = calculator0.moduloOfTwoNum(0.52d, 0.52d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 34.0d + "'", double71 == 34.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-34.0d) + "'", double72 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 5.666666666666667d + "'", double73 == 5.666666666666667d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 34.0d, 10.0d, 100.0d, (-108.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 9.0d + "'", double79 == 9.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        double double7 = calculator0.moduloOfTwoNum((double) (byte) 10, 5.666666666666667d);
        double double10 = calculator0.divide((double) '4', (double) 100);
        double double12 = calculator0.squareRoot(4.333333333333333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.333333333333333d + "'", double7 == 4.333333333333333d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.52d + "'", double10 == 0.52d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0816659994661326d + "'", double12 == 2.0816659994661326d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        int int27 = calculator0.factorial((int) (short) 100);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double31 = calculator28.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double34 = calculator28.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        double double37 = calculator35.squareRoot((-1.0d));
        double double39 = calculator35.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator40 = new edu.hawaii.ics.Calculator();
        double double43 = calculator40.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double46 = calculator40.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator47 = new edu.hawaii.ics.Calculator();
        double double50 = calculator47.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray57 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double58 = calculator47.Multiplication(doubleArray57);
        double double59 = calculator40.sum(doubleArray57);
        double double60 = calculator35.subtract(doubleArray57);
        double double61 = calculator28.subtract(doubleArray57);
        double double62 = calculator0.Average(doubleArray57);
        double double64 = calculator0.squareRoot(1.0d);
        edu.hawaii.ics.Calculator calculator65 = new edu.hawaii.ics.Calculator();
        double double68 = calculator65.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double71 = calculator65.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator72 = new edu.hawaii.ics.Calculator();
        double double75 = calculator72.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray82 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double83 = calculator72.Multiplication(doubleArray82);
        double double84 = calculator65.sum(doubleArray82);
        double double85 = calculator0.sum(doubleArray82);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.9E-324d + "'", double37 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 34.0d + "'", double59 == 34.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-34.0d) + "'", double60 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-34.0d) + "'", double61 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 5.666666666666667d + "'", double62 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 34.0d + "'", double84 == 34.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 34.0d + "'", double85 == 34.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        double double28 = calculator0.moduloOfTwoNum(0.0d, 2.378414230005442d);
        double double31 = calculator0.divide((-1.3867504905630727E-9d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 4.9E-324d + "'", double31 == 4.9E-324d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double9 = calculator7.squareRoot((-1.0d));
        double double11 = calculator7.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double18 = calculator12.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double22 = calculator19.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray29 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double30 = calculator19.Multiplication(doubleArray29);
        double double31 = calculator12.sum(doubleArray29);
        double double32 = calculator7.subtract(doubleArray29);
        double double33 = calculator0.subtract(doubleArray29);
        double double36 = calculator0.moduloOfTwoNum(4.9E-324d, 0.0d);
        double double38 = calculator0.squareRoot(1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.9E-324d + "'", double9 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 34.0d + "'", double31 == 34.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-34.0d) + "'", double32 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-34.0d) + "'", double33 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.9E-324d + "'", double36 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double18 = calculator16.squareRoot((-1.0d));
        double double20 = calculator16.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        double double40 = calculator21.sum(doubleArray38);
        double double41 = calculator16.Average(doubleArray38);
        double double42 = calculator0.subtract(doubleArray38);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double46 = calculator43.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double49 = calculator43.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray60 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double61 = calculator50.Multiplication(doubleArray60);
        double double62 = calculator43.sum(doubleArray60);
        double[] doubleArray67 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double68 = calculator43.subtract(doubleArray67);
        edu.hawaii.ics.Calculator calculator69 = new edu.hawaii.ics.Calculator();
        double double72 = calculator69.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double75 = calculator69.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator76 = new edu.hawaii.ics.Calculator();
        double double79 = calculator76.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray86 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double87 = calculator76.Multiplication(doubleArray86);
        double double88 = calculator69.sum(doubleArray86);
        double double89 = calculator43.subtract(doubleArray86);
        double double90 = calculator0.sum(doubleArray86);
        java.lang.Class<?> wildcardClass91 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 451.0d + "'", double40 == 451.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 75.16666666666667d + "'", double41 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-251.0d) + "'", double42 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 34.0d + "'", double62 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-108.0d) + "'", double68 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 34.0d + "'", double88 == 34.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + (-34.0d) + "'", double89 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 34.0d + "'", double90 == 34.0d);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator0.subtract(doubleArray16);
        double double21 = calculator0.divide((double) (short) 0, (double) (byte) 100);
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double27 = calculator22.squareRoot((double) (byte) -1);
        double double29 = calculator22.squareRoot((double) '#');
        int int31 = calculator22.factorial((int) ' ');
        edu.hawaii.ics.Calculator calculator32 = new edu.hawaii.ics.Calculator();
        double double34 = calculator32.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator35 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator36 = new edu.hawaii.ics.Calculator();
        double double39 = calculator36.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double42 = calculator36.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double45 = calculator36.divide(0.0d, (double) (byte) -1);
        double[] doubleArray52 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double53 = calculator36.sum(doubleArray52);
        double double54 = calculator35.sum(doubleArray52);
        double double55 = calculator32.sum(doubleArray52);
        double double56 = calculator22.sum(doubleArray52);
        double double57 = calculator0.sum(doubleArray52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-34.0d) + "'", double18 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.9E-324d + "'", double27 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 5.916079783099616d + "'", double29 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2147483648) + "'", int31 == (-2147483648));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.9E-324d + "'", double34 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.0d) + "'", double45 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 451.0d + "'", double53 == 451.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 451.0d + "'", double54 == 451.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 451.0d + "'", double55 == 451.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 451.0d + "'", double56 == 451.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 451.0d + "'", double57 == 451.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator0.subtract(doubleArray16);
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double22 = calculator19.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double25 = calculator19.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray36 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double37 = calculator26.Multiplication(doubleArray36);
        double double38 = calculator19.sum(doubleArray36);
        double[] doubleArray43 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double44 = calculator19.subtract(doubleArray43);
        edu.hawaii.ics.Calculator calculator45 = new edu.hawaii.ics.Calculator();
        double double48 = calculator45.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double51 = calculator45.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator52 = new edu.hawaii.ics.Calculator();
        double double55 = calculator52.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray62 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double63 = calculator52.Multiplication(doubleArray62);
        double double64 = calculator45.sum(doubleArray62);
        double[] doubleArray69 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double70 = calculator45.subtract(doubleArray69);
        double double71 = calculator19.Multiplication(doubleArray69);
        double double72 = calculator0.subtract(doubleArray69);
        double double75 = calculator0.moduloOfTwoNum(6.879993190313793E-4d, 0.52d);
        double double77 = calculator0.squareRoot((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-34.0d) + "'", double18 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 34.0d + "'", double38 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-108.0d) + "'", double44 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 34.0d + "'", double64 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-108.0d) + "'", double70 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1000.0d) + "'", double71 == (-1000.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + (-108.0d) + "'", double72 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 6.879993190313793E-4d + "'", double75 == 6.879993190313793E-4d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 4.9E-324d + "'", double77 == 4.9E-324d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot(5.656854249492381d);
        java.lang.Class<?> wildcardClass6 = calculator0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.378414230005442d + "'", double5 == 2.378414230005442d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator10 = new edu.hawaii.ics.Calculator();
        double double13 = calculator10.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double15 = calculator10.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator10.subtract(doubleArray26);
        double double29 = calculator0.subtract(doubleArray26);
        double double32 = calculator0.divide((-0.029411764705882353d), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-34.0d) + "'", double28 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-34.0d) + "'", double29 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.9E-324d + "'", double32 == 4.9E-324d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double6 = calculator0.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator7 = new edu.hawaii.ics.Calculator();
        double double10 = calculator7.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray17 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double18 = calculator7.Multiplication(doubleArray17);
        double double19 = calculator0.sum(doubleArray17);
        double[] doubleArray24 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double25 = calculator0.subtract(doubleArray24);
        java.lang.Class<?> wildcardClass26 = doubleArray24.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 34.0d + "'", double19 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-108.0d) + "'", double25 == (-108.0d));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        double double7 = calculator0.divide((double) 1.0f, (double) 10L);
        edu.hawaii.ics.Calculator calculator8 = new edu.hawaii.ics.Calculator();
        double double10 = calculator8.squareRoot((-1.0d));
        double double13 = calculator8.moduloOfTwoNum((double) (short) 1, 1.0d);
        edu.hawaii.ics.Calculator calculator14 = new edu.hawaii.ics.Calculator();
        double double17 = calculator14.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double20 = calculator14.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        double double24 = calculator21.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray31 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double32 = calculator21.Multiplication(doubleArray31);
        double double33 = calculator14.sum(doubleArray31);
        double double34 = calculator8.Average(doubleArray31);
        double double35 = calculator0.subtract(doubleArray31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1d + "'", double7 == 0.1d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.9E-324d + "'", double10 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 34.0d + "'", double33 == 34.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 5.666666666666667d + "'", double34 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-34.0d) + "'", double35 == (-34.0d));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        double double14 = calculator0.squareRoot((-108.0d));
        double double17 = calculator0.moduloOfTwoNum((-0.0049714956160500975d), 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.9E-324d + "'", double14 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0049714956160500975d + "'", double17 == 0.0049714956160500975d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double22 = calculator16.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double25 = calculator16.divide(0.0d, (double) (byte) -1);
        double[] doubleArray32 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double33 = calculator16.sum(doubleArray32);
        double double34 = calculator0.sum(doubleArray32);
        double double37 = calculator0.divide((-25.1d), (double) (short) -1);
        double double39 = calculator0.squareRoot(0.3273479475867742d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-0.0d) + "'", double25 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 451.0d + "'", double33 == 451.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 451.0d + "'", double34 == 451.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 25.1d + "'", double37 == 25.1d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.572143292879305d + "'", double39 == 0.572143292879305d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double35 = calculator26.divide(0.0d, (double) (byte) -1);
        double[] doubleArray42 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double43 = calculator26.sum(doubleArray42);
        edu.hawaii.ics.Calculator calculator44 = new edu.hawaii.ics.Calculator();
        double double47 = calculator44.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double49 = calculator44.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray60 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double61 = calculator50.Multiplication(doubleArray60);
        double double62 = calculator44.subtract(doubleArray60);
        double double63 = calculator26.Average(doubleArray60);
        edu.hawaii.ics.Calculator calculator64 = new edu.hawaii.ics.Calculator();
        double double67 = calculator64.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray74 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double75 = calculator64.Multiplication(doubleArray74);
        double double76 = calculator26.sum(doubleArray74);
        double double77 = calculator0.Average(doubleArray74);
        edu.hawaii.ics.Calculator calculator78 = new edu.hawaii.ics.Calculator();
        double double81 = calculator78.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray88 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double89 = calculator78.Multiplication(doubleArray88);
        double double90 = calculator0.sum(doubleArray88);
        double double92 = calculator0.squareRoot((double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-0.0d) + "'", double35 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 451.0d + "'", double43 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 4.9E-324d + "'", double49 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-34.0d) + "'", double62 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 5.666666666666667d + "'", double63 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 34.0d + "'", double76 == 34.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 5.666666666666667d + "'", double77 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 34.0d + "'", double90 == 34.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 9.848857801796104d + "'", double92 == 9.848857801796104d);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.divide((-0.0d), (double) 'a');
        double double6 = calculator0.divide(5.666666666666667d, 2.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.8333333333333335d + "'", double6 == 2.8333333333333335d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator12 = new edu.hawaii.ics.Calculator();
        double double15 = calculator12.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray22 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double23 = calculator12.Multiplication(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        double double27 = calculator0.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator28 = new edu.hawaii.ics.Calculator();
        double double30 = calculator28.squareRoot((-1.0d));
        double double32 = calculator28.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator34 = new edu.hawaii.ics.Calculator();
        double double37 = calculator34.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double40 = calculator34.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double43 = calculator34.divide(0.0d, (double) (byte) -1);
        double[] doubleArray50 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double51 = calculator34.sum(doubleArray50);
        double double52 = calculator33.sum(doubleArray50);
        double double53 = calculator28.Average(doubleArray50);
        edu.hawaii.ics.Calculator calculator54 = new edu.hawaii.ics.Calculator();
        double double57 = calculator54.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double59 = calculator54.squareRoot(5.656854249492381d);
        edu.hawaii.ics.Calculator calculator60 = new edu.hawaii.ics.Calculator();
        double double63 = calculator60.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double66 = calculator60.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator67 = new edu.hawaii.ics.Calculator();
        double double70 = calculator67.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray77 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double78 = calculator67.Multiplication(doubleArray77);
        double double79 = calculator60.sum(doubleArray77);
        double[] doubleArray84 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double85 = calculator60.subtract(doubleArray84);
        double double86 = calculator54.sum(doubleArray84);
        double double87 = calculator28.sum(doubleArray84);
        double double88 = calculator0.subtract(doubleArray84);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 34.0d + "'", double24 == 34.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 5.666666666666667d + "'", double25 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 2.378414230005442d + "'", double27 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.9E-324d + "'", double30 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.9E-324d + "'", double32 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-0.0d) + "'", double43 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 451.0d + "'", double51 == 451.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 451.0d + "'", double52 == 451.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 75.16666666666667d + "'", double53 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 2.378414230005442d + "'", double59 == 2.378414230005442d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 34.0d + "'", double79 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-108.0d) + "'", double85 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 110.0d + "'", double86 == 110.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 110.0d + "'", double87 == 110.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-108.0d) + "'", double88 == (-108.0d));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        double double12 = calculator0.moduloOfTwoNum(75.16666666666667d, 0.0d);
        edu.hawaii.ics.Calculator calculator13 = new edu.hawaii.ics.Calculator();
        double double15 = calculator13.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator13.Multiplication(doubleArray26);
        edu.hawaii.ics.Calculator calculator29 = new edu.hawaii.ics.Calculator();
        double double32 = calculator29.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double35 = calculator29.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double38 = calculator29.divide(0.0d, (double) (byte) -1);
        double[] doubleArray45 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double46 = calculator29.sum(doubleArray45);
        double double47 = calculator13.sum(doubleArray45);
        double double48 = calculator0.Multiplication(doubleArray45);
        int int50 = calculator0.factorial((int) '4');
        edu.hawaii.ics.Calculator calculator51 = new edu.hawaii.ics.Calculator();
        double double54 = calculator51.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double56 = calculator51.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator57 = new edu.hawaii.ics.Calculator();
        double double60 = calculator57.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray67 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double68 = calculator57.Multiplication(doubleArray67);
        double double69 = calculator51.subtract(doubleArray67);
        double double70 = calculator0.subtract(doubleArray67);
        double double73 = calculator0.divide((-0.019230769230769232d), 0.5916079783099616d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.9E-324d + "'", double12 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-0.0d) + "'", double38 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 451.0d + "'", double46 == 451.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 451.0d + "'", double47 == 451.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-5.2E9d) + "'", double48 == (-5.2E9d));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 4.9E-324d + "'", double56 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-34.0d) + "'", double69 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-34.0d) + "'", double70 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-0.032505932874173714d) + "'", double73 == (-0.032505932874173714d));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator3 = new edu.hawaii.ics.Calculator();
        double double6 = calculator3.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray13 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double14 = calculator3.Multiplication(doubleArray13);
        double double15 = calculator0.Multiplication(doubleArray13);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double18 = calculator16.squareRoot((-1.0d));
        double double20 = calculator16.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator21 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator22 = new edu.hawaii.ics.Calculator();
        double double25 = calculator22.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double28 = calculator22.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double31 = calculator22.divide(0.0d, (double) (byte) -1);
        double[] doubleArray38 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double39 = calculator22.sum(doubleArray38);
        double double40 = calculator21.sum(doubleArray38);
        double double41 = calculator16.Average(doubleArray38);
        double double42 = calculator0.subtract(doubleArray38);
        double double45 = calculator0.divide((-1000.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.9E-324d + "'", double20 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-0.0d) + "'", double31 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 451.0d + "'", double39 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 451.0d + "'", double40 == 451.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 75.16666666666667d + "'", double41 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-251.0d) + "'", double42 == (-251.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.9E-324d + "'", double45 == 4.9E-324d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray16 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double17 = calculator6.Multiplication(doubleArray16);
        double double18 = calculator0.subtract(doubleArray16);
        double double21 = calculator0.divide((double) (short) 0, (double) (byte) 100);
        double double23 = calculator0.squareRoot(34.0d);
        int int25 = calculator0.factorial(1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-34.0d) + "'", double18 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 5.830951894845301d + "'", double23 == 5.830951894845301d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum(9.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        double double8 = calculator5.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double11 = calculator5.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double14 = calculator5.divide(0.0d, (double) (byte) -1);
        double[] doubleArray21 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double22 = calculator5.sum(doubleArray21);
        double double23 = calculator0.sum(doubleArray21);
        edu.hawaii.ics.Calculator calculator24 = new edu.hawaii.ics.Calculator();
        double double27 = calculator24.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double30 = calculator24.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator31 = new edu.hawaii.ics.Calculator();
        double double34 = calculator31.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray41 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double42 = calculator31.Multiplication(doubleArray41);
        double double43 = calculator24.sum(doubleArray41);
        double[] doubleArray48 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double49 = calculator24.subtract(doubleArray48);
        edu.hawaii.ics.Calculator calculator50 = new edu.hawaii.ics.Calculator();
        double double53 = calculator50.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double56 = calculator50.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator57 = new edu.hawaii.ics.Calculator();
        double double60 = calculator57.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray67 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double68 = calculator57.Multiplication(doubleArray67);
        double double69 = calculator50.sum(doubleArray67);
        double double70 = calculator24.subtract(doubleArray67);
        double[] doubleArray77 = new double[] { 34.0d, 1.0f, (-1.0d), 0.5916079783099616d, (-0.0d), 75.16666666666667d };
        double double78 = calculator24.subtract(doubleArray77);
        double double79 = calculator0.Multiplication(doubleArray77);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-0.0d) + "'", double14 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 451.0d + "'", double22 == 451.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 34.0d + "'", double43 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-108.0d) + "'", double49 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 34.0d + "'", double69 == 34.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-34.0d) + "'", double70 == (-34.0d));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 34.0d, 1.0d, (-1.0d), 0.5916079783099616d, (-0.0d), 75.16666666666667d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-41.75827464497663d) + "'", double78 == (-41.75827464497663d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator1 = new edu.hawaii.ics.Calculator();
        double double3 = calculator1.squareRoot((-1.0d));
        edu.hawaii.ics.Calculator calculator4 = new edu.hawaii.ics.Calculator();
        double double7 = calculator4.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray14 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double15 = calculator4.Multiplication(doubleArray14);
        double double16 = calculator1.Multiplication(doubleArray14);
        double double18 = calculator1.squareRoot((-108.0d));
        edu.hawaii.ics.Calculator calculator19 = new edu.hawaii.ics.Calculator();
        double double22 = calculator19.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double25 = calculator19.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double28 = calculator19.divide(0.0d, (double) (byte) -1);
        double[] doubleArray35 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double36 = calculator19.sum(doubleArray35);
        edu.hawaii.ics.Calculator calculator37 = new edu.hawaii.ics.Calculator();
        double double40 = calculator37.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double42 = calculator37.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator43 = new edu.hawaii.ics.Calculator();
        double double46 = calculator43.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray53 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double54 = calculator43.Multiplication(doubleArray53);
        double double55 = calculator37.subtract(doubleArray53);
        double double56 = calculator19.Average(doubleArray53);
        edu.hawaii.ics.Calculator calculator57 = new edu.hawaii.ics.Calculator();
        double double60 = calculator57.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray67 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double68 = calculator57.Multiplication(doubleArray67);
        double double69 = calculator19.sum(doubleArray67);
        double double70 = calculator1.Average(doubleArray67);
        double double71 = calculator0.Multiplication(doubleArray67);
        edu.hawaii.ics.Calculator calculator72 = new edu.hawaii.ics.Calculator();
        double double75 = calculator72.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double78 = calculator72.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator79 = new edu.hawaii.ics.Calculator();
        double double82 = calculator79.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray89 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double90 = calculator79.Multiplication(doubleArray89);
        double double91 = calculator72.sum(doubleArray89);
        double[] doubleArray96 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double97 = calculator72.subtract(doubleArray96);
        double double98 = calculator0.subtract(doubleArray96);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.9E-324d + "'", double3 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.9E-324d + "'", double18 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-0.0d) + "'", double28 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 451.0d + "'", double36 == 451.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.9E-324d + "'", double42 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-34.0d) + "'", double55 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 5.666666666666667d + "'", double56 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 34.0d + "'", double69 == 34.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 5.666666666666667d + "'", double70 == 5.666666666666667d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 34.0d + "'", double91 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertArrayEquals(doubleArray96, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + (-108.0d) + "'", double97 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + (-108.0d) + "'", double98 == (-108.0d));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double2 = calculator0.squareRoot((-1.0d));
        double double4 = calculator0.squareRoot((double) (-1));
        edu.hawaii.ics.Calculator calculator5 = new edu.hawaii.ics.Calculator();
        edu.hawaii.ics.Calculator calculator6 = new edu.hawaii.ics.Calculator();
        double double9 = calculator6.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double12 = calculator6.moduloOfTwoNum((double) (byte) 1, (double) 1);
        double double15 = calculator6.divide(0.0d, (double) (byte) -1);
        double[] doubleArray22 = new double[] { 100, 100.0d, 100L, (-1), '4', (byte) 100 };
        double double23 = calculator6.sum(doubleArray22);
        double double24 = calculator5.sum(doubleArray22);
        double double25 = calculator0.Average(doubleArray22);
        edu.hawaii.ics.Calculator calculator26 = new edu.hawaii.ics.Calculator();
        double double29 = calculator26.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double32 = calculator26.moduloOfTwoNum((double) (byte) 1, (double) 1);
        edu.hawaii.ics.Calculator calculator33 = new edu.hawaii.ics.Calculator();
        double double36 = calculator33.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray43 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double44 = calculator33.Multiplication(doubleArray43);
        double double45 = calculator26.sum(doubleArray43);
        double[] doubleArray50 = new double[] { 1.0d, 100L, (-1L), (byte) 10 };
        double double51 = calculator26.subtract(doubleArray50);
        double double52 = calculator0.sum(doubleArray50);
        int int54 = calculator0.factorial((int) (byte) -1);
        edu.hawaii.ics.Calculator calculator55 = new edu.hawaii.ics.Calculator();
        double double58 = calculator55.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray65 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double66 = calculator55.Multiplication(doubleArray65);
        double double67 = calculator0.subtract(doubleArray65);
        double double70 = calculator0.divide(9.0d, 6.879993190313793E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.9E-324d + "'", double4 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.0d) + "'", double15 == (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 451.0d + "'", double23 == 451.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 451.0d + "'", double24 == 451.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 75.16666666666667d + "'", double25 == 75.16666666666667d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 34.0d + "'", double45 == 34.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-108.0d) + "'", double51 == (-108.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 110.0d + "'", double52 == 110.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-34.0d) + "'", double67 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 13081.408296553145d + "'", double70 == 13081.408296553145d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        edu.hawaii.ics.Calculator calculator0 = new edu.hawaii.ics.Calculator();
        double double3 = calculator0.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double5 = calculator0.squareRoot((double) (byte) -1);
        double double7 = calculator0.squareRoot((double) ' ');
        double double9 = calculator0.squareRoot((double) (short) 1);
        edu.hawaii.ics.Calculator calculator10 = new edu.hawaii.ics.Calculator();
        double double13 = calculator10.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double double15 = calculator10.squareRoot((double) (byte) -1);
        edu.hawaii.ics.Calculator calculator16 = new edu.hawaii.ics.Calculator();
        double double19 = calculator16.moduloOfTwoNum((double) 100L, (double) (byte) -1);
        double[] doubleArray26 = new double[] { (short) 0, (-0.0d), 0.0f, '#', 4.9E-324d, (-1L) };
        double double27 = calculator16.Multiplication(doubleArray26);
        double double28 = calculator10.subtract(doubleArray26);
        double double29 = calculator0.subtract(doubleArray26);
        double double32 = calculator0.moduloOfTwoNum((double) 100L, (-1.3867504905630727E-9d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.9E-324d + "'", double5 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.656854249492381d + "'", double7 == 5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.9E-324d + "'", double15 == 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, (-0.0d), 0.0d, 35.0d, 4.9E-324d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-34.0d) + "'", double28 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-34.0d) + "'", double29 == (-34.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 7.522861842721147E-10d + "'", double32 == 7.522861842721147E-10d);
    }
}

