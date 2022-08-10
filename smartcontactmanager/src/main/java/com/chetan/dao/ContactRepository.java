package com.chetan.dao;

import java.util.List;

import com.chetan.entities.Contact;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

	//pagination....
	
	@Query("from Contact as c where c.user.id =:userId")
	
	//public List<Contact> findContactsByUser(@Param("userId") int userId);
	
	public Page<Contact> findContacsByUser(@Param("userId")int userId, Pageable pePageable);
	
}
