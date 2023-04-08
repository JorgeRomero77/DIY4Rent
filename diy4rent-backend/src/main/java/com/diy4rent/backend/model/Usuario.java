package com.diy4rent.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")

public class Usuario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique= true, nullable = false)
  private int id;
  
  @Column(name = "NOMBRE", nullable = false)
  private String nombre;
  
  @Column(name = "CORREO", nullable = false)
  private String correo;
  
  @Column(name = "TELÉFONO", nullable = false)
  private int teléfono;
  
  @Column(name= "PAYPAL", nullable = false)
  private String paypal;
  
  @Column(name= "DIRECCIÓN", nullable = false)
  private String dirección;
  
  @Column(name= "CONTRASEÑA", nullable = false)
  private String contraseña;
  
  
	
	public Usuario(){
	}

	
	public Usuario(int id, String nombre, String correo, int teléfono, String paypal, String dirección, String contraseña) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
    this.teléfono = teléfono;
    this.paypal = paypal;
    this.dirección = dirección; 
    this.contraseña = contraseña;
	}


  public int getId() {
		return id;
	  }

  public void setId(int id) {
		this.id = id;
	}
  
    public String getNombre() {
		return nombre;
	  }

  public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    public String getCorreo() {
		return correo;
	  }

  public void setCorreo(String correo) {
		this.correo = correo;
	}
  
    public int getTeléfono() {
		return teléfono;
	  }

  public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
	}
      public String getPaypal() {
		return paypal;
	  }

  public void setPaypal(String paypal) {
		this.paypal = paypal;
	}
  
      public String getDirección() {
		return dirección;
	  }

  public void setDirección(String dirección) {
		this.dirección = dirección;
	}
  
      public String getContraseña() {
		return contraseña;
	  }

  public void setContraseña(String cotraseña) {
		this.contraseña = contraseña;
	}
}
