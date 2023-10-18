package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculolitros;


import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpreco;
	private JTextField textquantilitros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex4 frame = new ex4();
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
	public ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textpreco = new JTextField();
		textpreco.setBounds(154, 46, 86, 20);
		contentPane.add(textpreco);
		textpreco.setColumns(10);
		
		JLabel lblpreco = new JLabel("Informe o valor da gasolina");
		lblpreco.setBounds(154, 21, 162, 14);
		contentPane.add(lblpreco);
		
		JLabel lblquantidade = new JLabel("Informe quantos litros");
		lblquantidade.setBounds(10, 21, 178, 14);
		contentPane.add(lblquantidade);
		
		textquantilitros = new JTextField();
		textquantilitros.setBounds(10, 46, 86, 20);
		contentPane.add(textquantilitros);
		textquantilitros.setColumns(10);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String preco = textpreco.getText();			  // cria as strings e puxa elas do texto
					String quantilitros = textquantilitros.getText(); 
					
					Float precoFloat = Float.valueOf(preco);	 //converte as strings para float
					Float quantilitrosfloat = Float.valueOf(quantilitros);
					
					Calculolitros objconvertido = new Calculolitros(); //cria objeto da classe
					
					Float convertido = objconvertido.calculolitros(quantilitrosfloat, precoFloat);//puxa o metodo de conversao
					
					
					JOptionPane.showMessageDialog(null, "Resultado" + String.format("%.2f", convertido)); //mostra na tela
					//(null, "Preço = " + String.format("%.2f", result));
					
			}
		});
		btncalcular.setBounds(10, 91, 89, 23);
		contentPane.add(btncalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textpreco.setText("");
				textquantilitros.setText("");
			}
		});
		btnLimpar.setBounds(109, 91, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(211, 91, 89, 23);
		contentPane.add(btnFechar);
	}
}
