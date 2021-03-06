package com.telusko.springmvcboot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.telusko.springmvcboot.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{
	
	List<Person> findByName(String name);

	List<Person> findByNameOrderByAge(String name);
	List<Person> findByNameOrderByAgeDesc(String name);
	
	@Query("from Person where name= :pname ")
	List<Person> findByName1(@Param("pname") String name);

}
