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
public class FuncionarioHorista extends Funcionario{
    private Funcionario funcionario;
    private double horasMensais;
    private double valorHora;

    public FuncionarioHorista(Funcionario funcionario, double horasMensais, double valorHora) {
        super(funcionario.getNome(), funcionario.getRegisto());
        this.funcionario = funcionario;
        this.horasMensais = horasMensais;
        this.valorHora = valorHora;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getHorasMensais() {
        return horasMensais;
    }

    public void setHorasMensais(double horasMensais) {
        this.horasMensais = horasMensais;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public void Informacoes(){
        super.Informacoes();
        System.out.println("Horas mensais: "+horasMensais);
        System.out.println("Valor hora: "+valorHora);
    }
    
    public void CalcularSalario(){
        double salario=horasMensais * valorHora;
        System.out.println("O salario do funcionario horista é: "+salario);
    }
}
