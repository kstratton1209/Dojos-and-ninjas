package com.keara.dojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keara.dojos.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {}