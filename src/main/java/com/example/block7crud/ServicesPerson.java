package com.example.block7crud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Declaramos la clase como servicio con la anotación Service
@Service
public class ServicesPerson {

    //Creamos la lista sobre la que trabajaremos
    private final List<Person> personList = new ArrayList<Person>(){{
        add(new Person("Clark Kent", 30, "Krypton"));
        add(new Person("Doctor Who", 5000, "Gallifrey"));
        add(new Person("Adolf Hiremy-Hirschl", 30, "Vienna"));
    }};

    //Método para crear personas
    public void addPerson(Person person) {
        personList.add(new Person(person.getName(), person.getAge(), person.getCity()));
    }

    //Método para leer personas por nombre
    public String readPersonName(String name) {
        List<Person> result = personList.stream().filter(Person -> Person.getName().contains(name)).collect(Collectors.toList());
        return "Nombre: " + result.get(0).getName() + " Edad: " + result.get(0).getAge() + " Ciudad: " + result.get(0).getCity();
    }

    //Método para leer personas por su posición en la lista
    public String readPersonID(int id) {
        Person person = personList.get(id);
        return "Nombre: " + person.getName() + " Edad: " + person.getAge() + " Ciudad: " + person.getCity();
    }

    //Método para actualizar personas
    public String modifyPerson(Person person, int id) {
        personList.set(id, person);
        return "Cambiada la persona: " + person.getName();
    }

    //Método para borrar personas según posición en la lista
    public String deletePerson(int id) {
        Person person = personList.get(id);
        personList.remove(id);
        return "Eliminada persona de nombre: " + person.getName();
    }
}
