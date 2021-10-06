package game;

public class Jogo {
	private boolean status = true;
	private int contador = 0;
	private String[] tabuleiro = new String[9];
	private String Vencedor = " "; 
	
	public Jogo() {}
	
	public void preenche_tabuleiro(String verific, int index) {
		tabuleiro[index] = verific;
		contador++;	
	}
	
	public String verifica_status(){
		if(status = true && tabuleiro[0].equals(tabuleiro[1])&& tabuleiro[0].equals(tabuleiro[2])) {
			status = false;			
			Vencedor = test_vencedor(tabuleiro[0]);
			System.out.println("entrou - " + contador);
		}
		if(contador == 9)
			Vencedor = "Empate";
		return Vencedor;
	}

	private String test_vencedor(String vencedor) {
		if(vencedor.equals("X")) {
			vencedor = "X";			
		}	
		else if(vencedor.equals("Y")){
			vencedor = "0";			
		}	
			
		return vencedor;
	}	
	
	
}
