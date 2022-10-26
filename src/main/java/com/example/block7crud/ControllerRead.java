package com.example.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ControllerRead {

    //Usamos autowired para que pase la clase ServicesPerson
    @Autowired
    ServicesPerson servicesPerson;

    //Usando la clase inyectada ServicesPerson pedimos la info mediante la posición de lista
    @GetMapping("person/{id}")
    public String readPersonByID(@PathVariable("id") int id) {
        return servicesPerson.readPersonID(id);
    }

    //Usando la clase inyectada ServicesPerson pedimos la info mediante el nombre
    @GetMapping("person/name/{name}")
    public String readPersonByName(@PathVariable("name") String name) {
        return servicesPerson.readPersonName(name);
    }


}
