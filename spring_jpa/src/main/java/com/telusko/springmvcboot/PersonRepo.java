package com.telusko.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springmvcboot.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{

}
