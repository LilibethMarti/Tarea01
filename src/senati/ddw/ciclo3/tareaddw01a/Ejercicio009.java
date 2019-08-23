package senati.ddw.ciclo3.tareaddw01a;
import java.util.Scanner; 
public class Ejercicio009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el
		//precio final con IVA. El IVA será una constante que será del 21%.
		Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce un caracter ASCII");
		 char caracter = sc.next().charAt(0);
		 //Pasamos el caracter a codigo
		 int codigo = (int) caracter;
		 System.out.println(codigo); 
	}

}
