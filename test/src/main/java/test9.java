import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test9 {
//给定一组连续的整数，例如：10，11，12，……，20，但其中缺失一个数字，试找出缺失的数字：
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumberWu(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }
    static int findMissingNumber(int start, int end, List<Integer> list){
        if(start!=list.get(0)){
            return start;
        }
        if(end!=list.get(list.size()-1)){
            return end;
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)!=list.get(i+1)-1){
                return list.get(i)+1;
            }
        }
        return 0;
    }

    //和上述题目一样，但整数不再有序，试找出缺失的数字：
    static int findMissingNumberWu(int start, int end, List<Integer> list){
        Collections.sort(list);
        if(start!=list.get(0)){
            return start;
        }
        if(end!=list.get(list.size()-1)){
            return end;
        }
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)!=list.get(i+1)-1){
                return list.get(i)+1;
            }
        }
        return 0;
    }

}
