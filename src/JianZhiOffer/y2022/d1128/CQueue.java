package JianZhiOffer.y2022.d1128;

import java.util.LinkedList;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * <a href="https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=14rhlrh">...</a>
 * <p>
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 */
public class CQueue {
    LinkedList<Integer> A, B;

    public CQueue() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();

//        作者：Krahets
//        链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/solutions/100368/mian-shi-ti-09-yong-liang-ge-zhan-shi-xian-dui-l-2/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    }



}
