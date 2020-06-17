package aulas.oo.part03.heranca.exercicioFinal;

public class Funcionario {

    public Funcionario(int salario, String nome){
        this.nome = nome;
        this.salario = salario;
    }
    private String nome = "";
    private double salario=0;
    private double aliquotaImposto = 0.0001;
    private double imposto = 0;

    public double calculaImposto(){
        return imposto = salario * aliquotaImposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
