package streams.parallel.before;

import org.apache.log4j.Logger;

/**
 * Created by amik on 11/11/17.
 */
public class Logging {

    public static Logger LOGGER = Logger.getLogger("streams");

    public static void main(String[] args) {
    	LOGGER.info("Test");
    }
}
