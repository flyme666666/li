package leetcode.leet0419;

import java.util.Arrays;

/***
 *     作者：LeetCode-Solution
 *     链接：https://leetcode-cn.com/problems/shortest-distance-to-a-character/solution/zi-fu-de-zui-duan-ju-chi-by-leetcode-sol-2t49/
 *     来源：力扣（LeetCode）
 *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.shortestToChar("zxc", 'c')));
    }


    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = i - idx;
        }

        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
            if (s.charAt(i) == c) {
                idx = i;
            }
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;
    }


}
