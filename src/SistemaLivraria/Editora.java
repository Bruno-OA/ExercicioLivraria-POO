package SistemaLivraria;

public class Editora {

    private String nome;
    private String ano;
    private String cnpj;
    private String endereco;
    private String pais;
    private String estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Editora(String nome,
                   String ano,
                   String cnpj,
                   String endereco,
                   String pais,
                   String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
    }

    public String ListarDadosEditora() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
