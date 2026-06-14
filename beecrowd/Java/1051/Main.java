import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double valor1 = 0, valor2 = 0, valor3 = 0, imposto = 0;
		double valor = sc.nextDouble();
		
		if(valor <= 2000.0) {
			System.out.println("Isento");
		} else {
			if(valor>4500) {
				valor3 = valor - 4500;
				valor = valor - valor3;
			}
			
			if(valor>3000) {
				valor2 = valor - 3000;
				valor = valor - valor2;
			}
			
			if(valor>2000) {
				valor1 = valor - 2000;
				valor = valor - valor1;
			}
			
			imposto = (valor1*0.08)+(valor2*0.18)+(valor3*0.28);
			
			DecimalFormat df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
			
			System.out.printf("R$ "+df.format(imposto)+"\n");
		}
		
		sc.close();
	}
}
