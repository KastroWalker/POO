public class Jogador {
    String nome;
    String posicao;
    String nacionalidade;
    Double altura;
    Double peso;
    int anoDeNascimento;

    void dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Data de nascimento: " + this.anoDeNascimento);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Nacionalidade: " + this.nacionalidade);
    }

    int idade() {
        return 2020 - this.anoDeNascimento;
    }

    int aposentadoria() {
        return 38 - idade();
    }
}
