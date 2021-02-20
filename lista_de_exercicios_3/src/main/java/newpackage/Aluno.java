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
public class Aluno extends Pessoa{
    private int numMatricula;
    private int numSala;
    private double nota1;
    private double notaFinal;
    
    public Aluno(String nome, String CPF, int idade, String endereco, int numMatricula, int numSala) {
        super(nome, CPF, idade, endereco);
        this.numMatricula=numMatricula;
        this.numSala=numSala;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
        NotaFinal();
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public void Rematricula(){
        System.out.println("Aluno fez rematricula");
    }
    public void PassaAno(){
        if(notaFinal>=60){
            System.out.println("Aluno passou de ano");
        }else{
            RepeteAno();
        }
    }
    public void RepeteAno(){
        if(notaFinal<=60){
            System.out.println("Aluno não passou de ano");
        }else{
            PassaAno();
        }
    }
    public void Informacoes(){
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCPF());
        System.out.println("Idade: "+getIdade());
        System.out.println("Endereco: "+getEndereco());
        System.out.println("Matricula: "+numMatricula);
        System.out.println("Numer da Sala: "+numSala);
        System.out.println("Nota: "+nota1);
        System.out.println("Nota Final: "+notaFinal);
    }
    public void NotaFinal(){
        notaFinal+=nota1;
    }
}
