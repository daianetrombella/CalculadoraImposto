
package impostorenda;

/**
 *
 * @author Daiane
 */
public class Patrimonio{
    private String nome;
    private float valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
    
    
    Patrimonio(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }
    
 
    
}