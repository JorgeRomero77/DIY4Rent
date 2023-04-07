package com.diy4rent.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "intervalos")

public class Intervalos {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String inicio;
  private String fin;
  


  public int getId() {
		return id;
	  }

  public void setId(int id) {
		this.id = id;
	}
  
}
