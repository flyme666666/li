package JianZhiOffer.y2022.d1128;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 包含min函数的栈
 * https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/?envType=study-plan&id=lcof&plan=lcof&plan_progress=14rhlrh
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class MinStack {

    Deque<Integer> xStack;
    Deque<Integer> minStack;


    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

//    作者：力扣官方题解
//    链接：https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/solutions/1398785/bao-han-minhan-shu-de-zhan-by-leetcode-s-i2fk/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

}
