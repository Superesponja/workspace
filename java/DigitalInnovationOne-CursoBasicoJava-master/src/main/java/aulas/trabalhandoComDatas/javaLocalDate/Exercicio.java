package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalDateTime;

public class Exercicio {
    public static void main(String[] args) {
        LocalDateTime dataAntiga = LocalDateTime.of(2010,05,15,10,00);
        System.out.println(dataAntiga);
        LocalDateTime dataNova = dataAntiga.plusYears(4).plusMonths(6).plusHours(10);
        System.out.println(dataNova);
    }
}
