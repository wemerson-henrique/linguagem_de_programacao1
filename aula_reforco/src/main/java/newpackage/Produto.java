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
public class Produto {
    int codigo;
    String nome;
    int quantidade;
    double preco;
    String marca;
    
    public Produto(int codigo, String nome, int quantidade, double preco, String marca){
        this.codigo=codigo;
        this.nome=nome;
        this.quantidade=quantidade;
        this.preco=preco;
        this.marca=marca;
    }
    public void ver(){
        System.out.println("Código= " +codigo);
        System.out.println("nome= " +nome);
        System.out.println("quantidade= " +quantidade);
        System.out.println("preco= " +preco);
        System.out.println("marca" +marca);
    }
        
}
