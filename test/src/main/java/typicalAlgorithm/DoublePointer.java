package typicalAlgorithm;

/**
 * @Author ZhuWei
 * @Date 2020/5/6 22:09
 * @Version 1.0
 * 算法思想： 利用问题本身与序列的特性（序列递增性质），
 * 使用两个下标i、j对序列进行扫描 （可以同向扫描，也可以反向扫描） ，以较低的复杂度解决问题。
 */
public class DoublePointer {

}

class SolutionQ27 {
    public int removeElement(int[] nums, int val) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[sum] = nums[i];
                sum ++;
            }
        }
        return sum;
    }
}
