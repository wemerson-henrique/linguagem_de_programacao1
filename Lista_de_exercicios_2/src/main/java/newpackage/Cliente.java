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
public class Cliente {
    private int codCliente;
    private String nomeCompleto;
    private String CPF;
    
    public Cliente(int codCliente){
        this.codCliente=codCliente;
    }
    public void setCodCliente(int codCliente){
        this.codCliente=codCliente;
    }
    public int getCodCliente(){
        return codCliente;
    }
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto=nomeCompleto;
    }
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public void setCPF(String CPF){
        int conteNum=0;
        String numeros="1234567890";
        for(int i=0;i<CPF.length();i++){
            char digito=CPF.charAt(i);
            for(int x=0;x<numeros.length();x++){
                if(digito==numeros.charAt(x)){
                    conteNum++;
                }
            }
        }
        if(conteNum>=11){
            this.CPF=CPF;
        }else{
            Scanner ler=new Scanner(System.in);
            //System.out.print("CPF invalido! Insira um CPF com 11 dígitos");
            setCPF(ler.nextLine());
        }
    }
    public String getCPF(){
        return CPF;
    }
    public void Informacoes(){
        System.out.println("Codigo do cliente: "+getCodCliente());
        System.out.println("Nome completo do cliente: "+getNomeCompleto());
        System.out.println("CPF do cliente: "+getCPF());
    }
}
