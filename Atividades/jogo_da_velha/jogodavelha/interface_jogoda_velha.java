package jogodavelha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import game.Jogo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class interface_jogoda_velha {

	private JFrame frame;
	private JTextField txtResultado;
	private Jogo jogo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interface_jogoda_velha window = new interface_jogoda_velha();
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
	public interface_jogoda_velha() {
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
		jogo = new Jogo();
		
		
		JComboBox comboBox0 = new JComboBox();
		comboBox0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				int indice = comboBox0.getSelectedIndex();
				if( indice != 0 ) {
					comboBox0.setEnabled(false);	
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					jogo.preenche_tabuleiro(escolha, 0);
					String result = jogo.verifica_status();
					txtResultado.setText(result);
				}
				
			}
		});
		
		comboBox0.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox0.setBounds(63, 32, 39, 28);
		frame.getContentPane().add(comboBox0);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox1.setEnabled(false);		
					entra = 0;
				}
				int indice = comboBox1.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox1.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 1);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox1.setBounds(144, 32, 39, 28);
		frame.getContentPane().add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entra = 1; 
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox2.setEnabled(false);
					entra = 0;
				}
				int indice = comboBox2.getSelectedIndex();
				if( indice != 0 && entra == 1) {
					comboBox2.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 2);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox2.setBounds(222, 32, 39, 28);
		frame.getContentPane().add(comboBox2);
		
		JComboBox comboBox3 = new JComboBox();
		comboBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox3.setEnabled(false);	
					entra = 0;
				}
				int indice = comboBox3.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox3.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 3);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox3.setBounds(63, 90, 39, 28);
		frame.getContentPane().add(comboBox3);
		
		JComboBox comboBox4 = new JComboBox();
		comboBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox4.setEnabled(false);		
					entra = 0;
				}
				int indice = comboBox4.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox4.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 4);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox4.setBounds(144, 90, 39, 28);
		frame.getContentPane().add(comboBox4);
		
		JComboBox comboBox5 = new JComboBox();
		comboBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox5.setEnabled(false);		
					entra = 0;
				}
				int indice = comboBox5.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox5.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 5);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox5.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox5.setBounds(222, 90, 39, 28);
		frame.getContentPane().add(comboBox5);
		
		JComboBox comboBox6 = new JComboBox();
		comboBox6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox6.setEnabled(false);		
					entra = 0;
				}
				int indice = comboBox4.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox6.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 6);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox6.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox6.setBounds(63, 149, 39, 28);
		frame.getContentPane().add(comboBox6);
		
		JComboBox comboBox7 = new JComboBox();
		comboBox7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox7.setEnabled(false);		
					entra = 0;
				}
				int indice = comboBox4.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox7.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 7);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox7.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox7.setBounds(144, 149, 39, 28);
		frame.getContentPane().add(comboBox7);
		
		JComboBox comboBox8 = new JComboBox();
		comboBox8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int entra = 1;
				String result = jogo.verifica_status();
				if(result != " ") {
					comboBox8.setEnabled(false);		
					entra = 0;
				}
				int indice = comboBox4.getSelectedIndex();
				if( indice != 0 && entra == 1){
					comboBox8.setEnabled(false);
					
					String escolha;
					if(indice == 1) {
						escolha = "X";
					}else {
						escolha = "0";
					}
					
					jogo.preenche_tabuleiro(escolha, 8);
					result = jogo.verifica_status();
					txtResultado.setText(result);
					
				}
			}
		});
		comboBox8.setModel(new DefaultComboBoxModel(new String[] {"", "X", "0"}));
		comboBox8.setBounds(222, 149, 39, 28);
		frame.getContentPane().add(comboBox8);
		
		JLabel lblResultado = new JLabel("Vencedor das Partidas:");
		lblResultado.setBounds(10, 219, 145, 14);
		frame.getContentPane().add(lblResultado);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
		txtResultado.setBounds(144, 216, 119, 20);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		
	}
	
	
}
