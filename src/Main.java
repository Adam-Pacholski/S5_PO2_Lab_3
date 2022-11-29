import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // rozmiar okna na caly ekran
        ImageIcon icon = new ImageIcon("");
        frame.setTitle("Programowanie obiektowe 2 - Laboratorium 3");
        frame.setSize(new Dimension(screenSize.width, screenSize.height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}