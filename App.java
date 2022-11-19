public class App {
    
    public static void main(String[] args) {
        API api = new SimulationAPI();
        Scanner scanner = new SimulationScanner();


        int qrNumber = scanner.getQrNummer();
        Lieferschein ls = api.getLieferschein(qrNumber);
        System.out.println(ls.toString());
    }
}
