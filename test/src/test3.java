//枚举类
public class test3 {
    public static void main(String[] args) {
        Weekday day=Weekday.MON;
        if(day.dayValue==1){
            System.out.println(day.toString());
        }
    }

    enum Weekday{
        MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
        public final int dayValue;
        public final String chinese;

        private Weekday(int i,String chinese){
            dayValue=i;
            this.chinese=chinese;
        }

        @Override
        public String toString() {
            return this.chinese;
        }
    }
}
