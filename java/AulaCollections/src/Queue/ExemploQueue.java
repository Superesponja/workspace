package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia"); //adiciona elementos no fim da fila
        filaBanco.add("Roberto");
        filaBanco.add("Fabio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteAtendido= filaBanco.poll();//remove o primeiro elemento da fila
        System.out.println(filaBanco);
        System.out.println(clienteAtendido);

        String primeiroCliente = filaBanco.peek();
        System.out.println(filaBanco);
        System.out.println(primeiroCliente);
        filaBanco.clear();
        primeiroCliente = filaBanco.poll();
        System.out.println(filaBanco);
        System.out.println(primeiroCliente);
    }
}
