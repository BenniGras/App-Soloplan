public class Kunde {
    String name;
    Adresse adresse;

    Kunde() {
        name = "Musterfirma";
        adresse = new Adresse();
    }

    Kunde(String name) {
        this();
        this.name = name;
    }

    Kunde(String name, Adresse adresse) {
        this(name);
        this.adresse = adresse;
    }

    public String toString() {
        return name;
    }
}
