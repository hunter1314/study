package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JfarmeTest02 extends JFrame{

    private static final long serialVersionUID = 1L;

    public JfarmeTest02() {
        JPanel p = new JPanel();
        p.setBackground(Color.red);
        this.add(p, BorderLayout.CENTER);
        this.addMouseListener(new MouseAdapter() {
 
            public void mouseClicked(MouseEvent e) {
                System.out.println("JfarmeTest02 clicked");
            }
 
        });
    }
 
    public static void main(String[] args) {
        JfarmeTest02 frame = new JfarmeTest02();
        
        JFrame jf = new JFrame();
        
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
