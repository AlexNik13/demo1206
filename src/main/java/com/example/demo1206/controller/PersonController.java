package com.example.demo1206.controller;

import com.example.demo1206.Person;
import com.example.demo1206.Repository;
import org.springframework.web.bind.annotation.*;

@RestController // controller REST
public class PersonController {

    Repository rep   = new Repository();

    @GetMapping("/person")
    //@RequestMapping("/person")
    public Person getPerson(@RequestParam(value = "name", required = true) String name){
        return rep.personByName(name);
    }

    @PostMapping("/person")
    public Person personUpdate(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "age") int age){

        Person p = rep.personByName(name);
        if(p != null){
            p.setAge(age);
            return p;
        }
       return rep.personPut(new Person(name, age));
    }
}
