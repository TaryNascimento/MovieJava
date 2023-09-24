package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.minhasPreferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo(" i'm BACK ");
        minhaMusica.setCantor("None");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();

        }
        for (int i = 0; i < 1000; i++) { // fori auto-completa a sintaxe do laço for
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
            meuPodcast.setTitulo("BenDev");
            meuPodcast.setApresentador("Tary Nascimento");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();

        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();

        }
        minhasPreferidas preferidas = new minhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
