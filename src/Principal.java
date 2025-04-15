import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(153);
        meuFilme.setIncluidoNoPlano(true);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());

        Serie serie = new Serie();
        serie.setNome("Losta");
        serie.setAnoDeLancamento(2000);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.exibeFichaTecnica();
    }
}