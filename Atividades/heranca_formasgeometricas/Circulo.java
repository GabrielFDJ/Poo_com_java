package heranca_formasgeometricas;

public class Circulo extends FormaGeometrica{
    private Ponto a;
    private Ponto b;

    public Circulo (Ponto x, Ponto y){
        this.a=x;
        this.b=y;
    }
    
    public double calcularArea(){                
        double raio=this.distancia(a, b);
        return Math.PI*raio*raio; 
    }
}
