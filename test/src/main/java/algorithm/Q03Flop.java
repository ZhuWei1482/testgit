package algorithm;


/**
 * @Author ZhuWei
 * @Date 2020/3/5 22:03
 * @Version 1.0
 */
public class Q03Flop {
    public static void main(String[] args) {
        boolean[] b = new boolean[100];
        for(int i = 1; i < b.length; i++){
            int j = i - 1;
            while(j < b.length){
                b[j] = !b[j];
                j += i;
            }
        }
        int sum = 0;
        for(int i = 0 ; i < b.length; i++){
            if(!b[i]){
                System.out.println(i+1);
                sum += i+1;
            }
        }
        System.out.println(sum);
    }
}
