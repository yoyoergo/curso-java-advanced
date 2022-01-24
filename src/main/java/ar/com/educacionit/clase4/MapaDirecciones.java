package ar.com.educacionit.clase4;

import java.util.Map;
import java.util.TreeMap;
/**
 * Simulador de DNS
 * @author LopezCar
 *
 */
public class MapaDirecciones {

	public static Map<String,String> getMapa() {
		Map<String,String> map = new TreeMap<>();
		map.put("carlos", "192.168.0.80");
		map.put("alejandro", "192.168.0.81");
		map.put("ana", "192.168.0.80");
		return map;
	}
}
