public class Lieferschein {
    int nummer;
    Kunde kunde;
    Sender sender;
    Spedition spedition;

    Lieferschein(int nummer, Kunde kunde, Sender sender, Spedition spedition) {
        this.nummer = nummer;
        this.kunde = kunde;
        this.sender = sender;
        this.spedition = spedition;
    }

    public String toString() {
        return  "Liefernummer: " + nummer + "\n" + 
                "Empfänger: " + kunde.toString() + "\n" +
                "Sender: " + sender.toString() + "\n" +
                "Spedition: " + spedition.toString();
    }
}
