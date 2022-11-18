public class Adresse {
    String straße;
    int hausnummer;
    int postleitzahl;
    String stadt;

    Adresse() {
        straße = "Musterstraße";
        hausnummer = 1;
        postleitzahl = 12345;
        stadt = "Musterstadt";
    }
    Adresse(String straße, int hausnummer, int postleitzahl, String stadt) {
        this();
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
    }
}
