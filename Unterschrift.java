public class Unterschrift {
    String unterschrift;    
    String datum;

    Unterschrift(String unterschrift, String datum) {
        this.unterschrift = unterschrift;
        this.datum = datum;
        
    }

    public String toString() {
        return unterschrift + ", " + datum;
    }
}
