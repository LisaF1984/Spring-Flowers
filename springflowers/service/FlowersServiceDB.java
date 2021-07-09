package com.example.springflowers.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springflowers.domain.Flowers;
import com.example.springflowers.repo.FlowersRepo;

@Service

public class FlowersServiceDB {
	
	private FlowersRepo repo;

	public FlowersServiceDB(FlowersRepo repo) {
		this.repo = repo;
		
	}
	
	public Flowers create(Flowers f) {
		return this.repo.saveAndFlush(f);
	
	}
	public List<Flowers> read() {
	return this.repo.findAll();
	}
	
	public Flowers update(Long id, Flowers newF) {
	Flowers existing = this.repo.getById(id);
	existing.setName(newF.getName());
	existing.setColour(newF.getColour());
	existing.setDaysOld(newF.getDaysOld());
	existing.setBunch(newF.isBunch());
	
	Flowers updated = this.repo.save(existing);
	return updated;
	}
	
	public boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
	}
	
	}
	
	


