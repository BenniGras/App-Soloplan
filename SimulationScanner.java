public class SimulationScanner implements ScannerInterface {
    public int[] getQrNummer() {
        return new int[] {000001, 001, 0000001, 1};
    }

    public int[] getQrNummer(int[] nummer) {
        return nummer;
    }

    public String getUnterschrift() {
        return "Unterschrift";
    }
}
