public class App {
    
    public static void main(String[] args) {

        Fenster fenster = new Fenster();

        ScannerInterface scanner = new SimulationScanner();
        APIInterface api = new SimulationAPI();

        int[] qrNumber = scanner.getQrNummer(new int[]{000001, 001, 3286482, 1});
        Unterschrift unterschrift = scanner.getUnterschrift("Herbert Schmidt", "19.11.2022");
        try {
            Lieferschein ls = api.getLieferschein(qrNumber[2]);
            ls.addUnterschrift(unterschrift, qrNumber[3]);
            api.setLieferschein(ls);

        } catch(NullPointerException ex) {
            System.out.println("Der Lieferschein konnte nicht gefunden werden.");
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Ungültiger QR-Code");
        }    
    }
}
