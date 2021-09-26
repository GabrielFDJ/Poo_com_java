package zoologico;



public class Teste {
    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamífero urso = new Mamífero();
        urso.setNome("Urso-do-Canadá");
        urso.setCor("Vermelho");
        urso.setComprimento(180);        
        urso.setVelocidade(0.8);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("ZOO : ");
        linha();
        for(Animal animal:animais){
            System.out.println(animal);
            linha();
            
        }
    }

    public static void linha(){
        System.out.println("-------------------------------");
    }
}
