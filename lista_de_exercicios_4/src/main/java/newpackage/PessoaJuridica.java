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
public class PessoaJuridica extends Cliente {
    private String razaoSocial;
    private String nomeFantasia;
    private String sigla;
    private String CNPJ;

    public PessoaJuridica(String razaoSocial, String nomeFantasia, String sigla, String CNPJ, String pais, String dataCadastro) {
        super(pais, dataCadastro);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.sigla = sigla;
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    void Informacoes(){
        System.out.println("Razão Social: "+razaoSocial);
        System.out.println("Nome Fantasia: "+nomeFantasia);
        System.out.println("Sigla: "+sigla);
        System.out.println("CNPJ: "+CNPJ);
        super.Informacoes();
    }
}
