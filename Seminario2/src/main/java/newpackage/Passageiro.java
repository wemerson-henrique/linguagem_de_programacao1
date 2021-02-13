//___________________________________CLASS PASSAGEIRO______________________________________________
//FEITO POR WEMERSON HENRIQUE EM 10/02/2021

package newpackage;

import java.util.Scanner;

/**
 *
 * @author kiran
 */
public class Passageiro {
    String nome;
    String rg;
    String passaporte;
    int numVoou;
    
    public Passageiro(String nome, String rg, String passaporte,int numVoou){
        this.nome=nome;
        this.rg=rg;
        this.passaporte=passaporte;
        this.numVoou=numVoou;
    }
    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("RG: "+rg);
        System.out.println("Passaporte: "+passaporte);
        System.out.println("Numero do Voou: "+numVoou);
    }
    public void checkin(){
        System.out.println("Check-in confirmado");
    }
    public void embarque(){
        System.out.println("Embarque confirmado");
    }
    public void desembarque(){
        System.out.println("Desembarque confirmado");
    }
}
