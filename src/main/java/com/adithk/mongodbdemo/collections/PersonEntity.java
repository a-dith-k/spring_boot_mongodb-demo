package com.adithk.mongodbdemo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Document(collection = "person")
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonEntity {

    @Id
    private String personId;
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    
}
