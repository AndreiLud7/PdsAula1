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
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class CalculadoraInvestimentosGridFlowlayout extends JFrame {

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
					CalculadoraInvestimentosGridFlowlayout frame = new CalculadoraInvestimentosGridFlowlayout();
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
	public CalculadoraInvestimentosGridFlowlayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntSobre = new JMenuItem("Sobre");
		mntSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formsobre chama = new formsobre();
				formsobre formsobre = new formsobre();
				formsobre.setVisible(true); 
				
			}
		});
		mnAjuda.add(mntSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lbnDeposito = new JLabel("Deposito mensal R$:");
		contentPane.add(lbnDeposito);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textdeposito = new JTextField();
		textdeposito.setText(" ");
		panel.add(textdeposito);
		textdeposito.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Num. de Meses:");
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textnumMeses = new JTextField();
		panel_1.add(textnumMeses);
		textnumMeses.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Juros ao mês %:");
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textjuros = new JTextField();
		panel_2.add(textjuros);
		textjuros.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Total investido + juros R$:");
		contentPane.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		JLabel lblres = new JLabel("");
		panel_3.add(lblres);
		
		JPanel panel_5 = new JPanel();
		contentPane.add(panel_5);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnCalcular = new JButton("Calcular");
		panel_4.add(btnCalcular);
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
				 
				 lblres.setText("O resultado = " + chama);
				
				  
			}
		});
	}

}
