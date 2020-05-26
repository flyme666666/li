package leetcode.easy.twosum;

public class TwoSum2 {
    public static void main(String[] args){
        int [] nums=new int[]{2,11,7,15};
        int [] returnnums;
        TwoSum2 twoSum2 =new TwoSum2();
        returnnums= twoSum2.twoSum(nums,9);
        for (int returnnum : returnnums) {
            System.out.print(returnnum + " ");
        }
    }

    private int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (target-nums[i]==nums[j]){
                    return new int []{i,j};
                }
            }
        }
        return new int []{-1,-1};
    }

}
