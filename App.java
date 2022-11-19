public class App {
    
    public static void main(String[] args) {
        API api = new SimulationAPI();
        Scanner scanner = new SimulationScanner();

        int qrNumber = scanner.getQrNummer(123432757);
        try {
            Lieferschein ls = api.getLieferschein(qrNumber);
            System.out.println(ls.toString());
        } catch(NullPointerException ex) {
            System.out.println("Der Lieferschein konnte nicht gefunden werden.");
        }
        
        
    }
}
