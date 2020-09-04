package com.example.projetomobile;

public class Usuario {

    public String nome;
    public String email;
    public String senha;
    public String dtsnc;
    public String cpf;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String dtsnc, String cpf) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dtsnc = dtsnc;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDtsnc() {
        return dtsnc;
    }

    public void setDtsnc(String dtsnc) {
        this.dtsnc = dtsnc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
