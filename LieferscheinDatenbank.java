import java.util.Map;
import java.util.HashMap;



public class LieferscheinDatenbank {
    public Map<Integer, Lieferschein> lieferscheinDB;


    LieferscheinDatenbank() {
        lieferscheinDB = new HashMap<Integer, Lieferschein>();
    }

    public Map<Integer, Lieferschein> getDB() {
        return this.lieferscheinDB;
    }
}
