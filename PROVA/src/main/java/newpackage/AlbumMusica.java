
package newpackage;


public class AlbumMusica extends Produto{
    private String artista;
    private String nomeAlbum;
    private String faixaExecucao;

    public AlbumMusica(String artista, String nomeAlbum, String faixaExecucao, int id, String descricao, double custo) {
        super(id, descricao, custo);
        this.artista = artista;
        this.nomeAlbum = nomeAlbum;
        this.faixaExecucao = faixaExecucao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getFaixaExecucao() {
        return faixaExecucao;
    }

    public void setFaixaExecucao(String faixaExecucao) {
        this.faixaExecucao = faixaExecucao;
    }
    
    void Inforcacoes(){
        System.out.println("Artista: "+artista);
        System.out.println("Nome Album: "+nomeAlbum);
        System.out.println("Faixa Execucao: "+faixaExecucao);
        super.Inforcacoes();
    }
}
