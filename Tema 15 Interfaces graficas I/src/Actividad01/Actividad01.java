import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Actividad01 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad01 frame = new Actividad01();
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
	public Actividad01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setName("Datos Personas");
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos:");
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Dirección:");
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		panel_1.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Estudios:");
		panel_1.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Primaria", "Eso", "Bachillerato", "FP Medio", "FP Superior", "Universidad"}));
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("INSERTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textField.getText();
				String apellidos = textField_1.getText();
				String direccion = textField_2.getText();
				String telefono = textField_3.getText();
				String email = textField_4.getText();
				String estudios = comboBox.getSelectedItem().toString();
				
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();
				
				ArrayList<String> valores= new ArrayList<>();
				valores.add(nombre);
				valores.add(apellidos);
				valores.add(direccion);
				valores.add(telefono);
				valores.add(email);
				valores.add(estudios);
				
				modelo.addRow(valores.toArray());
				
				String mensaje = "Datos insertados CORRECTAMENTE";
				JOptionPane.showMessageDialog(btnNewButton_1, "Congratulations", mensaje, ABORT);
			}
		});
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("LIMPIAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();
				modelo.setRowCount(1);
			}
		});
		panel_2.add(btnNewButton);
		
		table = new JTable();
		panel_2.add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nombre:", "Apellidos:", "Direcci\u00F3n:", "Tel\u00E9fono:", "Email:", "Estudios:"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(102);
		table.getColumnModel().getColumn(1).setPreferredWidth(106);
		table.getColumnModel().getColumn(2).setPreferredWidth(112);
		table.getColumnModel().getColumn(4).setPreferredWidth(129);
		table.getColumnModel().getColumn(5).setPreferredWidth(136);
	}

}
