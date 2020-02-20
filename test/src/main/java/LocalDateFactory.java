/**
 * 静态工厂
 * @Author ZhuWei
 * @Date 2020/2/20 20:39
 * @Version 1.0
 */

import java.time.LocalDate;

public class LocalDateFactory {
    public static LocalDate factory(int yyyyMMdd){
        int yyyy,MM,dd;
        //TODO:将int截断为年月日
        return new LocalDate(yyyy,MM,dd);
    }
}
