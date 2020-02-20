package com.ouhamza.populator.dao;

import com.ouhamza.populator.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lhouceine OUHAMZA
 */

public interface PersonRepo extends JpaRepository<Person, Long> {
}
