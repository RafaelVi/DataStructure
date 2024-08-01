package br.com.rafaelvi.datastructure.models;

import java.util.LinkedList;
import java.util.List;

public class Filas {
    private List<String> alunos = new LinkedList<String>();

    public void adiciona(String aluno){ //Queue.add();
        alunos.add(aluno);
    }

    public String remove(){ //Queue.poll();
        return alunos.remove(0);
    }

    public boolean vazia(){ //List.isEmpty();
        return alunos.size() == 0;
    }

    @Override
    public String toString() {
        return alunos.toString();
    }
}
