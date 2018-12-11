package com.techlabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stall {

	@Id
	private int id;

	@OneToOne
	private Exhibitor exhibitor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Exhibitor getExhibitor() {
		return exhibitor;
	}

	public void setExhibitor(Exhibitor exhibitor) {
		this.exhibitor = exhibitor;
	}

}
