import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;


public class MyFrame extends JFrame {

    MyFrame(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // rozmiar okna na caly ekran
        this.setSize(new Dimension(screenSize.width, screenSize.height));

        this.setTitle("Programowanie obiektowe 2 - Laboratorium 3");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon icon = new ImageIcon("ico.png");
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(new Color(0x123456));
        this.setVisible(true);
    }
}
