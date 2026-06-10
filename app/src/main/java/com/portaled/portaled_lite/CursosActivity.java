package com.portaled.portaled_lite;

public class CursosActivity {

    private int id;
    private String nome;
    private String descricao;
    private int quantidadeAulas;

    public CursosActivity(int id,
                          String nome,
                          String descricao,
                          int quantidadeAulas) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeAulas = quantidadeAulas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }
}