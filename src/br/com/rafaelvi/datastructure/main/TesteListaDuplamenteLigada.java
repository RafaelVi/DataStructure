package br.com.rafaelvi.datastructure.main;

import br.com.rafaelvi.datastructure.models.ListaDuplamenteLigada;

import java.util.ArrayList;

public class TesteListaDuplamenteLigada {
    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        lista.adiciona("mauricio");
        lista.adiciona("cecilia");
        lista.adiciona("jose");
        lista.adiciona("joao");
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("danilo"));
    }
}
