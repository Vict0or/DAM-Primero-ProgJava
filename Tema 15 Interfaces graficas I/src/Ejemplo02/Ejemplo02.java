import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ejemplo02 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField JTextField1;
	private JTextField JTextField2;
	private JTable JTable;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo02 frame = new Ejemplo02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Ejemplo02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel JLabel1 = new JLabel("NOMBRE:");
		panel.add(JLabel1);
		
		JTextField1 = new JTextField();
		panel.add(JTextField1);
		JTextField1.setColumns(10);
		
		JLabel JLabel2 = new JLabel("APELLIDOS");
		panel.add(JLabel2);
		
		JTextField2 = new JTextField();
		panel.add(JTextField2);
		JTextField2.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JButton JButton1 = new JButton("Agregar");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Obtenemos el texto de ambos campos:
				String nombre = JTextField1.getText();
				String apellido = JTextField2.getText();
				
				//Obtenemos el modelo de la tabla
				DefaultTableModel modelo = (DefaultTableModel) JTable.getModel();
				
				//Agregamos valores capturados en un arrayList
				ArrayList<String> valores = new ArrayList<>();
				valores.add(nombre);
				valores.add(apellido);
				
				// Pasamos los valores obtenidos en el Array a la tabla, a traves de su modelo
				modelo.addRow(valores.toArray());
			}
		});
		panel_3.add(JButton1);
		
		JButton JButton2 = new JButton("Eliminar Fila");
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Vamos eliminar fila seleccionada y primero Obtenemos el numero de Fila
				int fila = JTable.getSelectedRow();
				
				//Obtenemos el modelo de la tabla
				DefaultTableModel modelo = (DefaultTableModel) JTable.getModel();
				
				//Eliminamos la fila
				modelo.removeRow(fila);
				
				//Ventana de informacion 
				String mensaje = " Registro Eliminado correctamente.";
				JOptionPane.showMessageDialog(JButton2, mensaje);
			}
		});
		panel_3.add(JButton2);
		
		JTable = new JTable();
		JTable.setShowGrid(false);
		JTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"NOMBRE:", "APELLIDOS:"},
			},
			new String[] {
				"NOMBRE", "APELLIDOS"
			}
		));
		JTable.getColumnModel().getColumn(0).setPreferredWidth(196);
		JTable.getColumnModel().getColumn(1).setPreferredWidth(238);
		panel_1.add(JTable);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton JButton3 = new JButton("Eliminar Todo");
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ventana de Emergencia
				String mensaje2 = "Acceso DENEGADO, no puede borrar todo el REGISTRO.";
				JOptionPane.showConfirmDialog(JButton3, mensaje2, "Emergencia", JOptionPane.WARNING_MESSAGE);
			}
		});
		panel_2.add(JButton3);
	}

}
