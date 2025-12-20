public class OOPS4Inheritance {
    public static void main(String[] args) {

        // Single level
        // Fish sharko = new Fish();
        // sharko.eat();
        
        // // Multi level
        // Dog jack = new Dog();
        // jack.eat(); 
        // jack.legs = 4;
        // System.out.println(jack.legs);

        // Hybrid Inheritance
        Shark s = new Shark();
        s.eat();
        s.swim();
        s.king();

        System.out.println("------------");

        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bff();

        System.out.println("------------");

        Eagle e = new Eagle();
        e.eat();
        e.fly();
        e.sky();
    }
}

//Base class
class Animal {
    String color;
    
    void eat() {
        System.out.println("Eat");
    }

    void breads() {
        System.out.println("Breadts");
    }
}

//Derived Class extends means properties/methods ko kichke andar lana
// class Fish extends Animal {
//     int fins;
//     void swim() {
//         System.out.println("Swims");
//     }
// }

//Multi level Inheritance

// class Mammal extends Animal {
//     int legs;
// }

// class Dog extends Mammal {
//     String breed;
// }

// Hierarchial Inheritance

// class Mammal extends Animal {
//    void walk() {
//     System.out.println("Walks");
//    }
// }
// class Fish extends Animal {
//    void swim() {
//     System.out.println("Swims");
//    }
// }
// class Bird extends Animal {
//    void fly() {
//     System.out.println("Fly");
//    }
// }

//Hybrid Inheritance
class Mammal extends Animal {
   void walk() {
    System.out.println("Walks");
   }
}
class Fish extends Animal {
   void swim() {
    System.out.println("Swims");
   }
}
class Bird extends Animal {
   void fly() {
    System.out.println("Fly");
   }
}

class Shark extends Fish {
    void king() {
        System.out.println("King of Water");
    }
}

class Dolphin extends Fish {
    void queen() {
        System.out.println("Queen of Water");
    }
}

class Dog extends Mammal {
    void bff() {
        System.out.println("He is bestes best friend Named Jack");
    }
}

class Mongoose extends Mammal {
    void jug() {
        System.out.println("Mongoose is wild Animal");
    }
}

class Eagle extends Bird {
    void sky() {
        System.out.println("Ruler of the sky");
    }
}

class Humming extends Bird {
    void small() {
        System.out.println("Small Bird");
    }
}