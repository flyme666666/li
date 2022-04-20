package leetcode.y2020.twosum;

import java.util.HashMap;

/**
 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

 示例:
 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/two-sum
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum1 {
    public static void main(String[] args){
        int [] nums=new int[]{2,11,7,15};
        int [] returnnums;
        TwoSum1 twoSum1 =new TwoSum1();
        returnnums= twoSum1.twoSum(nums,9);
        for (int returnnum : returnnums) {
            System.out.print(returnnum + " ");
        }
    }

    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int temp =target-nums[i];
            if(hash.containsKey(temp)){
                return new int []{hash.get(temp),i};
            }
            hash.put(nums[i],i);
        }
        return new int []{-1,-1};
    }
}
