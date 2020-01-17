package SistemaLivraria;

public class Livro {

    String livro;
    int totalPaginas;
    boolean aberto;
    String genero;
    String autor;
    String editora;
    int paginaAtual;
    int anoPublicado;

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public Livro(String livro,
                 int totalPaginas,
                 String genero,
                 String autor,
                 String editora,
                 int paginaAtual,
                 int anoPublicado) {
        this.livro = livro;
        this.totalPaginas = totalPaginas;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.paginaAtual = paginaAtual;
        this.anoPublicado = anoPublicado;
    }

    public enum TiposGenero{
        Acao,
        Aventura,
        Comedia,
        ComediaDramatica,
        Cult,
        Biografias,
        Drama,
        Espionagem,
        Erotico,
        Fantasia,
        FiccaoCientifica,
        Historico,
        Terror
    }

    public void abrirLivro(){
        this.aberto = true;
        System.out.println("Livro Aberto");
    }

    public void fecharLivro(){
        this.aberto = false;
        System.out.println("Livro Fechado");
    }

    public void proximaPagina(){
        if(this.aberto == true){
            paginaAtual++;
        }
    }

    public void proximaAnterior(){
        if(this.aberto == true){
            paginaAtual--;
        }
    }

    public void folhear(){
        if(this.aberto == true){
            paginaAtual += 10;
        }
    }

    public String ListarDadosLivro() {
        return "Livro{" +
                "livro='" + livro + '\'' +
                ", totalPaginas=" + totalPaginas +
                ", aberto=" + aberto +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + autor + '\'' +
                ", paginaAtual=" + paginaAtual +
                ", anoPublicado='" + anoPublicado + '\'' +
                '}';
    }
}
