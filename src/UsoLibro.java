
public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro("P en Java", "Juan", 25);
		Libro libro2 = new Libro("P en Java", "Juan", 25);
		if(libro1.equals(libro2)){
			System.out.println("Son iguales");
		} else {
			System.out.println("No lo son");
		}
		
		Libro libro3 = new Libro("P en Java", "Juan", 30);
		
		if(libro1.equals(libro3)){
			System.out.println("son iguales");
		} else {
			System.out.println("no lo son");
		}
		

	}

}
