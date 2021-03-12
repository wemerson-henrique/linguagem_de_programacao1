
package newpackage;

public class PessoaFisica extends Cliente{
    private String nome;
    private String sobreNome;
    private String CPF;

    public PessoaFisica(String nome, String sobreNome, String CPF, String pais, String dataCadastro) {
        super(pais, dataCadastro);
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    void Informacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Sobre Nome: "+sobreNome);
        System.out.println("CPF: "+CPF);
        super.Informacoes();
    }
}
