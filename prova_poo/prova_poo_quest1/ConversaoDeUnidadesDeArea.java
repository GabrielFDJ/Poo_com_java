package prova_poo_quest1;


public class ConversaoDeUnidadesDeArea {
		
	void conversor (double area) {
		double result_metro_pes = metro_pes(area);
		double result_pes_centimetros = pes_centimetros(result_metro_pes);
		double result_pes_acre = pes_acre(result_metro_pes);
		double result_acre_milha = acre_milha(result_pes_acre);
		
		System.out.println("\nA area do campo em pes quadrados sao de : "+ result_metro_pes+" pe(s)");
		System.out.println("A area do campo em centimetros quadrados sao de : "+ result_pes_centimetros+" centemetro(s)");
		System.out.println("A area do campo em acres quadrados sao de : "+ result_pes_acre+" acre(s)");
		System.out.println("A area do campo em milhas quadrados sao de : "+ result_acre_milha+" milha(s)");
		
	}
	
	double metro_pes(double area){
		double metro_para_pes = 10.76;
		double result_convert = area * metro_para_pes;
		
		return result_convert;
	}
	
	double pes_centimetros(double pes) {
		double pes_para_centimetros = 929;		
		double result_convert = pes * pes_para_centimetros;
		
		return result_convert;
	}
	 
	double pes_acre(double pes) {
		double pes_para_acre = 43.56;		
		double result_convert = pes/pes_para_acre;
		
		return result_convert; 	
	}
	
	double acre_milha(double acre) {
		double acre_para_milha = 640;		
		double result_convert = acre/acre_para_milha;
		
		return result_convert; 	
	}
}