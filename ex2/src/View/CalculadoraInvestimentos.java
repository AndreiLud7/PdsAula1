package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textdeposito;
	private JTextField textnumMeses;
	private JLabel lbnjuros;
	private JTextField textjuros;
	private JLabel lblTotalinventido;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Deposito mensal R$:");
		lblNewLabel.setBounds(68, 0, 138, 14);
		contentPane.add(lblNewLabel);
		
		textdeposito = new JTextField();
		textdeposito.setBounds(26, 22, 180, 20);
		contentPane.add(textdeposito);
		textdeposito.setColumns(10);
		
		JLabel lblnnummeses = new JLabel("Num. de meses:");
		lblnnummeses.setBounds(68, 53, 98, 14);
		contentPane.add(lblnnummeses);
		
		textnumMeses = new JTextField();
		textnumMeses.setBounds(26, 78, 180, 20);
		contentPane.add(textnumMeses);
		textnumMeses.setColumns(10);
		
		lbnjuros = new JLabel("Juros ao mês %:");
		lbnjuros.setBounds(68, 109, 112, 14);
		contentPane.add(lbnjuros);
		
		textjuros = new JTextField();
		textjuros.setBounds(26, 134, 180, 20);
		contentPane.add(textjuros);
		textjuros.setColumns(10);
		
		lblTotalinventido = new JLabel("Total investido + juros R$:");
		lblTotalinventido.setBounds(42, 165, 164, 14);
		contentPane.add(lblTotalinventido);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String deposito = textdeposito.getText();
				 String numeromeses = textnumMeses.getText();
				 String juros = textjuros.getText();
				 
				 double depositodouble = Double.valueOf(deposito);
				 int numeromesesint = Integer.valueOf(numeromeses);
				 double jurosdouble = Double.valueOf(juros);
				 
				 
				 Investimento a = new Investimento(numeromesesint, jurosdouble, depositodouble);
				 double chama = (double) a.calculaTotal();
				 
				 JOptionPane.showMessageDialog(null, "Resultado = "+ chama);
			}
		});
		btnCalcular.setBounds(67, 189, 89, 23);
		contentPane.add(btnCalcular);
	}
}
