package com.adithk.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adithk.mongodbdemo.collections.PersonEntity;

@Repository
public interface PersonRepository extends MongoRepository<PersonEntity,String>{
    

}