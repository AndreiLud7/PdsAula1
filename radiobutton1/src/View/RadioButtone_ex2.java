package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Calculos;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Font;

public class RadioButtone_ex2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimeiro;
	private JTextField textsegundo;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtone_ex2 frame = new RadioButtone_ex2();
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
	public RadioButtone_ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primeiro número inteiro:");
		lblNewLabel.setBounds(10, 11, 163, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo número inteiro:");
		lblNewLabel_1.setBounds(10, 48, 163, 14);
		contentPane.add(lblNewLabel_1);
		
		textPrimeiro = new JTextField();
		textPrimeiro.setBounds(183, 8, 160, 20);
		contentPane.add(textPrimeiro);
		textPrimeiro.setColumns(10);
		
		textsegundo = new JTextField();
		textsegundo.setBounds(183, 45, 160, 20);
		contentPane.add(textsegundo);
		textsegundo.setColumns(10);
		
		JRadioButton rdbtnadição = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnadição);
		rdbtnadição.setBounds(10, 86, 109, 23);
		contentPane.add(rdbtnadição);
		
		JRadioButton rdbtnsubtração = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnsubtração);
		rdbtnsubtração.setBounds(10, 116, 109, 23);
		contentPane.add(rdbtnsubtração);
		
		JRadioButton rdbtnMultiplicação = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicação);
		rdbtnMultiplicação.setBounds(10, 142, 109, 23);
		contentPane.add(rdbtnMultiplicação);
		
		JRadioButton rdbtnDivisão = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisão);
		rdbtnDivisão.setBounds(10, 168, 109, 23);
		contentPane.add(rdbtnDivisão);
		
		JLabel lblresultado = new JLabel("");
		lblresultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblresultado.setBounds(152, 213, 97, 23);
		contentPane.add(lblresultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String primeiroS= textPrimeiro.getText();
				String segundoS = textsegundo.getText();
				int primeiroint = Integer.valueOf(primeiroS);
				int segundoint = Integer.valueOf(segundoS);
				    
				Calculos chamaA = new Calculos();
				Calculos chamaS = new Calculos();
				Calculos chamaM = new Calculos();
				Calculos chamaD = new Calculos();
				
				Integer mostraA = chamaA.adição(primeiroint, segundoint);
				Integer mostraS = chamaS.subtracao(primeiroint, segundoint);
				Integer mostraM = chamaM.multiplicacao(primeiroint, segundoint);
				Integer mostraD = chamaD.divisao(primeiroint, segundoint);

				if(rdbtnadição.isSelected()) {
					
					lblresultado.setText("Resultado:"+ mostraA);
				}
				else if (rdbtnsubtração.isSelected()) {
					lblresultado.setText("Resultado:"+ mostraS);
				}
				else if (rdbtnMultiplicação.isSelected()) {
					lblresultado.setText("Resultado:"+ mostraM);
				}
				else if(rdbtnDivisão.isSelected()) {
					lblresultado.setText("Resultado:"+ mostraD);
				}
			}			
		});
		btnCalcular.setBounds(53, 213, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}

}
