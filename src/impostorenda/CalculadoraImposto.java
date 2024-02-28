
package impostorenda;


public class CalculadoraImposto {
    public void calculadoraImposto(Contribuinte contribuinte, Patrimonio[] listaPatrimonio){
        double imposto = 0.0;
        double porcentagem = 0.115;     
        double impostoPatrimonio = 0;
        
        if(contribuinte.getEstadoCivil() == 'S' || contribuinte.getEstadoCivil() == 's'){
            porcentagem = porcentagem + 0.023;
            
        } 
        if (contribuinte.getTemFilho() == false){
            porcentagem = porcentagem + 0.011;
        }
        if (contribuinte.getRendaAnual()> 500000){
            porcentagem = porcentagem + 0.095;      
        }else if (contribuinte.getRendaAnual()> 100000){
            porcentagem = porcentagem + 0.075;
        }else if (contribuinte.getRendaAnual()> 50000){
            porcentagem = porcentagem + 0.065;
        }   
        
        int j=0;
        while(listaPatrimonio[j] != null){
            if(listaPatrimonio[j].getValor() > 300000){
                double p;
                p = listaPatrimonio[j].getValor()*0.01;
                impostoPatrimonio = impostoPatrimonio + p; 
            }
            j++;
        }
      
        imposto = (contribuinte.getRendaAnual()*porcentagem);
        System.out.println("A porcentagem devida é:" + porcentagem*100 + "%");  
        System.out.println("O imposto de patrimonio é: "+impostoPatrimonio);
        System.out.println("O Valor devido é: R$  " + (impostoPatrimonio + imposto));
       
        
    }
    
}
