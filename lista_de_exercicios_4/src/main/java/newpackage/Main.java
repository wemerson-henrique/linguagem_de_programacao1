/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kiran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Faça um Programa para representar as informações de um Carro que contenha:
        a. 5 atributos privados
        b. Método construtor
        c. Métodos get e set
        d. 2 objetos
        e. Imprimir informações*/
        //System.out.println("E");
        /*System.out.println("_____________________________carro1_____________________________");
        Carro carro1=new Carro("123-232-233", "ABC123", "Ferrari", 1999, "Amarelo");
        carro1.Informacoes();
        System.out.println("_____________________________carro2_____________________________");
        Carro carro2=new Carro("123-232-233", "ABC123", "Ferrari", 1999, "Amarelo");
        carro2.Informacoes();*/
        
        /*2. Crie as três classes, usando os conceitos de herança e considerando que devem possuir:
        Atributos
        Construtor
        Métodos
        Crie uma classe que instancie um objeto para Pessoa
        Física e outro para Pessoa jurídica. Imprima todas as
        informações de cada objeto.*/
        /*System.out.println("_____________________________PessoaFisica_____________________________");
        System.out.println("\npessoa1\n");
        PessoaFisica pessoa1=new PessoaFisica("Ana", "Mendez", "123.456.356-42", "Fraça", "02/08/2019");
        pessoa1.Informacoes();
        System.out.println("\npessoa2\n");
        PessoaFisica pessoa2=new PessoaFisica("Pedro", "Silva", "754.456.764-29", "Germany", "24/05/2020");
        pessoa2.Informacoes();
        System.out.println("_____________________________PessoaJuridica_____________________________");
        System.out.println("\npessoa3\n");
        PessoaJuridica pessoa3=new PessoaJuridica("O ferecer bom serviço","Fort Academia","FA","FR-234.232.32","Estados Unidos", "11/03/2018");
        pessoa3.Informacoes();
        System.out.println("\npessoa4\n");
        PessoaJuridica pessoa4=new PessoaJuridica("O ferecer o melhor produto","BD Sepermercado","BDS","BR-115.764.23","Brasil", "13/06/2017");
        pessoa4.Informacoes();*/
        
        /*3. Crie uma tela semelhante à apresentada a seguir usando os comandos de interface gráfica do Java.
        Acrescentar um botão “Salvar” que quando clicado mostra a mensagem: “Professor(a) X cadastrado(a)
        com sucesso!”.*/
        //Janela
        JFrame janela1= new JFrame("Cadastro de Professor");
        janela1.setSize(1000,600);
        janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Painel
        JPanel painel= new JPanel();
        janela1.setContentPane(painel);
        painel.setLayout(new GridLayout(0,2));
        janela1.setVisible(true);
        //Registro
        JLabel labelRegistro=new JLabel();
        labelRegistro.setText("Registro: ");
        painel.add(labelRegistro);
        
        JTextField imputRegistro= new JTextField(40);
        painel.add(imputRegistro);
        //Nome
        JLabel labelNome=new JLabel();
        labelNome.setText("Nome: ");
        painel.add(labelNome);
        
        JTextField imputNome= new JTextField(40);
        painel.add(imputNome);
        
        //Titulo
        JLabel labelTiTulo=new JLabel();
        labelTiTulo.setText("Titulo: ");
        janela1.add(labelTiTulo);
        String[] itens =new String[3];
        itens[0]="Especialista";
        itens[1]="Mestre";
        itens[2]="Doutor";
        JComboBox opcoes=new JComboBox(itens);
        painel.add(opcoes);
        //dataAdmissao
        JLabel labeldataAdmissao=new JLabel();
        labeldataAdmissao.setText("data Admissao: ");
        painel.add(labeldataAdmissao);
        
        JTextField imputdataAdmissao= new JTextField(40);
        painel.add(imputdataAdmissao);
        //Botão
        JButton botao1=new JButton("CADASTRAR");
        painel.add(botao1);
        botao1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame janela2=new JFrame("Cliente cadastrado");
                janela2.setVisible(true);
                janela2.setSize(400,200);
                
                JLabel rotulo3 = new JLabel("Professor(a) "+imputNome.getText()+" cadastrado(a)com sucesso!");
                janela2.add(rotulo3);
            }
        });
        JButton botao2=new JButton("LIMPAR");
        painel.add(botao2);
        botao2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                imputRegistro.setText("");
                imputNome.setText("");
                imputdataAdmissao.setText("");
            }
        });
    }
    
}
