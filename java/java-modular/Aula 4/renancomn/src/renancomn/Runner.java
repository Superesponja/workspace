package renancomn;

import renancomn.utils.operacao.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.mais(10,2));
    }
}
