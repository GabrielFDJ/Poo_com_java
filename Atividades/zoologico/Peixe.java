package zoologico;

public class Peixe extends Animal{
    private String caracterisitcas;

    public Peixe(){
        super();
        this.setNumerodepatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracterisitcas="Barbatanas e Cauda";
    }

    public String getCaracterisitcas() {
        return caracterisitcas;
    }

    public void setCaracterisitcas(String caracterisitcas) {
        this.caracterisitcas = caracterisitcas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s+= "\n Caracteristicas : "+caracterisitcas+ "]";
        return s;
    }
    
    
}
