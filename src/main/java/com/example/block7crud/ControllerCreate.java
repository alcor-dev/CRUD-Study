package com.example.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerCreate {

    //Usamos autowired para que pase la clase ServicesPerson
    @Autowired
    ServicesPerson servicesPerson;

    //Metemos información dentro de la URL /person a través de un JSON
    @PostMapping("/person")
    public String addPerson(@RequestBody Person person) {
        //Mediante la clase inyectada ServicesPerson utilizamos el método para añadir
        servicesPerson.addPerson(person);
        return "Se ha añadido a: " + person.getName();
    }
}
