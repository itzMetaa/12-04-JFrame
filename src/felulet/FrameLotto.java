
package felulet;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FrameLotto extends JFrame implements ActionListener{

    private JTextField txtField;
    private JButton buttonOk;
    private JButton buttonRendez;
    private JPanel panelMain;
    private JComboBox comboBoxTipus;
    
    
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
        this.txtField.setFont(new Font("Arial", Font.PLAIN,20));

        this.buttonOk = new JButton();
        this.buttonOk.setText("Sorsol");
        this.buttonOk.setLocation(20,50);
        this.buttonOk.setSize(250,25);
        this.txtField.setFont(new Font("Arial", Font.PLAIN,20));
        
        this.buttonRendez = new JButton();
        this.buttonRendez.setText("Rendez");
        this.buttonRendez.setLocation(20,50);
        this.buttonRendez.setSize(250,25);
        this.buttonRendez.setFont(new Font("Arial", Font.PLAIN,20));
        
        
        this.comboBoxTipus = new JComboBox();
        this.comboBoxTipus.addItem("Ötös");
        this.comboBoxTipus.addItem("Hatos");
        this.comboBoxTipus.addItem("Skandi");
        this.comboBoxTipus.setLocation(20,80);
        this.comboBoxTipus.setSize(200,50);
        this.txtField.setFont(new Font("Arial", Font.PLAIN,20));
        
        
        this.panelMain.add(this.txtField);
        this.panelMain.add(this.buttonOk);
        this.panelMain.add(this.buttonRendez);
        this.buttonOk.addActionListener(this);
        this.buttonRendez.addActionListener(this);
        
 
        
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
