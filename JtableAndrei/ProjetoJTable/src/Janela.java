import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblNewLabel;
	private JTextField txtCPF;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnNewButton_2;
	private JTextField TextAltura;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTextField textpeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 137, 342, 146);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int linha = table.getSelectedRow();
				Pessoa pessoaSelecionada = listaPessoas.get(linha);
				JOptionPane.showMessageDialog(null, "Pessoa Selecionada: "+pessoaSelecionada.getNome());
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);
		
		labelNome = new JLabel("Nome");
		labelNome.setBounds(12, 0, 46, 14);
		contentPane.add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 22, 120, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(140, 0, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(140, 22, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String cpf= txtCPF.getText();
				Integer Idade = Integer.parseInt(textIdade.getText());
				Integer telefone = Integer.parseInt(textTelefone.getText());
				Float peso = Float.parseFloat(textpeso.getText());
				Float altura = Float.parseFloat(TextAltura.getText());
				
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setTelefone(telefone);
				p.setIdade(Idade);
				p.setPeso(peso);
				p.setAltura(altura);
				
				listaPessoas.add(p);
				
				atualizarJTableModel();
				limparCampos();
				
				
				
				
			}
		});
		btnNewButton.setBounds(12, 103, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				int Excluir = table.getSelectedRow();
				int cpf = (int) table.getValueAt(Excluir, 1);
				
				for (Pessoa pessoa : listaPessoas) {
					if (pessoa.getCpf() == cpf) {
						listaPessoas.remove(pessoa);
					}
				}
				atualizarJTableModel();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
		});
		btnNewButton_1.setBounds(150, 103, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Excluir = table.getSelectedRow();
				int cpf = (int) table.getValueAt(Excluir,1);
				String nome = txtNome.getText();
				Integer cpfA = Integer.parseInt(txtCPF.getText());
				Integer telefone = Integer.parseInt(textTelefone.getText());
				Integer idade = Integer.parseInt(textpeso.getText());
				Float peso = Float.parseFloat(textpeso.getText());
				Float altura = Float.parseFloat(TextAltura.getText());
				
				for (Pessoa pessoa:listaPessoas) {
					if (pessoa.getCpf()== cpf) {
						pessoa.setNome(nome);
						pessoa.setCpf(cpfA);
						pessoa.setTelefone(telefone);
						pessoa.setIdade(idade);
						pessoa.setPeso(peso);
						pessoa.setAltura(altura);
						atualizarJTableModel();
						limparCampos();
					}
				}
				
				atualizarJTableModel();
			}
		});
		btnNewButton_2.setBounds(265, 103, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(268, 0, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		TextAltura = new JTextField();
		TextAltura.setBounds(268, 22, 86, 20);
		contentPane.add(TextAltura);
		TextAltura.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(12, 72, 118, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(12, 53, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idade");
		lblNewLabel_3.setBounds(140, 53, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textIdade = new JTextField();
		textIdade.setBounds(140, 72, 118, 20);
		contentPane.add(textIdade);
		textIdade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Peso");
		lblNewLabel_4.setBounds(268, 53, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textpeso = new JTextField();
		textpeso.setBounds(268, 72, 86, 20);
		contentPane.add(textpeso);
		textpeso.setColumns(10);
	}
	
	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}
	
	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		TextAltura.setText("");
		textTelefone.setText("");
		textIdade.setText("");
		textpeso.setText("");
	}
}










