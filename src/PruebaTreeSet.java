import java.awt.*;
import java.util.*;

public class PruebaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*TreeSet<String> ordenaPersonas = new TreeSet<String>();
		
		ordenaPersonas.add("Edu");
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Juan");
		ordenaPersonas.add("Maria");
		
		for (String a : ordenaPersonas){
			System.out.println(a);
		}*/
		
		Articulo primero = new Articulo(1, "Java 1");
		Articulo segundo = new Articulo(5, "APHP 2");
		Articulo tercero = new Articulo(3, "Phyton 3");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(primero);
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(segundo);
		
		for(Articulo e : ordenaArticulos){
			System.out.println(e);
		}
		System.out.println("------------------------------------");
		
		/*Articulo comparadorArticulos = new Articulo();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);*/
		
		//ComparadorArticulos comparaArt = new ComparadorArticulos();
		
		
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>(){
			@Override
			public int compare(Articulo o1, Articulo o2) {
				// TODO Auto-generated method stub
				String desc1 = o1.getDescripcion();
				String desc2 = o2.getDescripcion();
				
				return desc1.compareTo(desc2);
			}
		});
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for(Articulo e : ordenaArticulos2){
			System.out.println(e);
		}
		
		

	}
	


}


class Articulo implements Comparable<Articulo>{
	
	private int numeroArticulo;
	private String descripcion;

	
	public Articulo(int num, String desc){
		numeroArticulo=num;
		descripcion=desc;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public String toString(){
		return "numero articulo " +numeroArticulo+" descripcion: "+descripcion;
	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numeroArticulo - o.numeroArticulo;
	}


	
}

/*class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		String desc1 = o1.getDescripcion();
		String desc2 = o2.getDescripcion();
		
		return desc1.compareTo(desc2);
	}
	
}*/
