public class Spedition extends Vertragspartner {
    int nummer;    
    String name;

    Spedition() {
        nummer = 1;
        name = "Musterspedition";
    }
    Spedition(String name) {
        this();
        this.name = name;
    }

    Spedition(int nummer, String name) {
        this(name);
        this.nummer = nummer;
    }

    public String toString() {
        return name;
    }
}
