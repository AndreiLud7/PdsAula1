package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculolitros;
import model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textaltura;
	private JTextField textbase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informe a altura");
		lblNewLabel.setBounds(20, 38, 174, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Informe a base");
		lblNewLabel_1.setBounds(148, 38, 286, 14);
		contentPane.add(lblNewLabel_1);
		
		textaltura = new JTextField();
		textaltura.setBounds(20, 63, 86, 20);
		contentPane.add(textaltura);
		textaltura.setColumns(10);
		
		textbase = new JTextField();
		textbase.setBounds(148, 63, 86, 20);
		contentPane.add(textbase);
		textbase.setColumns(10);
		
		JButton btncalcule = new JButton("Calcula");
		btncalcule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String altura = textaltura.getText();
				String base = textbase.getText();
				Float alturaF = Float.valueOf(altura); // conversao e puxar os textos digitados
				Float baseF = Float.valueOf(base);
				
				Retangulo a = new Retangulo(); 
				Retangulo b = new Retangulo();
				
				Float resultadoa = a.calculoper(baseF, alturaF);
				Float resultadob = b.calculoarea(baseF, alturaF);
				
				JOptionPane.showMessageDialog(null, "Perimetro = "+ resultadoa + " area = "+ resultadob);
			
				
				
				
				
			}
		});
		btncalcule.setBounds(10, 119, 89, 23);
		contentPane.add(btncalcule);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textaltura.setText("");
				textbase.setText("");
			}
		});
		btnNewButton.setBounds(105, 119, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(205, 119, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
