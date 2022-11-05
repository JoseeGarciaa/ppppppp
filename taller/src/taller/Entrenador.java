package taller;

public class Entrenador extends Persona {
	
	
	private int idFerderacion;
	
	

	
	public int getIdFerderacion() {
		return idFerderacion;
	}
	public void setIdFerderacion(int idFerderacion) {
		this.idFerderacion = idFerderacion;
	}

void dirigirPartido(){

}
void dirigirEntrenamiento() {
	
}
public void ViajarEntrenador() {
	
	System.out.println(super.viajar() + " Entrenador");
	
}



}
