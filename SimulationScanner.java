public class SimulationScanner implements ScannerInterface {
    public int[] getQrNummer() {
        return new int[] {000001, 001, 0000001, 1};
    }

    public int[] getQrNummer(int[] nummer) {
        return nummer;
    }

    public Unterschrift getUnterschrift() {
        return new Unterschrift(new Kunde(), "19.11.2022", "Jürgen Müller");
    }
}
