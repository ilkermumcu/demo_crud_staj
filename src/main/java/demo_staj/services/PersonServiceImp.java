package demo_staj.services;

import demo_staj.model.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonServiceImp {

    List<Person> listAll();
    Person getId(Long id);
    Person update (Person person, Long id);
    String delete(Long id);
    String createPerson(Person person);

}
