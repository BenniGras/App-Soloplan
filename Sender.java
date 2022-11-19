public class Sender extends Vertragspartner {
    String name;
    Adresse adresse;


    Sender() {
        name = "Musterfirma";
        adresse = new Adresse();
    }

    Sender(String name) {
        this();
        this.name = name;
    }

    Sender(String name, Adresse adresse) {
        this(name);
        this.adresse = adresse;
    }

    public String toString() {
        return name;
    }
}
