
public class OOPS8Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Arnold";
        

        System.out.println(s1.studentMarks(90, 90, 90));
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(Student.studentMarks(40, 90, 90));


        Student s3 = new Student();
        s3.schoolName = "AuHa";
        System.out.println(s3.studentMarks(95, 90, 92));

        System.out.println(s2.schoolName);

    }
}

class Student {

    static int studentMarks(int math, int phy, int sci) {
        return (math+phy+sci)/3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}