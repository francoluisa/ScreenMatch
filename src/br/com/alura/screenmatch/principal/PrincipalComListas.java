package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

    Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
    Filme filmeDoPaulo = new Filme("Dogville", 2003);
    Filme filme2 = new Filme("Avatar", 2009);
    Serie serie = new Serie("Lost", 2000);

    ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(filme2);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item);
        }
    }
}
