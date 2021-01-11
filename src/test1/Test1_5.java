package test1;

import java.util.ArrayList;
import java.util.List;

public class Test1_5 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int page = 2;//相当于pageNo
        int count = 20;//相当于pageSize
        int size = list.size();
        int pageCount=size/count;
        int fromIndex = count * (page - 1);
        int toIndex = fromIndex + count;
        if (toIndex >= size) {
            toIndex = size;
        }
        if(page>pageCount+1){
            fromIndex=0;
            toIndex=0;
        }

        System.out.println(list.subList(fromIndex, toIndex));


    }




}


