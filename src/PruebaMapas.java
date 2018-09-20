import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Edu"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Juan"));
		personal.put("148", new Empleado("Maria"));
		
		System.out.println(personal);
		
		personal.remove("147");
		System.out.println(personal);
		
		personal.put("148", new Empleado("PEpE"));
		
		System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()){
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave: " + clave + ", Valor: "+valor);
		}
	}

}


class Empleado{
	private String nombre;
	private double sueldo;
	
	public Empleado(String n){
		nombre=n;
		sueldo=2000;
	}
	
	public String toString(){
		return "[El nombre es " +nombre +" y el sueldo es: "+sueldo+"]";
		
	}
}