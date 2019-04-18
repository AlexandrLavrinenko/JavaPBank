package less_8.lecture.s09logfilter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FilterTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FilterTest.class.getName());
        logger.setFilter(new MyFilter());

        logger.log(Level.SEVERE, "Hi, it's First Message!");
        logger.log(Level.SEVERE, "Hi, it's Second Message!");
    }
}
