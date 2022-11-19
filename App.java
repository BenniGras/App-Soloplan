public class App {
    
    public static void main(String[] args) {
        API api = new SimulationAPI();
        Scanner scanner = new SimulationScanner();

        long qrNumber = scanner.getQrNummer(1000000000000000L);
        try {
            Lieferschein ls = api.getLieferschein(qrNumber);
            System.out.println(ls.toString());
        } catch(NullPointerException ex) {
            System.out.println("Der Lieferschein konnte nicht gefunden werden.");
        }
        
        
    }
}
