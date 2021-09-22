package heranca_formasgeometricas;

public class FormaGeometrica {

    private String cordaLinha;
    private String cordaArea;
    
    public String getCordaLinha() {
        return cordaLinha;
    }
    public void setCordaLinha(String cordaLinha) {
        this.cordaLinha = cordaLinha;
    }
    public String getCordaArea() {
        return cordaArea;
    }
    public void setCordaArea(String cordaArea) {
        this.cordaArea = cordaArea;
    } 

    public double distancia(Ponto a, Ponto b){
        return Math.sqrt(Math.pow((a.getX())-(b.getX()),2)+Math.pow(((a.getY())-(b.getY())),2));
    }

    public double calcularArea(){
        return 0;
    }
    
}