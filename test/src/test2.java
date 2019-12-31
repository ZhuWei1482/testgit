import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

//枚举javaBean的所有属性
public class test2 {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for(PropertyDescriptor pd : info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println("  "+pd.getReadMethod());
            System.out.println("  "+pd.getWriteMethod());
        }
    }

    class Person{
        private String naem;
        private int age;

        public String getNaem() {
            return naem;
        }

        public void setNaem(String naem) {
            this.naem = naem;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
