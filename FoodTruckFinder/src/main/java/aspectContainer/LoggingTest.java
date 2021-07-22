package aspectContainer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {

    private static Logger logger = LogManager.getLogger(LoggingTest.class);
    public static void main(String[] args) {

        System.out.println("Created a seperate class just to test out logging...!");

        logger.info("This is an info message!");
        logger.error("This is an error!");

    }
}


