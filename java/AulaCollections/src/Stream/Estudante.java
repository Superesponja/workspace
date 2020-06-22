package Stream;

public class Estudante {
    public Estudante(String nome, Integer idade){
        this.idade = idade;
        this.nome = nome;

    }
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
