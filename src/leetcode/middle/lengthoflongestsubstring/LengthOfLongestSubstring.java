package leetcode.middle.lengthoflongestsubstring;

import java.util.HashMap;

/**
 *
 3. 无重复字符的最长子串
 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

 示例 1:

 输入: "abcabcbb"
 输出: 3
 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 示例 2:

 输入: "bbbbb"
 输出: 1
 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 示例 3:

 输入: "pwwkew"
 输出: 3
 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LengthOfLongestSubstring {

    public static void main(String[] args){
        LengthOfLongestSubstring lengthOfLongestSubstring=new LengthOfLongestSubstring();
        System.out.println(lengthOfLongestSubstring.lengthOfLongestSubstring(new String("pwwkew") ));
    }

    public int lengthOfLongestSubstring(String s) {
        char[] ss = s.toCharArray() ;
        int left = 0 , right = 0 , n = ss.length ;
        int max = Integer.MIN_VALUE ;
        HashMap<Character,Integer> map = new HashMap<>() ;
        while(right < n){
            if(map.containsKey(ss[right])){      //当前字符已在滑动窗口内
                max = Math.max(max,right - left) ;  //记录遍历至此最长的符合题意的字符串。right-left为当前窗口大小
                int temp = map.get(ss[right]) ;
                for(int i = left ; i <= temp ; i++){
                    map.remove(ss[i]) ;     // 清除部分map记录
                }
                left = temp + 1 ;   // 调整滑动窗口的左端点
            }
            map.put(ss[right],right) ;
            right++ ;
        }
        return Math.max(max,right - left) ;
    }


}
