package com.diy4rent.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fotografíass")

public class Fotografías {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="ID")
  private int id;
	
  public Fotografías(){
  }
	
  public Fotografías(int id){
	this.id = id;	
  }
  


  public int getId() {
		return id;
	  }

  public void setId(int id) {
		this.id = id;
	}
  
}
