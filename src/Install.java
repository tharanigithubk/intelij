public class Install {
    public static void main(String[] args) {
        System.out.println("\n Java version:"+System.getProperty("java.version"));
        System.out.println("Java Runtime version:"+System.getProperty("java.runtime.version"));
        System.out.println("Java Home:"+System.getProperty("java.home"));
        System.out.println("Java vendor:"+System.getProperty("java.vendor"));
        System.out.println("Java vendor URL:"+System.getProperty("java.vendor.url"));
        System.out.println("Java class path:"+System.getProperty("java.class.path")+"\n");
    }
}
