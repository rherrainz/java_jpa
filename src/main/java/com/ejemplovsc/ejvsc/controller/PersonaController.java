package com.ejemplovsc.ejvsc.controller;

import com.ejemplovsc.ejvsc.model.Persona;
import java.util.List;

import com.ejemplovsc.ejvsc.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        
        return interPersona.getPersonas();
    }

    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        interPersona.savePersona(persona);
        return "La Persona fue creada correctamente.";
    }

    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La Persona fue borrada correctamente.";
    }

    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                            @RequestParam ("nombre") String nuevoNombre,
                            @RequestParam ("apellido") String nuevoApellido,
                            @RequestParam ("dad") int nuevaEdad){
        
        Persona perso = interPersona.findPersona(id);
        
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);


        interPersona.savePersona(perso);

        return perso;

        }

    
}
