package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		double prosent;
		double skatt;
		double inntekt = Double.parseDouble(showInputDialog( "bruttolønn :"));
		
		if(inntekt >= 0 && inntekt <=208050) {
			System.out.println("!ingen trinnskat!");
		}
		else if(inntekt <= 292850 && inntekt >= 208051) {
			
			prosent = 1.7;
			skatt = inntekt*prosent;
			System.out.println(" trinn 1, 	å betale: " + skatt);
			
		}
		else if(inntekt <= 670000 && inntekt >= 292851) {
			
			prosent = 4.0;
			skatt = inntekt*prosent;
			System.out.println("trinn 2,	 å betale: " + skatt);
			
		}
		else if(inntekt <= 937900 && inntekt >= 670001) {
		
			prosent = 13.6;
			skatt = inntekt*prosent;
			System.out.println(" trinn 3, 	å betale: " + skatt);
		
		}
			else if(inntekt <= 1350000 && inntekt >= 937901) {
				
			prosent = 16.6;
			skatt = inntekt*prosent;
			System.out.println(" trinn 4, 	å betale: " + skatt);
		
	}
		else if(inntekt >= 1350001) {
			
			prosent = 17.6;
			skatt = inntekt*prosent;
			System.out.println(" trinn 5, 	å betale: " + skatt);
			
	}

	}

}
