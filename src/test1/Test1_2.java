package test1;

public class Test1_2 {
    public static void main(String[] args) {
        String inputdate="2019-04-01"; //输入的调整日期
        //String inputdate="2019-04-18"; //输入的调整日期

        String maxdate=""; //最大发钱月次月 和 入司日期中取最大的值

        //（1）最大发钱月次月大于入司日期
        String empdate1 ="2019-04-18";//入司日期
        String maxwageno1="2020-02-01";//最大发钱月次月


        //（2）入司日期大于最大发钱月次月
        String empdate2 ="2019-04-18";//入司日期
        String maxwageno2="2019-02-01";//最大发钱月次月


        Integer i=empdate2.compareTo(maxwageno2);  //取入司日期和最大发钱月中最大的日期
        boolean isWrong =false;  //提示报错

        boolean isDay01 =false;  //是否最大日期后每月一号
        if(i>0){        //入司日期大
            //maxdate=empdate2;
            // System.out.println(maxdate);
            Integer j=inputdate.compareTo(empdate2);
            if((j<0)&&(!inputdate.equals(empdate2))){   //输入日期小于入司日时 必须为 入司日期
                isWrong=true;
                System.out.println("提示:新调整日期必须为 入司日期 2019-04-18 ......");
            }else if((j>0)&&(!"01".equals(inputdate.substring(8,10)))){  //输入日期大于入司日时 必须为 以后月份的一号
                isWrong=true;
                System.out.println("提示:新调整日期必须为 入司日期 2019-04-18 以后的每月一号......");
            }else {
            }
            if (isWrong) {
                System.out.println("提示报错......");
            }else {
                System.out.println("调整成功......");
            }
        }else {    //最大发钱月次月大
            /*maxdate=maxwageno2;
            System.out.println(maxdate);*/
        }
    }
}
