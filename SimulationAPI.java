public class SimulationAPI implements API {
    public Lieferschein getLieferschein(int qrNumber) {
        Lieferschein lieferschein = createLieferschein();
        return lieferschein;
    }

    public Lieferschein createLieferschein() {
        Kunde kunde1 = new Kunde("Testfirma");
        Sender sender1 = new Sender("Amazon");
        Spedition spedition1 = new Spedition(3, "Spedition Flink");

        return new Lieferschein(3928479, kunde1, sender1, spedition1);
    }
}
