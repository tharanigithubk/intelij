import java.util.ArrayList;

public class Changeal {
    public static void main(String[] args){
        ArrayList<String>language=new ArrayList<>();
        language.add("c");
        language.add("java");
        language.add("c++");
        language.set(1,"javascript");
        System.out.println("Modified Arraylist:"+language);
    }
}
