package game;

public class Jogo {
	private int status = 1;
	private int contador = 0;
	private String[] tabuleiro = new String[9];
	private String Vencedor = " "; 
	
	public Jogo() {}
	
	public void inicializar_tablueiro() {
		for(int i=0; i<9; i++) {
			tabuleiro[i] = "z";			
		}
			
	}
	
	public void preenche_tabuleiro(String verific, int index) {
		tabuleiro[index] = verific;
		contador++;	
	}
	
	public String verifica_status(){
		if(contador>2){		
			if(this.status == 1 && tabuleiro[0] != "z" && tabuleiro[0].equals(tabuleiro[1]) && tabuleiro[0].equals(tabuleiro[2])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[0]);			
			}
					
			else if(this.status == 1 && tabuleiro[0] != "z" && tabuleiro[0].equals(tabuleiro[3]) && tabuleiro[0].equals(tabuleiro[6])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[0]);			
			} 
			
			else if(this.status == 1 && tabuleiro[0] != "z" && tabuleiro[0].equals(tabuleiro[4]) && tabuleiro[0].equals(tabuleiro[8])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[0]);			
			} 
			
			else if(this.status == 1 && tabuleiro[1] != "z" && tabuleiro[1].equals(tabuleiro[4]) && tabuleiro[1].equals(tabuleiro[7])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[1]);			
			} 
				
			else if(this.status == 1 && tabuleiro[2] != "z" && tabuleiro[2].equals(tabuleiro[4]) && tabuleiro[2].equals(tabuleiro[6])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[2]);
			} 
			
			else if(this.status == 1 && tabuleiro[2] != "z" && tabuleiro[2].equals(tabuleiro[5]) && tabuleiro[2].equals(tabuleiro[8])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[2]);			
			}
			
			else if(this.status == 1 && tabuleiro[3] != "z" && tabuleiro[3].equals(tabuleiro[4]) && tabuleiro[3].equals(tabuleiro[5])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[3]);			
			}
			
			else if(this.status == 1 && tabuleiro[6] != "z" && tabuleiro[6].equals(tabuleiro[7]) && tabuleiro[6].equals(tabuleiro[8])) {
				this.status = 0;			
				Vencedor = test_vencedor(tabuleiro[6]);			
			}
			
			else if(this.status == 1 && contador == 9)
				Vencedor = "Empate";
		}
		return Vencedor;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String[] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(String[] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public String getVencedor() {
		return Vencedor;
	}

	public void setVencedor(String vencedor) {
		Vencedor = vencedor;
	}

	private String test_vencedor(String vencedor) {
		if(vencedor.equals("X")) {
			vencedor = "X";			
		}	
		else if(vencedor.equals("0")){
			vencedor = "0";			
		}	
			
		return vencedor;
	}	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}		
	
	
}
