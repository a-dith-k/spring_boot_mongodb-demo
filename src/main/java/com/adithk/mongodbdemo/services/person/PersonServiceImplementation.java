package com.adithk.mongodbdemo.services.person;

import com.adithk.mongodbdemo.collections.PersonEntity;
import com.adithk.mongodbdemo.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public PersonEntity registerUser(PersonEntity person) {
        return personRepository.save(person);
    }

    @Override
    public List<PersonEntity> getAllUsers() {
        throw new UnsupportedOperationException("Not yet Implemented");
    }

    public PersonEntity findUserById() {
       throw new UnsupportedOperationException("Not yet Implemented");
    }

    @Override
    public List<PersonEntity> getPersonNameStartsWith(String name) {
        return personRepository.findPersonEntitiesByFirstNameStartsWith(name);
    }

    @Override
    public void deletePersonById(String id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<PersonEntity> getPersonAgeBetween(int minAge, int maxAge) {
        return personRepository.findPersonAgeBetween(minAge, maxAge);
    }

}
