package com.example.test.dao;

import com.example.test.model.PersonModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;
    private List<PersonModel> people;
    {
        people = new ArrayList<>();

        people.add(new PersonModel(++PEOPLE_COUNT,"Андрей",18, "Баранников","Алексеевич"));
        people.add(new PersonModel(++PEOPLE_COUNT,"Иван",18, "Улесов","Павлович"));
        people.add(new PersonModel(++PEOPLE_COUNT,"Арсений",18, "Рыжов","Сергеевич"));
        people.add(new PersonModel(++PEOPLE_COUNT,"Николай",18, "Поверин","Олегович"));
    }

    public List<PersonModel> index(){

        return people;
    }

    public PersonModel show(int id){
        return people.stream().filter(personModel -> personModel.getId() == id).findAny().orElse(null);
    }

    public void save(PersonModel person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, PersonModel personModel){
        PersonModel updatePerson = show(id);
        updatePerson.setName(personModel.getName());
        updatePerson.setAge(personModel.getAge());
        updatePerson.setSurname(personModel.getSurname());
        updatePerson.setMidname(personModel.getMidname());
    }

    public void delete(int id){
        people.removeIf(p-> p.getId() == id);
    }

}
