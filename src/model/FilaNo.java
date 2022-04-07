package model;

import exception.ListaVaziaException;

public class FilaNo extends ListaNo{

    private static volatile FilaNo instance = null;

    private FilaNo(){
        setTamanhoLista(0);
        setInicio(null);
        setUltimo(null);
    }

    public static FilaNo getInstance(){
        if (instance == null){
            synchronized (FilaNo.class){
                if (instance == null){
                    instance = new FilaNo();
                }
            }
        }
        return instance;
    }

    public void inserirNoFim(Integer valor){
        if (estaVazio()){
            No no = new No(valor);
            this.setInicio(no);
            this.setUltimo(no);
        }else{
            this.setInicio(new No(valor, this.getInicio()));
        }
        this.setTamanhoLista(this.getTamanhoLista() + 1);
    }

    public Integer removerNoInicio() {
        if (estaVazio()){
            throw new ListaVaziaException("A lista está vazia");
        }
        No valorRetorno = getInicio();
        if (getInicio().equals(getUltimo())){
            setInicio(null);
            setUltimo(null);
        }else{
            setInicio(getInicio().getProximo());
        }
        this.setTamanhoLista(this.getTamanhoLista() - 1);
        return valorRetorno.getValor();
    }

    public void iteratorFila(){
        if (estaVazio()){
            System.out.print("Está vazio \n");
            return;
        }

        No auxiliar = getInicio();
        while (auxiliar != null){
            System.out.printf("Valor: %d \n",auxiliar.getValor());
            auxiliar = auxiliar.getProximo();
        }
        System.out.printf("A lista tem %d de tamanho \n",getTamanhoLista());
    }

}
