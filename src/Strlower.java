public class Strlower {
    public static void main(String[] args) {
        String str = "line1\nline2\nline3\nline4";
        int count = getlinecount(str);
        System.out.println("total line count:" + count);
    }

    public static int getlinecount(String text) {
        return text.split("[\n|\r]").length;
    }
}