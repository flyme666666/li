package BinarySearch.y2022.d1128;

/**
 * https://leetcode.cn/problems/binary-search/?envType=study-plan&id=binary-search-beginner&plan=binary-search&plan_progress=14rryc2
 * 二分查找
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 */
public class Solution {


    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

//    作者：力扣官方题解
//    链接：https://leetcode.cn/problems/binary-search/solutions/980494/er-fen-cha-zhao-by-leetcode-solution-f0xw/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。




}
