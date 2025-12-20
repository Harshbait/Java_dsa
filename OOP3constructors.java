public class OOP3constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Hiruzen");
        Student s2 = new Student();
        Student s3 = new Student(9383);
        System.out.println(s1.name);
        System.out.println(s3.roll);

        //For copy const

        Student s5 = new Student();
        s5.name = "Hidan";
        s5.pwd = "abc";
        s5.roll = 23344;

        Student s6 = new Student(s5);
        s6.pwd = "xyz";
    }
}

class Student {
    String name;
    int roll;
    String pwd;

    //Construtor

    //Non-paramitrez constructor
    Student() {
        System.out.println("Constructor is called....");
    }

    //paramitrez constructor
    Student(String newName) {
        this.name = newName;
    }

    Student(int newRoll) {
        this.roll = newRoll;
    }

    //Copy Constructor
    Student(Student s5) {
        this.name = name;
        this.roll = roll;
    }


}
