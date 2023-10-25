package com.adithk.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.adithk.mongodbdemo.collections.PersonEntity;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<PersonEntity,String>{


    List<PersonEntity> findPersonEntitiesByFirstNameStartsWith(String name);

    List<PersonEntity> findPersonEntitiesByAgeBetween(int minAge, int maxAge);

    @Query(value = "{ 'age': { $lt :?1,$gt: ?0} }",fields = "{address : 0}")
    List<PersonEntity> findPersonAgeBetween(int minAge, int maxAge);
}