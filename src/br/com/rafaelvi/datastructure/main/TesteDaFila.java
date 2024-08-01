package br.com.rafaelvi.datastructure.main;

import br.com.rafaelvi.datastructure.models.Filas;

public class TesteDaFila {
    public static void main(String[] args) {
        Filas fila = new Filas();

        fila.adiciona("Marcio");
        fila.adiciona("Augusto");
        fila.adiciona("Giovana");
        fila.adiciona("Cecilia");
        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(x1);


    }
}
