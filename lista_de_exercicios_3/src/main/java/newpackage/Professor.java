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
public class Professor extends Pessoa {
    private String turno;
    private double salario;
    
    
    public Professor(String nome, String CPF, int idade, String endereco, String turno, double salario) {
        super(nome, CPF, idade, endereco);
        this.salario=salario;
        this.turno=turno;
    }
    public void Informacoes(){
        System.out.println("Nome de Professor: "+getNome());
        System.out.println("CPF: "+getCPF());
        System.out.println("Idade: "+getIdade());
        System.out.println("Endereco: "+getEndereco());
        System.out.println("Turno: "+turno);
        System.out.println("Salario: "+salario);
    }
    public void Almento(double reajuste){
        salario+=reajuste;
    }
}
