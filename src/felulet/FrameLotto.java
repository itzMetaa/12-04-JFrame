
package felulet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FrameLotto extends JFrame implements ActionListener{

    private JTextField txtField;
    private JButton buttonOk;
    private JPanel panelMain;
    
    public FrameLotto() {
        initComponents();
    }
    
    private void initComponents(){
        this.setTitle("Lottó");
        this.setSize(300,400);
        this.setLocationRelativeTo(null);
        
        this.panelMain = (JPanel)this.getContentPane();
        this.panelMain.setLayout(null);
        
        this.txtField = new JTextField();
        this.txtField.setLocation(20,20);
        this.txtField.setSize(250,20);
        this.txtField.setText("Sajt uwu");

        this.buttonOk = new JButton();
        this.buttonOk.setText("Sorsol");
        this.buttonOk.setLocation(20,50);
        this.buttonOk.setSize(250,25);

        this.panelMain.add(this.txtField);
        this.panelMain.add(this.buttonOk);
        this.buttonOk.addActionListener(this);
        
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonOk)) {
            txtField.setText("Hajrá 14/S!!xD:D))):)");
        }
    }
    
}
