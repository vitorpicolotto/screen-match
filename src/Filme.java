public class Filme {
    //atributos guardados dentro do objeto (encapsulamento?)
    String nomeFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes; //metodo de acesso - Private
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    //Metodos: função dentro da classe

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    } //metodo acessor - para devolver o valor de um atributo privado

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
