package model;

public class Ubs_Informacoes {

    private String nome;
    private String descricao;
    private String endereco;
    private String foto;

    public Ubs_Informacoes() {
    }

    public Ubs_Informacoes(String nome, String descricao, String endereco, String foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.endereco = endereco;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
