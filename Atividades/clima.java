import java.util.Scanner;

public class clima {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int quente = 40;
        int frio = 10;
        int atual;

        System.out.println("Entre com a temperatura atual : ");
        atual = texto.nextInt();
        System.out.println("Valor atual eh : " + atual);

        if (atual <= quente && atual >= frio){
            System.out.println("Normal");
        }
        else
            System.out.println(("Temperatura Extrema"));
    }
}
