package taller;

public class Futbolista extends Persona {
	

	private int dorsal;
	private String nacionalidad;

	
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	void jugarPartido() {
		
	}
	void entrenar() {
		
	}
	
	public void viajarFutbolista() {
		
		System.out.println(super.viajar() + " Futbolista");
	}
	
	
}
