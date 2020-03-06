package algorithm;

/**
 * @Author ZhuWei
 * @Date 2020/3/6 22:56
 * @Version 1.0
 */
public class Q04Wooden {
    static int i = 0;
//    static int x = 0;

    public static void main(String[] args) {
        Q04Wooden q4 = new Q04Wooden();
        q4.wooden(100, 5, 1);
        System.out.println(i);
    }



    public void wooden(int n, int m, int x){
        //终止条件
        if(x > n){
            return;
        }else if(x < m){
            i ++;
            //接下来是现在根数的 2 倍
            wooden(n, m, x * 2);
        }else{
            i ++;
            //加上切分次数
            wooden(n, m, x  + m);

        }



//        //木棒的条数
//        if(i == 0){
//            x = 1;
//        }else{
//            x = i * 2;
//        }
//
//
//        if(x > m){
//            int z = x / m;
//            if(x % m > 0){
//                i++;
//            }
//            i += z;
//            return ;
//        }
//        i ++;
//        if(n != 1){
//            n = n / 2;
//            wooden(n, m);
//        }

    }
}
