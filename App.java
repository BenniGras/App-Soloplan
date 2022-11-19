public class App {
    
    public static void main(String[] args) {
        ScannerInterface scanner = new SimulationScanner();
        APIInterface api = new SimulationAPI();

        int[] qrNumber = scanner.getQrNummer(new int[]{000001,001,328648273,1});
        Unterschrift unterschrift = scanner.getUnterschrift();
        try {
            Lieferschein ls = api.getLieferschein(qrNumber[2]);
            System.out.println(ls.toString());
            System.out.println(unterschrift.toString());
        } catch(NullPointerException ex) {
            System.out.println("Der Lieferschein konnte nicht gefunden werden.");
        }
       
        
        
    }
}
