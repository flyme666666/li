package JianZhiOffer.y2022.d1129;

/**
 *  从尾到头打印链表
 *  https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=14rhlrh
 *  输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for(int i = 0; i < res.length; i++)
            res[i] = tmp.get(i);
        return res;
    }

    void recur(ListNode head) {
        if(head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

//    作者：Krahets
//    链接：https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/solutions/97270/mian-shi-ti-06-cong-wei-dao-tou-da-yin-lian-biao-d/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。



}
