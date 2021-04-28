package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bservice {

	@Autowired
	Brepository repository;
	//post data into db
	public Btime saveBtime(Btime btime) {
		return repository.save(btime);
		
	}
	
	public List<Btime> getBtimes(){
		return repository.findAll();
	}
}
