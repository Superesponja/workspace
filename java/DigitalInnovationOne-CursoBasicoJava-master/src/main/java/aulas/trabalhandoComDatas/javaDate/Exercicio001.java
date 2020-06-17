package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;

public class Exercicio001 {


    public static void main(String[] args) {

        Exercicio001 e = new Exercicio001();

        e.checaLong(1563385317992L);

        System.out.println("\n***********************************\n");
        e.aniversarioAntes2010(618148800000L);


    }


    /**
     * Exercicio 1
     *
     * Você tem um epoch (formato long) converta no formato Date
     *
     * Epoch 1563385317992
     *
     * Ponto de atenção: como você está manipulando um numero do tipo long, dependendo da maneira que você estiver
     *                   manipulando essa informação, você precisa colocar a letra l no final do numero
     *
     *
     *
     * @param epoch
     * @return
     */
    public Date checaLong(long epoch) {

        Date date = new Date(1563385317992L);

        System.out.println(date);


        return null;
    }

    public void aniversarioAntes2010(long longAniversario){
        Date aniversario = new Date(longAniversario);
        Date doisMilEDez = new Date(1273924800000L);

        System.out.println("Você nasceu em: "+ aniversario.toInstant());
        if(aniversario.after(doisMilEDez))
            System.out.println("Esta data é posterior a 15/5/2010");
        else if(aniversario.before(doisMilEDez))
            System.out.println("Esta data é anterior a 15/5/2010");
    }

    /**
     *
     * @return
     */
    public String dateToLong(long epoch) {
        Date data = new Date(epoch);


        return data.toInstant().toString();
    }

}