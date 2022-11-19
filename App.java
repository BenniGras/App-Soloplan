public class App {
    
    public static void main(String[] args) {
        APIInterface api = new SimulationAPI();
        ScannerInterface scanner = new SimulationScanner();

        int[] qrNumber = scanner.getQrNummer(new int[]{000001,001,328648273,1});
        try {
            Lieferschein ls = api.getLieferschein(qrNumber[2]);
            System.out.println(ls.toString());
        } catch(NullPointerException ex) {
            System.out.println("Der Lieferschein konnte nicht gefunden werden.");
        }
        
        
    }
}
