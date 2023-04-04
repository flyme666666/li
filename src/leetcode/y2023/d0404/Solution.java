package leetcode.y2023.d0404;

import java.util.Arrays;

/**
 *
 * 977. 有序数组的平方
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/?envType=study-plan&id=suan-fa-ru-men&plan=algorithms&plan_progress=x5anegeh">...</a>
 */
public class Solution {

    //直接平方后排序
    public int[] sortedSquares(int[] nums) {
        int [] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            newNums[i] = nums[i] * nums[i];
        }
        Arrays.sort(newNums);
        return newNums;
    }


    // 各种排序方法
    // https://leetcode.cn/problems/squares-of-a-sorted-array/solutions/39242/ge-chong-pai-xu-shuang-zhi-zhen-by-toxic-3/





}
