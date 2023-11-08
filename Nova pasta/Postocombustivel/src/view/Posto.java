package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import modelo.combustiveis;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoleopreco;
	private JTextField textcomum;
	private JTextField textAditivada;
	private JTextField textEtanol;
	private JTextField textFrasco;
	private JTextField textFrasco1litro;
	private JTextField textField;
	private JTextField textfrasco500;
	private JTextField textField_2;
	private JTextField textDias;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	ArrayList<combustiveis> combustiveislista = new ArrayList<combustiveis>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Posto frame = new Posto();
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
	public Posto() {
		combustiveiscarregar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(293, 11, 246, 142);
		contentPane.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[][][][][][][grow][grow]", "[][][]"));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		panel_1.add(lblNewLabel_4, "cell 2 0");
		
		textFrasco = new JTextField();
		panel_1.add(textFrasco, "cell 6 0,growx");
		textFrasco.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1L");
		panel_1.add(lblNewLabel_5, "cell 2 2");
		
		textFrasco1litro = new JTextField();
		textFrasco1litro.setColumns(10);
		panel_1.add(textFrasco1litro, "cell 6 2,growx");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(25, 164, 514, 131);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][][][grow][grow][grow][grow][]", "[][grow][grow][][grow][]"));
		
		JLabel lblNewLabel_10 = new JLabel("Quantidade");
		panel_2.add(lblNewLabel_10, "cell 3 1");
		
		JPanel panel = new JPanel();
		panel_2.add(panel, "cell 4 1,grow");
		
		JLabel lblNewLabel_9 = new JLabel("Valor a Pagar");
		panel_2.add(lblNewLabel_9, "cell 5 1");
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, "cell 6 1,grow");
		
		JLabel lblNewLabel_11 = new JLabel("Total Oleo");
		panel_2.add(lblNewLabel_11, "flowx,cell 7 1");
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6, "cell 3 2,grow");
		
		JLabel lblNewLabel_6 = new JLabel("Frasco 500ml");
		panel_2.add(lblNewLabel_6, "cell 1 3");
		
		textfrasco500 = new JTextField();
		textfrasco500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float valorF=0;
				try {
					valorF = Float.parseFloat(textfrasco500.getText());
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "O valor precisa ser float ");
					return;
				}
				float Valor2f=0;
				try {
					
					Valor2f = Float.parseFloat(textFrasco.getText());
				} catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "O valor precisa ser float");
					return;
				}
				float resfinal = valorF*Valor2f;
				lblmostravalor.settext(String.valueOf(resfinal));
			}
		});

		panel_2.add(textfrasco500, "cell 3 3,growx");
		textfrasco500.setColumns(10);
		
		JLabel lblmostravalor = new JLabel("");
		panel_2.add(lblmostravalor, "cell 5 3");
		
		JLabel lblTotalOleo = new JLabel("");
		panel_2.add(lblTotalOleo, "cell 7 3");
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7, "cell 3 4,grow");
		
		JLabel lblNewLabel_7 = new JLabel("Frasco 1L");
		panel_2.add(lblNewLabel_7, "cell 1 5");
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		panel_2.add(textField, "cell 3 5,growx");
		textField.setColumns(10);
		
		JLabel lblmostravalorembaixo = new JLabel("");
		panel_2.add(lblmostravalorembaixo, "cell 5 5");
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, "cell 7 1");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(25, 306, 246, 123);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[][][][][][grow]", "[][][]"));
		
		JLabel lblNewLabel_8 = new JLabel("Combustivel");
		panel_3.add(lblNewLabel_8, "cell 1 0");
		
		JComboBox<combustiveis> comboboxcombustiveis = new JComboBox();
		comboboxcombustiveis.setBounds(20, 46, 171, 22);
		
		for (int i = 0; i < combustiveislista.size(); i++) {
			comboboxcombustiveis.addItem(combustiveislista.get(i));
			
		}
		

		panel_3.add(comboboxcombustiveis, "cell 4 0,growx");
		
		JLabel lblNewLabel_12 = new JLabel("QuantidadeLitros");
		panel_3.add(lblNewLabel_12, "cell 1 1");
		
		textField_2 = new JTextField();
		panel_3.add(textField_2, "cell 4 1,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Total Combustivel");
		panel_3.add(lblNewLabel_13, "cell 1 2");
		
		JLabel lblmostratotalcombustivel = new JLabel("");
		panel_3.add(lblmostratotalcombustivel, "cell 4 2");
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new TitledBorder(null, "formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3_1.setBounds(293, 306, 246, 123);
		contentPane.add(panel_3_1);
		panel_3_1.setLayout(new MigLayout("", "[][][][][]", "[][][][]"));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("À vista");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_3_1.add(rdbtnNewRadioButton, "cell 0 0");
		
		JLabel lblNewLabel_14 = new JLabel("Dias:");
		panel_3_1.add(lblNewLabel_14, "cell 2 0,alignx trailing");
		
		textDias = new JTextField();
		panel_3_1.add(textDias, "cell 3 0,growx");
		textDias.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("À Prazo");
		buttonGroup.add(rdbtnNewRadioButton_1);
		panel_3_1.add(rdbtnNewRadioButton_1, "cell 0 1");
		
		JLabel lblNewLabel_15 = new JLabel("Total a pagar:");
		panel_3_1.add(lblNewLabel_15, "cell 1 2");
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(25, 11, 246, 142);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Oléo Diesel:");
		panel_1_1.add(lblNewLabel, "cell 1 0");
		
		textoleopreco = new JTextField();
		panel_1_1.add(textoleopreco, "cell 4 0,growx");
		textoleopreco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum");
		panel_1_1.add(lblNewLabel_1, "cell 1 2");
		
		textcomum = new JTextField();
		panel_1_1.add(textcomum, "cell 4 2,growx");
		textcomum.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada");
		panel_1_1.add(lblNewLabel_2, "cell 1 5");
		
		textAditivada = new JTextField();
		panel_1_1.add(textAditivada, "cell 4 5,growx");
		textAditivada.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol");
		panel_1_1.add(lblNewLabel_3, "cell 1 7");
		
		textEtanol = new JTextField();
		panel_1_1.add(textEtanol, "cell 4 7,growx");
		textEtanol.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String oleo = textoleopreco.getText();
				String comum = textcomum.getText();
				
				
				
				
			}
		});
		btnCalcular.setBounds(94, 440, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnnovocalculo = new JButton("Novo Calculo");
		btnnovocalculo.setBounds(239, 440, 116, 23);
		contentPane.add(btnnovocalculo);
		  
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(404, 440, 105, 23);
		contentPane.add(btnFechar);
	}
	
	private void combustiveiscarregar() {
		
		combustiveis a1 = new combustiveis();
		a1.setCodigo(1);
		a1.setNome("oleo");
		combustiveislista.add(a1);
		
		combustiveis a2 = new combustiveis();
		a2.setCodigo(2);
		a2.setNome("comum");
		combustiveislista.add(a2);		
		
		combustiveis a3 = new combustiveis();
		a3.setCodigo(3);
		a3.setNome("Aditivada");
		combustiveislista.add(a3);		
		
		combustiveis a4 = new combustiveis();
		a4.setCodigo(4);
		a4.setNome("Etanol");
		combustiveislista.add(a4);		


		
		
		
	}
}
