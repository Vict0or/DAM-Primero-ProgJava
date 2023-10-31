import javax.swing.*;
import java.awt.*;

public class Ejemplo01 extends JFrame {
    private JPanel panel1;
    private JLabel eti;
    private JTextField caja1;
    private JTextArea caja2;
    private JButton boton1;
    public Ejemplo01(){
        panel1 = new JPanel();
        eti = new JLabel("Escribe:");
        boton1 = new JButton("Pasalo");
        caja1 = new JTextField();
        caja1.setColumns(10);
        caja2 = new JTextArea(30,30);

        panel1.setLayout(new FlowLayout());
        panel1.add(eti);
        panel1.add(caja1);
        panel1.add(boton1);
        panel1.add(caja2);

        setContentPane(panel1);

       boton1.addActionListener(new java.awt.event.ActionListener(){
           public void actionPerformed(java.awt.event.ActionEvent evt){
               String txt = caja1.getText();
               caja2.setText(txt);
           }
       });
    }
}
