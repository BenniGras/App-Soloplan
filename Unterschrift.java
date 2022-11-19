public class Unterschrift {
    Vertragspartner vertragspartner;
    String datum;
    String unterschrift;

    Unterschrift(Vertragspartner vp, String datum, String unterschrift) {
        this.vertragspartner = vp;
        this.datum = datum;
        this.unterschrift = unterschrift;
    }

    public String toString() {
        return datum + ", " + unterschrift + " (" + vertragspartner.toString() + ")";
    }
}
