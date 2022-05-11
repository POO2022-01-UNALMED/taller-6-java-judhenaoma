package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	public static int automoviles;
	
	public Automovil(String placa,String nombre,double precio,int peso,Fabricante fabricante,int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		automoviles++;
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}