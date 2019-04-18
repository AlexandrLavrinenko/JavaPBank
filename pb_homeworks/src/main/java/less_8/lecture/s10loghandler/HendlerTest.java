package less_8.lecture.s10loghandler;

import java.util.logging.*;

public class HendlerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HendlerTest.class.getName());
        logger.setUseParentHandlers(false);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        XMLFormatter xmlFormatter = new XMLFormatter();
        consoleHandler.setFormatter(xmlFormatter);

//      Текст в формате XML
//        StreamHandler streamHandler = new StreamHandler(System.out, xmlFormatter);
//      Обычный текст
        StreamHandler streamHandler = new StreamHandler(System.out, new SimpleFormatter());

        logger.addHandler(consoleHandler);
        logger.addHandler(streamHandler);

        logger.log(Level.INFO, "some message formatted in xml");
    }
}
