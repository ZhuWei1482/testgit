import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author ZhuWei
 * @Date 2020/1/19 21:28
 * @Version 1.0
 */
public class Test14 {
    public static void main(String[] args) {
        //获取时间戳
        long ll = System.currentTimeMillis();
        System.out.println(ll);

        //打印时间
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);


        //程序运行时间检测
        LocalTime t = LocalTime.now();
        int x=0;
        for(int i = 0;i<100000000;i++){
            x *= i;
        }
        System.out.println("========================="+t);
        System.out.println("========================="+LocalTime.now());
    }
}
