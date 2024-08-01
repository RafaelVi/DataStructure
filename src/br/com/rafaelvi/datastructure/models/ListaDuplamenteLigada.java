package br.com.rafaelvi.datastructure.models;

public class ListaDuplamenteLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {

        if (totalDeElementos == 0) {
            this.primeira = new Celula(elemento);
            this.ultima = this.primeira;
        } else {
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }

        this.totalDeElementos++;
    }

    public void adiciona(Object elemento) {
        if (totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula proxima = anterior.getProximo();

            Celula nova = new Celula(elemento, proxima);
            nova.setAnterior(anterior);
            anterior.setProximo(nova);
            this.totalDeElementos++;

        }
    }

    public void remove(int posicao) {
        Celula anterior = this.pegaCelula(posicao - 1);
        if (posicao == 0) {
            removeDoComeco();
        } else if (posicao == this.totalDeElementos) {
            removeDoFim();
        } else {
            Celula proxima = this.pegaCelula(posicao).getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.totalDeElementos--;
        }
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object celula) {
        Celula atual = this.primeira;

        while (atual != null) {
            if (atual.getElemento().equals(celula)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {

        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            if (atual.getProximo() != null) builder.append(",");

            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }

    private Celula pegaCelula(int posicao) {

        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }

        Celula atual = primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void removeDoComeco() {
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }

        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public  void removeDoFim(){
        if (this.totalDeElementos == 1) this.removeDoComeco();
        else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
}

