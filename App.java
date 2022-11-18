public class App {
    
    public static void main(String[] args) {
        SoloplanAPI api = new SoloplanAPI();
        Lieferschein ls = api.getLieferschein(0);
        System.out.println(ls.toString());
    }
}
