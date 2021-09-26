package zoologico;

public class Animal {
    private String nome;
    private float comprimento;
    private int numerodepatas;
    private String cor;
    private double velocidade;
    private String ambiente;

    public Animal(){
        this.numerodepatas=4;
    }
    public String getAmbiente() {
        return ambiente;    
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public String getNome() {
        return nome;    
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public int getNumerodepatas() {
        return numerodepatas;
    }
    public void setNumerodepatas(int numerodepatas) {
        this.numerodepatas = numerodepatas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    @Override
    public String toString() {
        return " Animal [Ambiente = " + ambiente + ",\n Comprimento = " + comprimento + "cm ,\n Cor = " + cor + ",\n Nome = " + nome
                + ",\n Numerodepatas = " + numerodepatas + ",\n Velocidade = " + velocidade + " m/s]";
    }
    
    
}
