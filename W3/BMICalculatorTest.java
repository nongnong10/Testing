import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BMICalculatorTest {
    private BMICalculator bmiCalculator;

    @Before
    public void setUp() {
        bmiCalculator = new BMICalculator();
    }

    @Test
    public void test01() {
        String bmi = bmiCalculator.calculateBMI(50, 0.0);
        assertEquals("Invalid value", bmi);
    }

    @Test
    public void test02() {
        String bmi = bmiCalculator.calculateBMI(50, 1.7);
        assertEquals("Thinness", bmi);
    }

    @Test
    public void test03() {
        String bmi = bmiCalculator.calculateBMI(70, 1.7);
        assertEquals("Normal", bmi);
    }

    @Test
    public void test04() {
        String bmi = bmiCalculator.calculateBMI(75, 1.6);
        assertEquals("Overweight", bmi);
    }

    @Test
    public void test05() {
        String bmi = bmiCalculator.calculateBMI(75, 1.5);
        assertEquals("Obese Class I", bmi);
    }

    @Test
    public void test06() {
        String bmi = bmiCalculator.calculateBMI(35, 1.0);
        assertEquals("Obese Class II", bmi);
    }

    @Test
    public void test07() {
        String bmi = bmiCalculator.calculateBMI(40, 1.0);
        assertEquals("Obese Class III", bmi);
    }

    @Test
    public void test08() {
        String bmi = bmiCalculator.calculateBMI(0, 1.5);
        assertEquals("Invalid value", bmi);
    }

    @Test
    public void test09() {
        String bmi = bmiCalculator.calculateBMI(151 , 1.5);
        assertEquals("Invalid value", bmi);
    }

    @Test
    public void test10() {
        String bmi = bmiCalculator.calculateBMI(60, 0.0);
        assertEquals("Invalid value", bmi);
    }

    @Test
    public void test11() {
        String bmi = bmiCalculator.calculateBMI(60, 3.1);
        assertEquals("Invalid value", bmi);
    }

    @Test
    public void test12() {
        String bmi = bmiCalculator.calculateBMI(45, 1.56);
        assertEquals("Thinness", bmi);
    }

    @Test
    public void test13() {
        String bmi = bmiCalculator.calculateBMI(62, 1.6);
        assertEquals("Normal", bmi);
    }

    @Test
    public void test14() {
        String bmi = bmiCalculator.calculateBMI(60, 1.5);
        assertEquals("Overweight", bmi);
    }


    @Test
    public void test15() {
        String bmi = bmiCalculator.calculateBMI(80, 1.55);
        assertEquals("Obese Class I", bmi);
    }


    @Test
    public void test16() {
        String bmi = bmiCalculator.calculateBMI(80, 1.45);
        assertEquals("Obese Class II", bmi);
    }

    @Test
    public void test17() {
        String bmi = bmiCalculator.calculateBMI(80, 1.4);
        assertEquals("Obese Class III", bmi);
    }


}
