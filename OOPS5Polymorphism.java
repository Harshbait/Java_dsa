public class OOPS5Polymorphism {
    public static void main(String[] args) {
        //Method Overloading
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(5, 5));
        System.out.println(c1.sum((float)1.5, (float)1.2));
        System.out.println(c1.sum(1, 2, 3));

        //Method Overriding
        Deer d1 = new Deer();
        d1.eat();        
    }
}

//Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

//Method Overriding
class Animal {
    void eat() {
        System.out.println("Eats");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grasss");
    }
}