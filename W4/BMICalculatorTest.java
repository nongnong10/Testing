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
        String bmi = bmiCalculator.calculateBMI(-1 , 1.5);
        assertEquals("Invalid value", bmi);
    }

    @Test
    public void test02() {
        String bmi = bmiCalculator.calculateBMI(50, 1.7);
        assertEquals("Thinness", bmi);
    }

    @Test
    public void test03() {
        String bmi = bmiCalculator.calculateBMI(50 , 1.5);
        assertEquals("Normal", bmi);
    }

    @Test
    public void test04() {
        String bmi = bmiCalculator.calculateBMI(60 , 1.5);
        assertEquals("Overweight", bmi);
    }

    @Test
    public void test05() {
        String bmi = bmiCalculator.calculateBMI(70 , 1.5);
        assertEquals("Obese Class I", bmi);
    }

    @Test
    public void test06() {
        String bmi = bmiCalculator.calculateBMI(75 , 1.4);
        assertEquals("Obese Class II", bmi);
    }

    @Test
    public void test07() {
        String bmi = bmiCalculator.calculateBMI(80 , 1.4);
        assertEquals("Obese Class III", bmi);
    }
}