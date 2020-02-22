/**
 * 原型模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 原型模式应用不是很广泛，因为很多实例会持有类似文件、Socket这样的资源，
 * 而这些资源是无法复制给另一个对象共享的，只有存储简单类型的“值”对象可以复制。
 * @Author ZhuWei
 * @Date 2020/2/22 11:03
 * @Version 1.0
 */
public class Studentss implements Cloneable{

    private int id;
    private String name;
    private int score;

    @Override
    public Object clone(){
        Studentss s = new Studentss();
        s.id = this.id;
        s.name = this.name;
        s.score = this.score;
        return s;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return String.format("{Student: id=%s, name=%s, score=%s}@%s", this.id, this.name, this.score,
                Integer.toHexString(hashCode()));
    }

}
