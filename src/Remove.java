import java.util.ArrayList;
import java.util.List;
public class Remove {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("Audi");
        listStrings.add("Honda");
        listStrings.add("Ford");
        listStrings.add("Hyundai");
        listStrings.add("Kia");
        listStrings.add("Xylo");
        listStrings.add("ShiftDzire");
        System.out.println(listStrings);
        listStrings.remove(5);
        System.out.println("After removing fifth element from the list:\n"+listStrings);
    }
}
