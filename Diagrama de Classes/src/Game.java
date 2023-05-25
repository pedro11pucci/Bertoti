public class Game {
    private String nome;
    private String console;
    private double valor;

    public Game(String nome, String console, double valor){
        this.nome = nome;
        this.console = console;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getConsole() {
        return console;
    }

    public double getValor() {
        return valor;
    }

}
