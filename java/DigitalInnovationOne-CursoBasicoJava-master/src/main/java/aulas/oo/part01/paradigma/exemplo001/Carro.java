package aulas.oo.part01.paradigma.exemplo001;

public class Carro {
//Construtor
    public Carro(int maxPessoas, String modelo){
        this.maxPessoas = maxPessoas;
        this.modelo = modelo;
    }

//Declaração de Variáveis
    String modelo = "";
    private int maxPessoas=0;
    private int pessoasAtual=0;

//Métodos
    public void inserirPessoas(Pessoa pessoa){
        if ( maxPessoas>pessoasAtual)
            pessoasAtual++;
    }
    public void removerPessoas(Pessoa pessoa){
        if ( pessoasAtual>0)
            pessoasAtual--;
    }

//Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMaxPessoas() {
        return maxPessoas;
    }

    public void setPessoasAtual(int pessoasAtual) {
        this.pessoasAtual = pessoasAtual;
    }

    public int getPessoasAtual() {
        return pessoasAtual;
    }


}
