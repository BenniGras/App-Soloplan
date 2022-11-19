import javax.swing.JFrame;

public class Fenster extends JFrame {
    
    Fenster() {
        this.setTitle("CarLo Scan");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(400, 800);
        this.setVisible(true);
    }
}
