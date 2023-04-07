package com.diy4rent.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "intervalos")

public class Intervalo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String inicio;
  private String fin;

	
	public Intervalo(int id, String inicio, String fin) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
	}


  public int getId() {
		return id;
	  }

  public void setId(int id) {
		this.id = id;
	}
	
  public String getInicio() {
		return inicio;
	}
	
  public void setInicio(String inicio) {
		this.inicio = inicio;
	}
  public String getFin() {
		return fin;
	}
  public void setFin(String fin) {
		this.fin = fin;
	}
  
}
