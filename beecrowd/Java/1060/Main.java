import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int count = 0;
		double num = 0;
		
		for(int i = 0; i < 6; i++) {
			num = sc.nextDouble();
			if(num > 0) {
				count = count + 1;
			}
		}
		
		System.out.println(count+" valores positivos");

    sc.close();
	}
}
