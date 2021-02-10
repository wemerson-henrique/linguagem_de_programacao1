/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author kiran
 */
public class Cliente {
    String nome;
    String endereco;
    String CPF;
    String telefone;
        
    public Cliente(String nome, String endereco, String CPF, String telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.CPF=CPF;
        this.telefone=telefone;
    }
        public void ver(){
            System.out.println("nome=" +nome);
            System.out.println("endereco=" +endereco);
            System.out.println("CPF=" +CPF);
            System.out.println("telefone=" +telefone);
        }
}
