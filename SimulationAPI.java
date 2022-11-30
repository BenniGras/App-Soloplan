import java.util.Map;

public class SimulationAPI implements APIInterface {

    public Map<Integer, Lieferschein> db = getLieferscheinDB();

    public Lieferschein getLieferschein(int qrNumber) {
        return db.get(qrNumber);
    }

    public void setLieferschein(Lieferschein l) {
        db.replace(l.nummer, l);
    }

    public Lieferschein createLieferschein(int nummer, String kunde, String sender, String spedition) {
        Kunde k = new Kunde(kunde);
        Sender s = new Sender(sender);
        Spedition sped = new Spedition(spedition);

        return new Lieferschein(nummer, k, s, sped);
    }

    public Map<Integer, Lieferschein> getLieferscheinDB() {
        LieferscheinDatenbank dbObject = new LieferscheinDatenbank();
        Map<Integer, Lieferschein> db = dbObject.getDB();

        db.put(3286482, createLieferschein(3286482,"Bau GmbH", "Architekt", "ErdWagen"));
        db.put(8678267, createLieferschein(8678267,"Backer GmbH", "Müller GmbH", "Mehl Transport"));
        db.put(7575656, createLieferschein(7575656,"Geld AG", "Drucker KG", "SafeSpeed"));
        db.put(1234327, createLieferschein(1234327,"Empfänger 4", "Sender 4", "Spedition 4"));
        db.put(9876987, createLieferschein(9876987,"Empfänger 5", "Sender 5", "Spedition 5"));

        return db;

    }
}
