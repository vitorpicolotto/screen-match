package screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import screenmatch.modelos.Titulo;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Harry Potter e a Pedra Filosofal", 2001);
        meuFilme.avalia(9);
        Filme novoFilme = new Filme("Alta Fidelidade", 2000);
        meuFilme.avalia(10);
        var maisUmFilme = new Filme("O Iluminado", 1980);
        meuFilme.avalia(10);
        Serie theWire = new Serie("The Wire", 2000);

       List <Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(novoFilme);
        lista.add(maisUmFilme);
        lista.add(theWire); 

        for (Titulo item : lista) {
            System.out.println(item.getNomeFilme());

            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println(filme.getClassificacao());
            } 
        }
        
        ArrayList <String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Chuck Norris");
        buscaPorArtista.add("Van Damme");
        buscaPorArtista.add("Stallone");
    
        Collections.sort(buscaPorArtista); //ordem alfabética
        System.out.println("Depois de ordenar: ");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Comparator - ordenando por ano: " + lista);
    }
    
}
