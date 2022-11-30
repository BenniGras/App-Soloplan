public class PageRouter {
    Fenster fenster;

    PageRouter(Fenster fenster) {
        this.fenster = fenster;
        fenster.add(fenster.getStartseite());
        fenster.getScanner();
        fenster.getBackend();
        }

  

    public void router(String seite) {
        fenster.remove(fenster.startseite);
        fenster.remove(fenster.scanner);
        fenster.remove(fenster.backend);
        //fenster.startseite.setVisible(false);
        //fenster.scanner.setVisible(false);
        //fenster.backend.setVisible(false);

        System.out.println("HILFE");
        switch (seite) {
            case "Startseite":
                fenster.startseite.setVisible(true);
                break;

            case "Scanner":
                fenster.scanner.setVisible(true);
                break; 

            case "Backend":
                fenster.backend.setVisible(true);
                break;
       
            default:
                break;
        }

    }
}
