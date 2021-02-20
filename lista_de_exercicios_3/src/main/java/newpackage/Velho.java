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
public class Velho extends Imovel{
    private Imovel imovel;
    private Double descontoPreco;

    public Velho(Imovel imovel, Double descontoPreco) {
        super(imovel.getEndereco(), imovel.getPreco());
        this.imovel= imovel;
        this.descontoPreco = descontoPreco;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Double getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(Double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

    public void Informacoes() {
        System.out.println("Desconto de: "+descontoPreco);
        imovel.Informacoes();
    }
    
    public void PrecoDesconto(){
        double precoFinal=imovel.getPreco()- descontoPreco;
        System.out.println("O preço final do imavel é "+precoFinal);
    }
    
}
