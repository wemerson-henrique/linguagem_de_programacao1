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
public class Pessoa {
    private String nome;
    private String CPF;
    private int idade;
    private String endereco;
    
    Pessoa(String nome, String CPF, int idade, String endereco){
        this.nome=nome;
        this.CPF=CPF;
        this.idade=idade;
        this.endereco=endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(String nacimento) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void FazAniversario(){
        idade++;
    }
    
    public void Informacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCPF());
        System.out.println("Idade: "+getIdade());
        System.out.println("Endereco: "+getEndereco());
    }
}
