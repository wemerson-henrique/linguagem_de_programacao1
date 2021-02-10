/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
