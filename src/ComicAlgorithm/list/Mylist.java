package ComicAlgorithm.list;

/**
 * 漫画算法-链表操作
 */
public class Mylist {
    //头结点指针 (对象)
    private Node head;
    //尾节点指针 (对象)
    private Node last;
    //链表实际长度
    private int size;

    /**
     * 链表节点 内部类
     */
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * 打印输出链表
     */
    public void output() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /**
     * 链表插入元素
     *
     * @param data  插入的元素
     * @param index 插入的位置
     * @throws Exception
     */
    public void insert(int index, int data) throws Exception {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node insertedNode = new Node(data);
        if (size == 0) {
            //空链表
            head = insertedNode;
            last = insertedNode;
        } else if (index == 0) {
            //插入头部
            insertedNode.next = head;
            head = insertedNode;
        } else if (size == index) {
            //插入尾部
            last.next = insertedNode;
            last = insertedNode;
        } else {
            //插入中间
            Node prevNode = get(index - 1);
            insertedNode.next = prevNode.next;
            prevNode.next = insertedNode;

        }
        size++;
    }

    /**
     * 链表查找元素
     *
     * @param index 查找位置
     * @return
     * @throws Exception
     */
    public Node get(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("超出链表节点范围！");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public static void main(String[] args) throws Exception{
        Mylist mylist=new Mylist();
        mylist.insert(0,0);
        mylist.insert(1,1);
        mylist.insert(1,2);

        mylist.output();
    }
}
