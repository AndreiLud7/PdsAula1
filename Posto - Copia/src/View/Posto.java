package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import model.Calculos;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import model.Combobox;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textpreco500;
	private JTextField preco1L;
	private JTextField Dieselpreco;
	private JTextField comumpreco;
	private JTextField aditivadapreco;
	private JTextField Etanolpreco;
	private JTextField textQL500;
	private JTextField textQL1000;
	private JTextField Litrosgasolina;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textD;

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
		Calculos A = new Calculos();
		setTitle("Posto de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[636px]", "[125px][130px][120px][25]"));
		
		JPanel panel_7 = new JPanel();
		contentPane.add(panel_7, "cell 0 0,grow");
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_7.add(panel_1);
		panel_1.setToolTipText("Tabela preço");
		panel_1.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o Do Combust\u00EDvel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setLayout(new MigLayout("", "[153px][153px]", "[25px][25px][25px][25px]"));
		
		JLabel lblNewLabel = new JLabel("Óleo díesel:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, "cell 0 0,grow");
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "cell 1 0,grow");
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		Dieselpreco = new JTextField();
		Dieselpreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.D=Float.valueOf(Dieselpreco.getText());
			}
		});
		panel_3.add(Dieselpreco);
		Dieselpreco.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Gas. Comum:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1, "cell 0 1,grow");
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, "cell 1 1,grow");
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		comumpreco = new JTextField();
		comumpreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.C=Float.valueOf(comumpreco.getText());
			}
		});
		panel_4.add(comumpreco);
		comumpreco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gas. Aditivada:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2, "cell 0 2,grow");
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5, "cell 1 2,grow");
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		aditivadapreco = new JTextField();
		aditivadapreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.A=Float.valueOf(aditivadapreco.getText());
			}
		});
		panel_5.add(aditivadapreco);
		aditivadapreco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Etanol");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3, "cell 0 3,grow");
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6, "cell 1 3,grow");
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		Etanolpreco = new JTextField();
		Etanolpreco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.E=Float.valueOf(Etanolpreco.getText());
			}
		});
		panel_6.add(Etanolpreco);
		Etanolpreco.setColumns(10);
		
		JPanel panel = new JPanel();
		panel_7.add(panel);
		panel.setBorder(new TitledBorder(null, "Tabela de Pre\u00E7o do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(new MigLayout("", "[153px][153px]", "[26px][26px][26px]"));
		
		JLabel lblNewLabel_4 = new JLabel("Frasco 500ml");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4, "cell 0 0,grow");
		
		textpreco500 = new JTextField();
		textpreco500.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.L500=Float.valueOf(textpreco500.getText());
				
			}
		});
		textpreco500.setText("");
		panel.add(textpreco500, "cell 1 0,grow");
		textpreco500.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Frasco 1L");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5, "cell 0 1,grow");
		
		preco1L = new JTextField();
		preco1L.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.v1L=Float.valueOf(preco1L.getText());
			}
		});
		panel.add(preco1L, "cell 1 1,grow");
		preco1L.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, "cell 0 2,grow");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_8, "cell 0 1,grow");
		panel_8.setLayout(new MigLayout("", "[156px][156px][156px][156px]", "[36px][36px][36px]"));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9, "cell 0 0,grow");
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_6, "cell 1 0,grow");
		
		JLabel lblNewLabel_7 = new JLabel("Valor a Pagar");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_7, "cell 2 0,grow");
		
		JLabel lblNewLabel_8 = new JLabel("Total Óleo");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_8, "cell 3 0,grow");
		
		JLabel lblNewLabel_9 = new JLabel("Frasco de 500ml");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_9, "cell 0 1,grow");
		
		JLabel lblvalorcima = new JLabel("-");
		lblvalorcima.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel totaloleo = new JLabel("-");
		totaloleo.setHorizontalAlignment(SwingConstants.CENTER);
		
		textQL500 = new JTextField();
		textQL500.addFocusListener(new FocusAdapter() {
			
			
			public void focusLost(FocusEvent e) {
				
				A.A500ml=Float.valueOf(textQL500.getText());
				lblvalorcima.setText("R$ "+A.c500ml());		
				totaloleo.setText("R$ "+A.totalOleo());
			}
		});
		panel_8.add(textQL500, "cell 1 1,grow");
		textQL500.setColumns(10);
		
		panel_8.add(lblvalorcima, "cell 2 1,grow");
		
		
		
		
		panel_8.add(totaloleo, "cell 3 1,grow");
		
		JLabel lblNewLabel_11 = new JLabel("Frasco de 1L");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_11, "cell 0 2,grow");
		
		JLabel lblvalorbaixo = new JLabel("-");
		lblvalorbaixo.setHorizontalAlignment(SwingConstants.CENTER);
		textQL1000 = new JTextField();
		textQL1000.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				A.Quanti1l=Float.valueOf(textQL1000.getText());
				lblvalorbaixo.setText("R$ "+A.c1L());
				totaloleo.setText("R$ "+A.totalOleo());
			}
		});
		panel_8.add(textQL1000, "cell 1 2,grow");
		textQL1000.setColumns(10);
		
		
		panel_8.add(lblvalorbaixo, "cell 2 2,grow");
		
		JPanel panel_10 = new JPanel();
		contentPane.add(panel_10, "cell 0 2,grow");
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_11);
		panel_11.setLayout(new MigLayout("", "[153px][153px]", "[32px][32px][32px]"));
		
		JLabel lblNewLabel_10 = new JLabel("Combustível:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_10, "cell 0 0,grow");
		
		JComboBox Combo = new JComboBox();
		Combo.setModel(new DefaultComboBoxModel(Combobox.values()));
		panel_11.add(Combo, "cell 1 0,grow");
		
		JLabel lblNewLabel_12 = new JLabel("Quantidade Litros");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_12, "cell 0 1,grow");
		
		JLabel Totalgasolina = new JLabel("-");
		Totalgasolina.setHorizontalAlignment(SwingConstants.CENTER);
		
		Litrosgasolina = new JTextField();
		Litrosgasolina.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int I=Combo.getSelectedIndex();
				float Litros=Float.valueOf(Litrosgasolina.getText());
				
				if(I==0){
					Totalgasolina.setText(A.Diesel(Litros));
				}
				else if(I==1){
					Totalgasolina.setText(A.Comum(Litros));
				}
				else if(I==2){
					Totalgasolina.setText(A.Aditiv(Litros));
				}
				else if(I==3){
					Totalgasolina.setText(A.Etanol(Litros));
				}
				
			}
		});
		panel_11.add(Litrosgasolina, "cell 1 1,grow");
		Litrosgasolina.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Total Combustível:");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_13, "cell 0 2,grow");
		
		
		panel_11.add(Totalgasolina, "cell 1 2,grow");
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(null, "Formas de Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_10.add(panel_12);
		panel_12.setLayout(new MigLayout("", "[306px]", "[49px][49px]"));
		
		JPanel panel_14 = new JPanel();
		panel_12.add(panel_14, "cell 0 0,grow");
		panel_14.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_14.add(panel_15);
		panel_15.setLayout(new GridLayout(2, 1, 0, 0));
		
		JRadioButton Avista = new JRadioButton("À vista");
		buttonGroup.add(Avista);
		panel_15.add(Avista);
		
		JRadioButton Aprazo = new JRadioButton("À prazo");
		buttonGroup.add(Aprazo);
		panel_15.add(Aprazo);
		
		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17);
		panel_17.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				ColumnSpec.decode("129px"),},
			new RowSpec[] {
				RowSpec.decode("43px"),}));
		
		JLabel lblNewLabel_15 = new JLabel("R - ");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_17.add(lblNewLabel_15, "2, 1");
		lblNewLabel_15.setVerticalAlignment(SwingConstants.BOTTOM);
		
		textD = new JTextField();
		textD.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(textD, "3, 1, center, center");
		textD.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_12.add(panel_13, "cell 0 1,grow");
		
		JLabel lblNewLabel_16 = new JLabel("Total a pagar:");
		panel_13.add(lblNewLabel_16);
		
		JLabel lblpagamento = new JLabel("-");
		lblpagamento.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblpagamento);
		
		JPanel panel_18 = new JPanel();
		contentPane.add(panel_18, "cell 0 3,grow");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Avista.isSelected()) {					//condições do select a vista e a prazo

					String total=A.TotalpagarVista();
					lblpagamento.setText("R$ "+total);
				}
				else if(Aprazo.isSelected()){
					Integer D=Integer.valueOf(textD.getText());
					if(D<=30){
					String total= A.totalPagarPrazo();
					lblpagamento.setText("R$ "+total);
					}
					else if(D>30){
						String total= A.totalPagarPrazo30();
						lblpagamento.setText("R$ "+total);
					}
				}
			} 
		});
		panel_18.setLayout(new MigLayout("", "[71px][grow][95px][grow][65px]", "[23px,grow]"));
		panel_18.add(btnCalcular, "cell 0 0,alignx center,aligny top");
		
		JButton btnNovoCalculo = new JButton("Novo Cálculo");
		btnNovoCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblpagamento.setText("");
				Totalgasolina.setText("");
				lblvalorbaixo.setText("");
				lblvalorcima.setText("");
				totaloleo.setText("");
				Dieselpreco.setText("");
				comumpreco.setText("");
				aditivadapreco.setText("");
				Etanolpreco.setText("");
				textpreco500.setText("");
				preco1L.setText("");
				textQL500.setText("");
				textQL1000.setText("");
				Litrosgasolina.setText("");
				textD.setText("");
				
			}
		});
		
		JPanel panel_19 = new JPanel();
		panel_18.add(panel_19, "cell 1 0,grow");
		panel_18.add(btnNovoCalculo, "cell 2 0,alignx center,aligny top");
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		JPanel panel_20 = new JPanel();
		panel_18.add(panel_20, "cell 3 0,grow");
		panel_18.add(btnFechar, "cell 4 0,alignx center,aligny top");
	}

}
