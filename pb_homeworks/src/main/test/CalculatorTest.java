import less_2.Calculator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/***
 * Test.
 *
 * @author alavrinenko (mailto: alexandr.lavrinenko@gmail.com)
 * @version $Id$
 */
public class CalculatorTest {

    @Test
    public void mainMethodCheckAdd() {
        double operand1 = 15.5;
        double operand2 = 14.5;

        Calculator calc = new Calculator();
        Calculator.add(operand1,operand2);
        double expect = 30.0;
        assertThat(calc.getResult(), is(expect));
    }

    @Test
    public void mainMethodCheckSubtract() {
        double operand1 = 45.5;
        double operand2 = 15.5;

        Calculator calc = new Calculator();
        Calculator.subtract(operand1,operand2);
        double expect = 30.0;
        assertThat(calc.getResult(), is(expect));
    }

    @Test
    public void mainMethodCheckDiv() {
        double operand1 = 45.5;
        double operand2 = 5.0;

        Calculator calc = new Calculator();
        Calculator.div(operand1,operand2);
        double expect = 9.1;
        assertThat(calc.getResult(), is(expect));
    }

    @Test
    public void mainMethodCheckMultip() {
        double operand1 = 5.5;
        double operand2 = 10.0;

        Calculator calc = new Calculator();
        Calculator.multip(operand1,operand2);
        double expect = 55.0;
        assertThat(calc.getResult(), is(expect));
    }
}