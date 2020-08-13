package com.keara.dojos.services;

import java.util.List;
import org.springframework.stereotype.Service;


import com.keara.dojos.models.Dojo;
import com.keara.dojos.repositories.DojoRepository;
import java.util.Optional;


@Service
public class DojoService {
	
	private final DojoRepository dojoRepo;
	
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> getAll() {
		return (List<Dojo>) dojoRepo.findAll();
	}
	
	public Dojo getOne(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		return dojo.isPresent() ? dojo.get() : null;
	}
}
