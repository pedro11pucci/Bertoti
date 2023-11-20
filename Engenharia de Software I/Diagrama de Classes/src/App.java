public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();

        estoque.cadastrarGame(new Game("Dark Souls 1", "PC", 200.00));
        estoque.cadastrarGame(new Game("Dark Souls 2", "PlayStation 3", 2.00));
        estoque.cadastrarGame(new Game("Dark Souls 3", "PC", 200.00));
        estoque.cadastrarGame(new Game("Bloodborne", "PlayStation 4", 80.00));
        estoque.cadastrarGame(new Game("Elden Ring", "PC", 200.00));
        estoque.cadastrarGame(new Game("Demon Souls", "PlayStation 5", 200.00));

        System.out.println("BUSCA POR NOME: ");
        for (Game game : estoque.buscarPorNome("Bloodborne")) {
            System.out.println(game.getNome());
            System.out.println(game.getConsole());
            System.out.println(game.getValor());
        }
        System.out.println("======================================");
        System.out.println("BUSCA POR CONSOLE: ");
        for (Game game : estoque.buscaPorConsole("PC")) {
            System.out.println(game.getNome());
            System.out.println(game.getConsole());
            System.out.println(game.getValor());
        }
        System.out.println("======================================");
        System.out.println("BUSCA POR VALOR: ");
        for (Game game : estoque.buscaPorValor(2.00)) {
            System.out.println(game.getNome());
            System.out.println(game.getConsole());
            System.out.println(game.getValor());
        }
        System.out.println("======================================");
    }
}
