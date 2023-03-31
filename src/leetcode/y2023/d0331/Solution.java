package leetcode.y2023.d0331;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个下标从 0 开始、严格递增 的整数数组 nums 和一个正整数 diff 。如果满足下述全部条件，则三元组 (i, j, k) 就是一个 算术三元组 ：
 *
 * i < j < k ，
 * nums[j] - nums[i] == diff 且
 * nums[k] - nums[j] == diff
 * 返回不同 算术三元组 的数目。
 *
 * 示例 1：
 *
 * 输入：nums = [0,1,4,6,7,10], diff = 3
 * 输出：2
 * 解释：
 * (1, 2, 4) 是算术三元组：7 - 4 == 3 且 4 - 1 == 3 。
 * (2, 4, 5) 是算术三元组：10 - 7 == 3 且 7 - 4 == 3
 *
 */
public class Solution {

    //暴力三重循环
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] != diff) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (nums[k] - nums[j] == diff) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }


    public int arithmeticTriplets2(int[] nums, int diff) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            set.add(x);
        }
        int ans = 0;
        for (int x : nums) {
            if (set.contains(x + diff) && set.contains(x + 2 * diff)) {
                ans++;
            }
        }
        return ans;
    }


}
