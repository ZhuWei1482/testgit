import java.time.LocalDate;

/**
 * 静态工厂方法编写
 *定义一个创建对象的接口，让子类决定调用哪一个类。使一个类的实例化延迟到其子类。
 *
 * 它的好处在于，valueOf()内部可能会使用new创建一个新的Integer实例，但也可能直接返回一个缓存的Integer实例。
 * 对于调用方来说，没必要知道Integer创建的细节。
 *
 * @Author ZhuWei
 * @Date 2020/2/20 20:31
 * @Version 1.0
 */
public class FactoryMethod {
    public static void main(String[] args) {
        LocalDate date = LocalDateFactory.factory(20200202);
        System.out.println(date);
    }
}


