import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Majorityele {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,5,5,5,5,5,5};
        System.out.println("original array:" + Arrays.toString(nums));
        int result = Majorityelements(nums);
        if (result != -1)
            System.out.println("Majority element is" + result);
        else
            System.out.println("Majority element does not exist");
    }
    public static int Majorityelements(int arra1[]){
        int n=arra1.length;
        Map<Integer,Integer>Map=new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++)
        {
            if (Map.get(arra1[i])==null)
                    Map.put(arra1[i],0);
            Map.put(arra1[i],Map.get(arra1[i]) +1);
        }
        Iterator it= Map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair=(Map.Entry)it.next();
            if ((int)pair.getValue() > n / 2)
                return (int)pair.getKey();
            it.remove();
        }
        return -1;
        }
    }

