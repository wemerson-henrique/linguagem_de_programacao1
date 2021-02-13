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
    private int codigo;
    private String nome;
    private String marca;
    private double preco;
    
    public Produto(int codigo, String nome, String marca, double preco){
        this.codigo=codigo;
        this.nome=nome;
        this.marca=marca;
        this.preco=preco;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public double getPreco(){
        return preco;
    }
    public void Mostrar(){
        System.out.println("Código: "+getCodigo());
        System.out.println("Nome: "+getNome());
        System.out.println("Marca: "+getMarca());
        System.out.println("Preço: "+getPreco());
    }
}
