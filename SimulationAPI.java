import java.util.Map;

public class SimulationAPI implements API {
    public Lieferschein getLieferschein(int qrNumber) {
            Map<Integer, Lieferschein> db = getLieferscheinDB();
            return db.get(qrNumber);
    }

    public Lieferschein createLieferschein(int n, String k, String s, String sped) {
        Kunde kunde = new Kunde(k);
        Sender sender = new Sender(s);
        Spedition spedition = new Spedition(sped);

        return new Lieferschein(n, kunde, sender, spedition);
    }

    public Map<Integer, Lieferschein> getLieferscheinDB() {
        LieferscheinDatenbank dbObject = new LieferscheinDatenbank();
        Map<Integer, Lieferschein> db = dbObject.getDB();

        db.put(283647823, createLieferschein(283647823,"Empfänger 1", "Sender 1", "Spedition 1"));
        db.put(867826783, createLieferschein(867826783,"Empfänger 2", "Sender 2", "Spedition 2"));
        db.put(757565673, createLieferschein(757565673,"Empfänger 3", "Sender 3", "Spedition 3"));
        db.put(123432757, createLieferschein(123432757,"Empfänger 4", "Sender 4", "Spedition 4"));
        db.put(987698763, createLieferschein(987698763,"Empfänger 5", "Sender 5", "Spedition 5"));

        return db;

    }
}
