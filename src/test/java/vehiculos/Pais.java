package vehiculos;
import java.util.HashMap;
public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public static Pais paisMasVendedor() {
		HashMap<Pais,Integer> masVendido = new HashMap<Pais,Integer>();
		for(Vehiculo vehiculo:Vehiculo.vehiculos) {
			Pais pais = vehiculo.getFabricante().getPais();
			if(masVendido.containsKey(pais)) {
				masVendido.put(pais, masVendido.get(pais)+1);
			}else {
				masVendido.put(pais,1);
			}
		}
		int max = 0;
		Pais maxPais = null;
		for(Pais pais:masVendido.keySet()) {
			if(masVendido.get(pais)>max) {
				max = masVendido.get(pais);
				maxPais = pais;
			}
		}
		return maxPais;
	}
}