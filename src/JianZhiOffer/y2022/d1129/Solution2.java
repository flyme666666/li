package JianZhiOffer.y2022.d1129;

/**
 * 反转链表
 * https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=14rhlrh
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 */
public class Solution2 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

//    作者：力扣官方题解
//    链接：https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/solutions/551600/fan-zhuan-lian-biao-by-leetcode-solution-jvs5/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//

}
