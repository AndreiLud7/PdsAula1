import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setBackground(new Color(0, 64, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblolamundo = new JLabel("Ola mundo");
		lblolamundo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O foco esta no JLabel");
			}
		});

		lblolamundo.setBounds(199, 11, 84, 26);
		contentPane.add(lblolamundo);
		
		JButton btnfechar = new JButton("Fechar");
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnfechar.setBounds(38, 202, 89, 23);
		contentPane.add(btnfechar);
		
		JLabel nome = new JLabel("nome");
		nome.setBounds(129, 61, 46, 14);
		contentPane.add(nome);
		
		
		txtnome = new JTextField();
		txtnome.setBounds(197, 58, 86, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		JButton btnvalidar = new JButton("Validar");
		btnvalidar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			String nome = txtnome.getText();
			JOptionPane.showMessageDialog(null, "O nome digitado é: "+ nome);
			}
			
		});
		btnvalidar.setBounds(304, 202, 89, 23);
		contentPane.add(btnvalidar);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnome.setText("");
			}
		});
		btnlimpar.setBounds(176, 202, 89, 23);
		contentPane.add(btnlimpar);
	}
}
