package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainMethodTestingClass {
    private static Logger LOG = LogManager.getLogger(MainMethodTestingClass.class.getName());

    public static void main(String[] args){
        LOG.info("testing info logging");
        LOG.error("testing error logging");
        LOG.trace("testing trace logging");
        LOG.debug("testing debug logging");
        LOG.warn("testing warn logging");
        LOG.fatal("testing fatal logging");

    }
}
