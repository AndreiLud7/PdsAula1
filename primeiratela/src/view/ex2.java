package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textprimeiro;
	private JTextField textsegundo;
	private JButton btnlimpar;
	private JButton Fechar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex2 frame = new ex2();
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
	public ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textprimeiro = new JTextField();
		textprimeiro.setBounds(53, 42, 86, 20);
		contentPane.add(textprimeiro);
		textprimeiro.setColumns(10);
		
		textsegundo = new JTextField();
		textsegundo.setBounds(191, 42, 86, 20);
		contentPane.add(textsegundo);
		textsegundo.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textprimeiro.getText();
				String sobre = textsegundo.getText();
				JOptionPane.showMessageDialog(null, "nome completo = " +nome + " "+ sobre);
			}   
		});
		btnNewButton.setBounds(36, 87, 89, 23);
		contentPane.add(btnNewButton);
		
		btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textprimeiro.setText("");
				textsegundo.setText("");
			}
		});
		btnlimpar.setBounds(135, 87, 89, 23);
		contentPane.add(btnlimpar);
		
		Fechar = new JButton("Fechar");
		Fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});
		Fechar.setBounds(234, 87, 89, 23);
		contentPane.add(Fechar);
		
		lblNewLabel = new JLabel("Primeiro nome");
		lblNewLabel.setBounds(53, 17, 86, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Segundo nome");
		lblNewLabel_1.setBounds(191, 17, 100, 14);
		contentPane.add(lblNewLabel_1);
	}

}
