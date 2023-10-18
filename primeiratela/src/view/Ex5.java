package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.calculopeso;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtpeso;
	private JTextField textpreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex5 frame = new Ex5();
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
	public Ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe o preco do quilo");
		lblNewLabel.setBounds(162, 52, 186, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe o peso do prato");
		lblNewLabel_1.setBounds(10, 52, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btncalcula = new JButton("Calcula");
		btncalcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peso = txtpeso.getText();
				String preco = textpreco.getText();
				Float pesoF = Float.valueOf(peso);
				Float precoF = Float.valueOf(preco);
				
				calculopeso a = new calculopeso();
				Float result = a.peso(precoF, pesoF);
				JOptionPane.showMessageDialog(null, "Preço = " + String.format("%.2f", result));
	   
			
				    
			}
		});
		btncalcula.setBounds(10, 150, 89, 23);
		contentPane.add(btncalcula);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(10, 96, 86, 20);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		textpreco = new JTextField();
		textpreco.setBounds(162, 96, 86, 20);
		contentPane.add(textpreco);
		textpreco.setColumns(10);
		
		JButton btnlimpar = new JButton("limpar");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtpeso.setText("");
				textpreco.setText("");
			}
		});
		btnlimpar.setBounds(111, 150, 89, 23);
		contentPane.add(btnlimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(210, 150, 89, 23);
		contentPane.add(btnFechar);
	}

}
