package com.flick.milagre.services;

import com.flick.milagre.models.MilagreModel;
import com.flick.milagre.repositories.MilagreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/milagres")
public class MilagreService {

    @Autowired
    private MilagreRepository milagreRepository;

    //GET
    @GetMapping
    public List<MilagreModel> milagreModelList() {
        return milagreRepository.findAll();
    }

    @PostMapping
    //POST
    public MilagreModel criar(@RequestBody MilagreModel milagreModel) {
        return milagreRepository.save(milagreModel);
    }
    @DeleteMapping("/{id}")
    //DELETE
    public void deletar(@PathVariable Long id) {
        milagreRepository.deleteById(id);
    }
    //PUT
    @PutMapping("/{id}")
    public MilagreModel atualizar(@PathVariable Long id, @RequestBody MilagreModel milagreModel) {
     MilagreModel newMilagre = milagreRepository.findById(id).get();
     newMilagre.setNome(milagreModel.getNome());
     return milagreRepository.save(newMilagre);
    }
}
