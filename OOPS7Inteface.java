
import javax.sql.rowset.CachedRowSet;

public class OOPS7Inteface {
    public static void main(String[] args) {
        Vager v = new Vager();
        v.moves();

        Beer b = new Beer();
        b.eats();
    }
}

interface ChessPlayer {
    void moves();
}

class Vager implements ChessPlayer {
    public void moves() {
        System.out.println("Up down left right diagonal");
    }
}
class Rooke implements ChessPlayer {
    public void moves() {
        System.out.println("Up down left right");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up down left right diagonal (By one step)");
    }
}

// Muntiple Inheritance
interface Harbivour {
    void eats();
}

interface Carvinour {
    void eats();
}

class Beer implements Harbivour, Carvinour {
    public void eats() {
        System.out.println("Eat both veg nad non-veg");
    }
}