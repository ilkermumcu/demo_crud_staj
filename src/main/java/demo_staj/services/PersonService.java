package demo_staj.services;

import demo_staj.model.Person;
import demo_staj.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonService implements PersonServiceImp {

    private final PersonRepository personRepository;


    @Override
    public List<Person> listAll() {
        return personRepository.findAll();
    }

    @Override
    public Person getId(Long id) {
        return personRepository.findById(id).get();
    }

    @Override
    public Person update(Person person, Long id) {
        Person person1 = personRepository.findById(id).get();
        person1.setName(person.getName());
        person1.setSurname(person.getSurname());

        return personRepository.save(person1);
    }

    @Override
    public String delete(Long id) {
        personRepository.deleteById(id);
        return "Person (" + id + ") " + "silindi";
    }

    @Override
    public String createPerson(Person person) {
        personRepository.save(person);
        return  "Person (" + person.getName() + ")" + "olusturuldu";
    }
}
