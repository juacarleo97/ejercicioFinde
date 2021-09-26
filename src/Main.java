import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sw = new Scanner(System.in);
		System.out.println("Introduce el ejercicio a mostrar");
		int i = sw.nextInt();
		switch (i) {
			case 1: ejercicio1();
			break;
			
			case 3: ejercicio3();
			break;
			
			case 6: ejercicio6();
			break;
			case 7: ejercicio7();
			break;
			case 8: ejercicio8();
			break;
			
		}
		sw.close();

	}

	public static void ejercicio1() {
		System.out.println(ejercicio1Aux(15)); 
	}
	
	
	public static int ejercicio1Aux(int n) {
		if (n == 7) {
			return n;
			}
		else {
			return n + (ejercicio1Aux(n-1));
			}
		
	}
	
	public static void ejercicio2() {
		Login l1 = new Login("1","Nombre 1",10.2,1.20,false);
		Login l2 = new Login("1","Nombre 1",10.2,1.20,false);
		Login l3 = new Login("1","Nombre 1",10.2,1.20,false);
		Login l4 = new Login("1","Nombre 1",10.2,1.20,false);
		Login l5 = new Login("1","Nombre 1",10.2,1.20,false);
		
		Login[] array = {l1,l2,l3,l4,l5};
		
		String t1,t2;
		Double t3,t4;
		System.out.println("Hay " + array.length + " clientes, crea uno nuevo");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce numero de cuenta");
		t1 = teclado.nextLine();
		System.out.println("Introduce nombre");
		t2 = teclado.nextLine();
		System.out.println("Introduce saldo");
		t3 = teclado.nextDouble();
		System.out.println("Introduce interes");
		t4 = teclado.nextDouble();
		
		Login l6 = new Login(t1,t2,t3,t4,false);
		
		Login[] arrayNuevo = {l1,l2,l3,l4,l5,l6};
	}
	
	public static void ejercicio3() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Imprime tu fecha de nacimiento en formato día/mes/año");
		String fecha = teclado.nextLine();
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate now = LocalDate.now();
		LocalDate antes = LocalDate.from(formateo.parse(fecha));
		
		System.out.println("Días vividos: " + (Duration.between(now, antes).toDays()));
		teclado.close();
	}
	

	//Interfaz con tres métodos Ejercicio5
	interface Animal{
		public void hacerRuido();
		public void correr();
		public void comer();
	}
	
	class Perro implements Animal{
		public void hacerRuido() {
			System.out.println("Guau");
		}
		public void correr() {
			System.out.println("El perro corre");
		}
		public void comer() {
			System.out.println("El perro come");
		}
	}
	
	public static void ejercicio6() {
		
		class Cliente{
			
			String nombre;
			String apellido;
			String telefono;
			String email;
			
			public Cliente(String nombre, String apellido, String telefono, String email) {
				this.nombre = nombre;
				this.apellido = apellido;
				this.telefono = telefono;
				this.email = email;
				
			}
			
			
		}
		
		int i = 0;
		Scanner teclado = new Scanner(System.in);

		String t1,t2,t3,t4;
		Cliente c;
		
		LinkedList<Cliente> cL = new LinkedList<Cliente>();
		
		while (i < 2){
			
			System.out.println("Imprime nombre");
			t1 = teclado.nextLine();
			System.out.println("Imprime apellido");
			t2 = teclado.nextLine();
			System.out.println("Imprime telefono");
			t3 = teclado.nextLine();
			System.out.println("Imprime email");
			t4 = teclado.nextLine();
			c = new Cliente(t1,t2,t3,t4);
			cL.add(c);
			i++;
		}
		
		String t5;
		while(true) {
			System.out.println("Introduce cualquier tecla, N para salir o M para mostrar");
			t5 = teclado.nextLine();
			if(t5.equals("N")) {
				System.out.println("Fin de la ejecución");
				break;
			} else {
				if(t5.equals("M")) {
					for(Cliente elemento: cL) {
						System.out.println(elemento.nombre);
					}
				}
				System.out.println("Imprime nombre");
				t1 = teclado.nextLine();
				System.out.println("Imprime apellido");
				t2 = teclado.nextLine();
				System.out.println("Imprime telefono");
				t3 = teclado.nextLine();
				System.out.println("Imprime email");
				t4 = teclado.nextLine();
				c = new Cliente(t1,t2,t3,t4);
				cL.add(c);
				
				if(cL.size() == 10) {
					break;
				}
				
			}
			
		} 
		
			
			
		
	}
	
	public static void ejercicio7() {
		HashMap<String,String> map = new HashMap<String,String>();
		Scanner teclado = new Scanner(System.in);
		String t1,t2,t3;
		for(int i = 0; i < 5; i++) {
			System.out.println("Introduce el pais "+ i);
			t1 = teclado.nextLine();
			System.out.println("Introduce la capital "+ i);
			t2 = teclado.nextLine();
			map.put(t1, t2);
		}
		
		
		while(true) {
			System.out.println("Introduce un pais o N para salir");
			t3 = teclado.nextLine();
			if(t3.equals("N")) {
				System.out.println("Fin de la ejecución");
				break;
			} else {
				if (map.containsKey(t3)) {
					System.out.println("La capital de " + t3 + " es " + map.get(t3));
				} else {
					System.out.println("No existe ese país en la lista");
				}
			}
			
		} 
		teclado.close();
		
	}
	
	public static void ejercicio8() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Imprime la primera fecha en formato dd/mm/aaaa");
		String fecha1 = teclado.nextLine();
		System.out.println("Imprime la segunda fecha en formato día/mes/año");
		String fecha2 = teclado.nextLine();
		DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ft1 = LocalDate.parse(fecha1, formateo);
		LocalDate ft2 = LocalDate.parse(fecha2, formateo);
		
		if(ft1.isAfter(ft2)) {
			System.out.println("La fecha " + ft1 + " es más grande que la fecha " + ft2);
		} else {
			if (ft1.isBefore(ft2)) {
				System.out.println("La fecha " + ft2 + " es más grande que la fecha " + ft1);
			 } else {
				 System.out.println("Las dos fechas son iguales");
			 }
		}
		teclado.close();
	}
	
	
}
