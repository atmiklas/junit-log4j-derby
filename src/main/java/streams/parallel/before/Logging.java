package streams.parallel.before;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

/**
 * Created by amik on 11/11/17.
 */
public class Logging {

    public static Logger LOGGER = Logger.getLogger("streams.parallel.before.Logging");

    public static void main(String[] args) throws InterruptedException {
    
    	while(true) {
    		LOGGER.info("Test");
    	    TimeUnit.SECONDS.sleep(1);	
    	}
    }
}
