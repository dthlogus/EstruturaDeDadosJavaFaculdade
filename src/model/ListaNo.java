package model;

public class ListaNo{

    private No inicio;
    private No ultimo;
    private Integer tamanhoLista;

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public Integer getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(Integer tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public Boolean estaVazio(){
        return this.inicio == null;
    }

}
