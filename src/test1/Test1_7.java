package test1;

public class Test1_7 {

    public static void main(String[] args) {
//0 1 2 3
        Object[] dataObjects =  {"keyId", "idcardJm" , "phohoneJm" , "teleJm"};
 //       dataObjects[dataObjects.length-1] = dataObjects[0];
//        System.out.println(dataObjects[dataObjects.length-1]);

        for (int i = 0; i < dataObjects.length; i++) {
            if(i == 0){
                continue;
            }
            dataObjects[i-1] =  dataObjects[i];
        }
        dataObjects[dataObjects.length-1] = "keyId";
        System.out.println(dataObjects);

    }




}
