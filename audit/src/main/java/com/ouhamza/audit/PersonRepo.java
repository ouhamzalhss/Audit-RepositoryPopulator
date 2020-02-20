package com.ouhamza.audit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * @author Lhouceine OUHAMZA
 */
@RepositoryRestResource
public interface PersonRepo extends JpaRepository<Person, Long> {
}
