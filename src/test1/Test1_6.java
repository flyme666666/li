package test1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1_6 {




    public static void main(String[] args) {
//        double a = 3 * 0.1; //0.30000000000000004
//
//        double b = 1 * 0.3; //0.3
//
//        System.out.println(a);
//
//        System.out.println(b);

//        Integer A = 10000, B = 100 , C = 100;
//        System.out.println(A==B); //false
//
//        System.out.println(B==C); //true

        sort();

    }

    //冒泡排序
    public static void sort(){
        int [] arr =  {1,3,44,5,676,4};
        for (int i = arr.length; i > 0 ; i--) {
            for (int j = 0 ; j < i-1 ; j++){
                if(arr[j] > arr [j+1]){
                    int temp = arr [j+1];
                    arr [j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
