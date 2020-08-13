package com.keara.dojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.keara.dojos.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {}
