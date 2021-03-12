
package newpackage;


public class Livro extends Produto{
    private String autor;
    private String titulo;
    private String ISBN;

    public Livro(String autor, String titulo, String ISBN, int id, String descricao, double custo) {
        super(id, descricao, custo);
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    void Inforcacoes(){
        System.out.println("Autor: "+autor);
        System.out.println("Titulo: "+titulo);
        System.out.println("ISBN: "+ISBN);
        super.Inforcacoes();
    }
}
