package io.swagger.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
	@Modifying
	@Query("update Student s set s.name = ?1, s.surname = ?2 where s.rollNo = ?3")
	void updateStudentById(String name, String surname, Long rollNo);
}