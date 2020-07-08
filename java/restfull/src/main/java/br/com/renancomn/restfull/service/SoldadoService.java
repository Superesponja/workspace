package br.com.renancomn.restfull.service;

import br.com.renancomn.restfull.controller.request.SoldadoEditRequest;
import br.com.renancomn.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {
    }

    public void deletarSoldado(String cpf){

    }

    public List getAllSoldados() {
        List<Soldado> lista = new ArrayList<>();

        Soldado soldado = new Soldado();
        Soldado soldado1 = new Soldado();
        Soldado soldado2 = new Soldado();


        soldado.setCpf("123123123");
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco");
        lista.add(soldado);

        soldado1.setCpf("456456456");
        soldado1.setNome("Renan");
        soldado1.setRaca("Humano");
        soldado1.setArma("XbestinhaDaMaldade");
        lista.add(soldado1);

        soldado2.setCpf("789798798");
        soldado2.setNome("Juveninho");
        soldado2.setRaca("goblin");
        soldado2.setArma("faquihnha");
        lista.add(soldado);
        return lista;
    }
}
