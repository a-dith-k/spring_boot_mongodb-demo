package com.adithk.mongodbdemo.services.person;

import java.util.List;

import com.adithk.mongodbdemo.collections.PersonEntity;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    public PersonEntity registerUser(PersonEntity person);

    public List<PersonEntity> getAllUsers();

    public PersonEntity findUserById();

    List<PersonEntity> getPersonNameStartsWith(String name);

    void deletePersonById(String id);

    List<PersonEntity> getPersonAgeBetween(int minAge, int maxAge);
}
