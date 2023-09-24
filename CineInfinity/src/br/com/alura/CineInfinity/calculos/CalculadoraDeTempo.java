// CalculadoraDeTempo.java

package br.com.alura.CineInfinity.calculos;

import br.com.alura.CineInfinity.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();

    }
}