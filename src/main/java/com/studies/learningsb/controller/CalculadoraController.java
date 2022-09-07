package com.studies.learningsb.controller;


import com.studies.learningsb.model.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("{numeroUm}/{numeroDois}")
    public Integer resultadoSoma(@PathVariable int numeroUm, @PathVariable int numeroDois){
        return numeroUm + numeroDois;
    }

    @GetMapping("/multiplicar")
    public int resultadoMultiplicacao(@RequestParam(name = "numeroUm") int numeroUm, @RequestParam(name="numeroDois") int numeroDois){
       return new Calculadora(numeroUm, numeroDois).multiplicar(numeroUm, numeroDois);
    }
}
