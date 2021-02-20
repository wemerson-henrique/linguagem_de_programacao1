/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Random;

/**
 *
 * @author kiran
 */
public class Teste {
    private Professor professor;
    private Aluno aluno;
    private double valorTeste;
    private double nota;
    
    public Teste(Professor professor, Aluno aluno, double valorTeste){
        this.professor=professor;
        this.aluno=aluno;
        this.valorTeste=valorTeste;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getValorTeste() {
        return valorTeste;
    }

    public void setValorTeste(double valorTeste) {
        this.valorTeste = valorTeste;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void AplicaTeste(){
        System.out.println("O deste cera aplicado agora pelo professor "+professor.getNome());
        System.out.println("Valor do Teste: "+valorTeste);
        
    }
    public void Resultado(){
        Random random = new Random();
        nota = random.nextDouble() * valorTeste;
        System.out.println("O aluno "+aluno.getNome()+" tirou "+nota+" no teste;");
        aluno.setNota1(nota);
    }
    public void Informacoes(){
        System.out.println("Professor: "+professor);
        System.out.println("Aluno: "+aluno);
        System.out.println("Valor do Teste: "+valorTeste);
        System.out.println("Nota: "+nota);
    }
}
