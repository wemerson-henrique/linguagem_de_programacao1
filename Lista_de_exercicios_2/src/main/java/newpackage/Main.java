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
        // 1 .Crie uma classe Cliente, considerando que esta deva possuir :
        Scanner ler=new Scanner(System.in);
        Cliente cliente1= new Cliente(0);
        Cliente cliente2= new Cliente(1);
        System.out.println("Escreva o nome completo do cliente1:");
        cliente1.setNomeCompleto(ler.nextLine());
        System.out.println("Escreva o CPF do cliente1:");
        cliente1.setCPF(ler.nextLine());
        System.out.println("Escreva o nome completo do cliente2:");
        cliente2.setNomeCompleto(ler.nextLine());
        System.out.println("Escreva o CPF do cliente2:");
        cliente2.setCPF(ler.nextLine());
        System.out.println("\n__________________GET___________________\n");
        System.out.println("Codigo do cliente1: "+cliente1.getCodCliente());
        System.out.println("Nome completo do cliente1: "+cliente1.getNomeCompleto());
        System.out.println("CPF do cliente1: "+cliente1.getCPF());
        System.out.println("\n_____________Informacoes();_____________\n");
        System.out.println("Informacoes do cliente1:");
        cliente1.Informacoes();
        System.out.println("\nInformacoes do cliente2:");
        cliente2.Informacoes();
        
        /* 2.Crie um programa que instancie dois objetos Cliente, atribua o valor
        ao atributo Nome do Cliente e CPF. Verificar se CPF é válido.
        2. Crie a classe Pedido, considerando que esta deva possuir:*/
        /*Scanner ler=new Scanner(System.in);
        Pedido pedido1=new Pedido(0,"Maria","A cliente Aria comprou hamburguer");
        Pedido pedido2=new Pedido(1,"Jorge","O cliente Jorge comprou suco");
        System.out.println("Descrição do pedido1: "+pedido1.getDescricaoPed());
        System.out.println("Descrição do pedido2: "+pedido2.getDescricaoPed());
        System.out.println("______________________pedido1____________________________");
        System.out.println("Antes\n");
        pedido1.Informacoes();
        System.out.println("\nEscreva o novo nome do cliente e a nova descrição");
        pedido1.modificaNomeDescricao(ler.nextLine(), ler.nextLine());
        System.out.println("\nDepois\n");
        pedido1.Informacoes();
        System.out.println("______________________pedido2____________________________");
        System.out.println("Antes\n");
        System.out.println("Nome do cliente: "+pedido2.getNomeClien());
        System.out.println("Descrição do pedido: "+pedido2.getDescricaoPed());
        System.out.println("\nEscreva o novo nome do cliente e a nova descrição");
        pedido2.setNomeClien(ler.nextLine());
        pedido2.setDescricaoPed(ler.nextLine());
        System.out.println("\nDepois\n");
        System.out.println("Nome do cliente: "+pedido2.getNomeClien());
        System.out.println("Descrição do pedido: "+pedido2.getDescricaoPed());*/
        
        /*3. Escreva uma classe Ponto
        ▫ contém os atributos privados x e y
        ▫ Crie um construtor para Ponto
        ▫ métodos getX() e getY() que retornam x e y
        ▫ métodos setX(int) e setY(int) que mudam x e y
        ▫ Crie uma classe TestaPonto, instancie dois objetos Ponto
        ▫ Mostre os valores de cada ponto
        ▫ Calcule a distancia entre eles.*/
        /*Scanner ler=new Scanner(System.in);
        Ponto ponto1=new Ponto(0,0);
        Ponto ponto2=new Ponto(0,0);
        Ponto ponto3=new Ponto(0,0);
        System.out.println("________________________ponto1____________________________");
        System.out.println("Escreva o valor do eixo X do primeiro ponto");
        ponto1.setX(ler.nextInt());
        System.out.println("Escreva o valor do eixo Y do primeiro ponto");
        ponto1.setY(ler.nextInt());
        ponto1.Mostrar();
        System.out.println("________________________ponto2____________________________");
        System.out.println("Escreva o valor do eixo X do segundo ponto");
        ponto2.setX(ler.nextInt());
        System.out.println("Escreva o valor do eixo Y do segundo ponto");
        ponto2.setY(ler.nextInt());
        ponto2.Mostrar();
        System.out.println("________________________distancia____________________________");
        System.out.println("A distancia entre os pontos é: "+ponto3.Distancia(ponto1, ponto2));*/
        
        /*4. Fazer um programa em Java seguindo os seguintes
        requisitos:
        ▫ Criar uma classe para representar um produto;
        ▫ A classe produto deve ter os atributos privados: código,
        nome, marca, preço;
        ▫ Criar construtor para produto;
        ▫ Criar os métodos get e set;
        ▫ Criar um menu com as opções criar produto, alterar
        nome, alterar preço, mostrar informações e sair;
        ▫ Disponibilizar um vetor para o cadastro de até 10
        produtos;
        ▫ Fazer a leitura das informações do produto e armazenar
        no vetor.*/
        /*Scanner ler=new Scanner(System.in);
        boolean ligado=true;
        int codigo,opcao,cont=0;
        String nome, marca;
        double preco;
        Produto[] produto=new Produto[10];
        do{//criar produto, alterar nome, alterar preço, mostrar informações e sair;
            System.out.println("______________________________________________________________________");
            System.out.println("                                  |                                   ");
            System.out.println("              Opção               |              Comando              ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("           Criar produto          |                 1                 ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("           Alterar nome           |                 2                 ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("           Alterar preço          |                 3                 ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("        Mostrar informações       |                 4                 ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("          Listar produtos         |                 5                 ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("                Sair              |                 0                 ");
            System.out.println("__________________________________|___________________________________");
            System.out.println("Escolha uma opção:");
            opcao=ler.nextInt();
            switch(opcao){
                case 1:
                    if(cont>=produto.length){System.out.println("Não a espaço para cadastro");break;}
                    ler.nextLine();
                    System.out.println("Escreva o nome do produto:");
                    nome=ler.nextLine();
                    System.out.println("Escreva a marca do produto:");
                    marca=ler.nextLine();
                    System.out.println("Escreva o preço do produto:");
                    preco=ler.nextDouble();
                    produto[cont]= new Produto(cont,nome,marca,preco);
                    cont++;
                    break;
                case 2:
                    System.out.println("Escreva o codigo do produto:");
                    codigo=ler.nextInt();
                    if(codigo>=cont||codigo<0){
                        System.out.println("ERRO: codigo não encontrado");
                    }else{
                        System.out.println("Escreva o novo nome do produto:");
                        ler.nextLine();
                        nome=ler.nextLine();
                        produto[codigo].setNome(nome);   
                    }
                    break;
                case 3:
                    System.out.println("Escreva o codigo do produto:");
                    codigo=ler.nextInt();
                    if(codigo>=cont||codigo<0){
                        System.out.println("ERRO: codigo não encontrado");
                    }else{
                        System.out.println("Escreva o novo preço do produto:");
                        preco=ler.nextDouble();
                        produto[codigo].setPreco(preco);
                    }
                    break;
                case 4:
                    System.out.println("Escreva o codigo do produto:");
                    codigo=ler.nextInt();
                    if(codigo>=cont||codigo<0){
                        System.out.println("ERRO: codigo não encontrado");
                    }else{
                        produto[codigo].Mostrar();
                    }
                    break;
                case 5:
                    for(int x=0;x<cont;x++){
                        System.out.println("______________________________________________________________________");
                        produto[x].Mostrar();
                    }
                    break;
                case 0:
                    ligado=false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }while(ligado==true);*/
    }
    
}
