package com.cursuri.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cursuri {
	@Id
	private int idCurs;
	private String numeCurs;
	
	public int getIdCurs() {
		return idCurs;
	}
	public void setIdCurs(int idCurs) {
		this.idCurs = idCurs;
	}
	public String getNumeCurs() {
		return numeCurs;
	}
	public void setNumeCurs(String numeCurs) {
		this.numeCurs = numeCurs;
	}
	@Override
	public String toString() {
		return "Cursuri [idCurs=" + idCurs + ", numeCurs=" + numeCurs + "]";
	}
	
	
	
}
