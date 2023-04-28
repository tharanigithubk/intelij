import java.util.ArrayList;
public class Removeal {
    public static void main(String[] args){
        ArrayList<String>animals=new ArrayList<>();
        animals.add("lion");
        animals.add("horse");
        animals.add("tiger");
        String Str=animals.remove(2);
        System.out.println("updated arraylist:"+animals);
        System.out.println("Removed Elements:"+Str);
    }
}
