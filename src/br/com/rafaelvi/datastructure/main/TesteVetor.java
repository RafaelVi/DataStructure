package br.com.rafaelvi.datastructure.main;

import br.com.rafaelvi.datastructure.models.Aluno;
import br.com.rafaelvi.datastructure.models.Vetor;

public class TesteVetor {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Nilmar");
        Aluno a2 = new Aluno("Geronimo");
        Aluno a3 = new Aluno("Luciene");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(1, a3);

        System.out.println(lista.pega(1));
        System.out.println(lista.tamanho());
        lista.remove(1);

        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);
    }
}
