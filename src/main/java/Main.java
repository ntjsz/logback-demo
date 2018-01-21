import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;

/**
 * Created by hht on 2017.11.9.
 */
public class Main {
    final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("first hi");
        LOGGER.info("second hi");

        try {
            testException();
        } catch (Exception e) {
            LOGGER.error("something wrong:", e);
        }


        // waite for AsyncAppender's log queue be cleared
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void testException() throws Exception {
        throw new Exception("this is a exception msg.");
    }
}
