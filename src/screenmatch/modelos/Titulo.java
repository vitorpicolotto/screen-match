package screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    //atributos guardados dentro do objeto (encapsulamento?)
    private String nomeFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes; //modificador de acesso - private restringe que o atributo seja modificado
    private int totalAvaliacoes;
    private int duracaoEmMinutos;


    //construtor
     public Titulo(String nomeFilme, int anoDeLancamento) {
        this.nomeFilme = nomeFilme;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Metodos: função dentro da classe

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    } //metodo acessor - para devolver o valor de um atributo privado

    public String getNomeFilme() {
        return nomeFilme;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    } //alt+isert Setter; this -referencia que indica o valor de um filme no objeto ATUAL, não ao parâmetro do método

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Título: " + nomeFilme);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outrTitulo) {
        return this.getNomeFilme().compareTo(outrTitulo.getNomeFilme());
    }
}
