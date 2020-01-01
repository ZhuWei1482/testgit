import java.lang.reflect.Field;
//使用@Range注解来检查Java Bean的字段。如果字段类型是String，就检查String的长度，如果字段是int，就检查int的范围。
public class Person {
    @Inter(max = 0,min = 50)
    private String name;
    @Inter(max = 0,min = 225)
    private int age;

    //反射的概念
    void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : person.getClass().getFields()) {
            // 获取Field定义的@Inter:
            Inter range = field.getAnnotation(Inter.class);
            // 如果@Range存在:
            if (range != null) {
                // 获取Field的值:
                Object value = field.get(person);
                // 如果值是String:
                if (value instanceof String) {
                    String s = (String) value;
                    // 判断值是否满足@Range的min/max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }else if(value instanceof Integer){
                    //object转int类型
                    int i = Integer.parseInt(String.valueOf(value));
                    if (i<range.max() || i>range.min()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }
}
