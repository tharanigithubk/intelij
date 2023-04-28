public class StuName {
    public static void main(String[] args) {
        Stu student=new Stu("kani",2,1090110);
        System.out.println(student.Name);
        System.out.println(student.getAge());
        System.out.println(student.getRegister_number());
        student.setName("k");
       System.out.println(student.getName());
    }
}
