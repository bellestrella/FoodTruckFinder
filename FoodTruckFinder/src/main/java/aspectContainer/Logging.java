package aspectContainer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {

    private static final Logger LOG = LogManager.getLogger(Logging.class.getName());

    @Before("test.EntityTest.session.save()")
    public void testLogging(){
        LOG.info("This is a message to test if the logging is working");
    }

}
