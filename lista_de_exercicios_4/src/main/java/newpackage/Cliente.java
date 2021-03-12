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
public class Cliente {
    private String pais;
    private String dataCadastro;

    public Cliente(String pais, String dataCadastro) {
        this.pais = pais;
        this.dataCadastro = dataCadastro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    void Informacoes(){
        System.out.println("Pais: "+pais);
        System.out.println("Data Cadastro: "+dataCadastro);
    }
}
