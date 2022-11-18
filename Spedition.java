public class Spedition {
    int nummer;    
    String name;

    Spedition() {
        nummer = 1;
        name = "Musterspedition";
    }

    Spedition(int nummer, String name) {
        this.nummer = nummer;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
