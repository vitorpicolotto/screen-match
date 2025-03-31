package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    } //para quem quiser pegar o tempo total

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    //sobrecarga de métodos
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    //para não ficar repetindo códigos... POLIMORFISMO - CHAMAR/USAR DE MUITAS FORMAS O METODO
    public void inclui(Titulo titulo){
       this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
