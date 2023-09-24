package br.com.alura.CineInfinity.modelos;

import br.com.alura.CineInfinity.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel { //extends estende a Classe Titulo, "Extends" (Palavra reservada do Java que aplica herança à uma classe)
        private String diretor;

        public String getDiretor(){
            return diretor;
        }
        public void setDiretor(String diretor){
            this.diretor = diretor;
        }

    @Override
    public int getClassificacao() {
        return (int)  pegaMedia() / 2;
    }
}