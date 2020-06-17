package aulas.oo.part02.construtores.exemplo003;

import aulas.oo.part01.paradigma.exemplo001.Pessoa;

public class Carro {
//Construtor
    public Carro(int maxPessoas, String modelo, String marca, int ano){
        this.maxPessoas = maxPessoas;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

//Declaração de Variáveis
    String modelo = "", marca="", variante="";
    private int maxPessoas=0, pessoasAtual=0, ano;

//Métodos
    public void inserirPessoas(aulas.oo.part01.paradigma.exemplo001.Pessoa pessoa){
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
