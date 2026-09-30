import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String cpf;
    private char genero;
    private int idade;

    public Pessoa(String nome, String cpf, char genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "\n Nome: " + nome +
                "\n Cpf: " + cpf +
                "\n Genero : " + genero +
                "\n Idade : " + idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }


    @Override
    public int compareTo(Pessoa o) {
        return this.cpf.compareTo(o.cpf);
    }
}
