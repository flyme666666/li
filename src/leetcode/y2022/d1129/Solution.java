package leetcode.y2022.d1129;

/**
 * 生成交替二进制字符串的最少操作数
 * https://leetcode.cn/problems/minimum-changes-to-make-alternating-binary-string/
 * 给你一个仅由字符 '0' 和 '1' 组成的字符串 s 。一步操作中，你可以将任一 '0' 变成 '1' ，或者将 '1' 变成 '0' 。
 *
 * 交替字符串 定义为：如果字符串中不存在相邻两个字符相等的情况，那么该字符串就是交替字符串。例如，字符串 "010" 是交替字符串，而字符串 "0100" 不是。
 *
 * 返回使 s 变成 交替字符串 所需的 最少 操作数。
 */
public class Solution {

    public int minOperations(String s) {
        int result = 0;
        char[] sc = s.toCharArray();
        char preChar = sc[0];
        for (int i = 1; i < sc.length; i++) {
            if (preChar == sc[i]) {
                result++;
                preChar = (char) (preChar ^ 1);
            } else {
                preChar = sc[i];
            }
        }
        return Math.min(result, s.length() - result);
    }

//    作者：爪哇缪斯
//    链接：https://leetcode.cn/problems/minimum-changes-to-make-alternating-binary-string/solutions/1996765/-by-muse-77-gwcw/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
