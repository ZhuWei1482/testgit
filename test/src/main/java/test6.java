import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class test6 {
    //注意到实例变量log的获取方式是LogFactory.getLog(getClass())
    //SLF4J和Commons Logging的调用方式
    public static void main(String[] args) {
        Log log = LogFactory.getLog(test6.class);
        log.info("start...");
        log.warn("end.");
    }
}
