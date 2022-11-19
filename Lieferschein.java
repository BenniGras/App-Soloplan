public class Lieferschein {
    int nummer;
    Kunde kunde;
    Sender sender;
    Spedition spedition;
    Unterschrift unterschriftSpedition;
    Unterschrift unterschriftKunde;

    Lieferschein(int nummer, Kunde kunde, Sender sender, Spedition spedition) {
        this.nummer = nummer;
        this.kunde = kunde;
        this.sender = sender;
        this.spedition = spedition;
        this.unterschriftSpedition = null;
        this.unterschriftKunde = null;
    }

    public String toString() {
        String untSped;
        String untKund;
        if(unterschriftSpedition == null) {
            untSped = "";
        } else {
            untSped = this.unterschriftSpedition.toString();
        } if(unterschriftKunde == null) {
            untKund = "";
        } else untKund = this.unterschriftKunde.toString();

        return  "Liefernummer: " + nummer + "\n" + 
                "Empfänger: " + kunde.toString() + "\n" +
                "Sender: " + sender.toString() + "\n" +
                "Spedition: " + spedition.toString() + "\n" +
                "Unterschrift Spedition: " + untSped + "\n" +
                "Unterschrift Kunde: " + untKund + "\n" +
                "---------------------------------";
    }

    public String formatLiefernummer() {
        return "000000-00-0000000-0";
    }

    public void addUnterschrift(Unterschrift unterschrift, int flag) {
        if(flag == 1) {
            this.unterschriftSpedition = unterschrift;
        } else if(flag == 2) {
            this.unterschriftKunde = unterschrift;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
