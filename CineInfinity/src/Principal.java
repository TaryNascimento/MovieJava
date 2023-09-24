import br.com.alura.CineInfinity.calculos.CalculadoraDeTempo;
import br.com.alura.CineInfinity.calculos.FiltroRecomendacao;
import br.com.alura.CineInfinity.modelos.Episodio;
import br.com.alura.CineInfinity.modelos.Filme;
import br.com.alura.CineInfinity.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefao");
        meuFilme.setAnolANCAMENTO(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme:  " + meuFilme.getDuracaoEmMinutos());


        // meuFilme.exibeFichaTecnica();
        meuFilme.Avalia(10);
        meuFilme.Avalia(5);
        meuFilme.Avalia(7);
        System.out.println("total de avaliações:" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //   meuFilme.somaDasAvaliacoes = 10;
        //    meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnolANCAMENTO(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost:  " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        meuFilme.setNome("Avatar");
        meuFilme.setAnolANCAMENTO(2023);
        meuFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        //calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        //variavel referência   Variavel Objeto
        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("Iron Man");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnolANCAMENTO(2003);
        filmeDoPaulo.Avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        // Size conta quantos itens tem na lista
        System.out.println("Tamanho da lista:   " + listaDeFilmes.size());

        // Essa sintaxe é interessante
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);






    }
}