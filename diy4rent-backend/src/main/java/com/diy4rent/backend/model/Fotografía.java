package com.diy4rent.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fotografias")

public class Fotografia {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID", unique= true, nullable= false)
  private int id;
  @Column(name= "HERRAMIENTAID")
  private int herramientaId;
	
  public Fotografia(){
  }
	
  public Fotografia(int id, int herramientaId){
	this.id = id;
	this.herramientaId = herramientaId;
  }
  


  public int getId() {
		return id;
	  }

  public void setId(int id) {
		this.id = id;
	}
	
  public int getHerramientaId() {
		return herramientaId;
	  }

  public void setHerramientaId(int herramientaId) {
		this.herramientaId = herramientaId;
	}
  
}
