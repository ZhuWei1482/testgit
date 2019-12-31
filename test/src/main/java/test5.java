//异常屏蔽
//如果在执行finally语句时抛出异常，那么，catch语句的异常还能否继续抛出？
//在极少数的情况下，我们需要获知所有的异常。如何保存所有的异常信息？
// 方法是先用origin变量保存原始异常，然后调用Throwable.addSuppressed()，把原始异常添加进来，最后在finally抛出：
public class test5 {
    public static void main(String[] args) throws Exception {
        Exception origin = null;
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (Exception e) {
            origin = e;
            throw e;
        } finally {
            Exception e = new IllegalArgumentException();
            if (origin != null) {
                e.addSuppressed(origin);
            }
            throw e;
        }
    }
}
