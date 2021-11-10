package prova_poo_quest2;

import java.util.ArrayList;

public class Disciplina{
	
	private String nome_disciplina;
	private String cod_disciplina;
	private String sigla_disciplina;
	private Professor docente;
	private ArrayList<Aluno> lista_alunos;
	private ArrayList <Aula> aulas;
	private ArrayList<Horario> horarios_disciplina;	
	
	public Disciplina() {}
	
	public Disciplina(String nome_disciplina, String cod_disciplina , String sigla_disciplina, Professor docente) {
		this.nome_disciplina = nome_disciplina;	
		this.cod_disciplina = cod_disciplina;
		this.sigla_disciplina = sigla_disciplina;		
		this.aulas = new ArrayList<>();
		this.horarios_disciplina = new ArrayList<>();
		this.lista_alunos = new ArrayList<>();
	}
	
	
	public void inserir_aluno_disciplina(Aluno aluno) {
		lista_alunos.add(aluno);
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getCod_disciplina() {
		return cod_disciplina;
	}

	public void setCod_disciplina(String cod_disciplina) {
		this.cod_disciplina = cod_disciplina;
	}

	public String getSigla_disciplina() {
		return sigla_disciplina;
	}

	public void setSigla_disciplina(String sigla_disciplina) {
		this.sigla_disciplina = sigla_disciplina;
	}

	public Professor getDocente() {
		return docente;
	}

	public void setDocente(Professor docente) {
		this.docente = docente;
	}

	public ArrayList<Aluno> getLista_alunos() {
		return lista_alunos;
	}

	public void setLista_alunos(ArrayList<Aluno> lista_alunos) {
		this.lista_alunos = lista_alunos;
	}

	public ArrayList<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(ArrayList<Aula> aulas) {
		this.aulas = aulas;
	}

	public ArrayList<Horario> getHorarios_disciplina() {
		return horarios_disciplina;
	}

	public void setHorarios_disciplina(ArrayList<Horario> horarios_disciplina) {
		this.horarios_disciplina = horarios_disciplina;
	}
	
	public String toString() {
		String s;
		
		s = String.format("Nome disciplina  = %s\n",nome_disciplina);
		s+= String.format("Cod disciplina  = %s\n",cod_disciplina); 
		//s+= String.format("Sigla disciplina  = %s\n",sigla_disciplina);
		
		return s;
	}
	
	
}
