package prova_poo_quest2;

import java.util.ArrayList;

public class Curso {
	
	public ArrayList<Disciplina> disciplinas;
	public ArrayList<Horario> horarios;
	private String nome;
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public Curso (String nome, Disciplina disciplinas) {
		this.nome = nome;
		this.disciplinas = new ArrayList<>();
		this.horarios = new ArrayList<>();
	}
		
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public ArrayList<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(ArrayList<Horario> horarios) {
		this.horarios = horarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
