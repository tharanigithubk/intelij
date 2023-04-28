import java.util.ArrayList;
import java.util.List;
public class TeacherMain {
    public static void main(String[] args) {
        Teacher1 obj1 = new Teacher1("tharani", "be", "ond", 1, 16);
        Teacher1 obj2 = new Teacher1("kama", "me", "tnj", 2, 24);
        Teacher1 obj3 = new Teacher1("lakshmi", "be", "ond", 1, 25);
        Teacher1 obj4 = new Teacher1("kani", "me", "ond", 9, 26);
        Teacher1 obj5 = new Teacher1("rama", "be", "tnj", 5, 27);
        Teacher1 obj6 = new Teacher1("deiva", "me", "ond", 6, 24);
        Teacher1 obj7 = new Teacher1("hari ", "me", "ond", 9, 25);
        Teacher1 obj8 = new Teacher1("prabakar", "ba", "tnj", 8, 30);
        Teacher1 obj9 = new Teacher1("saranya", "ba", "ond", 9, 25);
        Teacher1 obj10 = new Teacher1("priya", "ba", "tnj", 10, 32);
        List<Teacher1> teachers = new ArrayList<>();
        teachers.add(obj1);
        teachers.add(obj2);
        teachers.add(obj3);
        teachers.add(obj4);
        teachers.add(obj5);
        teachers.add(obj6);
        teachers.add(obj7);
        teachers.add(obj8);
        teachers.add(obj9);
        teachers.add(obj10);
        System.out.println("no.of teachers ond location is" + "" + method1(teachers, "ond"));
        System.out.println("no.of teachers ond location std is" + "" + method2(teachers, "ond", 9));
        System.out.println("total age of location ond is" + "" + method3(teachers, "ond", 25));
        System.out.println("Degree is less than 40 age of teacher is" + "" + method4(teachers, "be"));
        System.out.println("Teacher age less than 20 is" + "" + method5(teachers, 20));
    }

    public static int method1(List<Teacher1> list, String location) {
        int count = 0;
        for (Teacher1 tech : list) {
            if (tech.getLocation() == location) {
                count++;
            }
        }
        return count;
    }

    public static int method2(List<Teacher1> list, String location, int std) {
        int count = 0;
        for (Teacher1 tech : list) {
            if (tech.getLocation() == location) {
            }
            if (tech.getStd() == std) {
                count++;
            }
        }
        return count;
    }

    public static int method3(List<Teacher1> list, String location, int age) {
        int sum = 0;
        for (Teacher1 tech : list) {
            if (tech.getLocation() == location) {
            }
            if (tech.getAge() == age) {
                sum = sum + age;
            }
        }
        return sum;
    }

    public static int method4(List<Teacher1> list, String degree) {
        int count = 0;
        for (Teacher1 tech : list) {
            if (tech.getDegree() == degree) {
                if (tech.getAge() > 20 && tech.getAge() < 40) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int method5(List<Teacher1> list, int age) {
        int count = 0;
        for (Teacher1 tech : list)
            if (tech.getAge()<age) {
                    count++;
                }

        return count;
    }
}







































