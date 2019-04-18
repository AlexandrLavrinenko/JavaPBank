package less_8.lecture.s11logconfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConfigTest {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger("");
        Logger logger1 = Logger.getLogger("com");
        Logger logger2 = Logger.getLogger("com.jencov");
        Logger logger3 = Logger.getLogger("com.jencov.web");

        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration(new FileInputStream(Paths
                .get("D:/projects/alavrinenko/JavaPBank/pb_homeworks/src/main/java/less_8/lecture/s11logconfig/logging.properties")
                .toFile()));

        logger.log(Level.INFO,"Root logger message");
        logger1.log(Level.INFO,"com logger message");
        logger2.log(Level.INFO,"com.jencov logger message");
        logger3.log(Level.INFO,"com.jencov.web logger message");

        logger.log(Level.WARNING, "!! Root logger message");
        logger1.log(Level.WARNING, "!! com logger message");
        logger2.log(Level.WARNING, "!! com.jencov logger message");
        logger3.log(Level.WARNING, "!! com.jencov.web logger message");
    }
}
