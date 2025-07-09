package com.example.ToDo_App.repo;

import com.example.ToDo_App.model.toDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iTOdorepo extends JpaRepository<toDo, Long> {

}
