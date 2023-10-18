package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField escreva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex1 frame = new ex1();
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
	public ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltemperatura = new JLabel("Temperatura");
		lbltemperatura.setBounds(29, 34, 99, 14);
		contentPane.add(lbltemperatura);
		
		escreva = new JTextField();
		escreva.setBounds(154, 31, 220, 20);
		contentPane.add(escreva);
		escreva.setColumns(10);
		
		JButton btncalcula = new JButton("calcular");
		btncalcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pegar a temp digitada no texto
				String tempdigitada = escreva.getText();
				//converter temp string para float 
				Float TempconvertidaF = Float.valueOf(tempdigitada);
				//criar objeto da classe conversaotemperatura
				ConversaoTemperatura conv = new ConversaoTemperatura();
				//chamar metodo conversão
				Float tempc = conv.converterFtoC(TempconvertidaF);
				//mostrar na tela
				JOptionPane.showMessageDialog(null, "Temperatura convertida : "+ String.format("%.2f", tempc));
			}
		});
		btncalcula.setBounds(29, 89, 89, 23);
		contentPane.add(btncalcula);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				escreva.setText("");
			}
		});
		btnLimpar.setBounds(163, 89, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnfechar = new JButton("Fechar");
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnfechar.setBounds(285, 89, 89, 23);
		contentPane.add(btnfechar);
	}

}
