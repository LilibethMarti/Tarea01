package senati.ddw.ciclo3.tareaddw01a;
import java.util.Scanner; 
public class Ejercicio0011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá
		//tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las
		//ventas. Piensa que es lo que se repite y lo que no. 
		Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce el número de ventas");
		 int numVentas=sc.nextInt();
		 int sumaVentas=0;
		 for (int i=0;i<numVentas;i++){
		 System.out.println("Introduce el precio de la venta "+(i+1));
		 int venta=sc.nextInt();
		 sumaVentas=sumaVentas+venta;
		 }
		 System.out.println(sumaVentas);
	}

}
