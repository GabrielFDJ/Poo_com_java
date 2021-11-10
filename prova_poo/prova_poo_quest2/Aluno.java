package prova_poo_quest2;

import java.util.ArrayList;

public class Aluno extends Pessoa{	
	
	private ArrayList<Curso> inscricao_curso;
	private ArrayList<Disciplina> inscricao_disciplina;
	private ArrayList<Disciplina> concluidas;
	private ArrayList<Double> lista_notas;	
		
	public Aluno(String nome, String id) {
		super(nome, id);
		this.inscricao_disciplina = new ArrayList<>();
		this.concluidas = new ArrayList<>();	
		this.lista_notas = new ArrayList<>();
	}
		
	private void inserir_disciplinas_inscritas(Disciplina disciplina) {
		inscricao_disciplina.add(disciplina);
	}
	
	private void inserir_curso_inscrito(Curso curso) {
		inscricao_curso.add(curso);
	}
	
	public void inserir_disciplinas_concluidas(Disciplina disciplina, double nota) {
		concluidas.add(disciplina);
		lista_notas.add(nota);
	}
	
}
