package impostorenda;

public class Contribuinte {
    private String nome;
    private String cpf;
    private double rendaAnual;
    private char estadoCivil;
    private boolean temFilho;
    //private Patrimonio[] listaPatrimonio = new Patrimonio[10];
    private int indexListaPatrimonio = 0;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public boolean getTemFilho() {
        return temFilho;
    }


    public int getIndexListaPatrimonio() {
        return indexListaPatrimonio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setTemFilho(boolean temFilho) {
        this.temFilho = temFilho;
    }

    public void setIndexListaPatrimonio(int indexListaPatrimonio) {
        this.indexListaPatrimonio = indexListaPatrimonio;
    }
    
    
    
    
}
