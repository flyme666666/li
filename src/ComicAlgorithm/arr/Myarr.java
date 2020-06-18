package ComicAlgorithm.arr;

/**
 * 漫画算法-数组操作
 */
public class Myarr {
    private int[] array;
    private int size;

    /**
     * 构造函数
     *
     * @param a
     */
    public Myarr(int a) {
        this.array = new int[a];
        size = 0;
    }

    /**
     * @param element 插入的元素
     * @param index   插入的位置
     * @throws Exception
     */
    public void insert(int index, int element) throws Exception {
        //判断下标是否越界
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围！");
        }
        //如果元素达到数组上限，则对数组进行扩容
        if (size >= array.length) {
            resize();
        }

        //从右向左移动元素
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        //插入新元素
        array[index] = element;
        size++;
    }

    /**
     * 打印数组
     */
    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * 数组扩容
     */
    public void resize() {
        int[] arrayNew = new int[array.length * 2]; //容量扩大一倍
        //旧数组复制到新数组
        System.arraycopy(array, 0, arrayNew, 0, array.length);
        array = arrayNew;
    }

    /**
     * 删除数组元素
     *
     * @param index 删除的位置
     * @return
     * @throws Exception
     */
    public void delete(int index) throws Exception {
        //判断下标是否越界
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("超出数组实际元素范围！");
        }
        // int deleteElement=array[index];
        //依次从右往左移动
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        // return deleteElement;
    }


    public static void main(String[] args) throws Exception {
        Myarr myarr = new Myarr(5);//有参构造函数
        myarr.insert(0, 1);
        myarr.insert(1, 2);
        myarr.insert(2, 3);
        myarr.insert(3, 4);
        myarr.insert(4, 5);
        //myarr.insert(4, 6);
        myarr.delete(0);

        System.out.println(myarr.size);
        myarr.output();
    }
}
