import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        double[] values = {1.0, 2.0, 3.0};
        assertEquals(6.0, calculator.sum(values), 0.0001);
    }

    @Test
    public void testSubtract() {
        double[] values = {5.0, 2.0, 1.0};
        assertEquals(2.0, calculator.subtract(values), 0.0001);
    }

    @Test
    public void testMultiplication() {
        double[] values = {2.0, 3.0, 4.0};
        assertEquals(24.0, calculator.Multiplication(values), 0.0001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.0001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(Double.MIN_VALUE, calculator.divide(5.0, 0.0), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9.0), 0.0001);
    }

    @Test
    public void testSquareRootOfNegative() {
        assertEquals(Double.MIN_VALUE, calculator.squareRoot(-9.0), 0.0001);
    }

    @Test
    public void testModuloOfTwoNum() {
        assertEquals(1.0, calculator.moduloOfTwoNum(7.0, 3.0), 0.0001);
    }

    @Test
    public void testModuloOfTwoNumWithNegative() {
        assertEquals(1.0, calculator.moduloOfTwoNum(-7.0, 3.0), 0.0001);
    }

    @Test
    public void testModuloOfTwoNumByZero() {
        assertEquals(Double.MIN_VALUE, calculator.moduloOfTwoNum(7.0, 0.0), 0.0001);
    }

    @Test
    public void testAverage() {
        double[] values = {2.0, 4.0, 6.0};
        assertEquals(4.0, calculator.Average(values), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageEmptyArray() {
        double[] values = {};
        calculator.Average(values);
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        assertEquals(0, calculator.factorial(-5));
    }
}