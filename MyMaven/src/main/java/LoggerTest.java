import org.apache.log4j.Logger;
import org.junit.Test;

public class LoggerTest {
    Logger logger = Logger.getLogger(LoggerTest.class);

    @Test
    public void printLogger() {
        logger.error("直接输出吧");
        try {
            System.out.println("日志练习！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void infoTest() {
        logger.info("输出info 的信息");
    }

}