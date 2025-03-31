import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNomeFilme("Harry Potter e a Pedra Filosofal");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(142);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);

        System.out.println("Total de avaliações: " +meuFilme.getTotalAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        //exemplo de herança
        Serie theWire = new Serie();
        theWire.setNomeFilme("The Wire");
        theWire.setAnoDeLancamento(2000);
        theWire.exibeFichaTecnica();
        theWire.setTemporadas(5);
        theWire.setMinutosPorEpisodio(60);
        theWire.setEpisodiosPorTemporada(18);
        System.out.println("Duração para maratonar The Wire: " + theWire.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
    }
}
