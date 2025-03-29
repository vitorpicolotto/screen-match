import screenmatch.modelos.Filme;

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
    }
}
