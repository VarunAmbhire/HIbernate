package com.techlabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Exhibitor {

	@Id
	private int exhib_Id;
	@OneToOne
	@JoinColumn()
	private Stall stall;

	public int getExhib_Id() {
		return exhib_Id;
	}

	public void setExhib_Id(int exhib_Id) {
		this.exhib_Id = exhib_Id;
	}

	public Stall getStall() {
		return stall;
	}

	public void setStall(Stall stall) {
		this.stall = stall;
	}

}
