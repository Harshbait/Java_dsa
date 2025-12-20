public class OOP2sgettersSeters {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        // We use private so we cant use . property like this
        // p1.color = "yellow";

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    // This is getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    //This is setter
    void setColor(String newColor) {
        this.color = newColor;
    }

    void getTip(int newTip) {
        this.tip = newTip;
    }
}