package senati.ddw.ciclo3.tareaddw01a;
import javax.swing.JOptionPane; 
public class Ejercicio008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lee un número por teclado y muestra por consola, el carácter al que pertenece en
		//la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
			 String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
			 //Pasamos el String a int
			 int codigo=Integer.parseInt(texto);
			 //Pasamos el codigo a caracter
			 char caracter=(char)codigo;
			 System.out.println(caracter);
	}

}
