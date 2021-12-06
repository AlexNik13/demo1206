package com.example.demo1206;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Repository {

    //имитация BD
    static Map<String, Person> persons = new Hashtable<>();

    static {
        persons.put("Sergey", new Person("Sergey",25));
        persons.put("Kostian", new Person("Kostian",36));
        persons.put("Sasha", new Person("Sasha",14));
    }

    public  Person personByName(String name){
        return persons.get(name);
    }

    public  Person personPut(Person person){
        persons.put(person.getName(), person);
        return person;
    }
}
