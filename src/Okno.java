import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Okno extends JFrame implements MouseListener {
    Tabliczka table;
    Okno(){


        table = new Tabliczka();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // rozmiar okna na caly ekran
        this.setSize(new Dimension(screenSize.width, screenSize.height));
        this.addMouseListener(this);
        this.setTitle("Programowanie obiektowe 2 - Laboratorium 3");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon icon = new ImageIcon("ico.png");
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(new Color(0x123456));
        this.setVisible(true);
        this.add(table.getTable());
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        table.setBounds(e.getX()-(table.getW()/2),e.getY()-(table.getH()/2));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
