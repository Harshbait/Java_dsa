public class OPPS6Abstration {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    
        BaldEagle e = new BaldEagle();
        e.walk();
        e.eat();

        // Cannot instantiate the type AnimalJava(16777373)
        // Animal is abstract; cannot be instantiated
        // Animal a = new Animal();

        System.out.println(e.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "orange";
    }
    
    void eat() {
        System.out.println("Animal eats");
    }

    abstract  void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class BaldEagle extends Animal {
    void changeColor() {
        color = "White, Yellow, brown";
    }
    void walk() {
        System.out.println("No need to walk, He can fly, but if he want to walk he can walk on 2Legs");
    }
}