public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nomeFilme = "Harry Potter e a Pedra Filosofal";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 142;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " +meuFilme.getTotalAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
    }
}
