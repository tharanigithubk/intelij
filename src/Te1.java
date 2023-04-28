import java.util.HashMap;
public class Te1 {
    public static void main(String[] args) {
        HashMap<String,Integer>teach=new HashMap<String,Integer>();
        System.out.println("teacher list orathanadu location and std");
        teach.put("tharani",1);
        teach.put("lakshmi",3);
        teach.put("kani",4);
        teach.put("deiva",6);
        teach.put("hari",7);
        teach.put("saranya",9);
        System.out.println("number of teacher in orathanadu is 6:");
        for (String i:teach.keySet()){
            System.out.println("key:" +i+ "value:"+teach.get(i));

        }
    }
}
