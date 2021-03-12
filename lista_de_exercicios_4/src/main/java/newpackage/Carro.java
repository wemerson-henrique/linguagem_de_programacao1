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
public class Carro {
    private String chassi;
    private String placa;
    private String modelo;
    private double ano;
    private String cor;

    public Carro(String chassi, String placa, String modelo, double ano, String cor) {
        this.chassi = chassi;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    void Informacoes(){
        System.err.println("chassi: "+chassi);
        System.err.println("placa: "+placa);
        System.err.println("modelo: "+modelo);
        System.err.println("ano: "+ano);
        System.err.println("cor: "+cor);
    }
}
