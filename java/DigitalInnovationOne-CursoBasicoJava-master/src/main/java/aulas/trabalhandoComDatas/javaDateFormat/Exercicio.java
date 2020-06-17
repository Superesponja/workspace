package aulas.trabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(("antes printava feio assim:\n" + data));
        System.out.println(("\nAgora printa bonito assim:"));
        SimpleDateFormat dataBonita = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
        System.out.println(dataBonita.format(data));
        System.out.println(("\n\n"));
    }

}
