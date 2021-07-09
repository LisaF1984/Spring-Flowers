package com.example.springflowers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springflowers.domain.Flowers;
import com.example.springflowers.service.FlowersServiceDB;

@RestController
@RequestMapping("/flowers")

public class FlowersController {

	private FlowersServiceDB service;
	
	@Autowired
	public FlowersController(FlowersServiceDB service) {
		this.service = service;
		
	}
	

@GetMapping("/test")
public String test() {
return "this is a flower test";
}

@PostMapping("/create")
public ResponseEntity<Flowers> create(@RequestBody Flowers f){
return new ResponseEntity<Flowers>(this.service.create(f), HttpStatus.CREATED);
}


@GetMapping("/read")
public ResponseEntity<List<Flowers>> read(){
return new ResponseEntity<List<Flowers>>(this.service.read(), HttpStatus.OK);

}
	@PutMapping("/update/id")
	public ResponseEntity<Flowers> update(@PathVariable Long id, @RequestBody Flowers f) {
		return new ResponseEntity<Flowers>(this.service.update(id, f), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/id")
	public ResponseEntity<Flowers> delete(@PathVariable Long id){
		return this.service.delete(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT):
										new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	}
	
