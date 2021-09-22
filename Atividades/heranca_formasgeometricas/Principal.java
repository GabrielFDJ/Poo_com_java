package heranca_formasgeometricas;
import java.io.PrintStream;

public class Principal {
    public static void main(String[] args) {
        PrintStream show = System.out;
        FormaGeometrica fm = new Quadrado(new Ponto(2,3), new Ponto(7,8));
        show.println(fm.calcularArea());
        fm = new Circulo(new Ponto(2,3), new Ponto(7,8 ));
        show.println(fm.calcularArea());
    }
    
}
