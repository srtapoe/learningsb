package com.studies.learningsb.controller;

import com.studies.learningsb.model.Personagem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @GetMapping("/lista")
    public List<Personagem> mostrarPersonagens(){
        Personagem persona = new Personagem(2L, "Lily", "How I met your mother");
        Personagem persona1 = new Personagem(3L, "Marshall", "How I met your mother");
        Personagem persona2 = new Personagem(4L, "Barney", "How I met your mother");
        Personagem persona3 = new Personagem(5L, "Robin", "How I met your mother");

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(persona);
        personagens.add(persona1);
        personagens.add(persona2);
        personagens.add(persona3);

        for(Personagem personagem : personagens){
            System.out.println(personagem);
        }

        return personagens;
    }

    @GetMapping("/especifico")
    public Personagem mostrarPersonagem(){
        return new Personagem(1L, "Ted Mosby", "How I met your mother");
    }

}
