package screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Favoritos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado");
        }else {
            System.out.println("Assistir depois");
        }
    }; //polimorfismo
}
