package less_2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IntervalTest {

    @Test
    public void intervalFrom0To14() {
        Interval.digit = 10;

        Interval.enterDigit();
        Interval.intervalDistribution();
        String expect = " входит в интервал [0 - 14]";
        assertThat(Interval.priznakInterval, is(expect));
    }
}