import java.util.ArrayList;
public class Accessal {
    public static void main(String[] args){
        ArrayList<String>animals=new ArrayList<>();
        animals.add("cow");
        animals.add("dog");
        animals.add("cat");
        System.out.println("Arraylist:"+animals);
        String Str=animals.get(1);
        System.out.println("Element at index 1:"+Str);
    }
}
