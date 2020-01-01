import javafx.util.Pair;

public class test8<T> {
    //泛型编写
    // Java的泛型是采用擦拭法实现的；

//    擦拭法决定了泛型<T>：
//    不能是基本类型，例如：int；
//    不能获取带泛型类型的Class，例如：Pair<String> .class；
//    不能判断带泛型类型的类型，例如：x instanceof Pair<String>；
//    不能实例化T类型，例如：new T()。
//    泛型方法要防止重复定义方法，例如：public boolean equals(T obj)；
//
//    子类可以获取父类的泛型类型<T>。
    private T name;
    private T nameUnit;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getNameUnit() {
        return nameUnit;
    }

    public void setNameUnit(T nameUnit) {
        this.nameUnit = nameUnit;
    }
}
