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
public class Pedido {
    private int codPedido;
    private String nomeClien;
    private String descricaoPed;
    
    public Pedido(int codPedido ,String nomeClien, String descricaoPed){
        this.codPedido=codPedido;
        this.nomeClien=nomeClien;
        this.descricaoPed=descricaoPed;
    }
    public void setCodPedido(int codPedido){
        this.codPedido=codPedido;
    }
    public int getCodPedido(){
        return codPedido;
    }
    public void setNomeClien(String nomeClien){
        this.nomeClien=nomeClien;
    }
    public String getNomeClien(){
        return nomeClien;
    }
    public void setDescricaoPed(String descricaoPed){
        this.descricaoPed=descricaoPed;
    }
    public String getDescricaoPed(){
        return descricaoPed;
    }
    public void Informacoes(){
        //System.out.println("Codigo do cliente: "+getCodPedido());
        System.out.println("Nome do cliente: "+getNomeClien());
        System.out.println("Descrição do pedido: "+getDescricaoPed());
    }
    public void modificaNomeDescricao(String nomeClien, String descricaoPed){
        setNomeClien(nomeClien);
        setDescricaoPed(descricaoPed);
    }
}
