package br.apphospital.modelo;

import java.io.Serializable;

public abstract class Funcionario implements Serializable {
    protected String codfuncionario;
    protected String nome;
    protected Integer numhorastrab;

    public String getCodfuncionario() {
        return codfuncionario;
    }

    public void setCodfuncionario(String codfuncionario) {
        this.codfuncionario = codfuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumhorastrab() {
        return numhorastrab;
    }

    public void setNumhorastrab(Integer numhorastrab) {
        this.numhorastrab = numhorastrab;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codfuncionario=" + codfuncionario + ", nome=" + nome + ", numhorastrab=" + numhorastrab + '}';
    }
    
    
}
