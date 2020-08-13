package com.keara.dojos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keara.dojos.models.Ninja;
import com.keara.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> getAll() {
		return (List<Ninja>) ninjaRepo.findAll();
	}
}
