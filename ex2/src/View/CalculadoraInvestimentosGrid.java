package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textdeposito;
	private JTextField textnumMeses;
	private JTextField textjuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lbnDeposito = new JLabel("Deposito mensal R$:");
		contentPane.add(lbnDeposito);
		
		textdeposito = new JTextField();
		contentPane.add(textdeposito);
		textdeposito.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Num. de Meses:");
		contentPane.add(lblNewLabel_2);
		
		textnumMeses = new JTextField();
		contentPane.add(textnumMeses);
		textnumMeses.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Juros ao mês %:");
		contentPane.add(lblNewLabel_3);
		
		textjuros = new JTextField();
		contentPane.add(textjuros);
		textjuros.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total investido + juros R$:");
		contentPane.add(lblNewLabel);
		
		JButton btnCalcular = new JButton("Calcular");
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
		contentPane.add(btnCalcular);
	}

}
