package renancomn.utils.operacao;

import renancomn.utils.operacao.interno.DivisaoAjudador;
import renancomn.utils.operacao.interno.MultiplicacaoAjudador;
import renancomn.utils.operacao.interno.SomaAjudador;
import renancomn.utils.operacao.interno.SubtracaoAjudador;

public class Calculadora {

    private DivisaoAjudador divisao;
    private MultiplicacaoAjudador multiplicacao;
    private SomaAjudador soma;
    private SubtracaoAjudador subtracao;

    public Calculadora(){
        divisao = new DivisaoAjudador();
        multiplicacao = new MultiplicacaoAjudador();
        soma = new SomaAjudador();
        subtracao = new SubtracaoAjudador();
    }

    public int mais(int a, int b){
        return soma.execute(a, b);
    }

    public int menos(int a, int b){
        return subtracao.execute(a, b);
    }

    public int vezes(int a, int b){
        return multiplicacao.execute(a, b);
    }

    public int dividir(int a, int b){
        return divisao.execute(a, b);
    }

}
