package com.CRUD_Operation_Uttam.CRUD_Operation.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer roll;
    private String name;
    private String address;

}
