package test1;

import java.io.*;

public class Test1_3 {
    {
        //rd /s/q C:\Users\zhang\Desktop\新建文件夹
        String cmd = "@echo off \nstart cmd /k ipconfig";
        String url = "D:\\test.bat";
        FileWriter fw = null;
        try {
            //生成bat文件
            fw = new FileWriter(url);
            fw.write(cmd);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            //运行bat文件
            Process process = Runtime.getRuntime().exec(url);
            InputStream in = process.getInputStream();
            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            process.waitFor();
            System.out.println("执行成功");
        }catch(Exception e){
            System.out.println("执行失败");
        }
    }
}
