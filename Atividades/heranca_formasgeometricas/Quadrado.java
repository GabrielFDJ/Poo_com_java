package heranca_formasgeometricas;

public class Quadrado extends FormaGeometrica{
    private Ponto a;
    private Ponto b;

    public Quadrado(Ponto x , Ponto y){
        this.a=x;
        this.b=y;
    }

    public double calcularArea(){
        double lado=this.distancia(a, b);
        return lado*lado;       
    }




    
}
