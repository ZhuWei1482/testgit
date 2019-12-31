import java.security.SecureRandom;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-15));
        //计算xy次方
        System.out.println(Math.pow(2,10));// 2的10次方=1024
        //生成一个随机数x，x的范围是0 <= x < 1：
        System.out.println(Math.random()); // 0.53907... 每次都不一样
//Random：生成伪随机数
        Random random = new Random();
        System.out.println(random.nextInt());
//SecureRandom：生成安全的随机数
        SecureRandom sRandom = new SecureRandom();
        System.out.println(sRandom.nextInt(100));
    }
}
