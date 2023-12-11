package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import model.classes;
import view.Janela;
import net.miginfocom.swing.MigLayout;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import model.Metodopag;
import javax.swing.ImageIcon;

public class Telaalterar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textnome;
	private JTextField textquarto;
	private JTextField textdata;
	private JTextField textdesc;
	private JTextField textquantidade;
	private JTextField textUnitario;
	private JTextField textField_2;
	private JTextField textpagom;
	private JTextField texthc;
	private JTextField textResponsavel;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Telaalterar(classes puxa,Janela janela) {
		setTitle("Alterar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblNewLabel_1 = new JLabel("Nome Funcionario");
		
		textnome = new JTextField();
		textnome.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Quarto");
		
		textquarto = new JTextField();
		textquarto.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Data do Consumo");
		
		textdata = new JTextField();
		textdata.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Desc do Produto");
		
		textdesc = new JTextField();
		textdesc.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("Quantidade consumida");
		
		textquantidade = new JTextField();
		textquantidade.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Unitario");
		
		textUnitario = new JTextField();
		textUnitario.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Custo Total produto");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Pago até o momento");
		
		textpagom = new JTextField();
		textpagom.setColumns(10);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Metodo de Pagamento");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Metodopag.values()));
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Horaconsumida");
		
		texthc = new JTextField();
		texthc.setColumns(10);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Funcionario Responsavel");
		
		JButton btnAlterar_1 = new JButton("");
		btnAlterar_1.setIcon(new ImageIcon(Telaalterar.class.getResource("/icones/Fechar.png")));
		btnAlterar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		 
		textResponsavel = new JTextField();
		textResponsavel.setColumns(10);
		 
		JButton btnAlterar_1_1 = new JButton("");
		btnAlterar_1_1.setIcon(new ImageIcon(Telaalterar.class.getResource("/icones/Limpar.png")));
		btnAlterar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textnome.setText("");
				    textdata.setText("");
				    textquantidade.setText("");
				    textField_2.setText("");
				    texthc.setText("");
				    textquarto.setText("");
				    textdesc.setText("");
				    textUnitario.setText("");
				    textpagom.setText("");  
				    textResponsavel.setText("");  
			}
		});
		
		JButton btnAlterar = new JButton("");
		btnAlterar.setIcon(new ImageIcon(Telaalterar.class.getResource("/icones/Alterar.png")));
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = textnome.getText();
				String dataString = textdata.getText();
				String Quanti = textquantidade.getText();
				String total = textField_2.getText();
				String hcString = texthc.getText();
				String quarto = textquarto.getText();
				String desc = textdesc.getText();
				String unitario = textUnitario.getText();
				String pagom = textpagom.getText();
				String responsavel = textResponsavel.getText();
				Object metodo = comboBox.getSelectedItem(); 
				String metodoS;
				DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				DateTimeFormatter hcFormatter = DateTimeFormatter.ofPattern("HH:mm");
				
				
				metodoS = metodo.toString();
				int quartoint = 0; // 
				try {
					quartoint = Integer.parseInt(quarto);
				} catch (Exception ex) {
				    JOptionPane.showMessageDialog(null, "Quarto inválido! Digite apenas números");
				    return;
				}
				int quantint = 0; // 
				try {
				    quantint = Integer.parseInt(Quanti);
				} catch (Exception ex) {
				    JOptionPane.showMessageDialog(null, "Quantidade inválida! Digite apenas números");
				    return;
				}
				float totalFloat = 0.0f;
				try {
				    totalFloat = Float.parseFloat(total);
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Total incorreto! Digite um número válido");
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
				
				puxa.setNome(nome);
				puxa.setData(data);
				puxa.setQuantidade(quantint);
				puxa.setTotal(totalFloat);
				puxa.setResponsavel(responsavel);
				puxa.setQuarto(quartoint);
				puxa.setDesc(desc);
				puxa.setUnitario(unitarioFloat);				
				puxa.setPagom(pagomFloat);
				puxa.setHc(hc);
				puxa.setMetodo(metodoS);

				     
				if(textnome.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite um nome");
					textnome.requestFocus();
				}
				else if(!textnome.getText().matches("[a -z A -Z ]+")) {
					JOptionPane.showMessageDialog(null, "Digite apenas letras");
					textnome.requestFocus();
				}
				else if(textdesc.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite o total");
					textdesc.requestFocus();
				}
				else if(!textdesc.getText().matches("[a -z A -Z ]+")) {
					JOptionPane.showMessageDialog(null, "Digite apenas letras para descrição do produto");
					textdesc.requestFocus();
				}
				else if(textResponsavel.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite qual funcionario responsavel");
					textResponsavel.requestFocus();
				}
				else if(!textResponsavel.getText().matches("[a -z A -Z ]+")) {
					JOptionPane.showMessageDialog(null, "Digite qual funcionario vazio");
					textResponsavel.requestFocus();
				}
				else if(metodoS == "Selecionar")
				{
					JOptionPane.showMessageDialog(null, "selecione um metodo de pagamento");
				}
				else{
					janela.Atualiza(puxa);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
					dispose();
				}
				
				
			}
		});
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Custo unitario");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(7)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_1_2)
														.addComponent(lblNewLabel_1))
													.addGap(51)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(textnome, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
														.addComponent(textdata, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(textquantidade, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
															.addGap(2)))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_1_1_1)
														.addComponent(lblNewLabel_1_1)
														.addComponent(lblNewLabel_1_1_1_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
													.addGap(62))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_1_4_1_2)
															.addGap(7))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addComponent(lblNewLabel_1_4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
																.addComponent(lblNewLabel_1_4_1))
															.addGap(18)))
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(lblNewLabel_1_1_3, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addComponent(textResponsavel)
																.addComponent(comboBox, 0, 149, Short.MAX_VALUE))
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(lblNewLabel_1_4_1_1, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))))
											.addGap(18))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
											.addGap(116)
											.addComponent(lblNewLabel_1_1_2)
											.addPreferredGap(ComponentPlacement.RELATED))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(btnAlterar, GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE)
									.addGap(112)
									.addComponent(btnAlterar_1_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addGap(104)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(textquarto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(textdesc)
											.addComponent(textpagom)
											.addComponent(texthc, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
									.addComponent(textUnitario, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(btnAlterar_1, GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)))))
					.addGap(129))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel)
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textquarto)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textnome)
							.addComponent(lblNewLabel_1_1))
						.addComponent(lblNewLabel_1))
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_2)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textdesc)
							.addComponent(textdata, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1_1_1)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_1_1_2)
									.addComponent(textquantidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_1_1_1_1))
								.addComponent(textUnitario)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_1_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(textpagom)
									.addGap(5))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_2)
										.addComponent(lblNewLabel_1_1_3)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addComponent(lblNewLabel_1_4)))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(9)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox)
								.addComponent(lblNewLabel_1_4_1))
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1_4_1_2)
								.addComponent(textResponsavel)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(texthc)
								.addComponent(lblNewLabel_1_4_1_1))
							.addGap(42)))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnAlterar_1_1, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
						.addComponent(btnAlterar, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE)
						.addComponent(btnAlterar_1, GroupLayout.PREFERRED_SIZE, 33, Short.MAX_VALUE))
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
		
		String nome = puxa.getNome();
		textnome.setText(nome);

		Integer quarto = puxa.getQuarto();
		textquarto.setText(String.valueOf(quarto));

		String hc = String.valueOf(puxa.getHc());
		texthc.setText(hc);

		String desc = puxa.getDesc();
		textdesc.setText(desc);

		String quantidade = String.valueOf(puxa.getQuantidade());
		textquantidade.setText(quantidade);

		String unitario = String.valueOf(puxa.getUnitario());
		textUnitario.setText(unitario);

		String total = String.valueOf(puxa.getTotal());
		textField_2.setText(total);

		String pagom = String.valueOf(puxa.getPagom());
		textpagom.setText(pagom);

		String responsavel = puxa.getResponsavel();
		textResponsavel.setText(responsavel);
	
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String data = puxa.getData().format(dateFormatter);
		textdata.setText(data);

	    
	}
}
