import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int quant = 0;
        double soma = 0, media = 0, num = 0;

        for(int i = 0; i < 6; i++){
            num = sc.nextDouble();
            if(num >= 0){
                quant = quant + 1;
                soma = soma + num;
            }
        }

        media = soma/quant;

        System.out.println(quant+" valores positivos");
        System.out.printf(Locale.US, "%.1f%n",media);

        sc.close();
    }
}
