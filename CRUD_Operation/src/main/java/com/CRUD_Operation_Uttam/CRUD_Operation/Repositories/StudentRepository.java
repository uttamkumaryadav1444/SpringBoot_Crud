package com.CRUD_Operation_Uttam.CRUD_Operation.Repositories;

import com.CRUD_Operation_Uttam.CRUD_Operation.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer> {
}
