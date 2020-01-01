import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test7 {
    //反射
    public static void main(String[] args) throws Exception {
        Person pr=new Person("zhuwei",20);
        //获取Class实例
        Class prClass = pr.getClass();
        //从实例中获取field
        Field field = prClass.getDeclaredField("name");
        //调用Field.setAccessible(true)的意思是，别管这个字段是不是public，一律允许访问。
        field.setAccessible(true);
        field.set(pr,"zhuweiwei");
        System.out.println(pr.getName());

        //反射调用构造方法
        // 获取构造方法Integer(int):
        Constructor cons1 = Integer.class.getConstructor(int.class);
        // 调用构造方法:
        Integer n1=(Integer) cons1.newInstance(123);
        System.out.println(n1);

    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name=name;
            this.age=age;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
