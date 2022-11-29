import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;

public class Tabliczka {

    private JTable table;
    private String[][] data;
    private int x = 0;
    private int y = 0;
    final int w = 331;
    final int h = 166;
    private boolean state = false;
    Tabliczka(){
        setData();
        defaultTableSettings();
    }

    private void setData() {

        this.data = new String[11][11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
               if(i==0 && j==0){
                   this.data[i][j] = "";
               }
               else if (i == 0)
                    this.data[i][j] = String.valueOf(j);
                else if (j == 0)
                    this.data[i][j] = String.valueOf(i);
                else {
                    int k = i * j;
                    this.data[i][j] = String.valueOf(k);
                }
            }
        }
    }

    private void defaultTableSettings(){
        String[] header = {"","","","","","","","","","",""};
        table = new JTable(this.data,header);
        table.setTableHeader(null);
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 11; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(center);
        }
        for (int i = 0; i < 11; i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            column.setMaxWidth(30);
        }

        table.setGridColor(Color.BLACK);
        table.setRowHeight(15);
        table.setIntercellSpacing(new Dimension(0, 0));
        table.setDefaultEditor(Object.class, null);
        table.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
        table.setBounds(-w,-h,w,h);
        table.setVisible(true);
    }

    public JTable getTable() {
    return this.table;
    }

    public void setBounds(int x, int y){
        table.setBounds(x,y,w,h);

    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
