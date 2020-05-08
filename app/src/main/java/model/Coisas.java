package model;

public class Coisas {
    private String nome;
    private String descricao;
    private String qtd;
    private String foto;

    public Coisas() {
    }

    public Coisas(String nome, String descricao, String qtd, String foto) {
        this.nome = nome;
        this.descricao = descricao;
        this.qtd = qtd;
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

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
