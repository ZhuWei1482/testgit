package algorithm;

/**
 * @Author ZhuWei
 * @Date 2020/3/3 20:04
 * @Version 1.0
 */
public class Palindrome1 {
    public static void main(String[] args) {
        int num = 11;
        while(true) {
            if((reverseString(String.valueOf(num)).equals(String.valueOf(num))) &&
                    (toBinaryString(num).equals(reverseString(toBinaryString(num)))) &&
                    (toOctalString(num).equals(reverseString(toOctalString(num))))) {
                System.out.println(num);
                break;
            }
            num += 2;
        }
    }


    static String toBinaryString(int i){
        return Integer.toBinaryString(i);
    }

    static String toOctalString(int i){
        return Integer.toOctalString(i);
    }

    static String reverseString(String s){
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        return sb.reverse().toString();
    }
}
