package controller;

import exception.EscolhaInvalidaExcepiton;

import java.util.Scanner;

public class Menu {

    private Integer acao = 0;
    private Integer option = 0;

    public void inicio(){
        Scanner scan = new Scanner(System.in);


        System.out.print("(1) Inserir novo elemento\n(2) Remover Elemento\n(3) Buscar Elemento\n(4) Imprimeir Elemento\n (0)Sair");
        acao = scan.nextInt();
        if (!validaEscolha(acao, 4)){
            throw new EscolhaInvalidaExcepiton("Escolha invalida, por favor, escolha uma opção de 0 a 4");
        }
        System.out.print("(1) Lista\n(2) Pilha\n(3) Fila\n(0)Sair");
        option = scan.nextInt();
        if (!validaEscolha(option, 3)){
            throw new EscolhaInvalidaExcepiton("Escolha invalida, por favor, escolha uma opção de 0 a 4");
        }
        switch (option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    public Boolean validaEscolha(Integer escolha, Integer limite){
        if (escolha < 0 && escolha > limite){
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

}
