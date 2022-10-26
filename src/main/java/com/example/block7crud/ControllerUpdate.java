package com.example.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ControllerUpdate {

    //Usamos autowired para que pase la clase ServicesPerson
    @Autowired
    ServicesPerson servicesPerson;

    //Pedimos una petición PUT para actualizar la persona que hemos comentado
    @PutMapping("person/{id}")
    public String updatePerson(@RequestBody Person person, @PathVariable("id") int id) {
        return servicesPerson.modifyPerson(person, id);
    }
}
