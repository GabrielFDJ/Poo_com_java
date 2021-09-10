import java.util.Scanner;

public class verification_senha {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);

        int numero = 1234;
        int password = 9999;
        int coduser,senha,opcao;
        int auxiliar = 1;

        System.out.println("Digite o codigo do user : ");
        coduser = texto.nextInt();

        if(coduser != numero){
            System.out.println("Usuário inválido!");
            auxiliar = 0;}

        while(auxiliar == 1) {
            System.out.println("Digite a senha : ");
            senha = texto.nextInt();

            if (senha == password) {
                System.out.println("Acesso permitido");
                auxiliar = 0;
            } else {
                System.out.println("Senha incorreta");
                System.out.println("1 - Para tentar novamente");
                System.out.println("2 - Para encerrar o sistema");
                System.out.println("Digite uma opção : ");
                opcao = texto.nextInt();
                switch (opcao) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("End...");
                        auxiliar = 0;
                        break;
                    default:
                        System.out.println("Opção inválida ,  sistema encerrado");
                        auxiliar = 0;
                        break;
                }

            }
        }


    }
}
