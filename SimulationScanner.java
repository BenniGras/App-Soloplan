public class SimulationScanner implements ScannerInterface {
    public int[] getQrNummer() {
        return new int[] {000001, 001, 0000001, 1};
    }

    public int[] getQrNummer(int[] nummer) {
        return nummer;
    }

    public Unterschrift getUnterschrift() {
        return new Unterschrift("Jürgen Müller", "19.11.2022");
    }
    public Unterschrift getUnterschrift(String u, String d) {
        return new Unterschrift(u, d);
    }
}
