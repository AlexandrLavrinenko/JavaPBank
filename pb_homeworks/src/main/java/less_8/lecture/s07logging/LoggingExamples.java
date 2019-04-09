package less_8.lecture.s07logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExamples {

    private static final Logger LOGGER = Logger.getLogger(LoggingExamples.class.getName());

    public void doIt() {
        LOGGER.entering(getClass().getName(), "doIt");

        try {
            if (isSmthBad()) {
                throw new Exception("We have a problem...");
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error doing XYZ", e);
        }

        LOGGER.exiting(getClass().getName(), "doIt");
    }

    private boolean isSmthBad(){
        return true;
    }

    public static void main(String[] args) {
        LoggingExamples examples = new LoggingExamples();
        examples.doIt();
    }
}
