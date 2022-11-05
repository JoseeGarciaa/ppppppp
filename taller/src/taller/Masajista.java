package taller;

public class Masajista extends Persona {
	
	private String titulacion;
	private int añosDeExperiencia;
	

	
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAñosDeExperiencia() {
		return añosDeExperiencia;
	}
	public void setAñosDeExperiencia(int añosDeExperiencia) {
		this.añosDeExperiencia = añosDeExperiencia;
	}
	

    void darMasaje() {
	
}
   public void viajarMasajista() {
		
		System.out.println(super.viajar() + " Masajista");
		
   }
    













}
