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
public class FuncionarioMensalista extends Funcionario{
    private Funcionario funcionario;
    private String cargo;

    public FuncionarioMensalista(Funcionario funcionario, String cargo) {
        super(funcionario.getNome(), funcionario.getRegisto());
        this.funcionario = funcionario;
        this.cargo = cargo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void Informacoes(){
        funcionario.Informacoes();
        System.out.println("O cargo do funcionrio é: "+cargo);
    }
    
    public void CalcularSalario(){
        double salario=11000;
        System.out.println("O salario do funcionario horista é: "+salario);
    }
    
}
