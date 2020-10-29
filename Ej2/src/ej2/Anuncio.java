package ej2;

import java.util.ArrayList;

public class Anuncio {

	private int id;
	private String tipo;
	private String titulo;
	private Contacto propietario;
	private ArrayList<Contacto> destinatarios;
	private String cuerpo;
	
	
	public Anuncio (int id,String tipo,String titulo,Contacto propietario,ArrayList<Contacto> destinatarios,String cuerpo){
		
		this.id = id;
		this.tipo = tipo;
		this.titulo = titulo;
		this.propietario = new Contacto(propietario);
		this.destinatarios = new ArrayList<Contacto>(destinatarios);
		this.cuerpo = cuerpo;
		
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Contacto getPropietario() {
		return propietario;
	}
	public void setPropietario(Contacto propietario) {
		this.propietario = propietario;
	}
	public ArrayList<Contacto> getDestinatarios() {
		return destinatarios;
	}
	public void setDestinatarios(ArrayList<Contacto> destinatarios) {
		this.destinatarios = destinatarios;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	
	
	
}
