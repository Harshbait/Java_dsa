import java.util.*;

public class OOPS9Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        
        BaldEagle e = new BaldEagle();
        System.out.println(e.color);
    
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "brown";
        System.out.println("Horse Constructor is called");
    }
}

class BaldEagle extends Animal {
    BaldEagle() {
        super.color = "White";
        System.out.println("Eagle Constructor is called");
    }
}