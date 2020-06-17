package aulas.trabalhandoComDatas.javaCalendar;

import java.util.Calendar;
import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        Exercicio e = new Exercicio();
        e.calculaDataPagamento(18,5,2020);
    }

    public void calculaDataPagamento (int dia, int mes, int ano){
        Calendar dataVencimento = Calendar.getInstance();
        dataVencimento.set(ano, mes, dia);

        dataVencimento.add(Calendar.DATE, 10);

        if(dataVencimento.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
            System.out.printf("A data de pagamento caiu no sabado\n", dataVencimento);
            dataVencimento.add(Calendar.DATE, 2);
            System.out.printf("Nova data de pagamento: %tc\n", dataVencimento);
        }
        else if(dataVencimento.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
            System.out.printf("A data de pagamento caiu no domingo\n", dataVencimento);
            dataVencimento.add(Calendar.DATE, 1);
            System.out.printf("Nova data de pagamento: %tc\n", dataVencimento);
        }
        else {
            System.out.printf("Data maxima de pagamento: %tc\n", dataVencimento);
        }
    }

}
