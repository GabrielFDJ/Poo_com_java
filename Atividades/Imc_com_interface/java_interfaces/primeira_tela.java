package Imc_com_interface.java_interfaces;

import java.awt.EventQueue;
import Imc_com_interface.farmacia.Pessoa;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class primeira_tela {

	private JFrame frame;
	private JTextField txtAltura;
	private JTextField txtPeso;
	private Pessoa pessoa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					primeira_tela window = new primeira_tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public primeira_tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(121, 96, 146, 20);
		frame.getContentPane().add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeso.setBounds(61, 39, 75, 31);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAltura.setBounds(61, 90, 75, 31);
		frame.getContentPane().add(lblAltura);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultado.setBounds(159, 195, 108, 44);
		frame.getContentPane().add(lblResultado);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				pessoa = new Pessoa(peso,altura);
				String resultado = pessoa.getIMC();
				lblResultado.setText(resultado);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(105, 146, 213, 31);
		frame.getContentPane().add(btnNewButton);
		
		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(121, 45, 146, 20);
		frame.getContentPane().add(txtPeso);
		
		
	}
}
