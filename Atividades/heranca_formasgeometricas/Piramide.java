package heranca_formasgeometricas;

public class Piramide extends FormaGeometrica{
    private Ponto a;
    private Ponto b;

    public Piramide (Ponto x, Ponto y){
        this.a=x;
        this.b=y;
    }
    
    public double calcularArea(){                
        double raio=this.distancia(a, b);
        return Math.PI*raio*raio; 
    }
}
