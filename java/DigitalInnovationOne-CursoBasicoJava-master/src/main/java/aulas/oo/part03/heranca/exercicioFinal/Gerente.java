package aulas.oo.part03.heranca.exercicioFinal;

public class Gerente extends Funcionario{

    public Gerente(int salario, String nome) {
        super(salario, nome);
    }

    private double aliquota = 0.001;

}
