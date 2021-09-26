package zoologico;

public class Mamífero extends Animal{
    private String alimento;

    public Mamífero(){
        super();
        this.setAmbiente("Terra");
        this.setCor("Castanho");
        this.alimento="Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s+= "\n Alimento : " + alimento +"]";
        return s;
    }
    
    
}
