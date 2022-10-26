package com.example.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerDelete {

    //Usamos autowired para que pase la clase ServicesPerson
    @Autowired
    ServicesPerson servicesPerson;

    //Usamos una petición Delete para eliminar a una persona de la lista
    @DeleteMapping("person/{id}")
    public String deletePerson(@PathVariable("id") int id){
        return servicesPerson.deletePerson(id);
    }
}
