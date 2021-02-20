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
public class Novo extends Imovel{
    private Imovel imovel;
    private Double adicionalPreco;

    public Novo(Imovel imovel,Double adicionalPreco) {
        super(imovel.getEndereco(), imovel.getPreco());
        this.imovel= imovel;
        this.adicionalPreco = adicionalPreco;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(Double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }

    public void Informacoes() {
        System.out.println("Adicional de: "+adicionalPreco);
        imovel.Informacoes();
    }
    
    public void PrecoAdicional(){
        double precoFinal=imovel.getPreco()+ adicionalPreco;
        System.out.println("O preço final do imavel é: "+precoFinal);
    }
    
}
