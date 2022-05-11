package vehiculos;

public class Camion extends Vehiculo{
	private int ejes;
	public static int camiones;
	public Camion(String placa,String nombre,double precio,int peso,Fabricante fabricante,int ejes) {
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
		camiones++;
	}
	
	public int getejes() {
		return ejes;
	}
	
	public void setejes(int ejes) {
		this.ejes = ejes;
	}
}