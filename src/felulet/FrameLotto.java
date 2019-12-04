
package felulet;

import javax.swing.JFrame;


public class FrameLotto extends JFrame{

    public FrameLotto() {
        initComponents();
    }
    
    private void initComponents(){
        this.setTitle("Lottó");
        this.setSize(400,350);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }
    
}
