public class Static {
    static void myStaticMethod(){
        System.out.println("static method can be called without creating object:");
    }
    public void myPublicMethod(){
        System.out.println("public method must be called by creating object:");
    }
    public static void main(String[] args) {
        myStaticMethod();
        Static obj=new Static();
        obj.myPublicMethod();
    }
}
