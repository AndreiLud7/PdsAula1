package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Retangulo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radiobutton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textbase;
	private JTextField textaltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radiobutton frame = new Radiobutton();
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
	public Radiobutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 23, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(183, 23, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textbase = new JTextField();
		textbase.setBounds(24, 48, 86, 20);
		contentPane.add(textbase);
		textbase.setColumns(10);
		
		textaltura = new JTextField();
		textaltura.setBounds(183, 48, 86, 20);
		contentPane.add(textaltura);
		textaltura.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Área");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(24, 104, 58, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(183, 104, 86, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblmostra = new JLabel("");
		lblmostra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblmostra.setBounds(24, 133, 46, 14);
		contentPane.add(lblmostra);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String baseS = textbase.getText();
				String AlturaS = textaltura.getText();
				
				Float BaseF = Float.valueOf(baseS);
				Float AlturaF = Float.valueOf(AlturaS);
				
				Retangulo chama = new Retangulo();		
				Retangulo chama2 = new Retangulo();
				
				Float Resper = chama.calculoper(BaseF, AlturaF);
				Float Resarea = chama2.calculoarea(BaseF, AlturaF);
				
				if(rdbtnNewRadioButton.isSelected()) {
					lblmostra.setText(""+Resarea);
				}else if (rdbtnNewRadioButton_1.isSelected()) {
					lblmostra.setText(""+Resper);
					
				}
				
			}
		});
		btnNewButton.setBounds(21, 158, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblmostra.setText("");
				textbase.setText("");
				textaltura.setText("");
			}
		});
		btnlimpar.setBounds(140, 158, 89, 23);
		contentPane.add(btnlimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(258, 158, 89, 23);
		contentPane.add(btnFechar);
	}
}
