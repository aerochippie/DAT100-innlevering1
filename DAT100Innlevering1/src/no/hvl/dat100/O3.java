package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class O3 {

	public static void main(String[] args) {
		
		
		int number = parseInt(showInputDialog("Number:"));
		int fakultet=1;

		if (number>= 1) {
			for(int i = 1;i<=number;i++) {
				fakultet = fakultet*i;
			}
			System.out.println(number + "! = " + fakultet);


		}else {
			System.out.print("invalid number");
		}

	}

}
