import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> personas = new LinkedList<String>();
		personas.add("Edu");
		personas.add("Sandra");
		personas.add("Pepe");
		personas.add("Laura");
		
		System.out.println(personas.size());
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("POPO");
	//	System.out.println(it.);
		
		for (String persona : personas){
			System.out.println(persona);
		}

	}

}
