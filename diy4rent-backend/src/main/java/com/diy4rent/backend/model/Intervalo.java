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
  @Column(name = "ID", unique= true, nullable= false)
  private int id;
  @Column(name = "INICIO", nullable= false)
  private String inicio;
  @Column(name = "FIN", nullable= false)
  private String fin;
	
	public Intervalo(){
	}

	
	public Intervalo(int id, String inicio, String fin) {
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
