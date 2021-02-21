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
public class Funcionario {
    private String nome;
    private String registo;

    public Funcionario(String nome, String registo) {
        this.nome = nome;
        this.registo = registo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegisto() {
        return registo;
    }

    public void setRegisto(String registo) {
        this.registo = registo;
    }
    
    public void Informacoes(){
        System.out.println("O nome do funcionrio é: "+nome);
        System.out.println("O registo do funcionrio é: "+registo);
    }
}
