package vehiculos;

import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		HashMap<Fabricante,Integer> masVendido = new HashMap<Fabricante,Integer>();
		for(Vehiculo vehiculo:Vehiculo.vehiculos) {
			Fabricante fabricante = vehiculo.getFabricante();
			if(masVendido.containsKey(fabricante)) {
				masVendido.put(fabricante, masVendido.get(fabricante)+1);
			}else {
				masVendido.put(fabricante,1);
			}
		}
		int maximo = 0;
		Fabricante fabri = null;
		for(Fabricante fabricante:masVendido.keySet()) {
			if(masVendido.get(fabricante)>maximo) {
				maximo = masVendido.get(fabricante);
				fabri = fabricante;
			}
		}
		return fabri;
	}
}