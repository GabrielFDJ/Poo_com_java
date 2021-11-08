package prova_poo_quest1;
import java.util.Scanner;

public class RecebeArea {
	public static void main(String[] args) {
		ConversaoDeUnidadesDeArea Convert = new ConversaoDeUnidadesDeArea();
		Scanner entrada = new Scanner(System.in);		
		double area = 0;
		int continuar = 1;
		int exit = 1;
		
		while(continuar!=0) {
			try {
				System.out.println("\nDigite a area do campo de futebol em metros : ");
				area = entrada.nextDouble();
				Convert.conversor(area);
				
			}catch(Exception erro){				
				System.out.println("\nErro ... Voce deve digitar um numero positivo , tente novamente ...");				
				entrada.nextLine();
			}		
			
			try {
				System.out.println("\nDigite 0 para continuar o programa ou qualquer outro numero/caractere para encerrar : ");
				exit = entrada.nextInt();
				if(exit != 0) {
					continuar = 0;
					System.out.println("\nPrograma encerrado ...");	
				}	
			}catch(Exception e) {
				continuar = 0;
				System.out.println("\nPrograma encerrado ...");				
			}
		}
	}	
	
}
