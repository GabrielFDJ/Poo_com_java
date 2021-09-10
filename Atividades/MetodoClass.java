import java.util.Random;

public class MetodoClass {
    public static void main(String[] args) {
        int num = 3;
        welcome();
        addtwo(num);
        num = 19;
        addtwo(num);
    }

    static void welcome() {
        System.out.println("Seja bem Vindo !!!");
    }

    static void addtwo(int num) {
        int soma;
        soma = num + 2;
        System.out.println("Soma eh : " + soma);
    }
}

