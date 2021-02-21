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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*/ 1. Crie a classe Pessoa, Professor e Aluno e utilize o conceito de herança. Crie uma classe para Teste que
        contenha um método main, crie objetos do tipo Professor e Aluno, e imprima os valores de cada objeto
        criado.*/
        System.out.println("\n---------------------Pessoa---------------------\n");
        Pessoa pessoa1=new Pessoa("Jose","232.565.565-23",42,"Rua Bernadida 12");
        pessoa1.Informacoes();
        System.out.println("\n---------------------Professor---------------------\n");
        Professor professor1= new Professor(pessoa1, "Matutitno", "Matematica", 5000);
        professor1.Informacoes();
        System.out.println("\n---------------------Aluno---------------------\n");
        System.out.println("Aluno1\n");
        Aluno aluno1=new Aluno("Maria","432.365.565-03",12,"Alameda Sempre Verde 21",123,2);
        aluno1.Informacoes();
        System.out.println("\nAluno2\n");
        Aluno aluno2=new Aluno("Ana","342.545.565-83",13,"Avenida Jardins 43",124,2);
        aluno2.Informacoes();
        System.out.println("\n---------------------Aplicação o Teste---------------------\n");
        Teste teste1 = new Teste (professor1, aluno1, 14);
        teste1.AplicaTeste();
        teste1.Resultado();
        Teste teste2 = new Teste (professor1, aluno2, 14);
        teste2.Resultado();
        System.out.println("\n---------------------Aluno Apos Teste---------------------\n");
        System.out.println("Aluno1\n");
        aluno1.Informacoes();
        System.out.println("\nAluno2\n");
        aluno2.Informacoes();
        
        /*2. Crie a classe Imovel, que possui um endereço e um preço. 
        a. crie uma classe Novo, que herda Imovel e possui um adicional no preço.
        b. Crie métodos de acesso e impressão deste valor adicional.
        c. crie uma classe Velho, que herda Imovel e possui um desconto no preço. Crie
        métodos de acesso e impressão para este desconto.
        d. crie um imóvel. Peça para o usuário digitar 1 para novo e 2 para velho. Conforme a
        definição do usuário, imprima o valor final do imóvel.*/
        /*System.out.println("________________________Informacoes do Imovel_________________________");
        Imovel imovel1=new Imovel("Avenida Marte de Forja 132",187000);
        imovel1.Informacoes();
        Scanner ler=new Scanner (System.in);
        int opcao=0;
        do{
            System.out.println("\nDigitar 1 para novo e 2 para velho ou 0 para sair.\n");
            opcao=ler.nextInt();
            if(1==opcao){
                System.out.println("______________________Imovel Novo___________________________");
                Novo imovelNovo=new Novo(imovel1,200000.0);
                imovelNovo.Informacoes();
                imovelNovo.PrecoAdicional();
            }
            if(2==opcao){
                System.out.println("_____________________Imovel Velho____________________________");
                Velho imovelVelho1=new Velho(imovel1,100000.0);
                imovelVelho1.Informacoes();
                imovelVelho1.PrecoDesconto();
            }
        }while(opcao!=0);*/
        
        //3. Implemente os diagramas de classe abaixo, em seguida crie os objetos:
        /*System.out.println("\n_____________________Funcionario____________________________\n");
        Funcionario funcionario1=new Funcionario("Jose","ica22");
        funcionario1.Informacoes();
        Funcionario funcionario2=new Funcionario("Maria","isd42");
        funcionario2.Informacoes();
        System.out.println("\n_____________________Funcionario Horista____________________________\n");
        FuncionarioHorista funcionarioHorista1=new FuncionarioHorista(funcionario1,180,50);
        funcionarioHorista1.Informacoes();
        funcionarioHorista1.CalcularSalario();
        System.out.println("\n_____________________Funcionario Mensalista____________________________\n");
        FuncionarioMensalista funcionarioMensalista1=new FuncionarioMensalista(funcionario2,"Supervisor");
        funcionarioMensalista1.Informacoes();
        funcionarioMensalista1.CalcularSalario();*/
        
    }
    
}
