public class App {
    
    public static void main(String[] args) {
        SoloplanAPI api = new SoloplanAPI();
        QrScanner scanner = new QrScanner();


        int qrNumber = scanner.getQrNummer();
        Lieferschein ls = api.getLieferschein(qrNumber);
        System.out.println(ls.toString());
    }
}
