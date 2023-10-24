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

}
