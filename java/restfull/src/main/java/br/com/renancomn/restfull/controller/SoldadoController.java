package br.com.renancomn.restfull.controller;


import br.com.renancomn.restfull.controller.request.SoldadoEditRequest;
import br.com.renancomn.restfull.dto.Soldado;
import br.com.renancomn.restfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService){
        this.soldadoService = soldadoService;
    }

    @GetMapping
    public ResponseEntity<List<Soldado>> getAllSoldados(){
        List<Soldado> allSoldados = soldadoService.getAllSoldados();
        return ResponseEntity.status((HttpStatus.OK)).body(allSoldados);
    }

    @GetMapping("/{cpf}") //get
    public ResponseEntity<Soldado> buscaSoldado(@PathVariable() String cpf){
        Soldado soldado = soldadoService.buscarSoldado(cpf);
        return ResponseEntity.status((HttpStatus.OK)).body(soldado);
    }

    @PostMapping
    public ResponseEntity crarSoldado(@RequestBody Soldado soldado){
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{cpf}")
    public ResponseEntity editarSoldado(@PathVariable() String cpf,
                                        @RequestBody SoldadoEditRequest soldadoEditRequest){
        soldadoService.alterarSoldado(cpf, soldadoEditRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity deletarSoldado(@PathVariable String cpf){
        soldadoService.deletarSoldado(cpf);
        return ResponseEntity.ok().build();
    }

}
