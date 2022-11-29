package leetcode.y2022.d1127;

/**
 * https://leetcode.cn/problems/check-if-array-is-sorted-and-rotated/description/
 * 检查数组是否经排序和轮转得到
 * 给你一个数组 nums 。nums 的源数组中，所有元素与 nums 相同，但按非递减顺序排列。
 *
 * 如果 nums 能够由源数组轮转若干位置（包括 0 个位置）得到，则返回 true ；否则，返回 false 。
 *
 * 源数组中可能存在 重复项 。
 *
 * 注意：我们称数组 A 在轮转 x 个位置后得到长度相同的数组 B ，当它们满足 A[i] == B[(i+x) % A.length] ，其中 % 为取余运算。
 *
 *
 */
public class Solution {


    public boolean check(int[] nums) {
        int t = 0, n = nums.length;
        for (int i = 1; i < n; i++) {
            if (t > 1) return false; // 如果出现超过1次的“非递增”情况，则直接返回false
            if (nums[i - 1] > nums[i]) t++; // 如果出现“非递增”情况，则t加1
        }
        return t == 0 || (t == 1 && nums[0] >= nums[n - 1]);
    }

//    作者：爪哇缪斯
//    链接：https://leetcode.cn/problems/check-if-array-is-sorted-and-rotated/solutions/1993078/-by-muse-77-oxgw/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


    public static void main(String[] args) {
        //int [] nums =  new int[] {2,1,3,4}; //false
        int [] nums =  new int[] {3,4,5,1,2}; //true
        Solution s = new Solution();
        System.out.println(s.check(nums));
    }
}
