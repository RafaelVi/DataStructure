package br.com.rafaelvi.datastructure.main;

import br.com.rafaelvi.datastructure.models.ListaLigada;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("mauricio");
        lista.adicionaNoComeco("paulo");
        lista.adicionaNoComeco("guilherme");
        lista.adiciona("joao");
        lista.adiciona(2, "gabriel");
        //System.out.println(lista);

        Object x = lista.pega(2);
        //System.out.println(x);

        System.out.println(lista);
        lista.removeDoComeco();
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);
        lista.remove(lista.tamanho());
        System.out.println(lista);

        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("lara"));




    }
}
