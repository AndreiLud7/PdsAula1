package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.classes;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import model.Metodopag;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaAd extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nometxt;
	private JTextField quartotxt;
	private JTextField Datatxt;
	private JTextField desctext;
	private JTextField pagomtxt;
	private JTextField totaltxt;
	private JTextField unitariotxt;
	private JTextField quantidadetxt;
	private JTextField responsaveltxt;
	private JTextField hctxt;
	private JButton btnNewButton;
	ArrayList<classes> listaconsumo = new ArrayList<classes>();
	private JButton btnNewButton_1;
	private JComboBox comboBox;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public TelaAd(Janela janela) {
		setTitle("Adicionar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nome");
		
		JLabel lblNewLabel_1 = new JLabel("Quarto");
		
		JLabel lblNewLabel_2 = new JLabel("Data");
		
		JLabel lblNewLabel_3 = new JLabel("Descrição");
		
		JLabel lblNewLabel_3_1 = new JLabel("Quantidade");
		
		JLabel lblUnitario = new JLabel("Unitario");
		
		JLabel lblNewLabel_1_1 = new JLabel("total");
		
		JLabel lblNewLabel_2_1 = new JLabel("Pago");
		
		JLabel lblNewLabel_3_2 = new JLabel("Metodo de Pagamento");
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Hora consumida");
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Responsavel");
		
		nometxt = new JTextField();
		nometxt.addFocusListener(new FocusAdapter() {

		});
		nometxt.setColumns(10);
		
		quartotxt = new JTextField();
		quartotxt.setColumns(10);
		
		Datatxt = new JTextField();
		Datatxt.addFocusListener(new FocusAdapter() {
			

		});
		Datatxt.setColumns(10);
		
		desctext = new JTextField();
		desctext.setColumns(10);
		
		pagomtxt = new JTextField();
		pagomtxt.setColumns(10);
		
		totaltxt = new JTextField();
		totaltxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		totaltxt.setColumns(10);
		
		unitariotxt = new JTextField();
		unitariotxt.setColumns(10);
		
		quantidadetxt = new JTextField();
		quantidadetxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				

			}
		});
		quantidadetxt.setColumns(10);
		
		responsaveltxt = new JTextField();
		responsaveltxt.setColumns(10);
		
		hctxt = new JTextField();
		hctxt.setColumns(10);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\KidsBaby\\eclipse-workspace\\ProjetoJTable\\icones\\Button.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   
			String nome = nometxt.getText();
			String dataString = Datatxt.getText();
			String Quanti = quantidadetxt.getText();
			String total = totaltxt.getText();
			String hcString = hctxt.getText();
			String quarto = quartotxt.getText();
			String desc = desctext.getText();
			String unitario = unitariotxt.getText();
			String pagom = pagomtxt.getText();
			String responsavel = responsaveltxt.getText();
			Object metodo = comboBox.getSelectedItem(); 
			String metodoS;
			metodoS = metodo.toString();
		
			DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter hcFormatter = DateTimeFormatter.ofPattern("HH:mm");
