import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejemplo01 app = new Ejemplo01();
                app.setVisible(true);;
                app.setSize(400, 300);
            }
        });
    }
}