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
  
  @Column(name = "TELEFONO", nullable = false)
  private int telefono;
  
  @Column(name= "PAYPAL", nullable = false)
  private String paypal;
  
  @Column(name= "DIRECCION", nullable = false)
  private String direccion;
  
  @Column(name= "CONTRASEÑA", nullable = false)
  private String contraseña;
  
  
	
	public Usuario(){
	}

	
	public Usuario(int id, String nombre, String correo, int telefono, String paypal, String direccion, String contraseña) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
    this.teléfono = telefono;
    this.paypal = paypal;
    this.dirección = direccion; 
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
  
    public int getTelefono() {
		return telefono;
	  }

  public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
      public String getPaypal() {
		return paypal;
	  }

  public void setPaypal(String paypal) {
		this.paypal = paypal;
	}
  
      public String getDireccion() {
		return direccion;
	  }

  public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
  
      public String getContraseña() {
		return contraseña;
	  }

  public void setContraseña(String cotraseña) {
		this.contraseña = contraseña;
	}
}
