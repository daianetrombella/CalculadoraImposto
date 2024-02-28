
package impostorenda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa Avançado Para Calcular Imposto de Renda");
        System.out.println("================================================");
        Scanner scn = new Scanner(System.in);
        Contribuinte c1 = new Contribuinte();
        
        //pedindo nome
        System.out.print("Informe o nome do contribuinte:");
        c1.setNome(scn.nextLine());
        
        //pedindo cpf
        System.out.print("Informe o cpf do contribuinte: ");
        c1.setCpf(scn.nextLine());
        
        //pedindo renda anual
        System.out.print("Informe a renda anual(XX,XX): ");
        c1.setRendaAnual(scn.nextDouble());

        //pedindo Estado Civil
        System.out.print("Estado Civil(C = casado ou S = solteiro): ");
        c1.setEstadoCivil(scn.next().charAt(0));
        
        scn.nextLine();
        
        //pedindo se tem filho
        System.out.print("Tem filho? (sim ou nao)");
        String filhos = scn.nextLine();
        //testando a resposta
        if(filhos.equalsIgnoreCase("sim")){
            c1.setTemFilho(true);
        }else{
            c1.setTemFilho(false);
        }
        System.out.println("Aperte ENTER para continuar");
        
        
        Patrimonio[] listaPatrimonio = new Patrimonio[10];
        
        //pedindo se deseja declarar patrimonio
        boolean condicao=true;
        float valorTotal = 0;
        int i = 0;
        
        while(condicao!=false){
            scn.nextLine();
            System.out.print("Deseja declarar patrimonio?(sim ou nao) ");
            String r = scn.nextLine();
            condicao = true;
        
            if(r.equalsIgnoreCase("sim")){
                System.out.print("Informe o nome do patrimonio "+ (i+1)+ ":");
                String nome = scn.nextLine();
            
                System.out.print("Informe o valor do patrimonio "+ (i+1)+ "(XX,XX):");
                float valor = scn.nextFloat();
                
            
                Patrimonio p = new Patrimonio(nome, valor);
                listaPatrimonio[i]= p;
                valorTotal = valorTotal + valor;
                
            }else{
                condicao=false;
            }
            i++;
        }
        String estado = null;
        if(c1.getEstadoCivil() == 'C' || c1.getEstadoCivil() == 'c'){
            estado = "casado(a)";
        }else if(c1.getEstadoCivil() == 'S' || c1.getEstadoCivil() == 's'){
            estado = "solteiro(a)";
        }
        
        String dependente = null;
        if(filhos.equalsIgnoreCase("sim")){
        dependente = "com filhos";
        }else if (filhos.equalsIgnoreCase("nao")){
            dependente = "sem filhos";
        }
    
        //IMPRIMINDO O RESULTADO
        float f = (float) c1.getRendaAnual();
       //System.out.printf("\nCalculando o imposto de renda de "+ c1.getNome()+ " com CPF: "+ c1.getCpf() +" "+ estado + " "+ dependente + ", e renda anual de R$%.2f"+ c1.getRendaAnual());
       System.out.format("\nCalculando o imposto de renda de %s com CPF %s %s %s e renda anual de %.2f", c1.getNome(), c1.getCpf(), estado, dependente, f);
       System.out.println("\nLista de patrimônio: ");
       for(int j =0; j < 10; j++){
           if(listaPatrimonio[j] != null){
            System.out.println((j+1) + "- "+ listaPatrimonio[j].getNome() +" no valor de R$" + listaPatrimonio[j].getValor());
           }
       }
       CalculadoraImposto c2 = new CalculadoraImposto();
       c2.calculadoraImposto(c1,listaPatrimonio);
       
        //System.out.println("Nome: "+ c1.getNome());
        //System.out.println("Cpf: "+ c1.getCpf());
        //System.out.println("Renda Anual: "+ c1.getRendaAnual());
        //System.out.println("Estado Civil: "+ c1.getEstadoCivil());
        //System.out.println("Tem filho: "+ c1.getTemFilho());
        
        
    }
    
}
