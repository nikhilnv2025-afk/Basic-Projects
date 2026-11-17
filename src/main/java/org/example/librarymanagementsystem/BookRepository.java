package org.example.librarymanagementsystem;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books,Long> {
}
// the other datatype of the jpa must match with the data type of the unique parameter in the