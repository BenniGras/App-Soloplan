import java.util.Map;
import java.util.HashMap;



public class LieferscheinDatenbank {
    public Map<Long, Lieferschein> lieferscheinDB;


    LieferscheinDatenbank() {
        lieferscheinDB = new HashMap<Long, Lieferschein>();
    }

    public Map<Long, Lieferschein> getDB() {
        return this.lieferscheinDB;
    }
}
