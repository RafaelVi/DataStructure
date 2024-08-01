package br.com.rafaelvi.datastructure.models;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();

    public void insere(String nome){ //Stack.push() method
        nomes.add(nome);
    }
    public String remove(){ //Stack.pop() method
        return nomes.removeLast();
    }

    public String  espia(){
        return nomes.get(nomes.size() - 1);
    }

    public boolean vazia(){ //List.isEmpty()
        return nomes.size() == 0;
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
