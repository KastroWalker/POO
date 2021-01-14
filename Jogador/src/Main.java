public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        jogador.nome = "Victor";
        jogador.posicao = "Atacante";
        jogador.nacionalidade = "Brasileiro";
        jogador.altura = 1.90;
        jogador.peso = 90.00;
        jogador.anoDeNascimento = 2002;

        jogador.dados();
        System.out.println(jogador.idade());
        System.out.println(jogador.aposentadoria());
    }
}
