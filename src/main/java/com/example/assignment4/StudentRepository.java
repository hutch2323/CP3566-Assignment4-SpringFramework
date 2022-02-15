package com.example.assignment4;
import org.springframework.data.repository.CrudRepository;
import com.example.assignment4.Student;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
