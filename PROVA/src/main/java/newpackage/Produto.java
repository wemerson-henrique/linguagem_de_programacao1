
package newpackage;


public class Produto {
    private int id;
    private String descricao;
    private double custo;

    public Produto(int id, String descricao, double custo) {
        this.id = id;
        this.descricao = descricao;
        this.custo = custo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    void Inforcacoes(){
        System.out.println("ID: "+id);
        System.out.println("Descricao: "+descricao);
        System.out.println("Custo: "+custo);
    }
}
