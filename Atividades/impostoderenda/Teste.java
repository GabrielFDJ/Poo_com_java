package impostoderenda;

public class Teste {

    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 1");
        p1.setRendaBruta(1400);
        p1.setCpf("223.474.920-47");

        PessoaFisica p2 = new PessoaFisica();
        p2.setNome("Contribuinte 2");
        p2.setRendaBruta(1700);
        p2.setCpf("283.508.450-90");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 3");
        p3.setRendaBruta(2300);
        p3.setCpf("611.111.330-50");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 4");
        p4.setRendaBruta(3500);
        p4.setCnpj("32.096.511/0001-45");

        PessoaJuridica p5 = new PessoaJuridica();
        p5.setNome("Contribuinte 5");
        p5.setRendaBruta(4400);
        p5.setCnpj("92.973.127/0001-05");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 6");
        p6.setRendaBruta(2600);
        p6.setCnpj("87.432.969/0001-10");

        Contribuinte[] contribuintes = new Contribuinte[6];        
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for(Contribuinte c : contribuintes){
            System.out.println(c);

        }
    
        }

    }
    

