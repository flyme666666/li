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


    //暴力破解
    public int searchBaoLi(int[] nums, int target) {
        if (nums.length < 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public  int  searchErFen(int[]  nums,  int  target)  {
        if  (nums.length  <  0)  {    //如果数组为空，返回-1
            return  -1;
        }
        int  left  =  0;      //定义左侧指针
        int  right  =  nums.length  -  1;        //定义右侧指针
        while  (left  <=  right)  {  //当左指针小于等于右指针时，继续循环
            int  mid  =  (right  -  left)  /  2  +  left;        //将左右指针相加除以2，得到中间指针
            int  num  =  nums[mid];        //获取中间数
            if  (num  ==  target)  {        //如果中间数等于目标数，返回其索引
                return  mid;
            }  else  if  (num  >  target)  {    //如果中间数大于目标值，将右指针移动到中间指针左侧
                right  =  mid  -  1;
            }  else  {        //如果中间数小于目标值，将左指针移动到中间指针右侧
                left  =  mid  +  1;
            }
        }
        return  -1;    //未找到，返回-1
    }











}
