
package felulet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FrameLotto extends JFrame{

    private JTextField txtField;
    private JButton buttonOk;
    private JPanel panelMain;
    
    public FrameLotto() {
        initComponents();
    }
    
    private void initComponents(){
        this.setTitle("Lottó");
        this.setSize(400,350);
        this.setLocationRelativeTo(null);
        
        this.panelMain = (JPanel)this.getContentPane();
        this.panelMain.setLayout(null);
        this.txtField = new JTextField();
        this.txtField.setLocation(20,20);
        this.txtField.setSize(250,20);
        this.txtField.setText("Sajt uwu");
        this.panelMain.add(this.txtField);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }
    
}