//----------------------------------------	
			
			float totalFloat = 0.0f;
			try {
			    totalFloat = Float.parseFloat(total);
			} catch (NumberFormatException ex) {
			    JOptionPane.showMessageDialog(null, "Total incorreto! Digite um número válido");
			    return;
			}
			int quantint = 0; // 
			try {
			    quantint = Integer.parseInt(Quanti);
			} catch (Exception ex) {
			    JOptionPane.showMessageDialog(null, "Quantidade inválida! Digite apenas números");
			    return;
			}
			int quartoint = 0; // 
			try {
				quartoint = Integer.parseInt(quarto);
			} catch (Exception ex) {
			    JOptionPane.showMessageDialog(null, "Quarto inválido! Digite apenas números");
			    return;
			}
			float unitarioFloat = 0.0f;
			try {
			    unitarioFloat = Float.parseFloat(unitario);
			} catch (NumberFormatException ex) {
			    JOptionPane.showMessageDialog(null, "Unitário incorreto! Digite um número válido");
			    return;
			}

			float pagomFloat = 0.0f;
			try {
			    pagomFloat = Float.parseFloat(pagom);
			} catch (NumberFormatException ex) {
			    JOptionPane.showMessageDialog(null, "Pago incorreto! Digite um número válido");
			    return;
			}
			LocalDate data;
			try {
			    data = LocalDate.parse(dataString, dataFormatter);
			} catch (DateTimeParseException ex) {
			    JOptionPane.showMessageDialog(null, "Data inválida! Digite no formato dd/MM/yyyy");
			    return;
			}
			LocalTime hc;
			try {
			    hc = LocalTime.parse(hcString, hcFormatter);
			} catch (DateTimeParseException ex) {
			    JOptionPane.showMessageDialog(null, "Hora inválida! Digite no formato HH:mm");
			    return;
			}
			
			
			classes chama = new classes();
			chama.setNome(nome);
			chama.setQuarto(quartoint);
			chama.setData(data);
			chama.setDesc(desc);
			chama.setQuantidade(quantint);
			chama.setUnitario(unitarioFloat );
			chama.setTotal(totalFloat);
			chama.setPagom(pagomFloat );
			chama.setHc(hc);
			chama.setResponsavel(responsavel);
			chama.setMetodo(metodoS);
			
//---------------------------
			
			if(nometxt.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe o nome vazio");
				nometxt.requestFocus();
			}
			else if(!nometxt.getText().matches("[a-zA-Z]+")) {
				JOptionPane.showMessageDialog(null, "Digite apenas letras");
				nometxt.requestFocus();
			}
			else if(desctext.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe a descrição vazia");
				desctext.requestFocus();
			}
			else if(!desctext.getText().matches("[a-zA-Z]+")) {
				JOptionPane.showMessageDialog(null, "Digite apenas letras para descrição do produto");
				desctext.requestFocus();
			}
			else if(responsaveltxt.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Digite qual funcionario vazio");
				responsaveltxt.requestFocus();
			}
			else if(!responsaveltxt.getText().matches("[a-zA-Z]+")) {
				JOptionPane.showMessageDialog(null, "Digite um nome valido");
				responsaveltxt.requestFocus();
			}
			else if(metodoS == "Selecionar") {
				JOptionPane.showMessageDialog(null, "selecione um metodo de pagamento");
			}

			else { 
			janela.chama(chama);
			dispose();
			}  
			}
		});
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Metodopag.values()));
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\KidsBaby\\eclipse-workspace\\ProjetoJTable\\icones\\Fechar.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\KidsBaby\\eclipse-workspace\\ProjetoJTable\\icones\\Limpar.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nometxt.setText("");
			    Datatxt.setText("");
			    quantidadetxt.setText("");
			    totaltxt.setText("");
			    hctxt.setText("");
			    quartotxt.setText("");
			    desctext.setText("");
			    unitariotxt.setText("");
			    pagomtxt.setText("");
			    responsaveltxt.setText("");
			
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(247, Short.MAX_VALUE)
					.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(7))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1)
						.addComponent(lblNewLabel_3_2)
						.addComponent(lblNewLabel_3_1_1))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(hctxt, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 168, Short.MAX_VALUE)
						.addComponent(totaltxt, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(nometxt, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(quantidadetxt, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
						.addComponent(Datatxt, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUnitario)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3_2_1))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(pagomtxt, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
								.addComponent(unitariotxt, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
								.addComponent(responsaveltxt, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(quartotxt, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
								.addComponent(desctext, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(nometxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(quartotxt, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(Datatxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(desctext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3_1)
								.addComponent(quantidadetxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblUnitario))
						.addComponent(unitariotxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_1_1))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_2_1)
							.addComponent(pagomtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(totaltxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(8)
									.addComponent(lblNewLabel_3_2))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_3_2_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(7)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addComponent(lblNewLabel_3_1_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(hctxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(responsaveltxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
					.addGap(37))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
