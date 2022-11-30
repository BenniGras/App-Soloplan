import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Fenster extends JFrame implements ActionListener{

    PageRouter router;
    APIInterface api;
    //ScannerInterface scanner;
    JButton scanButton;
    JButton backendButton;
    JPanel startseite;
    JPanel scanner;
    JPanel backend;
    
    Fenster() {
        this.setTitle("CarLo Scan");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(450, 950);
        this.setVisible(true);
        this.setLayout(null);

        this.api = new SimulationAPI();
        this.router = new PageRouter(this);
        
        //this.scanner = new SimulationScanner();

        
    }

    public JPanel getStartseite() {
        startseite = new JPanel();
        startseite.setBounds(0, 0, 450, 950);
        startseite.setLayout(null);

        scanButton = new JButton("SCAN");
        scanButton.setForeground(Color.WHITE);
        scanButton.setBackground(new Color(0x980044));
        scanButton.setBounds(125,250,200,100);
        scanButton.setFont(new Font("Arial", Font.BOLD, 35));
        scanButton.addActionListener(this);

        backendButton = new JButton("BACKEND");
        backendButton.setForeground(new Color(0x980044));
        backendButton.setBackground(Color.WHITE);
        backendButton.setBounds(125, 400, 200, 100);
        backendButton.setFont(new Font("Arial", Font.BOLD, 30));
        backendButton.addActionListener(this);
        
        startseite.add(scanButton);
        startseite.add(backendButton);
        return startseite;
    }

    public JPanel getScanner() {
        scanner = new JPanel();
        scanner.setBounds(0, 0, 450, 950);
        scanner.setLayout(null);

        JLabel qrCodeLabel = new JLabel();
        qrCodeLabel.setText("QR-Code");
        qrCodeLabel.setBounds(75, 150, 300, 50);
        qrCodeLabel.setFont(new Font("Arial", Font.PLAIN, 30));

        JTextField qrCode = new JTextField();
        qrCode.setBounds(75, 200, 300, 50);
        qrCode.setFont(new Font("Arial", Font.PLAIN, 25));

        JLabel unterschriftLabel = new JLabel();
        unterschriftLabel.setText("Unterschrift");
        unterschriftLabel.setBounds(75, 300, 300, 50);
        unterschriftLabel.setFont(new Font("Arial", Font.PLAIN, 30));

        JTextField unterschrift = new JTextField();
        unterschrift.setBounds(75, 350, 300, 50);
        unterschrift.setFont(new Font("Arial", Font.PLAIN, 25));

        JButton scanButton = new JButton("SCAN");
        scanButton.setForeground(Color.WHITE);
        scanButton.setBackground(new Color(0x980044));
        scanButton.setBounds(125, 500, 200, 100);
        scanButton.setFont(new Font("Arial", Font.BOLD, 35));
        scanButton.addActionListener(this);

        //scanner.add(qrCodeLabel);
        scanner.add(qrCode);
        scanner.add(unterschriftLabel);
        scanner.add(unterschrift);
        scanner.add(scanButton);
        return scanner;
    }

    public JPanel getBackend() {
        backend = new JPanel();
        backend.setBounds(0, 0, 450, 950);
        backend.setLayout(null);
        int margin = 25;

        Lieferschein ls1 = this.api.getLieferschein(3286482);
        Lieferschein ls2 = this.api.getLieferschein(8678267);
        Lieferschein ls3 = this.api.getLieferschein(7575656);
        Lieferschein[] lsListe = new Lieferschein[]{ls1, ls2, ls3};

        for (int i = 0; i < lsListe.length; i++) {
            JPanel card = new JPanel();
            card.setBorder(BorderFactory.createLineBorder(new Color(0x980044)));  
            card.setBounds(25, margin + 275 * i, 400, 250);
            //card.setBackground(Color.GRAY);
            card.setLayout(null);
            

            JLabel liefernummer = new JLabel();
            liefernummer.setText("Liefernummer: " + lsListe[i].nummer);
            liefernummer.setFont(new Font("Arial", Font.PLAIN, 30));
            liefernummer.setBounds(15, 10, 370, 30);

            JLabel sender = new JLabel();
            sender.setText("Von: " + lsListe[i].sender.toString());
            sender.setFont(new Font("Arial", Font.PLAIN, 30));
            sender.setBounds(15, 50, 370, 30);

            JLabel kunde = new JLabel();
            kunde.setText("Zu: " + lsListe[i].kunde.toString());
            kunde.setFont(new Font("Arial", Font.PLAIN, 30));
            kunde.setBounds(15, 90, 370, 30);

            JLabel spedition = new JLabel();
            spedition.setText("Über: " + lsListe[i].spedition.toString());
            spedition.setFont(new Font("Arial", Font.PLAIN, 30));
            spedition.setBounds(15, 130, 370, 30);

            String untSped;
            String untKund;
            if(lsListe[i].unterschriftSpedition == null) {
                untSped = "";
            } else {
                untSped = lsListe[i].unterschriftSpedition.toString();
            } if(lsListe[i].unterschriftKunde == null) {
                untKund = "";
            } else untKund = lsListe[i].unterschriftKunde.toString();

            JLabel uS = new JLabel();
            uS.setText("Spedition: " + untSped);
            uS.setFont(new Font("Arial", Font.PLAIN, 30));
            uS.setBounds(15, 170, 370, 30);

            JLabel uK = new JLabel();
            uK.setText("Kunde: " + untKund);
            uK.setFont(new Font("Arial", Font.PLAIN, 30));
            uK.setBounds(15, 210, 370, 30);

            card.add(liefernummer);
            card.add(sender);
            card.add(kunde);
            card.add(spedition);
            card.add(uS);
            card.add(uK);

            backend.add(card);
        }
        

        return backend;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == scanButton) {
            this.getContentPane().removeAll();
            this.add(this.scanner);
        } else if(e.getSource() == backendButton) {
            this.getContentPane().removeAll();
            this.add(this.backend);
        }
        
    }
}
