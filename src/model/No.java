package model;

import java.util.Objects;

public class No {

    private Integer valor;
    private No proximo;

    public No(Integer valor, No proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public No(Integer valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
