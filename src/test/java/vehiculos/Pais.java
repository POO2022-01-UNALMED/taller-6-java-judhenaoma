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
		HashMap<Pais,Integer> gana = new HashMap<Pais,Integer>();
		for(Vehiculo vehiculo:Vehiculo.vehiculos) {
			Pais pais = vehiculo.getFabricante().getPais();
			if(gana.containsKey(pais)) {
				gana.put(pais, gana.get(pais)+1);
			}else {
				gana.put(pais,1);
			}
		}
		int max = 0;
		Pais maxPais = null;
		for(Pais pais:gana.keySet()) {
			if(gana.get(pais)>max) {
				max = gana.get(pais);
				maxPais = pais;
			}
		}
		return maxPais;
	}
}