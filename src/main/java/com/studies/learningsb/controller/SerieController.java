package com.studies.learningsb.controller;

import com.studies.learningsb.entity.Serie;
import com.studies.learningsb.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/series")
public class SerieController {

    @Autowired
    private SerieRepository serieRepository;


    @PostMapping
    public @ResponseBody Serie novaSerie(@RequestParam String nome){
        Serie serie = new Serie(nome);
        serieRepository.save(serie);

        return serie;
    }

    @GetMapping("/listarSeries")
    @ResponseBody
    public ResponseEntity<List<Serie>> listarSeries(){

        List<Serie> series = (List<Serie>) serieRepository.findAll();

        return new ResponseEntity<List<Serie>>(series, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity encontrarSeriePorId(@PathVariable Long id){
        return serieRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarSerie(@PathVariable Long id){
        return serieRepository.findById(id)
                .map(record -> {
                    serieRepository.deleteById(id);
                            return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
