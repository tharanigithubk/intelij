import java.util.ArrayList;
import java.util.Iterator;
public class Te {
    public static void main(String[] args) {
        ArrayList<String>teach=new ArrayList<String>();
        System.out.println("teacher list in orathanadu:");
        teach.add("tharani");
        teach.add("lakshmi");
        teach.add("kani");
        teach.add("deiva");
        teach.add("hari");
        teach.add("saranya");
        Iterator<String>it=teach.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
