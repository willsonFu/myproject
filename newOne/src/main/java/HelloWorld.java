import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Administrator on 2017/9/21.
 */
public class HelloWorld
{
    private static Logger logger = LogManager.getLogger(HelloWorld.class);

    public static void main( String[] args ){
        logger.debug("debug");
        logger.error("error");
        System.out.print("aaaa");
    }
}
