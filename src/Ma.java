public class Ma {
    public static void main(String[] args) {
        Student obj=new Student("raj",10);
        System.out.println("name is:"+obj.getName());
        System.out.println("roll no is:"+obj.rollno);
        System.out.println("is_male is:"+obj.is_male);
        Student obj1=new Student("seetha",22);
        System.out.println("name is:"+obj1.getName());
        System.out.println("roll no is:"+obj1.rollno);
        System.out.println("is_male is:"+obj1.is_male);
    }
}
class Student{
    private String name;
    public int rollno;
    public int is_male;
    Student(String name,int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}
