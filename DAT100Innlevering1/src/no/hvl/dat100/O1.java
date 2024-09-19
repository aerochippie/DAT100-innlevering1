package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class O1 {

	public static void main(String[] args) {
		int poengsum;
		for(int i=1;i<=10;i++) {
			
	poengsum = parseInt(showInputDialog("Peongsum:"));
	 System.out.println(poengsum);
	 
		if ( poengsum >= 90 && poengsum <= 100) {
			System.out.println("karakter : A");
		}
		else if ( poengsum >= 80 && poengsum <= 89) {
			System.out.println("karakter : B");
		}
		else if ( poengsum >= 60 && poengsum <= 79) {
			System.out.println("karakter : C");
		}
		else if ( poengsum >= 50 && poengsum <= 59) {
			System.out.println("karakter : D");
		}
		else if ( poengsum >= 40 && poengsum <= 49) {
			System.out.println("karakter : E");
		} 
		else if ( poengsum >= 0 && poengsum <= 39) {
			System.out.println("karakter : F");
		}
		else if ( poengsum > 100 || poengsum < 0) {
		
			System.out.println("ugyldig poengsum! Prøv igjen!");
			poengsum = parseInt(showInputDialog("Peongsum:")); i--;
		}
		
		}
	}

	}

