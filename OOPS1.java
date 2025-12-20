
zz
public class OOPS1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();   //Constructor            
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color + " " + p1.tip);
        
        BankAcc bck = new BankAcc();
        bck.username = "Jlda";
        bck.setPasseord("jhaschacs");
    }
}

class BankAcc {
    String username;
    private String pwd;

    public void setPasseord(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float cgpa;

    void calcPercent(int chem, int phy, int math) {
        cgpa = (phy + chem + math)/2;
    }
}
