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
    private Pessoa pessoa;
    private String turno;
    private String materia;
    private double salario;

    public Professor(Pessoa pessoa, String turno, String materia, double salario) {
        super(pessoa.getNome(), pessoa.getCPF(), pessoa.getIdade(), pessoa.getEndereco());
        this.pessoa = pessoa;
        this.turno = turno;
        this.materia = materia;
        this.salario = salario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void Informacoes(){
        super.Informacoes();
        System.out.println("Turno: "+turno);
        System.out.println("Materia: "+materia);
        System.out.println("Salario: "+salario);
    }
    public void Almento(double reajuste){
        salario+=reajuste;
    }
}
