package com.techlabs.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	private int mid;

	@ManyToMany
	private Set<Actor> actor;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public Set<Actor> getActor() {
		return actor;
	}

	public void setActor(Set<Actor> actor) {
		this.actor = actor;
	}

}
