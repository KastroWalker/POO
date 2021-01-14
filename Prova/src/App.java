public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "victor";
        pessoa.idade = 18;
        pessoa.sexo = "masculino";
        pessoa.peso = 90;

        System.out.println(pessoa);
    }
}
