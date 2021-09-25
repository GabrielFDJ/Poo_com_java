package impostoderenda;

public class PessoaJuridica extends Contribuinte{

    private String Cnpj;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    @Override
    public double calcularimposto() {
        return this.getRendaBruta() * 0.1;  
    }

    @Override
    public String toString() {
        String s = "Pessoa Juridica [";
        s+= super.toString();
        s+= " ;cnpjf" + Cnpj;
        s+= " ;imposto a ser pago : " + calcularimposto()+ "]"; 
        return s;
    }
    
    
}
