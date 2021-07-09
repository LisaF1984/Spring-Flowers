package com.example.springflowers.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Flowers {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	private String colour;
	private int daysOld;
	private boolean bunch;

	public Flowers() {
		
	}

	public Flowers(String name, String colour, int daysOld, boolean bunch) {
		super();
//		this.id = id;
		this.name = name;
		this.colour = colour;
		this.daysOld = daysOld;
		this.bunch = bunch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getDaysOld() {
		return daysOld;
	}

	public void setDaysOld(int daysOld) {
		this.daysOld = daysOld;
	}

	public boolean isBunch() {
		return bunch;
	}

	public void setBunch(boolean bunch) {
		this.bunch = bunch;
	}
	
	
}
