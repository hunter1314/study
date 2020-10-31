package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JfarmeTest01 extends JFrame{
    /**
     * 
     */
    private static final long serialVersionUID = 7554087008285696671L;

    public JfarmeTest01() {
        // TODO Auto-generated constructor stub
        Container container = getContentPane();
        container.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.print("单击了鼠标按键，");
                int i = e.getButton();
                if (i == MouseEvent.BUTTON1)
                    System.out.print("单击的是鼠标左键，");
                if (i == MouseEvent.BUTTON2)
                    System.out.print("单击的是鼠标中键，");
                if (i == MouseEvent.BUTTON3)
                    System.out.print("单击的是鼠标右键，");
                int clickCount = e.getClickCount();
                System.out.println("单击次数为" + clickCount + "下");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.print("鼠标按键被按下，");
                int i = e.getButton();
                if (i == MouseEvent.BUTTON1)
                    System.out.println("按下的是鼠标左键");
                if (i == MouseEvent.BUTTON2)
                    System.out.println("按下的是鼠标中键");
                if (i == MouseEvent.BUTTON3)
                    System.out.println("按下的是鼠标右键");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.print("鼠标按键被释放，");
                int i = e.getButton();
                if (i == MouseEvent.BUTTON1)
                    System.out.println("释放的是鼠标左键");
                if (i == MouseEvent.BUTTON2)
                    System.out.println("释放的是鼠标中键");
                if (i == MouseEvent.BUTTON3)
                    System.out.println("释放的是鼠标右键");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("光标移入组件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("光标移出组件");
            }
            
        });
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JfarmeTest01 frame = new JfarmeTest01();
        frame.setTitle("MouseEvent Test");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 300, 100);
    }
}
