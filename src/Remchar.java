public class Remchar {
    public static void main(String[] args) {
        String str="tata sky";
        System.out.println(removecharAt(str,5));
    }
    public static String removecharAt(String s,int pos){
        return s.substring(0,pos)+s.substring(pos+1);
    }
}
