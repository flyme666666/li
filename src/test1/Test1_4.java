package test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1_4 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();

        int month = c.get(Calendar.MONTH) + 1;
        // System.out.println(month);
        for (int i = month; i > 0; i--) {
            String m ="";
            if(i<10){
                m = "0"+i;
            }else {
                m = ""+i;
            }
            System.out.println(m);
        }
        Date time = c.getTime();
        String preDay = sdf.format(time);
        System.out.println(preDay);

    }

}
