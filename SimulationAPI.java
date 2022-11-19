import java.util.Map;

public class SimulationAPI implements API {
    public Lieferschein getLieferschein(long qrNumber) {
            Map<Long, Lieferschein> db = getLieferscheinDB();
            return db.get(qrNumber);
    }

    public Lieferschein createLieferschein(long n, String k, String s, String sped) {
        Kunde kunde = new Kunde(k);
        Sender sender = new Sender(s);
        Spedition spedition = new Spedition(sped);

        return new Lieferschein(n, kunde, sender, spedition);
    }

    public Map<Long, Lieferschein> getLieferscheinDB() {
        LieferscheinDatenbank dbObject = new LieferscheinDatenbank();
        Map<Long, Lieferschein> db = dbObject.getDB();

        db.put(283647823L, createLieferschein(283647823,"Empfänger 1", "Sender 1", "Spedition 1"));
        db.put(867826783L, createLieferschein(867826783,"Empfänger 2", "Sender 2", "Spedition 2"));
        db.put(757565673L, createLieferschein(757565673,"Empfänger 3", "Sender 3", "Spedition 3"));
        db.put(123432757L, createLieferschein(123432757,"Empfänger 4", "Sender 4", "Spedition 4"));
        db.put(987698763L, createLieferschein(987698763,"Empfänger 5", "Sender 5", "Spedition 5"));

        return db;

    }
}
