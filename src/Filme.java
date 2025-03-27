public class Filme {
    //atributos guardados dentro do objeto (encapsulamento?)
    String nomeFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    //Metodos: função dentro da classe

    void exibeFichaTecnica(){
        System.out.println("Título: " + nomeFilme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

}
