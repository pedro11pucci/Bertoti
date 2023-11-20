import java.util.LinkedList;
import java.util.List;

public class Estoque {
    private static List<Game> games = new LinkedList<Game>();

    public void cadastrarGame(Game game){
        games.add(game);
    }

    public List<Game> buscarPorNome(String nome){
        List<Game> busca1 = new LinkedList<Game>();
        for (Game game : games) {
            if(game.getNome().equals(nome)){
                busca1.add(game);
            }
        }
        return busca1;
    }

    public List<Game> buscaPorConsole(String console){
        List<Game> busca2 = new LinkedList<Game>();
        for (Game game : games) {
            if(game.getConsole().equals(console)){
                busca2.add(game);
            }
        }
        return busca2;
    }

    public List<Game> buscaPorValor(double valor){
        List<Game> busca3 = new LinkedList<Game>();
        for (Game game : games) {
            if(game.getValor() == valor){
                busca3.add(game);
            }
        }
        return busca3;
    }

}
