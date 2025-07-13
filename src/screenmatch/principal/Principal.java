package screenmatch.principal;
import java.util.ArrayList;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter e a Pedra Filosofal", 2001);
        //meuFilme.setNomeFilme("Harry Potter e a Pedra Filosofal");
        //meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(142);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        Filme novoFilme = new Filme("Alta Fidelidade", 2000);
        //novoFilme.setNomeFilme("Alta Fidelidade");
        novoFilme.setDuracaoEmMinutos(100);
        //novoFilme.setAnoDeLancamento(2000);
        novoFilme.avalia(10);

        ArrayList <Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(novoFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNomeFilme());
        System.out.print(listaDeFilmes.toString());


        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        //exemplo de herança
        Serie theWire = new Serie("The Wire", 2000);
        // theWire.setNomeFilme("The Wire");
        // theWire.setAnoDeLancamento(2000);
        theWire.exibeFichaTecnica();
        theWire.setTemporadas(5);
        theWire.setMinutosPorEpisodio(60);
        theWire.setEpisodiosPorTemporada(18);
        System.out.println("Duração para maratonar The Wire: " + theWire.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theWire);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
