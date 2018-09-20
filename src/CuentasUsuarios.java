import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("Edu", "00001", 235000);
		Cliente cl2 = new Cliente("Maria", "00002", 50000);
		Cliente cl3 = new Cliente("Jose", "00003", 120000);
		Cliente cl4 = new Cliente("Penelope", "00004", 190000);
		
		Cliente cl5 = new Cliente("Edu", "00001", 275000);
		
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		clientesBanco.add(cl5);
		
		for(Cliente e:clientesBanco){
			System.out.println(e.getNombre() + " " + e.getN_cuenta() + " " + e.getSaldo() );
		}
		
		/*Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()){
			String nombreCliente = it.next().getNombre();
			
			System.out.println(nombreCliente);
		}*/
		
		
	}

}
