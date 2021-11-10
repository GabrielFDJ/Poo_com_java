package prova_poo_quest2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JToggleButton;
import java.awt.Choice;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import prova_poo_quest2.Curso;
import prova_poo_quest2.Disciplina;
import java.util.ArrayList;

import javax.swing.SwingConstants;

public class Tela_quest2 {

	private JFrame frame;
	private JTextField textFieldNomeCurso;
	private JTextField textFieldCodDisciplina;
	private JTextField textFieldSiglaDisciplina;
	private JTextField textFieldNomeDisciplina;
	private JTextField textFieldConjuntoAulas;
	private JTextField textFieldHorariosDisciplina_Dia;	
	private Disciplina disciplina;
	private JTextField textFieldHorario_dia;
	private JTextField textFieldDocente;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldHorariosDisciplina_Hora;
	private JTextField textFieldHorario_hora;
	private JTextField textFieldID_docente;
	private JTextField textField_2;
	private Curso curso;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_quest2 window = new Tela_quest2();
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
	public Tela_quest2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ArrayList<Disciplina> disciplinas_cadastradas = new ArrayList<>();
		ArrayList<Curso> cursos_cadastrados = new ArrayList<>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 434, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));	
				
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Disciplinas", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("CADASTRO DA DISCIPLINA");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(97, 5, 230, 28);
		lblNewLabel_1_1.setFont(new Font("Unispace", Font.PLAIN, 16));
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblCdigoDaDisciplina = new JLabel("C\u00F3digo da disciplina : ");
		lblCdigoDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCdigoDaDisciplina.setBounds(22, 78, 116, 23);
		panel_1.add(lblCdigoDaDisciplina);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Curso", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Curso :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(21, 48, 100, 23);
		panel.add(lblNewLabel);
		
		textFieldNomeCurso = new JTextField();
		textFieldNomeCurso.setBounds(125, 49, 143, 22);
		panel.add(textFieldNomeCurso);
		textFieldNomeCurso.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRO DO CURSO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(125, 11, 181, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblDisciplinas = new JLabel("Disciplinas Cadastradas :");
		lblDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDisciplinas.setBounds(22, 99, 131, 23);
		panel.add(lblDisciplinas);
		
		JComboBox comboBoxDisciplinas = new JComboBox();
		comboBoxDisciplinas.setBounds(162, 100, 118, 22);
		panel.add(comboBoxDisciplinas);
		
		JLabel lblHorriosDisciplina = new JLabel("Hor\u00E1rios da Disciplina :");
		lblHorriosDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHorriosDisciplina.setBounds(22, 151, 131, 23);
		panel.add(lblHorriosDisciplina);	
		
		JTextArea textAreaRelatorioCadastro = new JTextArea();
		textAreaRelatorioCadastro.setBounds(21, 185, 403, 89);
		panel.add(textAreaRelatorioCadastro);		
		
		JComboBox comboBoxHorarios_Curso = new JComboBox();
		comboBoxHorarios_Curso.setBounds(162, 152, 118, 22);
		panel.add(comboBoxHorarios_Curso);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hor\u00E1rios", null, panel_2, null);
		panel_2.setLayout(null);	
		
		JComboBox comboBoxDisciplina_Horario = new JComboBox();
		comboBoxDisciplina_Horario.setBounds(152, 74, 106, 22);
		panel_2.add(comboBoxDisciplina_Horario);
		
		JButton btnCadastrarCurso = new JButton("CADASTRAR CURSO");
		btnCadastrarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome_curso = textFieldNomeCurso.getText();
				String disciplina = comboBoxDisciplinas.getSelectedItem().toString();
				String horarios_curso = comboBoxHorarios_Curso.getSelectedItem().toString();
				int indice_selecionado = comboBoxHorarios_Curso.getSelectedIndex();	
				
				
				if(nome_curso.isEmpty() || disciplina.isEmpty() || horarios_curso.isEmpty()) {
					JOptionPane.showMessageDialog(btnCadastrarCurso, "� necess�rio preencher todos os campos");
				}
				else {
					Curso curso = new Curso(nome_curso);									
					JOptionPane.showMessageDialog(btnCadastrarCurso, "Curso cadastrado com Sucesso");					
					}					
					
					comboBoxHorarios_Curso.removeItemAt(indice_selecionado);
				}
				
			}
		);
		btnCadastrarCurso.setBounds(231, 295, 181, 30);
		panel.add(btnCadastrarCurso);	
		
		
		JButton btnAdicionarDisciplina = new JButton("ADICIONAR DISCIPLINA");
		btnAdicionarDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome_curso = textFieldNomeCurso.getText();
				String disciplina_selecionada = comboBoxDisciplinas.getSelectedItem().toString();
				String horario_curso = comboBoxHorarios_Curso.getSelectedItem().toString();
				int indice_selecionado = comboBoxDisciplina_Horario.getSelectedIndex();
				
				if(nome_curso.isEmpty() || disciplina_selecionada.isEmpty() || horario_curso.isEmpty()) {
					JOptionPane.showMessageDialog(btnAdicionarDisciplina, "� necess�rio preencher todos os campos");
				}
				else {
					JOptionPane.showMessageDialog(btnAdicionarDisciplina, "Disciplina adicionada com sucesso");
					comboBoxHorarios_Curso.removeItemAt(indice_selecionado);
					
				}
		}});
		btnAdicionarDisciplina.setBounds(21, 295, 194, 30);
		panel.add(btnAdicionarDisciplina);		
		
		//Eventos iniciais
				textAreaRelatorioCadastro.setText("� necess�rio cadastrar pelo menos uma disciplina\npara cadastrar um curso , se quiser cadastrar um\ncurso com apenas uma disciplina selecione o\nbot�o cadastrar curso");
				btnCadastrarCurso.setEnabled(false);
				btnAdicionarDisciplina.setEnabled(false);
		
		
				
		JLabel lblNewLabel_1_1_1 = new JLabel("CADASTRO DE NOVO HOR\u00C1RIO");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Unispace", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(73, 11, 274, 28);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblEscolhaDaDisciplina = new JLabel("Escolha da disciplina : ");
		lblEscolhaDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscolhaDaDisciplina.setBounds(23, 73, 125, 23);
		panel_2.add(lblEscolhaDaDisciplina);
		
		
		
		JLabel lblEscolhaDoHorario_dia = new JLabel("Dia :");
		lblEscolhaDoHorario_dia.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaDoHorario_dia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscolhaDoHorario_dia.setBounds(23, 115, 125, 23);
		panel_2.add(lblEscolhaDoHorario_dia);
		
		textFieldHorario_dia = new JTextField();
		textFieldHorario_dia.setColumns(10);
		textFieldHorario_dia.setBounds(152, 116, 106, 22);
		panel_2.add(textFieldHorario_dia);
		
		JTextArea txtrMensagemHorario = new JTextArea();
		
		txtrMensagemHorario.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtrMensagemHorario.setBounds(23, 189, 379, 50);
		panel_2.add(txtrMensagemHorario);
		txtrMensagemHorario.setText("� necess�rio ter pelo menos uma disciplina cadastrada\npara adicionar os hor�rios");
		
		textFieldCodDisciplina = new JTextField();
		textFieldCodDisciplina.setColumns(10);
		textFieldCodDisciplina.setBounds(148, 79, 106, 22);
		panel_1.add(textFieldCodDisciplina);
		
		JLabel lblSiglaDaDisciplina = new JLabel("Sigla da disciplina : ");
		lblSiglaDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSiglaDaDisciplina.setBounds(22, 112, 116, 23);
		panel_1.add(lblSiglaDaDisciplina);
		
		textFieldSiglaDisciplina = new JTextField();
		textFieldSiglaDisciplina.setColumns(10);
		textFieldSiglaDisciplina.setBounds(148, 112, 106, 22);
		panel_1.add(textFieldSiglaDisciplina);
		
		JLabel lblNomeDaDisciplina = new JLabel("Nome da disciplina :");
		lblNomeDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeDaDisciplina.setBounds(22, 44, 116, 23);
		panel_1.add(lblNomeDaDisciplina);
		
		textFieldNomeDisciplina = new JTextField();
		textFieldNomeDisciplina.setColumns(10);
		textFieldNomeDisciplina.setBounds(148, 44, 106, 22);
		panel_1.add(textFieldNomeDisciplina);
		
		JLabel lblConjuntoDeAulas = new JLabel("Conjunto de aulas :");
		lblConjuntoDeAulas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConjuntoDeAulas.setBounds(22, 146, 116, 23);
		panel_1.add(lblConjuntoDeAulas);
		
		textFieldConjuntoAulas = new JTextField();
		textFieldConjuntoAulas.setColumns(10);
		textFieldConjuntoAulas.setBounds(148, 145, 106, 22);
		panel_1.add(textFieldConjuntoAulas);
		
		JLabel lblHorriosDaDisciplina = new JLabel("Dia disciplina :");
		lblHorriosDaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHorriosDaDisciplina.setBounds(22, 180, 130, 23);
		panel_1.add(lblHorriosDaDisciplina);
		
		textFieldHorariosDisciplina_Dia = new JTextField();
		textFieldHorariosDisciplina_Dia.setColumns(10);
		textFieldHorariosDisciplina_Dia.setBounds(113, 181, 74, 22);
		panel_1.add(textFieldHorariosDisciplina_Dia);
		
		JTextArea textAreaRelatorioCadastroDisciplina = new JTextArea();
		textAreaRelatorioCadastroDisciplina.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textAreaRelatorioCadastroDisciplina.setBounds(22, 248, 379, 40);
		panel_1.add(textAreaRelatorioCadastroDisciplina);		
		textAreaRelatorioCadastroDisciplina.setText("\u00C9 necess\u00E1rio preencher todos os campos\r\npara cadastrar a disciplina");
		
		JLabel lblDocente = new JLabel("Docente :");
		lblDocente.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDocente.setBounds(10, 214, 130, 23);
		panel_1.add(lblDocente);
		
		textFieldDocente = new JTextField();
		textFieldDocente.setColumns(10);
		textFieldDocente.setBounds(123, 215, 106, 22);
		panel_1.add(textFieldDocente);
		
		JButton btnAdicionarHorario = new JButton("ADICIONAR HOR\u00C1RIO");
		btnAdicionarHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String horario_dia = textFieldHorario_dia.getText();
				String horario_hora = textFieldHorario_hora.getText();
				String disciplina_selecionada = comboBoxDisciplina_Horario.getSelectedItem().toString();
					
				if (horario_dia.isEmpty() || horario_hora.isEmpty()) {								
					JOptionPane.showMessageDialog(btnAdicionarHorario, "� necess�rio preencher o campo horario");
					}
				else {
					btnAdicionarHorario.setEnabled(true);
					comboBoxHorarios_Curso.addItem("Dia: "+horario_dia+" Hora: "+horario_hora);
					JOptionPane.showMessageDialog(btnAdicionarHorario, "Hor�rio cadastrado com sucesso");
				}
			}
		});
		btnAdicionarHorario.setBounds(126, 281, 181, 30);
		panel_2.add(btnAdicionarHorario);
				btnAdicionarHorario.setEnabled(false);
				JPanel panel_3 = new JPanel();
				tabbedPane.addTab("Aluno", null, panel_3, null);
				panel_3.setLayout(null);
				
				JComboBox comboBoxDisciplinas_Aluno = new JComboBox();
				comboBoxDisciplinas_Aluno.setBounds(160, 155, 121, 22);
				panel_3.add(comboBoxDisciplinas_Aluno);
				
				JLabel lblEscolhaDoHorario_hora = new JLabel("Hora :");
				lblEscolhaDoHorario_hora.setHorizontalAlignment(SwingConstants.CENTER);
				lblEscolhaDoHorario_hora.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblEscolhaDoHorario_hora.setBounds(23, 155, 125, 23);
				panel_2.add(lblEscolhaDoHorario_hora);
				
				JButton btnCadastrarAluno = new JButton("CADASTRAR ALUNO");
				btnCadastrarAluno.setEnabled(false);
				btnCadastrarAluno.setBounds(226, 247, 181, 30);
				panel_3.add(btnCadastrarAluno);
				
				textFieldHorario_hora = new JTextField();
				textFieldHorario_hora.setColumns(10);
				textFieldHorario_hora.setBounds(152, 157, 106, 22);
				panel_2.add(textFieldHorario_hora);
				
				JButton btnCadastrarDisciplina = new JButton("CADASTRAR DISCIPLINA");
				btnCadastrarDisciplina.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String nome_disciplina = textFieldNomeDisciplina.getText();
						String codigo_disciplina = textFieldCodDisciplina.getText();
						String sigla_disciplina = textFieldSiglaDisciplina.getText();
						String conjunto_aulas = textFieldConjuntoAulas.getText();
						String nome_professor = textFieldDocente.getText();	
						String id_professor = textFieldID_docente.getText();
						String horario_disciplina_dia = textFieldHorariosDisciplina_Dia.getText();
						String horario_disciplina_hora = textFieldHorariosDisciplina_Hora.getText();
						String horario_dia_hora = ("Dia: "+horario_disciplina_dia+" Hora: "+horario_disciplina_hora);
						
							
						if (nome_disciplina.isEmpty() || codigo_disciplina.isEmpty() || sigla_disciplina.isEmpty() || conjunto_aulas.isEmpty() || nome_professor.isEmpty() || horario_disciplina_dia.isEmpty() || horario_disciplina_hora.isEmpty()) {								
							JOptionPane.showMessageDialog(btnCadastrarDisciplina, "� necess�rio preencher todos os campos");
							}
						else {
							Disciplina disciplina = new Disciplina(nome_disciplina,codigo_disciplina,sigla_disciplina,new Professor(nome_professor,id_professor));
							disciplina.getHorarios_disciplina().add(new Horario(horario_disciplina_dia,horario_disciplina_hora));
							disciplinas_cadastradas.add(disciplina);
							
							comboBoxDisciplinas.addItem(nome_disciplina);
							comboBoxDisciplina_Horario.addItem(nome_disciplina);
							comboBoxHorarios_Curso.addItem(horario_dia_hora);
							comboBoxDisciplinas_Aluno.addItem(nome_disciplina);
							btnCadastrarAluno.setEnabled(true);
							btnAdicionarHorario.setEnabled(true);
							btnAdicionarDisciplina.setEnabled(true);
							btnCadastrarCurso.setEnabled(true);
												
							JOptionPane.showMessageDialog(btnCadastrarDisciplina, "Disciplina Cadastrada com Sucesso");
						}
						 
					}
				});
				btnCadastrarDisciplina.setBounds(113, 295, 181, 30);
				panel_1.add(btnCadastrarDisciplina);
				
				JLabel lblHoraDisciplina = new JLabel("Hora disciplina :");
				lblHoraDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblHoraDisciplina.setBounds(197, 178, 85, 23);
				panel_1.add(lblHoraDisciplina);
				
				textFieldHorariosDisciplina_Hora = new JTextField();
				textFieldHorariosDisciplina_Hora.setColumns(10);
				textFieldHorariosDisciplina_Hora.setBounds(292, 182, 74, 22);
				panel_1.add(textFieldHorariosDisciplina_Hora);
				
				JLabel lblIdDocente = new JLabel("ID Docente:");
				lblIdDocente.setHorizontalAlignment(SwingConstants.CENTER);
				lblIdDocente.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblIdDocente.setBounds(236, 214, 85, 23);
				panel_1.add(lblIdDocente);
				
				textFieldID_docente = new JTextField();
				textFieldID_docente.setColumns(10);
				textFieldID_docente.setBounds(327, 215, 74, 22);
				panel_1.add(textFieldID_docente);	
								
				JLabel lblNewLabel_1_2 = new JLabel("CADASTRO DO ALUNO");
				lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_2.setFont(new Font("Unispace", Font.PLAIN, 16));
				lblNewLabel_1_2.setBounds(113, 11, 181, 14);
				panel_3.add(lblNewLabel_1_2);
				
				JLabel lblNomeDoAluno = new JLabel("Nome do Aluno :");
				lblNomeDoAluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblNomeDoAluno.setBounds(24, 60, 100, 23);
				panel_3.add(lblNomeDoAluno);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(134, 61, 133, 22);
				panel_3.add(textField);
				
				JLabel lblIdaluno = new JLabel("Id_aluno :");
				lblIdaluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblIdaluno.setBounds(36, 106, 100, 23);
				panel_3.add(lblIdaluno);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(134, 107, 133, 22);
				panel_3.add(textField_1);
				
				
				
				JLabel lblDisciplinas_Aluno = new JLabel("Disciplinas Cadastradas :");
				lblDisciplinas_Aluno.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblDisciplinas_Aluno.setBounds(24, 154, 131, 23);
				panel_3.add(lblDisciplinas_Aluno);
				
				JButton btnAdicionarDisciplina_1 = new JButton("ADICIONAR DISCIPLINA");
				btnAdicionarDisciplina_1.setEnabled(false);
				btnAdicionarDisciplina_1.setBounds(10, 247, 194, 30);
				panel_3.add(btnAdicionarDisciplina_1);
				
				JLabel lblDisciplinas_Aluno_1 = new JLabel("Cursos Cadastrados :");
				lblDisciplinas_Aluno_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblDisciplinas_Aluno_1.setBounds(24, 194, 131, 23);
				panel_3.add(lblDisciplinas_Aluno_1);
				
				JComboBox comboBoxDisciplinas_Aluno_1 = new JComboBox();
				comboBoxDisciplinas_Aluno_1.setBounds(160, 195, 121, 22);
				panel_3.add(comboBoxDisciplinas_Aluno_1);				
				
				
				JPanel panel_4 = new JPanel();
				tabbedPane.addTab("Aula", null, panel_4, null);
				panel_4.setLayout(null);
				
				JLabel lblNewLabel_1_2_1 = new JLabel("CADASTRO DA AULA");
				lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1_2_1.setFont(new Font("Unispace", Font.PLAIN, 16));
				lblNewLabel_1_2_1.setBounds(105, 11, 181, 23);
				panel_4.add(lblNewLabel_1_2_1);
				
				JLabel lblDuraoDeAulas = new JLabel("Dura\u00E7\u00E3o da aula :");
				lblDuraoDeAulas.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblDuraoDeAulas.setBounds(42, 69, 110, 23);
				panel_4.add(lblDuraoDeAulas);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(160, 71, 133, 22);
				panel_4.add(textField_2);
				
				JButton btnCadastrarAula = new JButton("CADASTRAR AULA");
				btnCadastrarAula.setEnabled(false);
				btnCadastrarAula.setBounds(105, 241, 211, 38);
				panel_4.add(btnCadastrarAula);
	}
}
